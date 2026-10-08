package ch.qos.logback.core;

import ch.qos.logback.core.spi.AppenderAttachable;
import ch.qos.logback.core.spi.AppenderAttachableImpl;
import ch.qos.logback.core.util.InterruptUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class AsyncAppenderBase extends UnsynchronizedAppenderBase implements AppenderAttachable {
   public static final int DEFAULT_QUEUE_SIZE = 256;
   static final int UNDEFINED = -1;
   public static final int DEFAULT_MAX_FLUSH_TIME = 1000;
   AppenderAttachableImpl aai;
   BlockingQueue blockingQueue;
   int queueSize;
   int appenderCount;
   int discardingThreshold;
   boolean neverBlock;
   Worker worker;
   int maxFlushTime;

   public AsyncAppenderBase() {
      super();
      this.aai = new AppenderAttachableImpl();
      this.queueSize = 256;
      this.appenderCount = 0;
      this.discardingThreshold = -1;
      this.neverBlock = false;
      this.worker = new Worker();
      this.maxFlushTime = 1000;
   }

   private boolean isQueueBelowDiscardingThreshold() {
      return this.blockingQueue.remainingCapacity() < this.discardingThreshold;
   }

   private void put(Object event) {
      if (this.neverBlock) {
         this.blockingQueue.offer(event);
      } else {
         this.putUninterruptibly(event);
      }
   }

   private void putUninterruptibly(Object event) {
      boolean interrupted = false;
      while (true) {
         try {
            this.blockingQueue.put(event);
            break;
         } catch (InterruptedException e) {
            interrupted = true;
         }
      }
      if (interrupted) {
         Thread.currentThread().interrupt();
      }
   }

   public boolean isDiscardable(Object event) {
      return false;
   }

   public void preprocess(Object event) {
   }

   public void start() {
      if (this.isStarted()) {
         return;
      }
      if (this.appenderCount == 0) {
         this.addError("No attached appenders found.");
      } else {
         int qs = this.queueSize;
         if (qs < 1) {
            this.addError("Invalid queue size [" + qs + "]");
         } else {
            this.blockingQueue = new ArrayBlockingQueue(this.queueSize);
            if (this.discardingThreshold == -1) {
               this.discardingThreshold = this.queueSize / 5;
            }
            this.addInfo("Setting discardingThreshold to " + this.discardingThreshold);
            this.worker.setDaemon(true);
            this.worker.setName("AsyncAppender-Worker-" + this.getName());
            super.start();
            this.worker.start();
         }
      }
   }

   public void stop() {
      if (!this.isStarted()) {
         return;
      }
      super.stop();
      this.worker.interrupt();
      InterruptUtil interruptUtil = new InterruptUtil(this.context);
      try {
         interruptUtil.maskInterruptFlag();
         this.worker.join(this.maxFlushTime);
         if (this.worker.isAlive()) {
            this.addWarn("Max queue flush timeout (" + this.maxFlushTime + " ms) exceeded. Approximately " + this.blockingQueue.size() + " queued events were possibly discarded.");
         } else {
            this.addInfo("Queue flush finished successfully within timeout.");
         }
      } catch (InterruptedException e) {
         int size = this.blockingQueue.size();
         this.addError("Failed to join worker thread. " + size + " queued events may be discarded.", e);
      } finally {
         interruptUtil.unmaskInterruptFlag();
      }
   }

   public void append(Object event) {
      if (this.isQueueBelowDiscardingThreshold() && this.isDiscardable(event)) {
         return;
      }
      this.preprocess(event);
      this.put(event);
   }

   public int getQueueSize() {
      return this.queueSize;
   }

   public void setQueueSize(int queueSize) {
      this.queueSize = queueSize;
   }

   public int getDiscardingThreshold() {
      return this.discardingThreshold;
   }

   public void setDiscardingThreshold(int discardingThreshold) {
      this.discardingThreshold = discardingThreshold;
   }

   public int getMaxFlushTime() {
      return this.maxFlushTime;
   }

   public void setMaxFlushTime(int maxFlushTime) {
      this.maxFlushTime = maxFlushTime;
   }

   public int getNumberOfElementsInQueue() {
      return this.blockingQueue.size();
   }

   public void setNeverBlock(boolean neverBlock) {
      this.neverBlock = neverBlock;
   }

   public boolean isNeverBlock() {
      return this.neverBlock;
   }

   public int getRemainingCapacity() {
      return this.blockingQueue.remainingCapacity();
   }

   public void addAppender(Appender appender) {
      int count = this.appenderCount;
      if (count == 0) {
         this.appenderCount = count + 1;
         this.addInfo("Attaching appender named [" + appender.getName() + "] to AsyncAppender.");
         this.aai.addAppender(appender);
      } else {
         this.addWarn("One and only one appender may be attached to AsyncAppender.");
         this.addWarn("Ignoring additional appender named [" + appender.getName() + "]");
      }
   }

   public Iterator iteratorForAppenders() {
      return this.aai.iteratorForAppenders();
   }

   public Appender getAppender(String name) {
      return this.aai.getAppender(name);
   }

   public boolean isAttached(Appender appender) {
      return this.aai.isAttached(appender);
   }

   public void detachAndStopAllAppenders() {
      this.aai.detachAndStopAllAppenders();
   }

   public boolean detachAppender(Appender appender) {
      return this.aai.detachAppender(appender);
   }

   public boolean detachAppender(String name) {
      return this.aai.detachAppender(name);
   }

   class Worker extends Thread {
      public void run() {
         AsyncAppenderBase outer = AsyncAppenderBase.this;
         AppenderAttachableImpl aai = outer.aai;
         while (outer.isStarted()) {
            try {
               List eventList = new ArrayList();
               eventList.add(outer.blockingQueue.take());
               outer.blockingQueue.drainTo(eventList);
               Iterator it = eventList.iterator();
               while (it.hasNext()) {
                  aai.appendLoopOnAppenders(it.next());
               }
            } catch (InterruptedException e) {
               break;
            }
         }
         outer.addInfo("Worker thread will flush remaining events before exiting.");
         Iterator it = outer.blockingQueue.iterator();
         while (it.hasNext()) {
            Object event = it.next();
            aai.appendLoopOnAppenders(event);
            outer.blockingQueue.remove(event);
         }
         aai.detachAndStopAllAppenders();
      }
   }
}

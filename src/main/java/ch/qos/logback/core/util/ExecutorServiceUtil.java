package ch.qos.logback.core.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorServiceUtil {
   private static final ThreadFactory THREAD_FACTORY_FOR_SCHEDULED_EXECUTION_SERVICE = new ThreadFactory() {
      private final AtomicInteger threadNumber = new AtomicInteger(1);
      private final ThreadFactory defaultFactory = Executors.defaultThreadFactory();

      public Thread newThread(Runnable r) {
         Thread t = defaultFactory.newThread(r);
         if (!t.isDaemon()) {
            t.setDaemon(true);
         }
         t.setName("logback-" + threadNumber.getAndIncrement());
         return t;
      }
   };

   public static ScheduledExecutorService newScheduledExecutorService() {
      return new ScheduledThreadPoolExecutor(4, THREAD_FACTORY_FOR_SCHEDULED_EXECUTION_SERVICE);
   }

   /** @deprecated */
   public static ExecutorService newExecutorService() {
      return newThreadPoolExecutor();
   }

   public static ThreadPoolExecutor newThreadPoolExecutor() {
      TimeUnit var0 = TimeUnit.MILLISECONDS;
      SynchronousQueue<Runnable> var1 = new SynchronousQueue<>();
      ThreadFactory var2 = THREAD_FACTORY_FOR_SCHEDULED_EXECUTION_SERVICE;
      return new ThreadPoolExecutor(0, 32, 0L, var0, var1, var2);
   }

   public static void shutdown(ExecutorService var0) {
      if (var0 != null) {
         var0.shutdownNow();
      }
   }

   public static ExecutorService newAlternateThreadPoolExecutor() {
      return newThreadPoolExecutor();
   }
}
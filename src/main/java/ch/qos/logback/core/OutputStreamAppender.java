package ch.qos.logback.core;

import ch.qos.logback.core.encoder.Encoder;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.DeferredProcessingAware;
import ch.qos.logback.core.status.ErrorStatus;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.locks.ReentrantLock;

public class OutputStreamAppender extends UnsynchronizedAppenderBase {
   protected Encoder encoder;
   protected final ReentrantLock streamWriteLock;
   private OutputStream outputStream;
   boolean immediateFlush;

   public OutputStreamAppender() {


      super();
      ReentrantLock var1;
      var1 = new ReentrantLock(false);
      this.streamWriteLock = var1;
      this.immediateFlush = true;
   }

   private void writeBytes(byte[] var1) throws IOException {
      if (var1 != null && var1.length != 0) {

         byte[] var10002 = var1;
         this.streamWriteLock.lock();

         try {
            this.writeByteArrayToOutputStreamWithPossibleFlush(var10002);
         } catch (Throwable var3) {
            this.streamWriteLock.unlock();
            throw var3;
         }

         this.streamWriteLock.unlock();
      }
   }

   public OutputStream getOutputStream() {
      return this.outputStream;
   }

   public void start() {
      int var1 = 0;
      if (this.encoder == null) {
         ((ContextAwareBase)this).addStatus(new ErrorStatus("No encoder set for the appender named \"" + super.name + "\".", this));
         var1 = 1;
      }

      if (this.outputStream == null) {
         ((ContextAwareBase)this).addStatus(new ErrorStatus("No output stream set for the appender named \"" + super.name + "\".", this));
         ++var1;
      }

      if (var1 == 0) {
         super.start();
      }

   }

   public void setLayout(Layout var1) {
      ((ContextAwareBase)this).addWarn("This appender no longer admits a layout as a sub-component, set an encoder instead.");
      ((ContextAwareBase)this).addWarn("To ensure compatibility, wrapping your layout in LayoutWrappingEncoder.");
      ((ContextAwareBase)this).addWarn("See also http://logback.qos.ch/codes.html#layoutInsteadOfEncoder for details");
      LayoutWrappingEncoder var2;
      LayoutWrappingEncoder var10001 = var2 = new LayoutWrappingEncoder();
      var2.setLayout(var1);
      ((ContextAwareBase)var10001).setContext(super.context);
      this.encoder = var10001;
   }

   public void append(Object var1) {
      if (((UnsynchronizedAppenderBase)this).isStarted()) {
         this.subAppend(var1);
      }
   }

   public void stop() {
      if (super.isStarted()) {
         this.streamWriteLock.lock();
         try {
            this.closeOutputStream();
            super.stop();
         } finally {
            this.streamWriteLock.unlock();
         }
      }
   }

   public void closeOutputStream() {
      if (this.outputStream != null) {
         try {
            this.encoderClose();
            this.outputStream.close();
            this.outputStream = null;
         } catch (IOException var3) {
            ErrorStatus var2;
            var2 = new ErrorStatus("Could not close output stream for OutputStreamAppender.", this, var3);
            ((ContextAwareBase)this).addStatus(var2);
         }
      }

   }

   public void encoderClose() {
      Encoder var1;
      if ((var1 = this.encoder) != null && this.outputStream != null) {
         try {
            this.writeBytes(var1.footerBytes());
         } catch (IOException var2) {
            super.started = false;
            ((ContextAwareBase)this).addStatus(new ErrorStatus("Failed to write footer for appender named [" + super.name + "].", this, var2));
         }
      }

   }

   public void setOutputStream(OutputStream var1) {
      this.streamWriteLock.lock();
      try {
         this.closeOutputStream();
         this.outputStream = var1;
         if (this.encoder == null) {
            this.addWarn("Encoder has not been set. Cannot invoke its init method.");
         } else {
            this.encoderInit();
         }
      } finally {
         this.streamWriteLock.unlock();
      }
   }

   public void encoderInit() {
      Encoder var1;
      if ((var1 = this.encoder) != null && this.outputStream != null) {
         try {
            this.writeBytes(var1.headerBytes());
         } catch (IOException var2) {
            super.started = false;
            ((ContextAwareBase)this).addStatus(new ErrorStatus("Failed to initialize encoder for appender named [" + super.name + "].", this, var2));
         }
      }

   }

   public void writeOut(Object var1) throws IOException {
      this.writeBytes(this.encoder.encode(var1));
   }

   public final void writeByteArrayToOutputStreamWithPossibleFlush(byte[] var1) throws IOException {
      this.outputStream.write(var1);
      if (this.immediateFlush) {
         this.outputStream.flush();
      }

   }

   public void subAppend(Object var1) {
      if (super.isStarted()) {
         try {
            if (var1 instanceof DeferredProcessingAware) {
               ((DeferredProcessingAware)var1).prepareForDeferredProcessing();
            }
            this.writeOut(var1);
         } catch (IOException var3) {
            super.started = false;
            this.addStatus(new ErrorStatus("IO failure in appender", this, var3));
         }
      }
   }

   public Encoder getEncoder() {
      return this.encoder;
   }

   public void setEncoder(Encoder var1) {
      this.encoder = var1;
   }

   public boolean isImmediateFlush() {
      return this.immediateFlush;
   }

   public void setImmediateFlush(boolean var1) {
      this.immediateFlush = var1;
   }
}

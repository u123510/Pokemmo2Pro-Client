package ch.qos.logback.core;

import ch.qos.logback.core.recovery.ResilientFileOutputStream;
import ch.qos.logback.core.recovery.ResilientOutputStreamBase;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.ContextUtil;
import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.core.util.FileUtil;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Map;

public class FileAppender extends OutputStreamAppender {
   public static final long DEFAULT_BUFFER_SIZE = 8192L;
   protected static String COLLISION_WITH_EARLIER_APPENDER_URL;
   protected boolean append;
   protected String fileName;
   private boolean prudent;
   private FileSize bufferSize;

   public FileAppender() {

      super();
      this.append = true;
      this.fileName = null;
      this.prudent = false;
      FileSize var1;
      var1 = new FileSize(8192L);
      this.bufferSize = var1;
   }

   private void safeWriteOut(Object var1) {
      byte[] var4;
      if ((var4 = super.encoder.encode(var1)) != null && var4.length != 0) {

         byte[] var10002 = var4;
         super.streamWriteLock.lock();

         try {
            this.safeWriteBytes(var10002);
         } catch (Throwable var3) {
            super.streamWriteLock.unlock();
            throw var3;
         }

         super.streamWriteLock.unlock();
      }
   }

   private void safeWriteBytes(byte[] var1) {
      ResilientFileOutputStream var2 = (ResilientFileOutputStream)this.getOutputStream();
      FileChannel var3 = var2.getChannel();
      if (var3 == null) {
         return;
      }
      boolean var4 = Thread.interrupted();
      FileLock var5 = null;

      try {
         var5 = var3.lock();
         long var6 = var3.position();
         long var8 = var3.size();
         if (var8 != var6) {
            var3.position(var8);
         }
         this.writeByteArrayToOutputStreamWithPossibleFlush(var1);
      } catch (IOException var10) {
         var2.postIOFailure(var10);
      } finally {
         this.releaseFileLock(var5);
      }

      if (var4) {
         Thread.currentThread().interrupt();
      }
   }

   private void releaseFileLock(FileLock var1) {
      if (var1 != null && var1.isValid()) {
         try {
            var1.release();
         } catch (IOException var2) {
            ((ContextAwareBase)this).addError("failed to release lock", var2);
         }
      }

   }

   public void setFile(String var1) {
      if (var1 == null) {
         this.fileName = var1;
      } else {
         this.fileName = var1.trim();
      }

   }

   public boolean isAppend() {
      return this.append;
   }

   public final String rawFileProperty() {
      return this.fileName;
   }

   public String getFile() {
      return this.fileName;
   }

   public void start() {
      if (this.getFile() != null) {
         ((ContextAwareBase)this).addInfo("File property is set to [" + this.fileName + "]");
         if (this.prudent && !this.isAppend()) {
            this.setAppend(true);
            ((ContextAwareBase)this).addWarn("Setting \"Append\" property to true on account of \"Prudent\" mode");
         }

         if (this.checkForFileCollisionInPreviousFileAppenders()) {
            ((ContextAwareBase)this).addError("Collisions detected with FileAppender/RollingAppender instances defined earlier. Aborting.");
            ((ContextAwareBase)this).addError("For more information, please visit " + COLLISION_WITH_EARLIER_APPENDER_URL);
         } else {
            try {
               this.openFile(this.getFile());
            } catch (IOException var2) {
               this.addError("openFile(" + this.fileName + "," + this.append + ") call failed.", var2);
               return;
            }

            super.start();
         }
      } else {
         ((ContextAwareBase)this).addError("\"File\" property not set for appender named [" + super.name + "].");
      }

   }

   public void stop() {
      if (((UnsynchronizedAppenderBase)this).isStarted()) {
         super.stop();
         Map var1;
         if ((var1 = ContextUtil.getFilenameCollisionMap(super.context)) != null && ((UnsynchronizedAppenderBase)this).getName() != null) {
            var1.remove(((UnsynchronizedAppenderBase)this).getName());
         }
      }
   }

   public boolean checkForFileCollisionInPreviousFileAppenders() {
      boolean var1 = false;
      if (this.fileName == null) {
         return false;
      } else {
         Map var2;
         if ((var2 = (Map)super.context.getObject("FA_FILENAMES_MAP")) == null) {
            return var1;
         } else {
            java.util.Iterator var3 = var2.entrySet().iterator();

            while(var3.hasNext()) {
               Map.Entry var4 = (Map.Entry)var3.next();
               if (this.fileName.equals(var4.getValue())) {
                  String var6 = (String)var4.getValue();
                  String var7 = (String)var4.getKey();
                  this.addErrorForCollision("File", var6, var7);
                  var1 = true;
               }
            }

            if (super.name != null) {

               String var5 = ((UnsynchronizedAppenderBase)this).getName();
               var2.put(var5, this.fileName);
            }

            return var1;
         }
      }
   }

   public void addErrorForCollision(String var1, String var2, String var3) {
      ((ContextAwareBase)this).addError("'" + var1 + "' option has the same value \"" + var2 + "\" as that given for appender [" + var3 + "] defined earlier.");
   }

   public void openFile(String var1) throws IOException {
      super.streamWriteLock.lock();

      try {
         File var2 = new File(var1);
         if (!FileUtil.createMissingParentDirectories(var2)) {
            this.addError("Failed to create parent directories for [" + var2.getAbsolutePath() + "]");
         }

         ResilientFileOutputStream var10002 = new ResilientFileOutputStream(var2, this.append, this.bufferSize.getSize());
         var10002.setContext(super.context);
         this.setOutputStream(var10002);
      } catch (Throwable var59) {
         super.streamWriteLock.unlock();
         throw var59;
      }

      super.streamWriteLock.unlock();
   }

   public boolean isPrudent() {
      return this.prudent;
   }

   public void setPrudent(boolean var1) {
      this.prudent = var1;
   }

   public void setAppend(boolean var1) {
      this.append = var1;
   }

   public void setBufferSize(FileSize var1) {
      ((ContextAwareBase)this).addInfo("Setting bufferSize to [" + var1.toString() + "]");
      this.bufferSize = var1;
   }

   public void writeOut(Object var1) throws IOException {
      if (this.prudent) {
         this.safeWriteOut(var1);
      } else {
         super.writeOut(var1);
      }

   }
}

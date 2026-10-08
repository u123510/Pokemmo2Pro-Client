package ch.qos.logback.core.rolling;

import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.OutputStreamAppender;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.ContextUtil;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RollingFileAppender extends FileAppender {
   private static String RFA_NO_TP_URL;
   private static String RFA_NO_RP_URL;
   private static String COLLISION_URL;
   private static String RFA_LATE_FILE_URL;
   private static String RFA_RESET_RP_OR_TP;
   File currentlyActiveFile;
   TriggeringPolicy triggeringPolicy;
   RollingPolicy rollingPolicy;
   Lock triggeringPolicyLock;

   public RollingFileAppender() {

      super();
      ReentrantLock var1;
      var1 = new ReentrantLock();
      this.triggeringPolicyLock = var1;
   }

   private boolean checkForFileAndPatternCollisions() {
      TriggeringPolicy var1;
      FileNamePattern var3;
      if ((var1 = this.triggeringPolicy) instanceof RollingPolicyBase && (var3 = ((RollingPolicyBase)var1).fileNamePattern) != null && super.fileName != null) {

         String var2 = var3.toRegex();
         return this.fileName.matches(var2);
      } else {
         return false;
      }
   }

   private boolean checkForCollisionsInPreviousRollingFileAppenders() {
      boolean var1 = false;
      TriggeringPolicy var2;
      if ((var2 = this.triggeringPolicy) instanceof RollingPolicyBase && this.innerCheckForFileNamePatternCollisionInPreviousRFA(((RollingPolicyBase)var2).fileNamePattern)) {
         var1 = true;
      }

      return var1;
   }

   private boolean innerCheckForFileNamePatternCollisionInPreviousRFA(FileNamePattern var1) {
      boolean var2 = false;
      Map var3;
      if ((var3 = (Map)super.context.getObject("RFA_FILENAME_PATTERN_COLLISION_MAP")) == null) {
         return var2;
      } else {
         Iterator var4 = var3.entrySet().iterator();

         while(var4.hasNext()) {
            Map.Entry var5;
            if (var1.equals((var5 = (Map.Entry)var4.next()).getValue())) {
               String var6 = ((FileNamePattern)var5.getValue()).toString();
               String var7 = (String)var5.getKey();
               ((FileAppender)this).addErrorForCollision("FileNamePattern", var6, var7);
               var2 = true;
            }
         }

         if (super.name != null) {
            var3.put(((UnsynchronizedAppenderBase)this).getName(), var1);
         }

         return var2;
      }
   }

   private void attemptOpenFile() {
      try {
         this.currentlyActiveFile = new File(this.rollingPolicy.getActiveFileName());
         ((FileAppender)this).openFile(this.rollingPolicy.getActiveFileName());
      } catch (IOException var2) {
         ((ContextAwareBase)this).addError("setFile(" + super.fileName + ", false) call failed.", var2);
      }

   }

   private void attemptRollover() {
      try {
         this.rollingPolicy.rollover();
      } catch (RolloverFailure var1) {
         ((ContextAwareBase)this).addWarn("RolloverFailure occurred. Deferring roll-over.");
         super.append = true;
      }

   }

   public void start() {
      TriggeringPolicy var1;
      if ((var1 = this.triggeringPolicy) == null) {
         ((ContextAwareBase)this).addWarn("No TriggeringPolicy was set for the RollingFileAppender named " + ((UnsynchronizedAppenderBase)this).getName());
         ((ContextAwareBase)this).addWarn("For more information, please visit " + RFA_NO_TP_URL);
      } else if (!var1.isStarted()) {
         ((ContextAwareBase)this).addWarn("TriggeringPolicy has not started. RollingFileAppender will not start");
      } else if (this.checkForCollisionsInPreviousRollingFileAppenders()) {
         ((ContextAwareBase)this).addError("Collisions detected with FileAppender/RollingAppender instances defined earlier. Aborting.");
         ((ContextAwareBase)this).addError("For more information, please visit " + FileAppender.COLLISION_WITH_EARLIER_APPENDER_URL);
      } else {
         if (!super.append) {
            ((ContextAwareBase)this).addWarn("Append mode is mandatory for RollingFileAppender. Defaulting to append=true.");
            super.append = true;
         }

         if (this.rollingPolicy == null) {
            ((ContextAwareBase)this).addError("No RollingPolicy was set for the RollingFileAppender named " + ((UnsynchronizedAppenderBase)this).getName());
            ((ContextAwareBase)this).addError("For more information, please visit " + RFA_NO_RP_URL);
         } else if (this.checkForFileAndPatternCollisions()) {
            ((ContextAwareBase)this).addError("File property collides with fileNamePattern. Aborting.");
            ((ContextAwareBase)this).addError("For more information, please visit " + COLLISION_URL);
         } else {
            if (((FileAppender)this).isPrudent()) {
               if (((FileAppender)this).rawFileProperty() != null) {
                  ((ContextAwareBase)this).addWarn("Setting \"File\" property to null on account of prudent mode");
                  this.setFile((String)null);
               }

               if (this.rollingPolicy.getCompressionMode() != CompressionMode.NONE) {
                  ((ContextAwareBase)this).addError("Compression is not supported in prudent mode. Aborting");
                  return;
               }
            }

            File var2;
            var2 = new File(this.getFile());
            this.currentlyActiveFile = var2;
            ((ContextAwareBase)this).addInfo("Active log file name: " + this.getFile());
            super.start();
         }
      }
   }

   public void stop() {
      if (((UnsynchronizedAppenderBase)this).isStarted()) {
         super.stop();
         RollingPolicy var1;
         if ((var1 = this.rollingPolicy) != null) {
            var1.stop();
         }

         TriggeringPolicy var2;
         if ((var2 = this.triggeringPolicy) != null) {
            var2.stop();
         }

         Map var3;
         if ((var3 = ContextUtil.getFilenamePatternCollisionMap(super.context)) != null && ((UnsynchronizedAppenderBase)this).getName() != null) {
            var3.remove(((UnsynchronizedAppenderBase)this).getName());
         }

      }
   }

   public void setFile(String var1) {
      if (var1 != null && (this.triggeringPolicy != null || this.rollingPolicy != null)) {
         ((ContextAwareBase)this).addError("File property must be set before any triggeringPolicy or rollingPolicy properties");
         ((ContextAwareBase)this).addError("For more information, please visit " + RFA_LATE_FILE_URL);
      }

      super.setFile(var1);
   }

   public String getFile() {
      return this.rollingPolicy.getActiveFileName();
   }

   public void rollover() {
      super.streamWriteLock.lock();

      try {
         this.closeOutputStream();
         this.attemptRollover();
         this.attemptOpenFile();
      } catch (Throwable var3) {
         super.streamWriteLock.unlock();
         throw var3;
      }

      super.streamWriteLock.unlock();
   }

   public void subAppend(Object var1) {
      this.triggeringPolicyLock.lock();

      try {
         if (this.triggeringPolicy.isTriggeringEvent(this.currentlyActiveFile, var1)) {
            this.rollover();
         }
      } catch (Throwable var8) {
         this.triggeringPolicyLock.unlock();
         throw var8;
      }

      this.triggeringPolicyLock.unlock();
      super.subAppend(var1);
   }

   public RollingPolicy getRollingPolicy() {
      return this.rollingPolicy;
   }

   public TriggeringPolicy getTriggeringPolicy() {
      return this.triggeringPolicy;
   }

   public void setRollingPolicy(RollingPolicy var1) {
      RollingPolicy var2;
      if ((var2 = this.rollingPolicy) instanceof TriggeringPolicy) {
         String var3;
         String var10003 = var3 = var2.getClass().getSimpleName();
         ((ContextAwareBase)this).addWarn("A rolling policy of type " + var10003 + " was already set.");
         ((ContextAwareBase)this).addWarn("Note that " + var3 + " doubles as a TriggeringPolicy");
         ((ContextAwareBase)this).addWarn("See also " + RFA_RESET_RP_OR_TP);
      }

      this.rollingPolicy = var1;
      if (var1 instanceof TriggeringPolicy) {
         this.triggeringPolicy = (TriggeringPolicy)var1;
      }

   }

   public void setTriggeringPolicy(TriggeringPolicy var1) {
      TriggeringPolicy var2;
      if ((var2 = this.triggeringPolicy) instanceof RollingPolicy) {
         String var3;
         String var10003 = var3 = var2.getClass().getSimpleName();
         ((ContextAwareBase)this).addWarn("A triggering policy of type " + var10003 + " was already set.");
         ((ContextAwareBase)this).addWarn("Note that " + var3 + " doubles as a RollingPolicy");
         ((ContextAwareBase)this).addWarn("See also " + RFA_RESET_RP_OR_TP);
      }

      this.triggeringPolicy = var1;
      if (var1 instanceof RollingPolicy) {
         this.rollingPolicy = (RollingPolicy)var1;
      }

   }
}

package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.Compressor;
import ch.qos.logback.core.rolling.helper.FileFilterUtil;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.rolling.helper.RenameUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.FileSize;
import java.io.File;
import java.time.Instant;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TimeBasedRollingPolicy extends RollingPolicyBase implements TriggeringPolicy {
   static final String FNP_NOT_SET = "The FileNamePattern option must be set before using TimeBasedRollingPolicy. ";
   FileNamePattern fileNamePatternWithoutCompSuffix;
   private Compressor compressor;
   private RenameUtil renameUtil;
   Future compressionFuture;
   Future cleanUpFuture;
   private int maxHistory;
   protected FileSize totalSizeCap;
   private ArchiveRemover archiveRemover;
   TimeBasedFileNamingAndTriggeringPolicy timeBasedFileNamingAndTriggeringPolicy;
   boolean cleanHistoryOnStart;

   public TimeBasedRollingPolicy() {




      super();
      RenameUtil var1;
      var1 = new RenameUtil();
      this.renameUtil = var1;
      this.maxHistory = 0;
      FileSize var2;
      var2 = new FileSize(0L);
      this.totalSizeCap = var2;
      this.cleanHistoryOnStart = false;
   }

   private void waitForAsynchronousJobToStop(Future var1, String var2) {
      if (var1 != null) {
         long var3 = 30L;

         try {
            var1.get(var3, TimeUnit.SECONDS);
         } catch (TimeoutException var5) {
            this.addError("Timeout while waiting for " + var2 + " job to finish", var5);
         } catch (Exception var6) {
            this.addError("Unexpected exception while waiting for " + var2 + " job to finish", var6);
         }
      }

   }

   private String transformFileNamePattern2ZipEntry(String var1) {
      return FileFilterUtil.afterLastSlash(FileFilterUtil.slashify(var1));
   }

   public void start() {
      this.renameUtil.setContext(super.context);
      if (super.fileNamePatternStr != null) {
         FileNamePattern var1;
         var1 = new FileNamePattern(super.fileNamePatternStr, super.context);
         super.fileNamePattern = var1;
         ((RollingPolicyBase)this).determineCompressionMode();
         Compressor var3;
         Compressor var10000 = var3 = new Compressor(super.compressionMode);
         this.compressor = var3;
         ((ContextAwareBase)var10000).setContext(super.context);
         FileNamePattern var4;
         FileNamePattern var7 = var4 = new FileNamePattern(Compressor.computeFileNameStrWithoutCompSuffix(super.fileNamePatternStr, super.compressionMode), super.context);
         this.fileNamePatternWithoutCompSuffix = var4;
         ((ContextAwareBase)this).addInfo("Will use the pattern " + String.valueOf(var7) + " for the active file");
         if (super.compressionMode == CompressionMode.ZIP) {
            String var5 = this.transformFileNamePattern2ZipEntry(super.fileNamePatternStr);
            FileNamePattern var2;
            var2 = new FileNamePattern(var5, super.context);
            super.zipEntryFileNamePattern = var2;
         }

         if (this.timeBasedFileNamingAndTriggeringPolicy == null) {
            DefaultTimeBasedFileNamingAndTriggeringPolicy var6;
            var6 = new DefaultTimeBasedFileNamingAndTriggeringPolicy();
            this.timeBasedFileNamingAndTriggeringPolicy = var6;
         }

         this.timeBasedFileNamingAndTriggeringPolicy.setContext(super.context);
         this.timeBasedFileNamingAndTriggeringPolicy.setTimeBasedRollingPolicy(this);
         this.timeBasedFileNamingAndTriggeringPolicy.start();
         if (!this.timeBasedFileNamingAndTriggeringPolicy.isStarted()) {
            ((ContextAwareBase)this).addWarn("Subcomponent did not start. TimeBasedRollingPolicy will not start.");
         } else {
            if (this.maxHistory != 0) {
               (this.archiveRemover = this.timeBasedFileNamingAndTriggeringPolicy.getArchiveRemover()).setMaxHistory(this.maxHistory);
               this.archiveRemover.setTotalSizeCap(this.totalSizeCap.getSize());
               if (this.cleanHistoryOnStart) {
                  ((ContextAwareBase)this).addInfo("Cleaning on start up");
                  this.cleanUpFuture = this.archiveRemover.cleanAsynchronously(Instant.ofEpochMilli(this.timeBasedFileNamingAndTriggeringPolicy.getCurrentTime()));
               }
            } else if (!this.isUnboundedTotalSizeCap()) {
               ((ContextAwareBase)this).addWarn("'maxHistory' is not set, ignoring 'totalSizeCap' option with value [" + String.valueOf(this.totalSizeCap) + "]");
            }

            super.start();
         }
      } else {
         ((ContextAwareBase)this).addWarn("The FileNamePattern option must be set before using TimeBasedRollingPolicy. ");
         ((ContextAwareBase)this).addWarn("See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
         throw new IllegalStateException("The FileNamePattern option must be set before using TimeBasedRollingPolicy. See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
      }
   }

   public boolean isUnboundedTotalSizeCap() {
      return this.totalSizeCap.getSize() == 0L;
   }

   public void stop() {
      if (((RollingPolicyBase)this).isStarted()) {
         this.waitForAsynchronousJobToStop(this.compressionFuture, "compression");
         this.waitForAsynchronousJobToStop(this.cleanUpFuture, "clean-up");
         super.stop();
      }
   }

   public void setTimeBasedFileNamingAndTriggeringPolicy(TimeBasedFileNamingAndTriggeringPolicy var1) {
      this.timeBasedFileNamingAndTriggeringPolicy = var1;
   }

   public TimeBasedFileNamingAndTriggeringPolicy getTimeBasedFileNamingAndTriggeringPolicy() {
      return this.timeBasedFileNamingAndTriggeringPolicy;
   }

   public void rollover() {
      String var1;
      String var2 = FileFilterUtil.afterLastSlash(var1 = this.timeBasedFileNamingAndTriggeringPolicy.getElapsedPeriodsFileName());
      if (super.compressionMode == CompressionMode.NONE) {
         if (((RollingPolicyBase)this).getParentsRawFileProperty() != null) {
            this.renameUtil.rename(((RollingPolicyBase)this).getParentsRawFileProperty(), var1);
         }
      } else if (((RollingPolicyBase)this).getParentsRawFileProperty() == null) {
         this.compressionFuture = this.compressor.asyncCompress(var1, var1, var2);
      } else {
         this.compressionFuture = this.renameRawAndAsyncCompress(var1, var2);
      }

      if (this.archiveRemover != null) {


         Instant var3 = Instant.ofEpochMilli(this.timeBasedFileNamingAndTriggeringPolicy.getCurrentTime());
         this.cleanUpFuture = this.archiveRemover.cleanAsynchronously(var3);
      }

   }

   public Future renameRawAndAsyncCompress(String var1, String var2) {


      String var4 = ((RollingPolicyBase)this).getParentsRawFileProperty();
      String var3 = var1 + System.nanoTime() + ".tmp";
      this.renameUtil.rename(var4, var3);
      return this.compressor.asyncCompress(var3, var1, var2);
   }

   public String getActiveFileName() {
      String var1;
      return (var1 = ((RollingPolicyBase)this).getParentsRawFileProperty()) != null ? var1 : this.timeBasedFileNamingAndTriggeringPolicy.getCurrentPeriodsFileNameWithoutCompressionSuffix();
   }

   public boolean isTriggeringEvent(File var1, Object var2) {
      return this.timeBasedFileNamingAndTriggeringPolicy.isTriggeringEvent(var1, var2);
   }

   public int getMaxHistory() {
      return this.maxHistory;
   }

   public void setMaxHistory(int var1) {
      this.maxHistory = var1;
   }

   public boolean isCleanHistoryOnStart() {
      return this.cleanHistoryOnStart;
   }

   public void setCleanHistoryOnStart(boolean var1) {
      this.cleanHistoryOnStart = var1;
   }

   public String toString() {
      return "c.q.l.core.rolling.TimeBasedRollingPolicy@" + this.hashCode();
   }

   public void setTotalSizeCap(FileSize var1) {
      ((ContextAwareBase)this).addInfo("setting totalSizeCap to " + var1.toString());
      this.totalSizeCap = var1;
   }
}

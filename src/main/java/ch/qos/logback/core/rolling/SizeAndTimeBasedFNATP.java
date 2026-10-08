package ch.qos.logback.core.rolling;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.FileFilterUtil;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.rolling.helper.SizeAndTimeBasedArchiveRemover;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.Duration;
import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.core.util.InvocationGate;
import ch.qos.logback.core.util.SimpleInvocationGate;
import java.io.File;
import java.time.Instant;

@NoAutoStart
public class SizeAndTimeBasedFNATP extends TimeBasedFileNamingAndTriggeringPolicyBase {
   public enum Usage {
      EMBEDDED,
      DIRECT;
   }

   static String MISSING_INT_TOKEN;
   static String MISSING_DATE_TOKEN;
   volatile int currentPeriodsCounter;
   FileSize maxFileSize;
   Duration checkIncrement;
   private final Usage usage;
   InvocationGate invocationGate;

   public SizeAndTimeBasedFNATP() {
      this(ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP.Usage.DIRECT);
   }

   public SizeAndTimeBasedFNATP(Usage var1) {


      super();
      this.currentPeriodsCounter = 0;
      this.checkIncrement = null;
      SimpleInvocationGate var2;
      var2 = new SimpleInvocationGate();
      this.invocationGate = var2;
      this.usage = var1;
   }

   private boolean validateDateAndIntegerTokens() {
      boolean var1 = false;
      if (super.tbrp.fileNamePattern.getIntegerTokenConverter() == null) {
         var1 = true;
         ((ContextAwareBase)this).addError(MISSING_INT_TOKEN + super.tbrp.fileNamePatternStr + "]");
         ((ContextAwareBase)this).addError("See also http://logback.qos.ch/codes.html#sat_missing_integer_token");
      }

      if (super.tbrp.fileNamePattern.getPrimaryDateTokenConverter() == null) {
         var1 = true;
         ((ContextAwareBase)this).addError(MISSING_DATE_TOKEN + super.tbrp.fileNamePatternStr + "]");
      }

      return var1 ^ true;
   }

   private boolean checkSizeBasedTrigger(File var1, long var2) {
      if (this.invocationGate.isTooSoon(var2)) {
         return false;
      } else if (var1 == null) {
         ((ContextAwareBase)this).addWarn("activeFile == null");
         return false;
      } else if (this.maxFileSize == null) {
         ((ContextAwareBase)this).addWarn("maxFileSize = null");
         return false;
      } else if (var1.length() >= this.maxFileSize.getSize()) {
         super.elapsedPeriodsFileName = super.tbrp.fileNamePatternWithoutCompSuffix.convertMultipleArguments(new Object[]{super.dateInCurrentPeriod, this.currentPeriodsCounter});
         int var10001 = this.currentPeriodsCounter++;
         return true;
      } else {
         return false;
      }
   }

   public void start() {
      super.start();
      if (this.usage == ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP.Usage.DIRECT) {
         ((ContextAwareBase)this).addWarn("SizeAndTimeBasedFNATP is deprecated. Use SizeAndTimeBasedRollingPolicy instead");
         ((ContextAwareBase)this).addWarn("For more information see http://logback.qos.ch/manual/appenders.html#SizeAndTimeBasedRollingPolicy");
      }

      if (super.isErrorFree()) {
         if (this.maxFileSize == null) {
            ((ContextAwareBase)this).addError("maxFileSize property is mandatory.");
            ((TimeBasedFileNamingAndTriggeringPolicyBase)this).withErrors();
         }

         if (this.checkIncrement != null) {
            SimpleInvocationGate var1;
            var1 = new SimpleInvocationGate(this.checkIncrement);
            this.invocationGate = var1;
         }

         if (!this.validateDateAndIntegerTokens()) {
            ((TimeBasedFileNamingAndTriggeringPolicyBase)this).withErrors();
         } else {
            (super.archiveRemover = this.createArchiveRemover()).setContext(super.context);
            this.computeCurrentPeriodsHighestCounterValue(FileFilterUtil.afterLastSlash(super.tbrp.fileNamePattern.toRegexForFixedDate(super.dateInCurrentPeriod)));
            if (((TimeBasedFileNamingAndTriggeringPolicyBase)this).isErrorFree()) {
               super.started = true;
            }

         }
      }
   }

   public ArchiveRemover createArchiveRemover() {

      FileNamePattern var1 = super.tbrp.fileNamePattern;
      return new SizeAndTimeBasedArchiveRemover(var1, this.rc);
   }

   public void computeCurrentPeriodsHighestCounterValue(String var1) {
      File[] var2;
      if ((var2 = FileFilterUtil.filesInFolderMatchingStemRegex((new File(this.getCurrentPeriodsFileNameWithoutCompressionSuffix())).getParentFile(), var1)) != null && var2.length != 0) {
         this.currentPeriodsCounter = FileFilterUtil.findHighestCounter(var2, var1);
         if (super.tbrp.getParentsRawFileProperty() != null || super.tbrp.compressionMode != CompressionMode.NONE) {
            ++this.currentPeriodsCounter;
         }

      } else {
         this.currentPeriodsCounter = 0;
      }
   }

   public boolean isTriggeringEvent(File var1, Object var2) {
      long var3;
      if ((var3 = ((TimeBasedFileNamingAndTriggeringPolicyBase)this).getCurrentTime()) >= super.atomicNextCheck.get()) {
         long var5 = ((TimeBasedFileNamingAndTriggeringPolicyBase)this).computeNextCheck(var3);
         super.atomicNextCheck.set(var5);
         Instant var6 = super.dateInCurrentPeriod;
         super.elapsedPeriodsFileName = super.tbrp.fileNamePatternWithoutCompSuffix.convertMultipleArguments(new Object[]{var6, this.currentPeriodsCounter});
         this.currentPeriodsCounter = 0;
         ((TimeBasedFileNamingAndTriggeringPolicyBase)this).setDateInCurrentPeriod(var3);
         return true;
      } else {
         return this.checkSizeBasedTrigger(var1, var3);
      }
   }

   public Duration getCheckIncrement() {
      return this.checkIncrement;
   }

   public void setCheckIncrement(Duration var1) {
      this.checkIncrement = var1;
   }

   public String getCurrentPeriodsFileNameWithoutCompressionSuffix() {
      return super.tbrp.fileNamePatternWithoutCompSuffix.convertMultipleArguments(new Object[]{super.dateInCurrentPeriod, this.currentPeriodsCounter});
   }

   public void setMaxFileSize(FileSize var1) {
      this.maxFileSize = var1;
   }
}

package ch.qos.logback.core.rolling;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.rolling.helper.TimeBasedArchiveRemover;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.File;
import java.time.Instant;

@NoAutoStart
public class DefaultTimeBasedFileNamingAndTriggeringPolicy extends TimeBasedFileNamingAndTriggeringPolicyBase {
   public void start() {
      super.start();
      if (!super.isErrorFree()) {
         return;
      }

      if (super.tbrp.fileNamePattern.hasIntegerTokenCOnverter()) {
         this.addError("Filename pattern [" + String.valueOf(super.tbrp.fileNamePattern) + "] contains an integer token converter, i.e. %i, INCOMPATIBLE with this configuration. Remove it.");
         return;
      }

      TimeBasedArchiveRemover var1 = new TimeBasedArchiveRemover(super.tbrp.fileNamePattern, super.rc);
      this.archiveRemover = var1;
      this.setContext(this.context);
      this.started = true;
   }

   public boolean isTriggeringEvent(File var1, Object var2) {
      long var5 = ((TimeBasedFileNamingAndTriggeringPolicyBase)this).getCurrentTime();
      if (var5 >= super.atomicNextCheck.get()) {
         long var3 = ((TimeBasedFileNamingAndTriggeringPolicyBase)this).computeNextCheck(var5);
         this.atomicNextCheck.set(var3);
         Instant var6 = this.dateInCurrentPeriod;
         this.addInfo("Elapsed period: " + var6.toString());
         this.elapsedPeriodsFileName = this.tbrp.fileNamePatternWithoutCompSuffix.convert(var6);
         ((TimeBasedFileNamingAndTriggeringPolicyBase)this).setDateInCurrentPeriod(var5);
         return true;
      } else {
         return false;
      }
   }

   public String toString() {
      return "c.q.l.core.rolling.DefaultTimeBasedFileNamingAndTriggeringPolicy";
   }
}

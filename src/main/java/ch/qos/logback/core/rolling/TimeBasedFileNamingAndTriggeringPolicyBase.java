package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.RollingCalendar;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.File;
import java.time.Instant;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicLong;

public abstract class TimeBasedFileNamingAndTriggeringPolicyBase extends ContextAwareBase implements TimeBasedFileNamingAndTriggeringPolicy {
   private static String COLLIDING_DATE_FORMAT_URL;
   protected TimeBasedRollingPolicy tbrp;
   protected ArchiveRemover archiveRemover;
   protected String elapsedPeriodsFileName;
   protected RollingCalendar rc;
   protected long artificialCurrentTime;
   protected AtomicLong atomicNextCheck;
   protected Instant dateInCurrentPeriod;
   protected boolean started;
   protected boolean errorFree;

   public TimeBasedFileNamingAndTriggeringPolicyBase() {




      super();
      this.archiveRemover = null;
      this.artificialCurrentTime = -1L;
      AtomicLong var1;
      var1 = new AtomicLong(0L);
      this.atomicNextCheck = var1;
      this.dateInCurrentPeriod = null;
      this.started = false;
      this.errorFree = true;
   }

   public boolean isStarted() {
      return this.started;
   }

   public void start() {
      DateTokenConverter var1;
      if ((var1 = this.tbrp.fileNamePattern.getPrimaryDateTokenConverter()) != null) {
         if (var1.getZoneId() != null) {
            TimeZone var2 = TimeZone.getTimeZone(var1.getZoneId());
            RollingCalendar var3;
            var3 = new RollingCalendar(var1.getDatePattern(), var2, Locale.getDefault());
            this.rc = var3;
         } else {
            RollingCalendar var6;
            var6 = new RollingCalendar(var1.getDatePattern());
            this.rc = var6;
         }

         ((ContextAwareBase)this).addInfo("The date pattern is '" + var1.getDatePattern() + "' from file name pattern '" + this.tbrp.fileNamePattern.getPattern() + "'.");
         this.rc.printPeriodicity(this);
         if (!this.rc.isCollisionFree()) {
            ((ContextAwareBase)this).addError("The date format in FileNamePattern will result in collisions in the names of archived log files.");
            ((ContextAwareBase)this).addError("For more information, please visit " + COLLIDING_DATE_FORMAT_URL);
            this.withErrors();
         } else {
            long var4 = this.getCurrentTime();
            this.setDateInCurrentPeriod(var4);
            if (this.tbrp.getParentsRawFileProperty() != null) {
               File var7;
               File var10000 = var7 = new File(this.tbrp.getParentsRawFileProperty());
               if (var7.exists() && var7.canRead()) {
                  var4 = var7.lastModified();
                  this.setDateInCurrentPeriod(var4);
               }
            }

            ((ContextAwareBase)this).addInfo("Setting initial period to " + String.valueOf(this.dateInCurrentPeriod));
            var4 = this.computeNextCheck(var4);
            this.atomicNextCheck.set(var4);
         }
      } else {
         throw new IllegalStateException("FileNamePattern [" + this.tbrp.fileNamePattern.getPattern() + "] does not contain a valid DateToken");
      }
   }

   public void stop() {
      this.started = false;
   }

   public long computeNextCheck(long var1) {
      return this.rc.getNextTriggeringDate(Instant.ofEpochMilli(var1)).toEpochMilli();
   }

   public String getElapsedPeriodsFileName() {
      return this.elapsedPeriodsFileName;
   }

   public String getCurrentPeriodsFileNameWithoutCompressionSuffix() {
      return this.tbrp.fileNamePatternWithoutCompSuffix.convert(this.dateInCurrentPeriod);
   }

   public void setDateInCurrentPeriod(long var1) {
      this.dateInCurrentPeriod = Instant.ofEpochMilli(var1);
   }

   public void setCurrentTime(long var1) {
      this.artificialCurrentTime = var1;
   }

   public long getCurrentTime() {
      long var1;
      return (var1 = this.artificialCurrentTime) >= 0L ? var1 : System.currentTimeMillis();
   }

   public void setTimeBasedRollingPolicy(TimeBasedRollingPolicy var1) {
      this.tbrp = var1;
   }

   public ArchiveRemover getArchiveRemover() {
      return this.archiveRemover;
   }

   public void withErrors() {
      this.errorFree = false;
   }

   public boolean isErrorFree() {
      return this.errorFree;
   }
}

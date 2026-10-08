package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.spi.ContextAwareBase;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class RollingCalendar extends GregorianCalendar {
   private static final long serialVersionUID = -5937537740925066161L;
   static final TimeZone GMT_TIMEZONE = TimeZone.getTimeZone("GMT");
   PeriodicityType periodicityType;
   String datePattern;

   public RollingCalendar(String var1) {
      this.periodicityType = PeriodicityType.ERRONEOUS;
      this.datePattern = var1;
      this.periodicityType = this.computePeriodicityType();
   }

   public RollingCalendar(String var1, TimeZone var2, Locale var3) {
      super(var2, var3);
      this.periodicityType = PeriodicityType.ERRONEOUS;
      this.datePattern = var1;
      this.periodicityType = this.computePeriodicityType();
   }

   private boolean collision(long var1) {
      SimpleDateFormat var3 = new SimpleDateFormat(this.datePattern);
      var3.setTimeZone(GMT_TIMEZONE);
      return var3.format(new Date(0L)).equals(var3.format(new Date(var1)));
   }

   public static int diffInMonths(long var0, long var2) {
      if (var0 <= var2) {
         Calendar var4 = Calendar.getInstance();
         var4.setTimeInMillis(var0);
         Calendar var5 = Calendar.getInstance();
         var5.setTimeInMillis(var2);
         int var7 = var5.get(1) - var4.get(1);
         int var6 = var5.get(2) - var4.get(2);
         return var7 * 12 + var6;
      } else {
         throw new IllegalArgumentException("startTime cannot be larger than endTime");
      }
   }

   private static Instant innerGetEndOfThisPeriod(Calendar var0, PeriodicityType var1, Instant var2) {
      return innerGetEndOfNextNthPeriod(var0, var1, var2, 1);
   }

   private static Instant innerGetEndOfNextNthPeriod(Calendar var0, PeriodicityType var1, Instant var2, int var3) {
      long var4 = var2.toEpochMilli();
      var0.setTimeInMillis(var4);
      switch (var1) {
         case TOP_OF_HOUR:
            var0.set(12, 0);
            var0.set(13, 0);
            var0.set(14, 0);
            var0.add(11, var3);
            break;
         case TOP_OF_DAY:
            var0.set(11, 0);
            var0.set(12, 0);
            var0.set(13, 0);
            var0.set(14, 0);
            var0.add(5, var3);
            break;
         case TOP_OF_WEEK:
            int var6 = var0.getFirstDayOfWeek();
            var0.set(7, var6);
            var0.set(11, 0);
            var0.set(12, 0);
            var0.set(13, 0);
            var0.set(14, 0);
            var0.add(3, var3);
            break;
         case TOP_OF_MILLISECOND:
            var0.add(14, var3);
            break;
         case TOP_OF_SECOND:
            var0.set(14, 0);
            var0.add(13, var3);
            break;
         case TOP_OF_MINUTE:
            var0.set(13, 0);
            var0.set(14, 0);
            var0.add(12, var3);
            break;
         case HALF_DAY:
         default:
            throw new IllegalStateException("Unknown periodicity type.");
         case TOP_OF_MONTH:
            var0.set(5, 1);
            var0.set(11, 0);
            var0.set(12, 0);
            var0.set(13, 0);
            var0.set(14, 0);
            var0.add(2, var3);
      }
      return Instant.ofEpochMilli(var0.getTimeInMillis());
   }

   public PeriodicityType getPeriodicityType() {
      return this.periodicityType;
   }

   public PeriodicityType computePeriodicityType() {
      GregorianCalendar var1 = new GregorianCalendar(GMT_TIMEZONE, Locale.getDefault());
      Instant var2 = Instant.ofEpochMilli(0L);
      ZoneId var3 = ZoneId.of("UTC");
      if (this.datePattern != null) {
         for (PeriodicityType var7 : PeriodicityType.VALID_ORDERED_LIST) {
            DateTimeFormatter var8 = DateTimeFormatter.ofPattern(this.datePattern).withZone(var3);
            String var9 = var8.format(var2);
            String var10 = var8.format(innerGetEndOfThisPeriod(var1, var7, var2));
            if (var9 != null && var10 != null && !var9.equals(var10)) {
               return var7;
            }
         }
      }
      return PeriodicityType.ERRONEOUS;
   }

   public boolean isCollisionFree() {
      switch (this.periodicityType) {
         case TOP_OF_HOUR:
            return this.collision(43200000L) ^ true;
         case TOP_OF_DAY:
            if (this.collision(604800000L)) {
               return false;
            } else if (this.collision(2678400000L)) {
               return false;
            } else {
               return !this.collision(31536000000L);
            }
         case TOP_OF_WEEK:
            if (this.collision(2937600000L)) {
               return false;
            } else {
               return !this.collision(31622400000L);
            }
         default:
            return true;
      }
   }

   public void printPeriodicity(ContextAwareBase var1) {
      switch (this.periodicityType) {
         case TOP_OF_HOUR:
            var1.addInfo("Roll-over at the top of every hour.");
            break;
         case TOP_OF_DAY:
            var1.addInfo("Roll-over at midnight.");
            break;
         case TOP_OF_WEEK:
            var1.addInfo("Rollover at the start of week.");
            break;
         case TOP_OF_MILLISECOND:
            var1.addInfo("Roll-over every millisecond.");
            break;
         case TOP_OF_SECOND:
            var1.addInfo("Roll-over every second.");
            break;
         case TOP_OF_MINUTE:
            var1.addInfo("Roll-over every minute.");
            break;
         case HALF_DAY:
            var1.addInfo("Roll-over at midday and midnight.");
            break;
         case TOP_OF_MONTH:
            var1.addInfo("Rollover at start of every month.");
            break;
         default:
            var1.addInfo("Unknown periodicity.");
      }
   }

   public long periodBarriersCrossed(long var1, long var3) {
      if (var1 <= var3) {
         long var5 = this.getStartOfCurrentPeriodWithGMTOffsetCorrection(var1, this.getTimeZone());
         var5 = this.getStartOfCurrentPeriodWithGMTOffsetCorrection(var3, this.getTimeZone()) - var5;
         switch (this.periodicityType) {
            case TOP_OF_HOUR:
               return var5 / 3600000L;
            case TOP_OF_DAY:
               return var5 / 86400000L;
            case TOP_OF_WEEK:
               return var5 / 604800000L;
            case TOP_OF_MILLISECOND:
               return var5;
            case TOP_OF_SECOND:
               return var5 / 1000L;
            case TOP_OF_MINUTE:
               return var5 / 60000L;
            case HALF_DAY:
            default:
               throw new IllegalStateException("Unknown periodicity type.");
            case TOP_OF_MONTH:
               return (long) diffInMonths(var1, var3);
         }
      } else {
         throw new IllegalArgumentException("Start cannot come before end");
      }
   }

   public Instant getEndOfNextNthPeriod(Instant var1, int var2) {
      return innerGetEndOfNextNthPeriod(this, this.periodicityType, var1, var2);
   }

   public Instant getNextTriggeringDate(Instant var1) {
      return this.getEndOfNextNthPeriod(var1, 1);
   }

   public long getStartOfCurrentPeriodWithGMTOffsetCorrection(long var1, TimeZone var3) {
      Calendar var10002 = Calendar.getInstance(var3);
      var10002.setTimeInMillis(var1);
      Instant var4 = this.getEndOfNextNthPeriod(Instant.ofEpochMilli(var10002.getTimeInMillis()), 0);
      Calendar var10001 = Calendar.getInstance(var3);
      var10001.setTimeInMillis(var4.toEpochMilli());
      int var5 = var10001.get(15);
      long var6 = (long) (var10001.get(16) + var5);
      return var4.toEpochMilli() + var6;
   }
}
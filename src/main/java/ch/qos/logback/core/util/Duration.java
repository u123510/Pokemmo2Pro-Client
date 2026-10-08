package ch.qos.logback.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Duration {
   private static final String DOUBLE_PART = "([0-9]*(.[0-9]+)?)";
   private static final int DOUBLE_GROUP = 1;
   private static final String UNIT_PART = "(|milli(second)?|second(e)?|minute|hour|day)s?";
   private static final int UNIT_GROUP = 3;
   private static final Pattern DURATION_PATTERN = Pattern.compile("([0-9]*(.[0-9]+)?)\\s*(|milli(second)?|second(e)?|minute|hour|day)s?", 2);
   static final long SECONDS_COEFFICIENT = 1000L;
   static final long MINUTES_COEFFICIENT = 60000L;
   static final long HOURS_COEFFICIENT = 3600000L;
   static final long DAYS_COEFFICIENT = 86400000L;
   final long millis;

   public Duration(long var1) {
      this.millis = var1;
   }

   public static Duration buildByMilliseconds(double var0) {
      return new Duration((long)var0);
   }

   public static Duration buildBySeconds(double var0) {
      return new Duration((long)(var0 * (double)1000.0F));
   }

   public static Duration buildByMinutes(double var0) {
      return new Duration((long)(var0 * (double)60000.0F));
   }

   public static Duration buildByHours(double var0) {
      return new Duration((long)(var0 * (double)3600000.0F));
   }

   public static Duration buildByDays(double var0) {
      return new Duration((long)(var0 * (double)8.64E7F));
   }

   public static Duration buildUnbounded() {
      return new Duration(Long.MAX_VALUE);
   }

   public static Duration valueOf(String var0) {
      Matcher var1;
      if ((var1 = DURATION_PATTERN.matcher(var0)).matches()) {
         var0 = var1.group(1);
         String var5;
         String var10000 = var5 = var1.group(3);
         double var2 = Double.valueOf(var0);
         if (!var10000.equalsIgnoreCase("milli") && !var5.equalsIgnoreCase("millisecond") && var5.length() != 0) {
            if (!var5.equalsIgnoreCase("second") && !var5.equalsIgnoreCase("seconde")) {
               if (var5.equalsIgnoreCase("minute")) {
                  return buildByMinutes(var2);
               } else if (var5.equalsIgnoreCase("hour")) {
                  return buildByHours(var2);
               } else if (var5.equalsIgnoreCase("day")) {
                  return buildByDays(var2);
               } else {
                  throw new IllegalStateException("Unexpected " + var5);
               }
            } else {
               return buildBySeconds(var2);
            }
         } else {
            return buildByMilliseconds(var2);
         }
      } else {
         throw new IllegalArgumentException("String value [" + var0 + "] is not in the expected format.");
      }
   }

   public long getMilliseconds() {
      return this.millis;
   }

   public String toString() {
      long var1;
      if ((var1 = this.millis) < 1000L) {
         return var1 + " milliseconds";
      } else if (var1 < 60000L) {
         return var1 / 1000L + " seconds";
      } else {
         return var1 < 3600000L ? var1 / 60000L + " minutes" : var1 / 3600000L + " hours";
      }
   }
}

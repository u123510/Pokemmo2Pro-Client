package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.pattern.DynamicConverter;
import ch.qos.logback.core.util.CachingDateFormatter;
import ch.qos.logback.core.util.DatePatternToRegexUtil;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

public class DateTokenConverter extends DynamicConverter implements MonoTypedConverter {
   public static final String CONVERTER_KEY = "d";
   public static final String AUXILIARY_TOKEN = "AUX";
   public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";
   private String datePattern;
   private ZoneId zoneId;
   private CachingDateFormatter cdf;
   private boolean primary = true;

   public void start() {
      if ((this.datePattern = ((DynamicConverter)this).getFirstOption()) == null) {
         this.datePattern = "yyyy-MM-dd";
      }

      List var1;
      if ((var1 = ((DynamicConverter)this).getOptionList()) != null) {
         for(int var2 = 1; var2 < var1.size(); ++var2) {
            String var3 = (String)var1.get(var2);
            if ("AUX".equalsIgnoreCase(var3)) {
               this.primary = false;
            } else {
               this.zoneId = ZoneId.of(var3);
            }
         }
      }

      CachingDateFormatter var5 = new CachingDateFormatter(this.datePattern, this.zoneId);
      this.cdf = var5;
   }

   public String convert(Date var1) {
      return this.cdf.format(var1.getTime());
   }

   public String convert(Instant var1) {
      return this.cdf.format(var1.toEpochMilli());
   }

   public String convert(Object var1) {
      if (var1 != null) {
         if (var1 instanceof Date) {
            return this.convert((Date)var1);
         } else if (var1 instanceof Instant) {
            return this.convert((Instant)var1);
         } else {
            String var10002 = String.valueOf(var1);
            throw new IllegalArgumentException("Cannot convert " + var10002 + " of type" + var1.getClass().getName());
         }
      } else {
         throw new IllegalArgumentException("Null argument forbidden");
      }
   }

   public String getDatePattern() {
      return this.datePattern;
   }

   public ZoneId getZoneId() {
      return this.zoneId;
   }

   public boolean isApplicable(Object var1) {
      if (var1 instanceof Date) {
         return true;
      } else {
         return var1 instanceof Instant;
      }
   }

   public String toRegex() {
      return (new DatePatternToRegexUtil(this.datePattern)).toRegex();
   }

   public boolean isPrimary() {
      return this.primary;
   }
}

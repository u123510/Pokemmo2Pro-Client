package ch.qos.logback.core.util;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public class CachingDateFormatter {
   final DateTimeFormatter dtf;
   final ZoneId zoneId;
   final AtomicReference atomicReference;

   public CachingDateFormatter(String var1) {
      this(var1, (ZoneId)null);
   }

   public CachingDateFormatter(String var1, ZoneId var2) {
      this(var1, var2, (Locale)null);
   }

   public CachingDateFormatter(String var1, ZoneId var2, Locale var3) {
      if (var2 == null) {
         this.zoneId = ZoneId.systemDefault();
      } else {
         this.zoneId = var2;
      }

      if (var3 == null) {
         var3 = Locale.getDefault();
      }

      this.dtf = DateTimeFormatter.ofPattern(var1).withZone(this.zoneId).withLocale(var3);
      CacheTuple var4;
      var4 = new CacheTuple(-1L, (String)null);
      this.atomicReference = new AtomicReference(var4);
   }

   public final String format(long var1) {
      CacheTuple var3;
      if (var1 != (var3 = (CacheTuple)this.atomicReference.get()).lastTimestamp) {


         Instant var5 = Instant.ofEpochMilli(var1);
         String var6 = this.dtf.format(var5);
         CacheTuple var4;
         var4 = new CacheTuple(var1, var6);
         this.atomicReference.compareAndSet(var3, var4);
         var3 = var4;
      }

      return var3.cachedStr;
   }

   static class CacheTuple {
      final long lastTimestamp;
      final String cachedStr;

      public CacheTuple(long var1, String var3) {
         this.lastTimestamp = var1;
         this.cachedStr = var3;
      }
   }
}

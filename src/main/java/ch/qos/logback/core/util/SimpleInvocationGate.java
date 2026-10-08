package ch.qos.logback.core.util;

import java.util.concurrent.atomic.AtomicLong;

public class SimpleInvocationGate implements InvocationGate {
   public static final Duration DEFAULT_INCREMENT = Duration.buildBySeconds((double)60.0F);
   AtomicLong atomicNext;
   final Duration increment;

   public SimpleInvocationGate() {
      this(DEFAULT_INCREMENT);
   }

   public SimpleInvocationGate(Duration var1) {


      super();
      AtomicLong var2;
      var2 = new AtomicLong(0L);
      this.atomicNext = var2;
      this.increment = var1;
   }

   public boolean isTooSoon(long var1) {
      if (var1 == -1L) {
         return false;
      } else {
         long var3;
         if (var1 >= (var3 = this.atomicNext.get())) {

            long var5 = this.increment.getMilliseconds() + var1;
            return this.atomicNext.compareAndSet(var3, var5) ^ true;
         } else {
            return true;
         }
      }
   }
}

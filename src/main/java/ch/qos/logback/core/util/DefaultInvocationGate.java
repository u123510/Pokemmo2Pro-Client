package ch.qos.logback.core.util;

public class DefaultInvocationGate implements InvocationGate {
   static final int MASK_DECREASE_RIGHT_SHIFT_COUNT = 2;
   private static final int MAX_MASK = 65535;
   static final int DEFAULT_MASK = 15;
   private static final long MASK_INCREASE_THRESHOLD = 100L;
   private static final long MASK_DECREASE_THRESHOLD = 800L;
   private volatile long mask;
   private long invocationCounter;
   private long minDelayThreshold;
   private long maxDelayThreshold;
   long lowerLimitForMaskMatch;
   long upperLimitForNoMaskMatch;

   public DefaultInvocationGate() {
      this(100L, 800L, System.currentTimeMillis());
   }

   public DefaultInvocationGate(long var1, long var3, long var5) {
      this.mask = 15L;
      this.invocationCounter = 0L;
      this.minDelayThreshold = var1;
      this.maxDelayThreshold = var3;
      this.lowerLimitForMaskMatch = var5 + var1;
      this.upperLimitForNoMaskMatch = var5 + var3;
   }

   private void updateLimits(long var1) {
      this.lowerLimitForMaskMatch = var1 + this.minDelayThreshold;
      this.upperLimitForNoMaskMatch = var1 + this.maxDelayThreshold;
   }

   private void increaseMask() {
      if (this.mask < 65535L) {
         this.mask = this.mask << 1 | 1L;
      }
   }

   private void decreaseMask() {
      this.mask >>>= 2;
   }

   public final boolean isTooSoon(long var1) {
      long var3;
      long var10000 = var3 = this.invocationCounter;
      this.invocationCounter = var3 + 1L;
      boolean var5;
      if ((var10000 & this.mask) == this.mask) {
         var5 = true;
      } else {
         var5 = false;
      }

      if (var5) {
         if (var1 < this.lowerLimitForMaskMatch) {
            this.increaseMask();
         }

         this.updateLimits(var1);
      } else if (var1 > this.upperLimitForNoMaskMatch) {
         this.decreaseMask();
         this.updateLimits(var1);
         return false;
      }

      return var5 ^ true;
   }

   public long getMask() {
      return this.mask;
   }

   public long getInvocationCounter() {
      return this.invocationCounter;
   }
}

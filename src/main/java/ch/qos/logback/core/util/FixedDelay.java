package ch.qos.logback.core.util;

public class FixedDelay implements DelayStrategy {
   private final long subsequentDelay;
   private long nextDelay;

   public FixedDelay(long var1, long var3) {
      this.nextDelay = var1;
      this.subsequentDelay = var3;
   }

   public FixedDelay(int var1) {
      this((long)var1, (long)var1);
   }

   public long nextDelay() {
      long var10000 = this.nextDelay;
      this.nextDelay = this.subsequentDelay;
      return var10000;
   }
}

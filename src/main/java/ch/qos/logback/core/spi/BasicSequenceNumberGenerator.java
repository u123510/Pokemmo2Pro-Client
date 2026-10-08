package ch.qos.logback.core.spi;

import java.util.concurrent.atomic.AtomicLong;

public class BasicSequenceNumberGenerator extends ContextAwareBase implements SequenceNumberGenerator {
   private final AtomicLong atomicLong;

   public BasicSequenceNumberGenerator() {

      super();
      AtomicLong var1;
      var1 = new AtomicLong();
      this.atomicLong = var1;
   }

   public long nextSequenceNumber() {
      return this.atomicLong.incrementAndGet();
   }
}

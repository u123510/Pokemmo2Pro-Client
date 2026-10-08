package ch.qos.logback.core.spi;

public abstract interface SequenceNumberGenerator extends ch.qos.logback.core.spi.ContextAware {
    public abstract long nextSequenceNumber();
}


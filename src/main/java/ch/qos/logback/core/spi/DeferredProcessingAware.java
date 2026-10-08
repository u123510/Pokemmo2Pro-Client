package ch.qos.logback.core.spi;

public abstract interface DeferredProcessingAware {
    public abstract void prepareForDeferredProcessing();
}


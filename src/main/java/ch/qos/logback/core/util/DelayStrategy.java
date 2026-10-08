package ch.qos.logback.core.util;

public abstract interface DelayStrategy {
    public abstract long nextDelay();
}


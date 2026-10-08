package ch.qos.logback.core.spi;

public abstract interface LifeCycle {
    public abstract void start();
    public abstract void stop();
    public abstract boolean isStarted();
}


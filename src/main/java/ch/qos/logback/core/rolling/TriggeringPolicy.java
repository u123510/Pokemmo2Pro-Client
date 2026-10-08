package ch.qos.logback.core.rolling;

public abstract interface TriggeringPolicy extends ch.qos.logback.core.spi.LifeCycle {
    public boolean isTriggeringEvent(java.io.File arg0, java.lang.Object arg1);

}


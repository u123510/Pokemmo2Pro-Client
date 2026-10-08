package ch.qos.logback.core.spi;

public abstract interface PropertyDefiner extends ch.qos.logback.core.spi.ContextAware {
    public abstract java.lang.String getPropertyValue();
}


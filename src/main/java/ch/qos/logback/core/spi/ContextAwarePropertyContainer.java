package ch.qos.logback.core.spi;

public abstract interface ContextAwarePropertyContainer extends ch.qos.logback.core.spi.PropertyContainer, ch.qos.logback.core.spi.ContextAware {
    public abstract java.lang.String subst(java.lang.String arg0);
}


package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.spi.ContextAware;

public interface LoggerContextAware extends ContextAware {
    void setLoggerContext(LoggerContext context);
}

package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.spi.ContextAware;

public interface Configurator extends ContextAware {
    ExecutionStatus configure(LoggerContext context);

    enum ExecutionStatus {
        NEUTRAL,
        INVOKE_NEXT_IF_ANY,
        DO_NOT_INVOKE_NEXT_IF_ANY
    }
}

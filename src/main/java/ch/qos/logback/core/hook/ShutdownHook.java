package ch.qos.logback.core.hook;

import ch.qos.logback.core.spi.ContextAware;

public interface ShutdownHook extends Runnable, ContextAware {
}

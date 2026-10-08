package ch.qos.logback.classic.boolex;

import ch.qos.logback.classic.spi.ILoggingEvent;

public interface IEvaluator {
    boolean doEvaluate(ILoggingEvent event);
}

package ch.qos.logback.classic.boolex;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.boolex.EventEvaluatorBase;

public class OnErrorEvaluator extends EventEvaluatorBase<ILoggingEvent> {
    @Override
    public boolean evaluate(ILoggingEvent event) {
        return event.getLevel().levelInt >= 40000;
    }
}

package ch.qos.logback.classic.net;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.classic.spi.LoggingEventVO;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import java.io.Serializable;

public class LoggingEventPreSerializationTransformer implements PreSerializationTransformer<ILoggingEvent> {
    @Override
    public Serializable transform(ILoggingEvent event) {
        if (event == null) {
            return null;
        }
        if (event instanceof LoggingEvent) {
            return LoggingEventVO.build(event);
        }
        if (event instanceof LoggingEventVO) {
            return (LoggingEventVO) event;
        }
        throw new IllegalArgumentException("Unsupported type " + event.getClass().getName());
    }
}

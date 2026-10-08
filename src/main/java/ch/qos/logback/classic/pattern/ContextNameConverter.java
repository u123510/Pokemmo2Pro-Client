package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

public class ContextNameConverter extends ClassicConverter {
    @Override
    public String convert(ILoggingEvent value) {
        return value.getLoggerContextVO().getName();
    }
}

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

public class ThreadConverter extends ClassicConverter {
    @Override
    public String convert(ILoggingEvent value) {
        return value.getThreadName();
    }
}

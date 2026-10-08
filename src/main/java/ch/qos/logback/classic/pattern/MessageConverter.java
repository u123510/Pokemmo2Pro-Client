package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

public class MessageConverter extends ClassicConverter {
    @Override
    public String convert(ILoggingEvent value) {
        return value.getFormattedMessage();
    }
}

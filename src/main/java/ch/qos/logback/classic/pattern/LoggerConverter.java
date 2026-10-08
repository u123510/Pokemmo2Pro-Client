package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

public class LoggerConverter extends NamedConverter {
    @Override
    public String getFullyQualifiedName(ILoggingEvent event) {
        return event.getLoggerName();
    }
}

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

public class LineOfCallerConverter extends ClassicConverter {
    @Override
    public String convert(ILoggingEvent event) {
        StackTraceElement[] callerData = event.getCallerData();
        if (callerData != null && callerData.length > 0) {
            return Integer.toString(callerData[0].getLineNumber());
        }
        return "?";
    }
}

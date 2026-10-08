package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

public class FileOfCallerConverter extends ClassicConverter {
    @Override
    public String convert(ILoggingEvent event) {
        StackTraceElement[] callerData = event.getCallerData();
        if (callerData != null && callerData.length > 0) {
            return callerData[0].getFileName();
        }
        return "?";
    }
}

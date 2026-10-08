package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

public class MethodOfCallerConverter extends ClassicConverter {
    @Override public String convert(ILoggingEvent event) {
        StackTraceElement[] callerData = event.getCallerData();
        return callerData != null && callerData.length > 0 ? callerData[0].getMethodName() : "?";
    }
}

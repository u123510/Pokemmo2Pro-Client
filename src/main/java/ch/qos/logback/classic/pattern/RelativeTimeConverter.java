package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

public class RelativeTimeConverter extends ClassicConverter {
    private long lastTimestamp = -1L;
    private String timesmapCache;

    @Override public synchronized String convert(ILoggingEvent event) {
        long timestamp = event.getTimeStamp();
        if (lastTimestamp != timestamp) {
            lastTimestamp = timestamp;
            timesmapCache = Long.toString(timestamp - event.getLoggerContextVO().getBirthTime());
        }
        return timesmapCache;
    }
}

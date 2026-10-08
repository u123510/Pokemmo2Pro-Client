package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

public class MicrosecondConverter extends ClassicConverter {
    @Override public String convert(ILoggingEvent event) {
        int value = event.getNanoseconds() / 1000 % 1000;
        if (value >= 100) return Integer.toString(value);
        if (value >= 10) return "0" + value;
        return "00" + value;
    }
}

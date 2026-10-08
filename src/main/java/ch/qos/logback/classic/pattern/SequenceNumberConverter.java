package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

public class SequenceNumberConverter extends ClassicConverter {
    @Override public void start() {
        if (getContext() == null) return;
        if (getContext().getSequenceNumberGenerator() == null) {
            addWarn("It looks like no <sequenceNumberGenerator> was defined in Logback configuration.");
        }
        super.start();
    }
    @Override public String convert(ILoggingEvent event) {
        return Long.toString(event.getSequenceNumber());
    }
}

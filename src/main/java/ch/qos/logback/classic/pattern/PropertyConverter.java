package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

public final class PropertyConverter extends ClassicConverter {
    private String key;

    @Override public void start() {
        String option = getFirstOption();
        if (option != null) {
            key = option;
            super.start();
        }
    }

    public String getKey() { return key; }

    @Override public String convert(ILoggingEvent event) {
        if (key == null) return "Property_HAS_NO_KEY";
        String value = event.getLoggerContextVO().getPropertyMap().get(key);
        return value != null ? value : System.getProperty(key);
    }
}

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Map;

public class MDCConverter extends ClassicConverter {
    private String key;
    private String defaultValue = "";

    private String outputMDCForAllKeys(Map<String, String> map) {
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (first) first = false; else result.append(", ");
            result.append(entry.getKey()).append('=').append(entry.getValue());
        }
        return result.toString();
    }

    @Override public void start() {
        String[] values = OptionHelper.extractDefaultReplacement(getFirstOption());
        key = values[0];
        if (values[1] != null) defaultValue = values[1];
        super.start();
    }

    @Override public void stop() { key = null; super.stop(); }

    @Override public String convert(ILoggingEvent event) {
        Map<String, String> map = event.getMDCPropertyMap();
        if (map == null) return defaultValue;
        if (key == null) return outputMDCForAllKeys(map);
        String value = map.get(key);
        return value == null ? defaultValue : value;
    }

    public String getKey() { return key; }
}

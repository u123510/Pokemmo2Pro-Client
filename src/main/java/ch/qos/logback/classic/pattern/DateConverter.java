package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.util.CachingDateFormatter;
import java.time.ZoneId;
import java.util.List;
import java.util.Locale;

public class DateConverter extends ClassicConverter {
    private long lastTimestamp;
    private String timestampStrCache;
    private CachingDateFormatter cachingDateFormatter;

    public DateConverter() {
        lastTimestamp = -1L;
        timestampStrCache = null;
        cachingDateFormatter = null;
    }

    @Override public void start() {
        String pattern = getFirstOption();
        if (pattern == null) pattern = "yyyy-MM-dd HH:mm:ss,SSS";
        if ("ISO8601".equals(pattern)) pattern = "yyyy-MM-dd HH:mm:ss,SSS";
        List<String> options = getOptionList();
        ZoneId zoneId = null;
        if (options != null && options.size() > 1) {
            zoneId = ZoneId.of(options.get(1));
            addInfo("Setting zoneId to \"" + zoneId + "\"");
        }
        Locale locale = null;
        if (options != null && options.size() > 2) {
            locale = Locale.forLanguageTag(options.get(2));
            addInfo("Setting locale to \"" + locale + "\"");
        }
        try {
            cachingDateFormatter = new CachingDateFormatter(pattern, zoneId, locale);
        } catch (IllegalArgumentException ex) {
            addWarn("Could not instantiate SimpleDateFormat with pattern " + pattern, ex);
            cachingDateFormatter = new CachingDateFormatter("yyyy-MM-dd HH:mm:ss,SSS", zoneId);
        }
        super.start();
    }

    @Override public String convert(ILoggingEvent event) {
        return cachingDateFormatter.format(event.getTimeStamp());
    }
}

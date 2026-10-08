package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
import f.Fg0;
import f.HA0;
import java.util.HashMap;
import java.util.Map;

public class DynamicThresholdFilter extends TurboFilter {
    private final Map<String, Level> valueLevelMap = new HashMap<>();
    private Level defaultThreshold = Level.ERROR;
    private String key;
    private FilterReply onHigherOrEqual = FilterReply.NEUTRAL;
    private FilterReply onLower = FilterReply.DENY;
    public String getKey() { return key; }
    public void setKey(String key) { this.key = key; }
    public Level getDefaultThreshold() { return defaultThreshold; }
    public void setDefaultThreshold(Level value) { defaultThreshold = value; }
    public FilterReply getOnHigherOrEqual() { return onHigherOrEqual; }
    public void setOnHigherOrEqual(FilterReply value) { onHigherOrEqual = value; }
    public FilterReply getOnLower() { return onLower; }
    public void setOnLower(FilterReply value) { onLower = value; }
    public void addMDCValueLevelPair(MDCValueLevelPair pair) {
        if (valueLevelMap.containsKey(pair.getValue())) addError(pair.getValue() + " has been already set");
        else valueLevelMap.put(pair.getValue(), pair.getLevel());
    }
    @Override public void start() {
        if (key == null) addError("No key name was specified");
        super.start();
    }
    @Override public FilterReply decide(HA0 marker, Logger logger, Level level, String format, Object[] params, Throwable t) {
        if (key == null) throw new IllegalArgumentException("key parameter cannot be null");
        if (Fg0.Tl == null) throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        String value = Fg0.Tl.get(key);
        if (!isStarted()) return FilterReply.NEUTRAL;
        Level threshold = value == null ? defaultThreshold : valueLevelMap.getOrDefault(value, defaultThreshold);
        return level.isGreaterOrEqual(threshold) ? onHigherOrEqual : onLower;
    }
}

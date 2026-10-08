package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
import f.Fg0;
import f.HA0;

public class MDCFilter extends MatchingFilter {
    private String MDCKey;
    private String value;
    @Override public void start() {
        boolean error = false;
        if (value == null) { addError("'value' parameter is mandatory. Cannot start."); error = true; }
        if (MDCKey == null) { addError("'MDCKey' parameter is mandatory. Cannot start."); error = true; }
        if (!error) start = true;
    }
    @Override public FilterReply decide(HA0 marker, Logger logger, Level level, String format, Object[] params, Throwable t) {
        if (!isStarted()) return FilterReply.NEUTRAL;
        if (MDCKey == null) throw new IllegalArgumentException("key parameter cannot be null");
        if (Fg0.Tl == null) throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        return value.equals(Fg0.Tl.get(MDCKey)) ? onMatch : onMismatch;
    }
    public void setValue(String value) { this.value = value; }
    public void setMDCKey(String key) { this.MDCKey = key; }
}

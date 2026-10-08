package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
import f.HA0;
import f.xu0_0;
import f.nf0_1;

public class MarkerFilter extends MatchingFilter {
    private HA0 markerToMatch;
    @Override public void start() {
        if (markerToMatch != null) super.start();
        else addError("The marker property must be set for [" + getName() + "]");
    }
    @Override public FilterReply decide(HA0 marker, Logger logger, Level level, String format, Object[] params, Throwable t) {
        if (!isStarted()) return FilterReply.NEUTRAL;
        if (marker == null) return onMismatch;
        return ((nf0_1) marker).gJ(markerToMatch) ? onMatch : onMismatch;
    }
    public void setMarker(String marker) {
        if (marker != null) markerToMatch = xu0_0.N3(marker);
    }
}

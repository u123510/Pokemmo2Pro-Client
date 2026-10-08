package ch.qos.logback.classic.turbo;

import ch.qos.logback.core.spi.FilterReply;

public abstract class MatchingFilter extends TurboFilter {
    protected FilterReply onMatch = FilterReply.NEUTRAL;
    protected FilterReply onMismatch = FilterReply.NEUTRAL;
    public final void setOnMatch(String value) {
        if ("NEUTRAL".equals(value)) onMatch = FilterReply.NEUTRAL;
        else if ("ACCEPT".equals(value)) onMatch = FilterReply.ACCEPT;
        else if ("DENY".equals(value)) onMatch = FilterReply.DENY;
    }
    public final void setOnMismatch(String value) {
        if ("NEUTRAL".equals(value)) onMismatch = FilterReply.NEUTRAL;
        else if ("ACCEPT".equals(value)) onMismatch = FilterReply.ACCEPT;
        else if ("DENY".equals(value)) onMismatch = FilterReply.DENY;
    }
}

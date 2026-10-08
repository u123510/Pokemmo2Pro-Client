package ch.qos.logback.core.filter;

import ch.qos.logback.core.spi.FilterReply;

public abstract class AbstractMatcherFilter<E> extends Filter<E> {
    protected FilterReply onMatch;
    protected FilterReply onMismatch;

    public AbstractMatcherFilter() {
        onMatch = FilterReply.NEUTRAL;
        onMismatch = FilterReply.NEUTRAL;
    }

    public final void setOnMatch(FilterReply onMatch) { this.onMatch = onMatch; }
    public final void setOnMismatch(FilterReply onMismatch) { this.onMismatch = onMismatch; }
    public final FilterReply getOnMatch() { return onMatch; }
    public final FilterReply getOnMismatch() { return onMismatch; }
}

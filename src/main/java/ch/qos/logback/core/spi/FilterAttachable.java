package ch.qos.logback.core.spi;

public abstract interface FilterAttachable<E> {
    public abstract void addFilter(ch.qos.logback.core.filter.Filter arg0);
    public abstract void clearAllFilters();
    public abstract java.util.List getCopyOfAttachedFiltersList();
    public abstract ch.qos.logback.core.spi.FilterReply getFilterChainDecision(E arg0);
}

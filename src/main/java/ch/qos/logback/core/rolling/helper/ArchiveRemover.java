package ch.qos.logback.core.rolling.helper;

public abstract interface ArchiveRemover extends ch.qos.logback.core.spi.ContextAware {
    public void clean(java.time.Instant arg0);

    public void setMaxHistory(int arg0);

    public void setTotalSizeCap(long arg0);

    public java.util.concurrent.Future cleanAsynchronously(java.time.Instant arg0);

}


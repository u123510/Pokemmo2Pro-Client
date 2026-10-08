package ch.qos.logback.core.spi;

public abstract interface ComponentTracker {
    public static final int DEFAULT_TIMEOUT = 1800000;
    public static final int DEFAULT_MAX_COMPONENTS = 2147483647;

    public abstract int getComponentCount();
    public abstract java.lang.Object find(java.lang.String arg0);
    public abstract java.lang.Object getOrCreate(java.lang.String arg0, long arg1);
    public abstract void removeStaleComponents(long arg0);
    public abstract void endOfLife(java.lang.String arg0);
    public abstract java.util.Collection allComponents();
    public abstract java.util.Set allKeys();
}


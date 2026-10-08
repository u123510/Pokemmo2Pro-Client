package ch.qos.logback.core.util;

public abstract interface InvocationGate {
    public static final long TIME_UNAVAILABLE = -1L;

    public abstract boolean isTooSoon(long arg0);
}


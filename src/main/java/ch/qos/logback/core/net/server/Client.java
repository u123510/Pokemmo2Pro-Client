package ch.qos.logback.core.net.server;

public abstract interface Client extends java.lang.Runnable, java.io.Closeable {
    public void close();

}


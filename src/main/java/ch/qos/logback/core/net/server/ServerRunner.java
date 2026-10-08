package ch.qos.logback.core.net.server;

public abstract interface ServerRunner extends ch.qos.logback.core.spi.ContextAware, java.lang.Runnable {
    public boolean isRunning();

    public void stop() throws java.io.IOException;

    public void accept(ch.qos.logback.core.net.server.ClientVisitor arg0);

}

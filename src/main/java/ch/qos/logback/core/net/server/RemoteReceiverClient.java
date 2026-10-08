package ch.qos.logback.core.net.server;

abstract interface RemoteReceiverClient extends ch.qos.logback.core.net.server.Client, ch.qos.logback.core.spi.ContextAware {
    public void setQueue(java.util.concurrent.BlockingQueue arg0);

    public boolean offer(java.io.Serializable arg0);

}


package ch.qos.logback.core.net.server;

import java.io.IOException;

public interface ServerListener extends java.io.Closeable {
    Client acceptClient() throws IOException, InterruptedException;

    void close();
}
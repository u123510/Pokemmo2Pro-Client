package ch.qos.logback.classic.net.server;

import java.util.concurrent.Executor;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.net.server.Client;
import ch.qos.logback.core.net.server.ConcurrentServerRunner;
import ch.qos.logback.core.net.server.ServerListener;

class RemoteAppenderServerRunner extends ConcurrentServerRunner {
    public RemoteAppenderServerRunner(ServerListener listener, Executor executor) {
        super(listener, executor);
    }

    public boolean configureClient(RemoteAppenderClient client) {
        client.setLoggerContext((LoggerContext) getContext());
        return true;
    }

    @Override
    public boolean configureClient(Client client) {
        return configureClient((RemoteAppenderClient) client);
    }
}

package ch.qos.logback.core.net.server;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.concurrent.Executor;
import javax.net.ServerSocketFactory;

public abstract class AbstractServerSocketAppender<E>
extends AppenderBase<E> {
    public static final int DEFAULT_BACKLOG = 50;
    public static final int DEFAULT_CLIENT_QUEUE_SIZE = 100;
    private int port = 4560;
    private int backlog = 50;
    private int clientQueueSize = 100;
    private String address;
    private ServerRunner runner;

    @Override
    public void start() {
        if (this.isStarted()) {
            return;
        }
        try {
            ServerSocket serverSocket = this.getServerSocketFactory().createServerSocket(this.getPort(), this.getBacklog(), this.getInetAddress());
            ServerListener serverListener = this.createServerListener(serverSocket);
            ServerRunner serverRunner = this.createServerRunner(serverListener, this.getContext().getExecutorService());
            this.runner = serverRunner;
            serverRunner.setContext(this.getContext());
            this.getContext().getExecutorService().execute(this.runner);
            super.start();
        } catch (Exception e) {
            this.addError("server startup error: " + String.valueOf(e), e);
        }
    }

    public ServerListener createServerListener(ServerSocket serverSocket) {
        return new RemoteReceiverServerListener(serverSocket);
    }

    public ServerRunner createServerRunner(ServerListener serverListener, Executor executor) {
        int clientQueueSize = this.getClientQueueSize();
        return new RemoteReceiverServerRunner(serverListener, executor, clientQueueSize);
    }

    @Override
    public void stop() {
        if (this.isStarted()) {
            try {
                this.runner.stop();
                super.stop();
            } catch (IOException e) {
                this.addError("server shutdown error: " + String.valueOf(e), e);
            }
        }
    }

    @Override
    public void append(E event) {
        if (event == null) {
            return;
        }
        this.postProcessEvent(event);
        final Serializable serializable = this.getPST().transform(event);
        this.runner.accept(new ClientVisitor() {
            @Override
            public void visit(Client client) {
                ((RemoteReceiverClient) client).offer(serializable);
            }
        });
    }

    public abstract void postProcessEvent(E event);

    public abstract PreSerializationTransformer<E> getPST();

    public ServerSocketFactory getServerSocketFactory() throws Exception {
        return ServerSocketFactory.getDefault();
    }

    public InetAddress getInetAddress() throws UnknownHostException {
        if (this.getAddress() == null) {
            return null;
        }
        return InetAddress.getByName(this.getAddress());
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getBacklog() {
        return this.backlog;
    }

    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getClientQueueSize() {
        return this.clientQueueSize;
    }

    public void setClientQueueSize(int clientQueueSize) {
        this.clientQueueSize = clientQueueSize;
    }
}

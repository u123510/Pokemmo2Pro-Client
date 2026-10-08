package ch.qos.logback.classic.net.server;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.concurrent.Executor;

import javax.net.ServerSocketFactory;

import ch.qos.logback.classic.net.ReceiverBase;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.net.server.ServerListener;
import ch.qos.logback.core.net.server.ServerRunner;
import ch.qos.logback.core.util.CloseUtil;

public class ServerSocketReceiver extends ReceiverBase {
    public static final int DEFAULT_BACKLOG = 50;
    private int port = 4560;
    private int backlog = 50;
    private String address;
    private ServerSocket serverSocket;
    private ServerRunner runner;

    public ServerSocketReceiver() {
        super();
    }

    public boolean shouldStart() {
        try {
            ServerSocketFactory factory = getServerSocketFactory();
            int actualPort = getPort();
            int actualBacklog = getBacklog();
            InetAddress inetAddress = getInetAddress();
            ServerSocket socket = factory.createServerSocket(actualPort, actualBacklog, inetAddress);
            ServerListener listener = createServerListener(socket);
            Context context = getContext();
            Executor executor = context.getExecutorService();
            runner = createServerRunner(listener, executor);
            runner.setContext(context);
            return true;
        } catch (Exception e) {
            addError("server startup error: " + String.valueOf(e), e);
            CloseUtil.closeQuietly(serverSocket);
            return false;
        }
    }

    public ServerListener createServerListener(ServerSocket serverSocket) {
        return new RemoteAppenderServerListener(serverSocket);
    }

    public ServerRunner createServerRunner(ServerListener listener, Executor executor) {
        return new RemoteAppenderServerRunner(listener, executor);
    }

    public Runnable getRunnableTask() {
        return runner;
    }

    public void onStop() {
        try {
            if (runner == null) {
                return;
            }
            runner.stop();
        } catch (java.io.IOException e) {
            addError("server shutdown error: " + String.valueOf(e), e);
        }
    }

    public ServerSocketFactory getServerSocketFactory() {
        return ServerSocketFactory.getDefault();
    }

    public InetAddress getInetAddress() throws java.net.UnknownHostException {
        if (getAddress() == null) {
            return null;
        }
        return InetAddress.getByName(getAddress());
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getBacklog() {
        return backlog;
    }

    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

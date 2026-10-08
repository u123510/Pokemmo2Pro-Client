package ch.qos.logback.core.net.server;

import ch.qos.logback.core.util.CloseUtil;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public abstract class ServerSocketListener
implements ServerListener {
    private final ServerSocket serverSocket;

    public ServerSocketListener(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    private String socketAddressToString(SocketAddress socketAddress) {
        String s = socketAddress.toString();
        int i = s.indexOf("/");
        if (i >= 0) {
            s = s.substring(i + 1);
        }
        return s;
    }

    @Override
    public Client acceptClient() throws IOException, InterruptedException {
        Socket socket = this.serverSocket.accept();
        return this.createClient(this.socketAddressToString(socket.getRemoteSocketAddress()), socket);
    }

    public abstract Client createClient(String id, Socket socket);

    @Override
    public void close() {
        CloseUtil.closeQuietly(this.serverSocket);
    }

    @Override
    public String toString() {
        return this.socketAddressToString(this.serverSocket.getLocalSocketAddress());
    }
}

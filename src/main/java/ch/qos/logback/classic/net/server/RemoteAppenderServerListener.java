package ch.qos.logback.classic.net.server;

import java.net.ServerSocket;
import java.net.Socket;

import ch.qos.logback.core.net.server.ServerSocketListener;

class RemoteAppenderServerListener extends ServerSocketListener {
    public RemoteAppenderServerListener(ServerSocket serverSocket) {
        super(serverSocket);
    }

    public RemoteAppenderClient createClient(String id, Socket socket) {
        return new RemoteAppenderStreamClient(id, socket);
    }
}

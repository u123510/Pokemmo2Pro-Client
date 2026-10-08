package ch.qos.logback.core.net.server;

import java.net.ServerSocket;
import java.net.Socket;

class RemoteReceiverServerListener extends ServerSocketListener {
    public RemoteReceiverServerListener(ServerSocket socket) {
        super(socket);
    }

    public RemoteReceiverClient createClient(String id, Socket socket) {
        return new RemoteReceiverStreamClient(id, socket);
    }

}

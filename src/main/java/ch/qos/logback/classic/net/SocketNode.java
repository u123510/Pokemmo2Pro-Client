package ch.qos.logback.classic.net;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;
import ch.qos.logback.classic.spi.ILoggingEvent;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;

public class SocketNode implements Runnable {
    private Socket socket;
    private LoggerContext context;
    private HardenedLoggingEventInputStream hardenedLoggingEventInputStream;
    private SocketAddress remoteSocketAddress;
    private Logger logger;
    private boolean closed;
    private SimpleSocketServer socketServer;

    public SocketNode(SimpleSocketServer socketServer, Socket socket, LoggerContext context) {
        this.socketServer = socketServer;
        this.socket = socket;
        this.remoteSocketAddress = socket.getRemoteSocketAddress();
        this.context = context;
        this.logger = context.getLogger(SocketNode.class);
    }

    @Override
    public void run() {
        try {
            hardenedLoggingEventInputStream = new HardenedLoggingEventInputStream(
                    new BufferedInputStream(socket.getInputStream()));
        } catch (Exception ex) {
            logger.error("Could not open ObjectInputStream to " + socket, ex);
            closed = true;
        }

        while (!closed) {
            try {
                ILoggingEvent event = (ILoggingEvent) hardenedLoggingEventInputStream.readObject();
                Logger eventLogger = context.getLogger(event.getLoggerName());
                if (eventLogger.isEnabledFor(event.getLevel())) {
                    eventLogger.callAppenders(event);
                }
            } catch (EOFException ex) {
                logger.info("Caught java.io.EOFException closing connection.");
                break;
            } catch (java.net.SocketException ex) {
                logger.info("Caught java.net.SocketException closing connection.");
                break;
            } catch (IOException ex) {
                logger.info("Caught java.io.IOException: " + ex);
                logger.info("Closing connection.");
                break;
            } catch (Exception ex) {
                logger.error("Unexpected exception. Closing connection.", ex);
                break;
            }
        }
        socketServer.socketNodeClosing(this);
        close();
    }

    public void close() {
        if (closed) {
            return;
        }
        closed = true;
        HardenedLoggingEventInputStream input = hardenedLoggingEventInputStream;
        if (input == null) {
            return;
        }
        try {
            input.close();
        } catch (IOException ex) {
            logger.warn("Could not close connection.", ex);
        } finally {
            hardenedLoggingEventInputStream = null;
        }
    }

    @Override
    public String toString() {
        return getClass().getName() + remoteSocketAddress;
    }
}

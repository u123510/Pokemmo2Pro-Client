package ch.qos.logback.classic.net.server;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.HardenedObjectInputStream;
import ch.qos.logback.core.util.CloseUtil;

class RemoteAppenderStreamClient implements RemoteAppenderClient {
    private final String id;
    private final Socket socket;
    private final InputStream inputStream;
    private LoggerContext lc;
    private Logger logger;

    public RemoteAppenderStreamClient(String id, Socket socket) {
        this.id = id;
        this.socket = socket;
        this.inputStream = null;
    }

    public RemoteAppenderStreamClient(String id, InputStream inputStream) {
        this.id = id;
        this.socket = null;
        this.inputStream = inputStream;
    }

    private HardenedObjectInputStream createObjectInputStream() throws IOException {
        if (inputStream != null) {
            return new HardenedLoggingEventInputStream(inputStream);
        }
        return new HardenedLoggingEventInputStream(socket.getInputStream());
    }

    public void setLoggerContext(LoggerContext loggerContext) {
        this.lc = loggerContext;
        this.logger = loggerContext.getLogger(getClass().getPackage().getName());
    }

    public void close() {
        if (socket != null) {
            CloseUtil.closeQuietly(socket);
        }
    }

    public void run() {
        logger.info(String.valueOf(this) + ": connected");
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = createObjectInputStream();
            while (true) {
                Object object;
                try {
                    object = objectInputStream.readObject();
                } catch (EOFException eof) {
                    break;
                }
                ILoggingEvent event = (ILoggingEvent) object;
                Logger eventLogger = lc.getLogger(event.getLoggerName());
                if (eventLogger.isEnabledFor(event.getLevel())) {
                    eventLogger.callAppenders(event);
                }
            }
        } catch (RuntimeException e) {
            logger.error(String.valueOf(this) + ": " + String.valueOf(e));
        } catch (ClassNotFoundException e) {
            logger.error(String.valueOf(this) + ": unknown event class");
        } catch (IOException e) {
            logger.info(String.valueOf(this) + ": " + String.valueOf(e));
        } finally {
            if (objectInputStream != null) {
                CloseUtil.closeQuietly((Closeable) objectInputStream);
            }
            close();
            logger.info(String.valueOf(this) + ": connection closed");
        }
    }

    public String toString() {
        return id;
    }
}

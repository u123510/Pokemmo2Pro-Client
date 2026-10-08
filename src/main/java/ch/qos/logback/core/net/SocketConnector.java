package ch.qos.logback.core.net;

import java.net.Socket;
import java.util.concurrent.Callable;
import javax.net.SocketFactory;

public interface SocketConnector extends Callable {
    Socket call();

    void setExceptionHandler(SocketConnector.ExceptionHandler exceptionHandler);

    void setSocketFactory(SocketFactory socketFactory);

    interface ExceptionHandler {
        void connectionFailed(SocketConnector connector, Exception ex);
    }
}
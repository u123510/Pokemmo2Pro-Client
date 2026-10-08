package ch.qos.logback.classic.net.server;

import javax.net.ServerSocketFactory;

import ch.qos.logback.core.net.ssl.ConfigurableSSLServerSocketFactory;
import ch.qos.logback.core.net.ssl.SSLComponent;
import ch.qos.logback.core.net.ssl.SSLConfiguration;

public class SSLServerSocketReceiver extends ServerSocketReceiver implements SSLComponent {
    private SSLConfiguration ssl;
    private ServerSocketFactory socketFactory;

    public SSLServerSocketReceiver() {
        super();
    }

    public ServerSocketFactory getServerSocketFactory() {
        if (socketFactory == null) {
            try {
                javax.net.ssl.SSLContext context = getSsl().createContext(this);
                socketFactory = new ConfigurableSSLServerSocketFactory(getSsl().getParameters(), context.getServerSocketFactory());
            } catch (Exception e) {
                addError(e.getMessage(), e);
            }
        }
        return socketFactory;
    }

    public SSLConfiguration getSsl() {
        if (ssl == null) {
            ssl = new SSLConfiguration();
        }
        return ssl;
    }

    public void setSsl(SSLConfiguration ssl) {
        this.ssl = ssl;
    }
}

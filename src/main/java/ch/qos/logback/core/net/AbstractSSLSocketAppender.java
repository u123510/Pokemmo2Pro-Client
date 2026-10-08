/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.net;

import ch.qos.logback.core.net.AbstractSocketAppender;
import ch.qos.logback.core.net.ssl.ConfigurableSSLSocketFactory;
import ch.qos.logback.core.net.ssl.SSLComponent;
import ch.qos.logback.core.net.ssl.SSLConfiguration;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;

public abstract class AbstractSSLSocketAppender
extends AbstractSocketAppender
implements SSLComponent {
    private SSLConfiguration ssl;
    private SocketFactory socketFactory;

    @Override
    public SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @Override
    public void start() {
        try {
            SSLContext sslContext = this.getSsl().createContext(this);
            SSLParametersConfiguration sslParametersConfiguration = this.getSsl().getParameters();
            sslParametersConfiguration.setContext(this.getContext());
            this.socketFactory = new ConfigurableSSLSocketFactory(sslParametersConfiguration, sslContext.getSocketFactory());
            super.start();
        }
        catch (Exception exception) {
            this.addError(exception.getMessage(), exception);
        }
    }

    @Override
    public SSLConfiguration getSsl() {
        if (this.ssl == null) {
            this.ssl = new SSLConfiguration();
        }
        return this.ssl;
    }

    @Override
    public void setSsl(SSLConfiguration sSLConfiguration) {
        this.ssl = sSLConfiguration;
    }
}


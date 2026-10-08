/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.net.ssl.SSLConfigurable;
import javax.net.ssl.SSLServerSocket;

public class SSLConfigurableServerSocket
implements SSLConfigurable {
    private final SSLServerSocket delegate;

    public SSLConfigurableServerSocket(SSLServerSocket sSLServerSocket) {
        this.delegate = sSLServerSocket;
    }

    @Override
    public String[] getDefaultProtocols() {
        return this.delegate.getEnabledProtocols();
    }

    @Override
    public String[] getSupportedProtocols() {
        return this.delegate.getSupportedProtocols();
    }

    @Override
    public void setEnabledProtocols(String[] stringArray) {
        this.delegate.setEnabledProtocols(stringArray);
    }

    @Override
    public String[] getDefaultCipherSuites() {
        return this.delegate.getEnabledCipherSuites();
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    @Override
    public void setEnabledCipherSuites(String[] stringArray) {
        this.delegate.setEnabledCipherSuites(stringArray);
    }

    @Override
    public void setNeedClientAuth(boolean bl) {
        this.delegate.setNeedClientAuth(bl);
    }

    @Override
    public void setWantClientAuth(boolean bl) {
        this.delegate.setWantClientAuth(bl);
    }

    @Override
    public void setHostnameVerification(boolean bl) {
    }
}


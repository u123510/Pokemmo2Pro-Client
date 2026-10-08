/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.net.ssl.SSLConfigurableServerSocket;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

public class ConfigurableSSLServerSocketFactory
extends ServerSocketFactory {
    private final SSLParametersConfiguration parameters;
    private final SSLServerSocketFactory delegate;

    public ConfigurableSSLServerSocketFactory(SSLParametersConfiguration sSLParametersConfiguration, SSLServerSocketFactory sSLServerSocketFactory) {
        this.parameters = sSLParametersConfiguration;
        this.delegate = sSLServerSocketFactory;
    }

    @Override
    public ServerSocket createServerSocket(int n, int n2, InetAddress inetAddress) throws IOException {
        SSLServerSocket sSLServerSocket = (SSLServerSocket)this.delegate.createServerSocket(n, n2, inetAddress);
        this.parameters.configure(new SSLConfigurableServerSocket(sSLServerSocket));
        return sSLServerSocket;
    }

    @Override
    public ServerSocket createServerSocket(int n, int n2) throws IOException {
        SSLServerSocket sSLServerSocket = (SSLServerSocket)this.delegate.createServerSocket(n, n2);
        this.parameters.configure(new SSLConfigurableServerSocket(sSLServerSocket));
        return sSLServerSocket;
    }

    @Override
    public ServerSocket createServerSocket(int n) throws IOException {
        SSLServerSocket sSLServerSocket = (SSLServerSocket)this.delegate.createServerSocket(n);
        this.parameters.configure(new SSLConfigurableServerSocket(sSLServerSocket));
        return sSLServerSocket;
    }
}


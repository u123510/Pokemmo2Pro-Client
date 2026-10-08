package ch.qos.logback.core.net.ssl;

public abstract interface SSLConfigurable {
    public abstract java.lang.String[] getDefaultProtocols();
    public abstract java.lang.String[] getSupportedProtocols();
    public abstract void setEnabledProtocols(java.lang.String[] arg0);
    public abstract java.lang.String[] getDefaultCipherSuites();
    public abstract java.lang.String[] getSupportedCipherSuites();
    public abstract void setEnabledCipherSuites(java.lang.String[] arg0);
    public abstract void setNeedClientAuth(boolean arg0);
    public abstract void setWantClientAuth(boolean arg0);
    public abstract void setHostnameVerification(boolean arg0);
}


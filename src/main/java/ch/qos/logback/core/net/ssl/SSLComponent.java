package ch.qos.logback.core.net.ssl;

public abstract interface SSLComponent {
    public abstract ch.qos.logback.core.net.ssl.SSLConfiguration getSsl();
    public abstract void setSsl(ch.qos.logback.core.net.ssl.SSLConfiguration arg0);
}


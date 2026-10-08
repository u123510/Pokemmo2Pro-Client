package ch.qos.logback.core.rolling;

public abstract interface RollingPolicy extends ch.qos.logback.core.spi.LifeCycle {
    public void rollover();

    public java.lang.String getActiveFileName();

    public ch.qos.logback.core.rolling.helper.CompressionMode getCompressionMode();

    public void setParent(ch.qos.logback.core.FileAppender arg0);

}


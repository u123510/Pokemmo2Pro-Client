package ch.qos.logback.core.spi;

public abstract interface ContextAware {
    public abstract void setContext(ch.qos.logback.core.Context arg0);
    public abstract ch.qos.logback.core.Context getContext();
    public abstract void addStatus(ch.qos.logback.core.status.Status arg0);
    public abstract void addInfo(java.lang.String arg0);
    public abstract void addInfo(java.lang.String arg0, java.lang.Throwable arg1);
    public abstract void addWarn(java.lang.String arg0);
    public abstract void addWarn(java.lang.String arg0, java.lang.Throwable arg1);
    public abstract void addError(java.lang.String arg0);
    public abstract void addError(java.lang.String arg0, java.lang.Throwable arg1);
}


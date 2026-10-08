package ch.qos.logback.core.spi;

public abstract interface AppenderAttachable<E> {
    public abstract void addAppender(ch.qos.logback.core.Appender<E> arg0);
    public abstract java.util.Iterator<ch.qos.logback.core.Appender<E>> iteratorForAppenders();
    public abstract ch.qos.logback.core.Appender<E> getAppender(java.lang.String arg0);
    public abstract boolean isAttached(ch.qos.logback.core.Appender<E> arg0);
    public abstract void detachAndStopAllAppenders();
    public abstract boolean detachAppender(ch.qos.logback.core.Appender<E> arg0);
    public abstract boolean detachAppender(java.lang.String arg0);
}

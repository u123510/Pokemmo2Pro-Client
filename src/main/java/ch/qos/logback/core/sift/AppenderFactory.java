package ch.qos.logback.core.sift;

public abstract interface AppenderFactory {
    public abstract ch.qos.logback.core.Appender buildAppender(ch.qos.logback.core.Context arg0, java.lang.String arg1);
}


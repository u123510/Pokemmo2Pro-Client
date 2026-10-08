package ch.qos.logback.classic.spi;

public interface IThrowableProxy {
    String getMessage();
    String getClassName();
    StackTraceElementProxy[] getStackTraceElementProxyArray();
    int getCommonFrames();
    IThrowableProxy getCause();
    IThrowableProxy[] getSuppressed();
    boolean isCyclic();
}

package ch.qos.logback.core.status;

import java.util.Iterator;

public interface Status {
    int INFO = 0;
    int WARN = 1;
    int ERROR = 2;
    int getLevel();
    int getEffectiveLevel();
    Object getOrigin();
    String getMessage();
    Throwable getThrowable();
    @Deprecated
    default Long getDate() { return getTimestamp(); }
    long getTimestamp();
    boolean hasChildren();
    void add(Status status);
    boolean remove(Status status);
    Iterator<Status> iterator();
}

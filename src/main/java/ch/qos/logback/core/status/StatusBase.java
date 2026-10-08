package ch.qos.logback.core.status;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public abstract class StatusBase implements Status {
    private static final List<Status> EMPTY_LIST = new ArrayList<>(0);
    int level;
    final String message;
    final Object origin;
    List<Status> childrenList;
    Throwable throwable;
    long timestamp;

    public StatusBase(int level, String message, Object origin) { this(level, message, origin, null); }
    public StatusBase(int level, String message, Object origin, Throwable throwable) {
        this.level = level;
        this.message = message;
        this.origin = origin;
        this.throwable = throwable;
        timestamp = System.currentTimeMillis();
    }

    public synchronized void add(Status status) {
        if (status == null) throw new NullPointerException("Null values are not valid Status.");
        if (childrenList == null) childrenList = new ArrayList<>();
        childrenList.add(status);
    }
    public synchronized boolean hasChildren() { return childrenList != null && !childrenList.isEmpty(); }
    public synchronized Iterator<Status> iterator() { return (childrenList == null ? EMPTY_LIST : childrenList).iterator(); }
    public synchronized boolean remove(Status status) { return childrenList != null && childrenList.remove(status); }
    public int getLevel() { return level; }
    public synchronized int getEffectiveLevel() { int result = level; for (Status status : (Iterable<Status>) () -> iterator()) result = Math.max(result, status.getEffectiveLevel()); return result; }
    public String getMessage() { return message; }
    public Object getOrigin() { return origin; }
    public Throwable getThrowable() { return throwable; }
    public long getTimestamp() { return timestamp; }
    public String toString() {
        StringBuilder b = new StringBuilder();
        switch (getEffectiveLevel()) { case ERROR: b.append("ERROR"); break; case WARN: b.append("WARN"); break; default: b.append("INFO"); }
        if (origin != null) b.append(" in ").append(origin).append(" -");
        b.append(' ').append(message);
        if (throwable != null) b.append(' ').append(throwable);
        return b.toString();
    }
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        StatusBase other = (StatusBase) object;
        return level == other.level && timestamp == other.timestamp && Objects.equals(message, other.message);
    }
    public int hashCode() { return Objects.hash(level, message, timestamp); }
}

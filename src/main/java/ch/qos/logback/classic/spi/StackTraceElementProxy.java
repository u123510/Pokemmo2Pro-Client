package ch.qos.logback.classic.spi;

import java.io.Serializable;

public class StackTraceElementProxy implements Serializable {
    private static final long serialVersionUID = -2374374378980555982L;
    final StackTraceElement ste;
    private transient String steAsString;
    @Deprecated
    ClassPackagingData classPackagingData;

    public StackTraceElementProxy(StackTraceElement ste) {
        if (ste == null) throw new IllegalArgumentException("ste cannot be null");
        this.ste = ste;
    }

    public String getSTEAsString() {
        if (steAsString == null) steAsString = "at " + ste;
        return steAsString;
    }
    public StackTraceElement getStackTraceElement() { return ste; }
    public void setClassPackagingData(ClassPackagingData data) {
        if (classPackagingData != null) throw new IllegalStateException("Packaging data has been already set");
        classPackagingData = data;
    }
    public ClassPackagingData getClassPackagingData() { return classPackagingData; }
    @Override public int hashCode() { return ste.hashCode(); }
    @Override public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StackTraceElementProxy other = (StackTraceElementProxy) obj;
        return ste.equals(other.ste) && java.util.Objects.equals(classPackagingData, other.classPackagingData);
    }
    @Override public String toString() { return getSTEAsString(); }
}

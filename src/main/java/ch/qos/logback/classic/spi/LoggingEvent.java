package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.EnvUtil;
import ch.qos.logback.core.util.StringUtil;
import f.Sm0;
import f.HA0;
import f.OA;
import f.mo_2;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class LoggingEvent implements ILoggingEvent, Serializable {
    public static final String VIRTUAL_THREAD_NAME_PREFIX = "virtual-";
    public static final String REGULAR_UNNAMED_THREAD_PREFIX = "unnamed-";
    transient String fqnOfLoggerClass;
    private String threadName;
    private String loggerName;
    private LoggerContext loggerContext;
    private LoggerContextVO loggerContextVO;
    private transient Level level;
    private String message;
    transient String formattedMessage;
    private transient Object[] argumentArray;
    private ThrowableProxy throwableProxy;
    private StackTraceElement[] callerDataArray;
    private List<HA0> markerList;
    private Map<String, String> mdcPropertyMap;
    List<OA> keyValuePairs;
    private Instant instant;
    private long timeStamp;
    private int nanoseconds;
    private long sequenceNumber;

    public LoggingEvent() {
    }

    public LoggingEvent(String fqcn, Logger logger, Level level, String message, Throwable throwable, Object[] argArray) {
        this.fqnOfLoggerClass = fqcn;
        this.loggerName = logger.getName();
        this.loggerContext = logger.getLoggerContext();
        this.loggerContextVO = loggerContext.getLoggerContextRemoteView();
        this.level = level;
        this.message = message;
        this.argumentArray = argArray;
        initTmestampFields(Clock.systemUTC().instant());
        if (loggerContext != null) {
            ch.qos.logback.core.spi.SequenceNumberGenerator generator = loggerContext.getSequenceNumberGenerator();
            if (generator != null) sequenceNumber = generator.nextSequenceNumber();
        }
        if (throwable == null) throwable = extractThrowableAnRearrangeArguments(argArray);
        if (throwable != null) {
            throwableProxy = new ThrowableProxy(throwable);
            if (loggerContext != null && loggerContext.isPackagingDataEnabled()) throwableProxy.calculatePackagingData();
        }
    }

    private Throwable extractThrowableAnRearrangeArguments(Object[] argArray) {
        Throwable throwable = EventArgUtil.extractThrowable(argArray);
        if (EventArgUtil.successfulExtraction(throwable)) argumentArray = EventArgUtil.trimmedCopy(argArray);
        return throwable;
    }

    private String extractThreadName(Thread thread) {
        if (thread == null) return "?";
        String name = thread.getName();
        if (StringUtil.notNullNorEmpty(name)) return name;
        Long virtualThreadId = getVirtualThreadId(thread);
        if (virtualThreadId != null) return VIRTUAL_THREAD_NAME_PREFIX + virtualThreadId;
        return REGULAR_UNNAMED_THREAD_PREFIX + thread.getId();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        throw new UnsupportedOperationException(getClass() + " does not support serialization. Use LoggerEventVO instance instead. See also LoggerEventVO.build method.");
    }

    public void initTmestampFields(Instant instant) {
        this.instant = instant;
        this.nanoseconds = instant.getNano();
        long millis = instant.getEpochSecond() * 1000L;
        this.timeStamp = millis + this.nanoseconds / 1000000;
    }

    public void setArgumentArray(Object[] argArray) {
        if (argumentArray != null) throw new IllegalStateException("argArray has been already set");
        argumentArray = argArray;
    }

    public Object[] getArgumentArray() { return argumentArray; }

    public void addKeyValuePair(OA pair) {
        if (keyValuePairs == null) keyValuePairs = new ArrayList<>(4);
        keyValuePairs.add(pair);
    }

    public void setKeyValuePairs(List<OA> pairs) { keyValuePairs = pairs; }
    public List<OA> getKeyValuePairs() { return keyValuePairs; }
    public Level getLevel() { return level; }
    public String getLoggerName() { return loggerName; }
    public void setLoggerName(String name) { loggerName = name; }

    public String getThreadName() {
        if (threadName == null) threadName = extractThreadName(Thread.currentThread());
        return threadName;
    }

    public Long getVirtualThreadId(Thread thread) {
        if (!EnvUtil.isJDK21OrHigher()) return null;
        try {
            boolean virtual = (Boolean) Thread.class.getMethod("isVirtual").invoke(thread);
            if (!virtual) return null;
            return thread.getId();
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ignored) {
            return null;
        }
    }

    public void setThreadName(String name) {
        if (threadName != null) throw new IllegalStateException("threadName has been already set");
        threadName = name;
    }

    public IThrowableProxy getThrowableProxy() { return throwableProxy; }

    public void setThrowableProxy(ThrowableProxy proxy) {
        if (throwableProxy != null) throw new IllegalStateException("ThrowableProxy has been already set.");
        throwableProxy = proxy;
    }

    @Override
    public void prepareForDeferredProcessing() {
        getFormattedMessage();
        getThreadName();
        getMDCPropertyMap();
    }

    public void setLoggerContext(LoggerContext context) { loggerContext = context; }
    public LoggerContextVO getLoggerContextVO() { return loggerContextVO; }
    public void setLoggerContextRemoteView(LoggerContextVO vo) { loggerContextVO = vo; }
    public String getMessage() { return message; }

    public void setMessage(String value) {
        if (message != null) throw new IllegalStateException("The message for this event has been set already.");
        message = value;
    }

    public Instant getInstant() { return instant; }
    public void setInstant(Instant value) { initTmestampFields(value); }
    public long getTimeStamp() { return timeStamp; }
    public int getNanoseconds() { return nanoseconds; }
    public void setTimeStamp(long value) { setInstant(Instant.ofEpochMilli(value)); }
    public long getSequenceNumber() { return sequenceNumber; }
    public void setSequenceNumber(long value) { sequenceNumber = value; }

    public void setLevel(Level value) {
        if (level != null) throw new IllegalStateException("The level has been already set for this event.");
        level = value;
    }

    public StackTraceElement[] getCallerData() {
        if (callerDataArray == null) {
            Throwable t = new Throwable();
            int maxDepth = loggerContext.getMaxCallerDataDepth();
            callerDataArray = CallerData.extract(t, fqnOfLoggerClass, maxDepth, loggerContext.getFrameworkPackages());
        }
        return callerDataArray;
    }

    public boolean hasCallerData() { return callerDataArray != null; }
    public void setCallerData(StackTraceElement[] data) { callerDataArray = data; }
    public List<HA0> getMarkerList() { return markerList; }

    public void addMarker(HA0 marker) {
        if (marker == null) return;
        if (markerList == null) markerList = new ArrayList<>(4);
        markerList.add(marker);
    }

    public long getContextBirthTime() { return loggerContextVO.getBirthTime(); }

    public String getFormattedMessage() {
        if (formattedMessage != null) return formattedMessage;
        if (argumentArray != null) formattedMessage = mo_2.fC(message, argumentArray).G;
        else formattedMessage = message;
        return formattedMessage;
    }

    public Map<String, String> getMDCPropertyMap() {
        if (mdcPropertyMap == null) {
            Sm0 adapter = loggerContext.getMDCAdapter();
            if (adapter instanceof ch.qos.logback.classic.util.LogbackMDCAdapter) {
                mdcPropertyMap = ((ch.qos.logback.classic.util.LogbackMDCAdapter) adapter).getPropertyMap();
            } else {
                mdcPropertyMap = adapter.getCopyOfContextMap();
            }
        }
        if (mdcPropertyMap == null) mdcPropertyMap = Collections.emptyMap();
        return mdcPropertyMap;
    }

    public void setMDCPropertyMap(Map<String, String> map) {
        if (mdcPropertyMap != null) throw new IllegalStateException("The MDCPropertyMap has been already set for this event.");
        mdcPropertyMap = map;
    }

    @Deprecated
    public Map<String, String> getMdc() { return getMDCPropertyMap(); }

    @Override
    public String toString() { return "[" + level + "] " + getFormattedMessage(); }
}

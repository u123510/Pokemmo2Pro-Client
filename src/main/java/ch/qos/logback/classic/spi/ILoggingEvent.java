package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.spi.DeferredProcessingAware;
import f.HA0;
import java.time.Instant;
import java.util.List;
import java.util.Map;

public interface ILoggingEvent extends DeferredProcessingAware {
    String getThreadName();
    Level getLevel();
    String getMessage();
    Object[] getArgumentArray();
    String getFormattedMessage();
    String getLoggerName();
    LoggerContextVO getLoggerContextVO();
    IThrowableProxy getThrowableProxy();
    StackTraceElement[] getCallerData();
    boolean hasCallerData();

    @Deprecated
    default HA0 N3() {
        List<HA0> markers = getMarkerList();
        return markers == null || markers.isEmpty() ? null : markers.get(0);
    }

    List<HA0> getMarkerList();
    Map<String, String> getMDCPropertyMap();

    @Deprecated
    Map<String, String> getMdc();

    long getTimeStamp();
    int getNanoseconds();

    default Instant getInstant() {
        return Instant.ofEpochMilli(getTimeStamp());
    }

    long getSequenceNumber();
    List<?> getKeyValuePairs();
    void prepareForDeferredProcessing();
}

package ch.qos.logback.classic.net.server;

import ch.qos.logback.classic.net.LoggingEventPreSerializationTransformer;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.server.SSLServerSocketAppenderBase;
import ch.qos.logback.core.spi.PreSerializationTransformer;

public class SSLServerSocketAppender extends SSLServerSocketAppenderBase {
    private static final PreSerializationTransformer pst = new LoggingEventPreSerializationTransformer();
    private boolean includeCallerData;

    public SSLServerSocketAppender() {
        super();
    }

    public void postProcessEvent(ILoggingEvent event) {
        if (isIncludeCallerData()) {
            event.getCallerData();
        }
    }

    public void postProcessEvent(Object event) {
        postProcessEvent((ILoggingEvent) event);
    }

    public PreSerializationTransformer getPST() {
        return pst;
    }

    public boolean isIncludeCallerData() {
        return includeCallerData;
    }

    public void setIncludeCallerData(boolean includeCallerData) {
        this.includeCallerData = includeCallerData;
    }
}

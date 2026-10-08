package ch.qos.logback.classic.net.server;

import ch.qos.logback.classic.net.LoggingEventPreSerializationTransformer;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.server.AbstractServerSocketAppender;
import ch.qos.logback.core.spi.PreSerializationTransformer;

public class ServerSocketAppender extends AbstractServerSocketAppender<ILoggingEvent> {
    private static final PreSerializationTransformer pst = new LoggingEventPreSerializationTransformer();
    private boolean includeCallerData;

    public ServerSocketAppender() {
        super();
    }

    public void postProcessEvent(ILoggingEvent event) {
        if (isIncludeCallerData()) {
            event.getCallerData();
        }
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

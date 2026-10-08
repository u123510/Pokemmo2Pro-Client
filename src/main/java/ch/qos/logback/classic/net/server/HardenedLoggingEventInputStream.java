package ch.qos.logback.classic.net.server;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ClassPackagingData;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.LoggerContextVO;
import ch.qos.logback.classic.spi.LoggerRemoteView;
import ch.qos.logback.classic.spi.LoggingEventVO;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxy;
import ch.qos.logback.classic.spi.ThrowableProxyVO;
import ch.qos.logback.core.net.HardenedObjectInputStream;

public class HardenedLoggingEventInputStream extends HardenedObjectInputStream {
    static final String ARRAY_PREFIX = "[L";

    public static List<String> getWhilelist() {
        ArrayList<String> list = new ArrayList<>();
        list.add(LoggingEventVO.class.getName());
        list.add(LoggerContextVO.class.getName());
        list.add(LoggerRemoteView.class.getName());
        list.add(ThrowableProxyVO.class.getName());
        list.add(f.nf0_1.class.getName());
        list.add(Level.class.getName());
        list.add(Logger.class.getName());
        list.add(StackTraceElement.class.getName());
        list.add(StackTraceElement[].class.getName());
        list.add(ThrowableProxy.class.getName());
        list.add(ThrowableProxy[].class.getName());
        list.add(IThrowableProxy.class.getName());
        list.add(IThrowableProxy[].class.getName());
        list.add(StackTraceElementProxy.class.getName());
        list.add(StackTraceElementProxy[].class.getName());
        list.add(ClassPackagingData.class.getName());
        return list;
    }

    public HardenedLoggingEventInputStream(InputStream inputStream) throws java.io.IOException {
        super(inputStream, getWhilelist());
    }

    public HardenedLoggingEventInputStream(InputStream inputStream, List<String> whitelist) throws java.io.IOException {
        this(inputStream);
        addToWhitelist(whitelist);
    }
}

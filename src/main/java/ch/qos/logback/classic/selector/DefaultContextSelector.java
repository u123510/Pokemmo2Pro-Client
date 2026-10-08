package ch.qos.logback.classic.selector;

import ch.qos.logback.classic.LoggerContext;
import java.util.Arrays;
import java.util.List;

public class DefaultContextSelector implements ContextSelector {
    private LoggerContext defaultLoggerContext;

    public DefaultContextSelector(LoggerContext defaultLoggerContext) {
        this.defaultLoggerContext = defaultLoggerContext;
    }

    @Override
    public LoggerContext getLoggerContext() {
        return getDefaultLoggerContext();
    }

    @Override
    public LoggerContext getDefaultLoggerContext() {
        return defaultLoggerContext;
    }

    @Override
    public LoggerContext detachLoggerContext(String name) {
        return defaultLoggerContext;
    }

    @Override
    public List<String> getContextNames() {
        return Arrays.asList(defaultLoggerContext.getName());
    }

    @Override
    public LoggerContext getLoggerContext(String name) {
        return defaultLoggerContext.getName().equals(name) ? defaultLoggerContext : null;
    }
}

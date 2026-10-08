package ch.qos.logback.classic.selector;

import ch.qos.logback.classic.LoggerContext;
import java.util.List;

public interface ContextSelector {
    LoggerContext getLoggerContext();
    LoggerContext getLoggerContext(String name);
    LoggerContext getDefaultLoggerContext();
    LoggerContext detachLoggerContext(String name);
    List<String> getContextNames();
}

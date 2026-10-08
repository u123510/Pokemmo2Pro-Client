package ch.qos.logback.classic.jul;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import java.util.logging.LogRecord;

public class JULHelper {
    public static final boolean isRegularNonRootLogger(java.util.logging.Logger logger) {
        return logger != null && !"".equals(logger.getName());
    }

    public static final boolean isRoot(java.util.logging.Logger logger) {
        return logger != null && "".equals(logger.getName());
    }

    public static java.util.logging.Level asJULLevel(Level level) {
        if (level == null) {
            throw new IllegalArgumentException("Unexpected level [null]");
        }
        return switch (level.levelInt) {
            case Integer.MIN_VALUE -> java.util.logging.Level.ALL;
            case 5000 -> java.util.logging.Level.FINEST;
            case 10000 -> java.util.logging.Level.FINE;
            case 20000 -> java.util.logging.Level.INFO;
            case 30000 -> java.util.logging.Level.WARNING;
            case 40000 -> java.util.logging.Level.SEVERE;
            case Integer.MAX_VALUE -> java.util.logging.Level.OFF;
            default -> throw new IllegalArgumentException("Unexpected level [" + level + "]");
        };
    }

    public static String asJULLoggerName(String name) {
        return "ROOT".equals(name) ? "" : name;
    }

    public static java.util.logging.Logger asJULLogger(String name) {
        return java.util.logging.Logger.getLogger(asJULLoggerName(name));
    }

    public static java.util.logging.Logger asJULLogger(Logger logger) {
        return asJULLogger(logger.getName());
    }
}

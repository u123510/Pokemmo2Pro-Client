package ch.qos.logback.classic.util;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.Status;
import f.Cq0;

public class StatusViaSLF4JLoggerFactory {
    public static void addInfo(String message, Object origin) {
        addStatus(new InfoStatus(message, origin));
    }

    public static void addError(String message, Object origin) {
        addStatus(new ErrorStatus(message, origin));
    }

    public static void addError(String message, Object origin, Throwable throwable) {
        addStatus(new ErrorStatus(message, origin, throwable));
    }

    public static void addStatus(Status status) {
        Object factory = Cq0.vr().getLoggerFactory();
        if (factory instanceof LoggerContext context) {
            ContextAwareBase aware = new ContextAwareBase();
            aware.setContext(context);
            aware.addStatus(status);
        }
    }
}

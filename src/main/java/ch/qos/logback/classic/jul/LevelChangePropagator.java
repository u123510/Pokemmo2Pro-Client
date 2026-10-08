package ch.qos.logback.classic.jul;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.LoggerContextListener;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.LogManager;

public class LevelChangePropagator extends ContextAwareBase implements LoggerContextListener, LifeCycle {
    private final Set<java.util.logging.Logger> julLoggerSet = new HashSet<>();
    private boolean isStarted;
    private boolean resetJUL;

    private void propagate(Logger logger, Level level) {
        addInfo("Propagating " + level + " level on " + logger + " onto the JUL framework");
        java.util.logging.Logger julLogger = JULHelper.asJULLogger(logger);
        julLoggerSet.add(julLogger);
        julLogger.setLevel(JULHelper.asJULLevel(level));
    }

    private void propagateExistingLoggerLevels() {
        LoggerContext context = (LoggerContext) this.context;
        for (Object o : context.getLoggerList()) {
            Logger logger = (Logger) o;
            if (logger.getLevel() != null) {
                propagate(logger, logger.getLevel());
            }
        }
    }

    public void setResetJUL(boolean resetJUL) {
        this.resetJUL = resetJUL;
    }

    @Override
    public boolean isResetResistant() {
        return false;
    }

    @Override
    public void onStart(LoggerContext context) {
    }

    @Override
    public void onReset(LoggerContext context) {
    }

    @Override
    public void onStop(LoggerContext context) {
    }

    @Override
    public void onLevelChange(Logger logger, Level level) {
        propagate(logger, level);
    }

    public void resetJULLevels() {
        LogManager manager = LogManager.getLogManager();
        Enumeration<String> names = manager.getLoggerNames();
        while (names.hasMoreElements()) {
            String name = names.nextElement();
            java.util.logging.Logger logger = manager.getLogger(name);
            if (JULHelper.isRegularNonRootLogger(logger) && logger.getLevel() != null) {
                addInfo("Setting level of jul logger [" + name + "] to null");
                logger.setLevel(null);
            }
        }
    }

    @Override
    public void start() {
        if (resetJUL) {
            resetJULLevels();
        }
        propagateExistingLoggerLevels();
        isStarted = true;
    }

    @Override
    public void stop() {
        isStarted = false;
    }

    @Override
    public boolean isStarted() {
        return isStarted;
    }
}

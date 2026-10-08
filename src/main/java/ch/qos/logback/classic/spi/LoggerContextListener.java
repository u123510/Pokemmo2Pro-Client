package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;

public interface LoggerContextListener {
    boolean isResetResistant();
    void onStart(LoggerContext context);
    void onReset(LoggerContext context);
    void onStop(LoggerContext context);
    void onLevelChange(Logger logger, Level level);
}

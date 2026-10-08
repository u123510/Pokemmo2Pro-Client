package ch.qos.logback.classic.util;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class LevelToSyslogSeverity {
    public static int convert(ILoggingEvent event) {
        Level level = event.getLevel();
        return switch (level.levelInt) {
            case 5000, 10000 -> 7;
            case 20000 -> 6;
            case 30000 -> 4;
            case 40000 -> 3;
            default -> throw new IllegalArgumentException("Level " + level + " is not a valid level for a printing method");
        };
    }
}

package ch.qos.logback.classic.util;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.util.OptionHelper;

public class LevelUtil {
    public static boolean isInheritedLevelString(String value) {
        return "INHERITED".equalsIgnoreCase(value) || "NULL".equalsIgnoreCase(value);
    }

    public static Level levelStringToLevel(String value) {
        if (OptionHelper.isNullOrEmptyOrAllSpaces(value)) {
            return null;
        }
        return isInheritedLevelString(value) ? null : Level.toLevel(value);
    }
}

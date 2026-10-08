/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.classic;

import f.bj_2;
import java.io.Serializable;

public final class Level
implements Serializable {
    private static final long serialVersionUID = -814092767334282137L;
    public static final int OFF_INT = Integer.MAX_VALUE;
    public static final int ERROR_INT = 40000;
    public static final int WARN_INT = 30000;
    public static final int INFO_INT = 20000;
    public static final int DEBUG_INT = 10000;
    public static final int TRACE_INT = 5000;
    public static final int ALL_INT = Integer.MIN_VALUE;
    public static final Integer OFF_INTEGER = Integer.MAX_VALUE;
    public static final Integer ERROR_INTEGER = 40000;
    public static final Integer WARN_INTEGER = 30000;
    public static final Integer INFO_INTEGER = 20000;
    public static final Integer DEBUG_INTEGER = 10000;
    public static final Integer TRACE_INTEGER = 5000;
    public static final Integer ALL_INTEGER = Integer.MIN_VALUE;
    public static final Level OFF = new Level(Integer.MAX_VALUE, "OFF");
    public static final Level ERROR = new Level(40000, "ERROR");
    public static final Level WARN = new Level(30000, "WARN");
    public static final Level INFO = new Level(20000, "INFO");
    public static final Level DEBUG = new Level(10000, "DEBUG");
    public static final Level TRACE = new Level(5000, "TRACE");
    public static final Level ALL = new Level(Integer.MIN_VALUE, "ALL");
    public final int levelInt;
    public final String levelStr;

    private Level(int n, String string) {
        this.levelInt = n;
        this.levelStr = string;
    }

    public static Level convertAnSLF4JLevel(bj_2 bj_22) {
        return Level.fromLocationAwareLoggerInteger(bj_22.JB0);
    }

    public static Level toLevel(String string) {
        return Level.toLevel(string, DEBUG);
    }

    public static Level valueOf(String string) {
        return Level.toLevel(string, DEBUG);
    }

    public static Level toLevel(int n) {
        return Level.toLevel(n, DEBUG);
    }

    public static Level toLevel(int n, Level level) {
        switch (n) {
            default: {
                return level;
            }
            case 0x7FFFFFFF: {
                return OFF;
            }
            case 40000: {
                return ERROR;
            }
            case 30000: {
                return WARN;
            }
            case 20000: {
                return INFO;
            }
            case 10000: {
                return DEBUG;
            }
            case 5000: {
                return TRACE;
            }
            case -2147483648: 
        }
        return ALL;
    }

    public static Level toLevel(String string, Level level) {
        if (string == null) {
            return level;
        }
        if ((string = string.trim()).equalsIgnoreCase("ALL")) {
            return ALL;
        }
        if (string.equalsIgnoreCase("TRACE")) {
            return TRACE;
        }
        if (string.equalsIgnoreCase("DEBUG")) {
            return DEBUG;
        }
        if (string.equalsIgnoreCase("INFO")) {
            return INFO;
        }
        if (string.equalsIgnoreCase("WARN")) {
            return WARN;
        }
        if (string.equalsIgnoreCase("ERROR")) {
            return ERROR;
        }
        if (string.equalsIgnoreCase("OFF")) {
            return OFF;
        }
        return level;
    }

    private Object readResolve() {
        return Level.toLevel(this.levelInt);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Level fromLocationAwareLoggerInteger(int n) {
        Level level;
        if (n != 0) {
            if (n != 10) {
                if (n != 20) {
                    if (n != 30) {
                        if (n != 40) throw new IllegalArgumentException(n + " not a valid level value");
                        level = ERROR;
                        return level;
                    } else {
                        level = WARN;
                    }
                    return level;
                } else {
                    level = INFO;
                }
                return level;
            } else {
                level = DEBUG;
            }
            return level;
        } else {
            level = TRACE;
        }
        return level;
    }

    public static int toLocationAwareLoggerInteger(Level level) {
        if (level != null) {
            switch (level.toInt()) {
                default: {
                    throw new IllegalArgumentException(String.valueOf(level) + " not a valid level value");
                }
                case 40000: {
                    return 40;
                }
                case 30000: {
                    return 30;
                }
                case 20000: {
                    return 20;
                }
                case 10000: {
                    return 10;
                }
                case 5000: 
            }
            return 0;
        }
        throw new IllegalArgumentException("null level parameter is not admitted");
    }

    public String toString() {
        return this.levelStr;
    }

    public int toInt() {
        return this.levelInt;
    }

    public Integer toInteger() {
        switch (this.levelInt) {
            default: {
                throw new IllegalStateException("Level " + this.levelStr + ", " + this.levelInt + " is unknown.");
            }
            case 0x7FFFFFFF: {
                return OFF_INTEGER;
            }
            case 40000: {
                return ERROR_INTEGER;
            }
            case 30000: {
                return WARN_INTEGER;
            }
            case 20000: {
                return INFO_INTEGER;
            }
            case 10000: {
                return DEBUG_INTEGER;
            }
            case 5000: {
                return TRACE_INTEGER;
            }
            case -2147483648: 
        }
        return ALL_INTEGER;
    }

    public boolean isGreaterOrEqual(Level level) {
        return this.levelInt >= level.levelInt;
    }
}


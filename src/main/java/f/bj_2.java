package f;

import cn.pokemmo.constant.enums.LogLevel;

public enum bj_2 {
    f90(40, "ERROR"),
    SM(30, "WARN"),
    LPT2(20, "INFO"),
    LU(10, "DEBUG"),
    qu(0, "TRACE");

    public static final bj_2[] am0 = values();
    public final int JB0;
    public final String pD0;

    bj_2(int value, String text) {
        this.JB0 = value;
        this.pD0 = text;
    }

    public final String toString() {
        return this.pD0;
    }

    public LogLevel asModern() {
        return LogLevel.valueOf(name());
    }
}
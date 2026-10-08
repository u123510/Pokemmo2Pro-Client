package cn.pokemmo.constant.enums;

import f.*;

public enum LogLevel {
    f90(40, "ERROR"),
    SM(30, "WARN"),
    LPT2(20, "INFO"),
    LU(10, "DEBUG"),
    qu(0, "TRACE");

    public static final LogLevel[] am0 = values();
    public final int JB0;
    public final String pD0;

    LogLevel(int value, String text) {
        this.JB0 = value;
        this.pD0 = text;
    }

    public final String toString() {
        return this.pD0;
    }

    public f.bj_2 toLegacy() {
        return f.bj_2.valueOf(name());
    }
}
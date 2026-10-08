package cn.pokemmo.constant.enums;

import f.*;

public enum TableDebugMode {
    none,
    all,
    table,
    cell,
    actor;

    public static final TableDebugMode cg = none;
    public static final TableDebugMode FP = all;
    public static final TableDebugMode Pq0 = table;
    public static final TableDebugMode La0 = cell;
    public static final TableDebugMode k2 = actor;
    public static final TableDebugMode[] prn = values();

    public f.SD toLegacy() {
        return f.SD.valueOf(name());
    }
}
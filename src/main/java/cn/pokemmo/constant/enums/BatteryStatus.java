package cn.pokemmo.constant.enums;

import f.*;

public enum BatteryStatus {
    POWER_UNKNOWN,
    POWER_EMPTY,
    POWER_LOW,
    POWER_MEDIUM,
    POWER_FULL,
    POWER_WIRED;

    public static final BatteryStatus Nx0 = POWER_UNKNOWN;
    public static final BatteryStatus XI0 = POWER_EMPTY;
    public static final BatteryStatus HF = POWER_LOW;
    public static final BatteryStatus e3 = POWER_MEDIUM;
    public static final BatteryStatus UJ0 = POWER_FULL;
    public static final BatteryStatus gw0 = POWER_WIRED;

    public f.oz_1 toLegacy() {
        return f.oz_1.valueOf(name());
    }
}
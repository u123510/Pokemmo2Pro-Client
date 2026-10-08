package f;

import cn.pokemmo.constant.enums.BatteryStatus;

public enum oz_1 {
    POWER_UNKNOWN,
    POWER_EMPTY,
    POWER_LOW,
    POWER_MEDIUM,
    POWER_FULL,
    POWER_WIRED;

    public static final oz_1 Nx0 = POWER_UNKNOWN;
    public static final oz_1 XI0 = POWER_EMPTY;
    public static final oz_1 HF = POWER_LOW;
    public static final oz_1 e3 = POWER_MEDIUM;
    public static final oz_1 UJ0 = POWER_FULL;
    public static final oz_1 gw0 = POWER_WIRED;

    public BatteryStatus asModern() {
        return BatteryStatus.valueOf(name());
    }
}
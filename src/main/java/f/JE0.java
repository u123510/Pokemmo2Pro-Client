package f;

import cn.pokemmo.constant.enums.AntiAliasingMode;

public enum JE0 {
    None,
    Slight,
    Medium,
    Full,
    AutoSlight,
    AutoMedium,
    AutoFull;

    public static final JE0 Ut = None;
    public static final JE0 P8 = Slight;
    public static final JE0 cOM2 = Medium;
    public static final JE0 E7 = Full;
    public static final JE0 ij = AutoSlight;
    public static final JE0 n0 = AutoMedium;
    public static final JE0 f4 = AutoFull;
    public static final JE0[] X0 = values();

    public AntiAliasingMode asModern() {
        return AntiAliasingMode.valueOf(name());
    }
}
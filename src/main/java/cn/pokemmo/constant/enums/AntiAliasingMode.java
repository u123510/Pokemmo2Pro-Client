package cn.pokemmo.constant.enums;

import f.*;

public enum AntiAliasingMode {
    None,
    Slight,
    Medium,
    Full,
    AutoSlight,
    AutoMedium,
    AutoFull;

    public static final AntiAliasingMode Ut = None;
    public static final AntiAliasingMode P8 = Slight;
    public static final AntiAliasingMode cOM2 = Medium;
    public static final AntiAliasingMode E7 = Full;
    public static final AntiAliasingMode ij = AutoSlight;
    public static final AntiAliasingMode n0 = AutoMedium;
    public static final AntiAliasingMode f4 = AutoFull;
    public static final AntiAliasingMode[] X0 = values();

    public f.JE0 toLegacy() {
        return f.JE0.valueOf(name());
    }
}
package cn.pokemmo.constant.enums;

import f.*;

public enum PlatformRuntime {
    cw,
    BN,
    HeadlessDesktop,
    xp,
    Rv0,
    XU;

    public f.hb0_2 toLegacy() {
        return f.hb0_2.valueOf(name());
    }
}
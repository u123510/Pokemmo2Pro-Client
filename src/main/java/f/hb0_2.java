package f;

import cn.pokemmo.constant.enums.PlatformRuntime;

public enum hb0_2 {
    cw,
    BN,
    HeadlessDesktop,
    xp,
    Rv0,
    XU;

    public PlatformRuntime asModern() {
        return PlatformRuntime.valueOf(name());
    }
}
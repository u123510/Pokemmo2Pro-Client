package cn.pokemmo.constant.enums;

import f.*;

public enum BattleAnimationSpeed {
    Cr,
    Kj,
    n9;

    public static final BattleAnimationSpeed[] ZB0 = values();

    public f.lpt2__2 toLegacy() {
        return f.lpt2__2.valueOf(name());
    }
}
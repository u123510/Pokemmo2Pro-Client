package f;

import cn.pokemmo.constant.enums.BattleAnimationSpeed;

public enum lpt2__2 {
    Cr,
    Kj,
    n9;

    public static final lpt2__2[] ZB0 = values();

    public BattleAnimationSpeed asModern() {
        return BattleAnimationSpeed.valueOf(name());
    }
}
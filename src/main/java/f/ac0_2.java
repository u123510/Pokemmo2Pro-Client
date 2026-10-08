package f;

import cn.pokemmo.constant.enums.TextAlignment;

public enum ac0_2 {
    LpT3,
    RIGHT,
    CENTER,
    D4;

    public static final ac0_2[] cJ = values();

    public TextAlignment asModern() {
        return TextAlignment.valueOf(name());
    }
}
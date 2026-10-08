package f;

import cn.pokemmo.constant.enums.DirectionSide;

public enum xm_1 {
    TOP,
    LEFT,
    BOTTOM,
    RIGHT;

    public static final xm_1[] N6 = values();

    public DirectionSide asModern() {
        return DirectionSide.valueOf(name());
    }
}
package cn.pokemmo.constant.enums;

import f.*;

public enum DirectionSide {
    TOP,
    LEFT,
    BOTTOM,
    RIGHT;

    public static final DirectionSide[] N6 = values();

    public f.xm_1 toLegacy() {
        return f.xm_1.valueOf(name());
    }
}
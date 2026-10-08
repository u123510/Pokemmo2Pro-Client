package cn.pokemmo.constant.enums;

import f.*;

public enum TextAlignment {
    LpT3,
    RIGHT,
    CENTER,
    D4;

    public static final TextAlignment[] cJ = values();

    public f.ac0_2 toLegacy() {
        return f.ac0_2.valueOf(name());
    }
}
package cn.pokemmo.constant.enums;

import f.*;

public enum Orientation {
    WD0,
    VERTICAL;

    public static final Orientation[] b90 = values();

    public f.ab_2 toLegacy() {
        return f.ab_2.valueOf(name());
    }
}
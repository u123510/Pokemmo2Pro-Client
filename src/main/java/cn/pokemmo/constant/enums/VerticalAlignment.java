package cn.pokemmo.constant.enums;

import f.*;

public enum VerticalAlignment {
    TOP,
    MIDDLE,
    N6,
    FILL;

    public static final VerticalAlignment[] d50 = values();

    public f.qi_2 toLegacy() {
        return f.qi_2.valueOf(name());
    }
}
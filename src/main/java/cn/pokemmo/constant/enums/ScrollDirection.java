package cn.pokemmo.constant.enums;

import f.*;

public enum ScrollDirection {
    both,
    mJ,
    jm;

    public static final ScrollDirection[] L0 = values();

    public f.ke_0 toLegacy() {
        return f.ke_0.valueOf(name());
    }
}
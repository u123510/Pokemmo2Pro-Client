package cn.pokemmo.constant.enums;

import f.*;

public enum AlphaMode {
    NONE,
    ALPHA;

    public f.gy0_0 toLegacy() {
        return f.gy0_0.valueOf(name());
    }
}
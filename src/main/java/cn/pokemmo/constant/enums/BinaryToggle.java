package cn.pokemmo.constant.enums;

import f.*;

public enum BinaryToggle {
    Ha0,
    Is;

    public f.DF0 toLegacy() {
        return f.DF0.valueOf(name());
    }
}

package cn.pokemmo.constant.enums;

import f.*;

public enum ItemRarity {
    PX,
    Fc,
    fg0,
    D60;

    public f.kw_2 toLegacy() {
        return f.kw_2.valueOf(name());
    }
}
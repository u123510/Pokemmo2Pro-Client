package cn.pokemmo.constant.enums;

import f.*;

public enum BlendFactor {
    FU,
    Mh,
    KR;

    public static final BlendFactor[] Gc = values();

    public f.cs_0 toLegacy() {
        return f.cs_0.valueOf(name());
    }
}
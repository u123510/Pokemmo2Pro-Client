package cn.pokemmo.constant.enums;

import f.*;

public enum AnchorAlignment {
    Ap,
    TK;

    public static final AnchorAlignment[] kJ = {Ap, TK};

    public f.F70 toLegacy() {
        return f.F70.valueOf(name());
    }
}
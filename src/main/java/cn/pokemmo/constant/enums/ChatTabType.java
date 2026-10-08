package cn.pokemmo.constant.enums;

import f.*;

public enum ChatTabType {
    sX(false),
    J60(false),
    r9(false),
    n3(true),
    K40(false),
    Bv0(true);

    public static final ChatTabType[] OB0;
    public final boolean mZ;

    ChatTabType(boolean doubleClick) {
        this.mZ = doubleClick;
    }

    static {
        OB0 = values();
    }

    public f.jr_0 toLegacy() {
        return f.jr_0.valueOf(name());
    }
}
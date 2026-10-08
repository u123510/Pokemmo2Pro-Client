package f;

import cn.pokemmo.constant.enums.ChatTabType;

public enum jr_0 {
    sX(false),
    J60(false),
    r9(false),
    n3(true),
    K40(false),
    Bv0(true);

    public static final jr_0[] OB0;
    public final boolean mZ;

    jr_0(boolean doubleClick) {
        this.mZ = doubleClick;
    }

    static {
        OB0 = values();
    }

    public ChatTabType asModern() {
        return ChatTabType.valueOf(name());
    }
}
package cn.pokemmo.constant.enums;

import f.*;

public enum SessionActiveState {
    uR((byte)0),
    ACTIVE((byte)1),
    Pv((byte)2);

    public static final bm0_1 Com3;
    public final byte eH;

    SessionActiveState(byte var3) {
        this.eH = var3;
    }

    @Override
    public final String toString() {
        switch (this) {
            case uR:
                return "未激活 (0)";
            case ACTIVE:
                return "已激活 (1)";
            case Pv:
                return "阶段2 (2)";
            default:
                return name();
        }
    }

    static {
        Com3 = new bm0_1();
        for (SessionActiveState var3 : values()) {
            Com3.gE0(var3.eH, var3);
        }
    }

    public f.ys_1 toLegacy() {
        return f.ys_1.valueOf(name());
    }
}
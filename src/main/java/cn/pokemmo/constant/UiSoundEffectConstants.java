package cn.pokemmo.constant;

import f.cy0_0;

public class UiSoundEffectConstants {
    public static final cy0_0 Mm;
    public static final cy0_0 Vr0;
    public static final cy0_0 Kt0;
    public static final cy0_0[] u;
    public final short KG;
    public final int Cu;

    public UiSoundEffectConstants(int i, short s) {
        this.Cu = i;
        this.KG = s;
    }

    static {
        Mm = new cy0_0(0, (short) 1663);
        Vr0 = new cy0_0(1, (short) 1772);
        Kt0 = new cy0_0(2, (short) 1660);
        u = new cy0_0[]{Mm, Vr0, Kt0};
    }
}

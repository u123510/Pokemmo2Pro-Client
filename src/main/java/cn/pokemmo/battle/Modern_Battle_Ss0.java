package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Ss0
 */
public abstract class Modern_Battle_Ss0 {

    public Modern_Battle_Ss0() {
        super();
    }

    public static final short C70 = (short)-1;
    public static final short[] zl = new short[]{13, 14, 15, 16};
    public static final short[] v20 = new short[]{17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
    public static final short[] Q30 = new short[]{40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
    public static final short[] VG = new short[]{52, 53, 54, 55, 56};
    public static final short[] UQ = new short[]{69, 70, 71, 72};
    public static final short[] Yb = new short[]{74, 75, 76, 77};

    public static boolean lPt2(short s) {
        return s == 12 || s == 17 || s == 40 || s == 51;
    }

    public static boolean C90(short s) {
        return s == 2 || s == 12 || s == 17 || s == 28 || s == 30 || s == 40 || s == 51;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static short Fv(q10_0 q10_02, short s) {
        if (q10_02 == q10_0.Bj0) {
            if (s == 359) return 360;
            if (s == 361) return 362;
            if (s == 365) return 366;
            if (s != 367) return C70;
            return 368;
        }
        if (q10_02 != q10_0.Ci || s != 94) return C70;
        return 93;
    }
}



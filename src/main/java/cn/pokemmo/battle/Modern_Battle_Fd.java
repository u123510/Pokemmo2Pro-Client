package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.FD
 */
public class Modern_Battle_Fd {

    public static final FD C6 = new FD(0);
    public static final FD Q70 = new FD(1);
    public static final FD Ye = new FD(2);
    public static final FD eq0 = new FD(3);
    public static final FD Np0 = new FD(4);
    public static final bm0_1 KH0;

    public final byte Zz0;

    public Modern_Battle_Fd(int value) {
        this.Zz0 = (byte) value;
    }

    static {
        FD[] values = {C6, Q70, Ye, eq0, Np0};
        KH0 = new bm0_1();
        for (FD value : values.clone()) {
            KH0.gE0(value.Zz0, value);
        }
    }
}


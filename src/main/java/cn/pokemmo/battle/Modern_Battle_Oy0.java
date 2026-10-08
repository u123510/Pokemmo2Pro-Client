package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Oy0
 */
public class Modern_Battle_Oy0 {

    public static final bm0_1 Cu;
    public static final Oy0[] NJ;
    public final byte ul0;
    public final int qx0;

    public Modern_Battle_Oy0(byte ul0, int qx0) {
        this.qx0 = qx0;
        this.ul0 = ul0;
    }

    static {
        Oy0 first = new Oy0((byte) 0, 0);
        Oy0 second = new Oy0((byte) 1, 1);
        Oy0 third = new Oy0((byte) 2, 2);
        NJ = new Oy0[]{first, second, third};
        Oy0[] values = NJ.clone();
        Cu = new bm0_1();
        for (Oy0 value : values) {
            Cu.gE0(value.ul0, value);
        }
    }
}


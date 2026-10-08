package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.MG0
 */
public class Modern_Battle_Mg0 {

    public static final MG0 lpt6;
    public static final MG0 rm;
    public static final MG0 Wk0;
    public static final bm0_1 Xo0;
    public static final MG0[] L;
    public final int hX;

    public Modern_Battle_Mg0(int value) {
        this.hX = value;
    }

    static {
        lpt6 = new MG0(0);
        rm = new MG0(1);
        Wk0 = new MG0(2);
        L = new MG0[] {lpt6, rm, Wk0};
        MG0[] values = L.clone();
        Xo0 = new bm0_1();
        for (MG0 value : values) {
            Xo0.gE0((byte) value.hX, value);
        }
    }
}


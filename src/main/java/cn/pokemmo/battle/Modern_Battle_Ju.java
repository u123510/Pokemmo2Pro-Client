package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.JU
 */
public class Modern_Battle_Ju {

    public static final JU O4 = new JU(0, 0);
    public static final JU xj = new JU(1, 1);
    public static final JU es = new JU(2, 2);
    public static final JU hD = new JU(3, 3);
    public static final JU NA = new JU(4, 4);
    public static final JU fv0 = new JU(5, 5);
    public static final JU re0 = new JU(6, 6);
    public static final JU Dv0 = new JU(7, 7);
    public static final JU[] X90 = new JU[]{O4, xj, es, hD, NA, fv0, re0, Dv0};
    public static final bm0_1 IT = new bm0_1();
    public final byte H70;
    public final int Ap0;

    public Modern_Battle_Ju(int var1, int var2) {
        this.Ap0 = var1;
        this.H70 = (byte)var2;
    }

    static {
        for (JU var0 : (JU[])X90.clone()) {
            IT.gE0(var0.H70, var0);
        }
    }

    public final int FB0() {
        return this.Ap0;
    }
}


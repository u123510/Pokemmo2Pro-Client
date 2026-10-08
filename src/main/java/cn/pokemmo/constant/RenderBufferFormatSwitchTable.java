package cn.pokemmo.constant;

import f.Vz0;
import f.hb_2;
import f.j00_0;

public abstract class RenderBufferFormatSwitchTable {
    public static final int[] Lv;
    public static final int[] CoM5;
    public static final int[] YF;

    static {
        Object ignored = j00_0.gD0;
        YF = new int[13];
        YF[0] = 1;
        YF[9] = 2;
        YF[12] = 3;
        YF[11] = 4;

        Object ignoredModes = hb_2.lf0;
        CoM5 = new int[9];
        CoM5[7] = 1;
        CoM5[6] = 2;
        CoM5[1] = 3;
        CoM5[2] = 4;
        CoM5[4] = 5;
        CoM5[5] = 6;
        CoM5[8] = 7;

        Object ignoredFormats = Vz0.GH;
        Lv = new int[5];
        Lv[Vz0.GH.oC0] = 1;
        Lv[Vz0.MM.oC0] = 2;
        Lv[Vz0.bK.oC0] = 3;
        Lv[Vz0.lx0.oC0] = 4;
    }
}

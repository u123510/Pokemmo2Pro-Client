package cn.pokemmo.util;

import f.*;


/**
 * 现代化重构类 - 原始混淆类: f.AY
 */
public class Modern_Util_Ay
implements LB0 {

    public final /* synthetic */ yd0_0 sc;

    public Modern_Util_Ay(yd0_0 yd0_02) {
        this.sc = yd0_02;
    }

    public final void LPT3(int n, D2 d2) {
        YT yT;
        yd0_0 yd0_02 = this.sc;
        if (yd0_02.SO.ZY.uw(yd0_02.LN) >= 0) {
            yd0_0 n2 = this.sc;
            yT = n2.SO.ZY;
            int yd0_03 = yT.uw(n2.LN);
            short oldValue;
            if (yd0_03 < 0) {
                oldValue = yT.XQ;
            } else {
                oldValue = yT.ie0[yd0_03];
            }
            tw0_0.RE0.wp0(this.sc.bV, oldValue);
        }
        yd0_0 yd0_03 = this.sc;
        yT = yd0_03.SO.ZY;
        yd0_0 yd0_04 = yd0_03;
        int n2 = yd0_04.LN;
        short s = yd0_04.h5;
        int n3 = yT.at0(n2);
        boolean bl = true;
        int n4 = n3;
        if (n3 < 0) {
            n4 = -n3 - 1;
            short cfr_ignored_0 = yT.ie0[n4];
            bl = false;
        }
        yT.ie0[n4] = s;
        if (bl) {
            YT yT2 = yT;
            yT2.OC0(yT2.vx);
        }
        yd0_0 yd0_05 = this.sc;
        byte by = yd0_05.bV;
        short s2 = yd0_05.h5;
        boolean bl2 = true;
        float f = yd0_05.Ms0 * dw_2.ej;
        float f2 = yd0_05.Lr0;
        byte by2 = by;
        by = 0;
        tw0_0.RE0.IE(by2, s2, (short)-1, bl2, f, 1.0f, f2, (int)by);
    }
}


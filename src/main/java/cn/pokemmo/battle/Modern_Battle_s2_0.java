package cn.pokemmo.battle;

import f.*;
import java.text.DecimalFormat;

/**
 * 现代化重构类 - 原始混淆类: f.s2_0
 */
public abstract class Modern_Battle_s2_0 {

    public Modern_Battle_s2_0() {
        super();
    }

    public static tk0_0 tq0(vk0_1 vk0_1Var, VU vu) {
        return Fl0(vk0_1Var, vu != null ? vu.I8 : null, -1);
    }

    public static tk0_0 Fl0(vk0_1 vk0_1Var, CE ce, int i) {
        mc0_1 mc0_1Var = null;
        if (ce != null && ce.rh0() > 0) {
            mc0_1Var = gu0.l2.lPT6(ce.rh0());
        }
        String str;
        if (i > 0) {
            str = lb0_2.JD(vk0_1Var, ce, mc0_1Var, i);
        } else {
            DecimalFormat decimalFormat = lb0_2.mR;
            int i2 = zb0_2.bigCJKFontSizes() ? 22 : 38;
            str = lb0_2.JD(vk0_1Var, ce, mc0_1Var, i2);
        }
        boolean z = false;
        a10_0 a10_0Var = tw0_0.PK0;
        if (a10_0Var != null && a10_0Var.gD0(gw0_0.vz)) {
            z = true;
        }
        LPT6_ jJ0 = fn_0.qz0().jJ0(vk0_1Var.oG(ce, null).j40);
        float f = tw0_0.kz0() ? 2.0F : 1.5F;
        S70 s70 = new S70(jJ0, f);
        fn_0 qz0 = fn_0.qz0();
        byte b = vk0_1Var.Pl(z).RA0;
        LPT6_[] lpt6_Arr = qz0.Y9;
        if (b >= lpt6_Arr.length) {
            b = 0;
        }
        S70 s70_2 = new S70(lpt6_Arr[b], f);
        ka0_1 ka0_1Var = new ka0_1(new le0_2[] { s70, s70_2 });
        ka0_1Var.C80 = 2.0F;
        tk0_0 tk0_0Var = new tk0_0(new A40());
        A40 a40 = tk0_0Var.gg0;
        a40.FU.NA().Wa0();
        a40.sw0(sm0_0.c0(vk0_1Var.bt), "title").goto$().Rr0.vx0(ka0_1Var).LPt4((float) (s70_2.Mx + s70.Mx + 2)).GD().Rr0.Rg();
        j1_0 es = a40.es(str);
        es.d80 = Integer.valueOf(2);
        es.K6();
        return tk0_0Var;
    }
}


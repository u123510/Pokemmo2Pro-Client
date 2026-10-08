package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.XD0
 */
public class Modern_Battle_XD0 {

    public final VU pu;

    public Modern_Battle_XD0(VU vU) {
        this.pu = vU;
    }

    public static short pD0(gc_2 gc_22, byte by, short s, byte by2, rz_0 rz_02, int n) {
        by = (byte)(n * 2 + by);
        double d = (s / 4 + by + gc_22.f00) * by2 / 100 + gc_22.L70;
        double d2 = gc_22 == rz_02.j10 ? 1.1 : (gc_22 == rz_02.Hv ? 0.9 : 1.0);
        return (short)(d * d2);
    }

    public final short BL0(gc_2 gc_22) {
        return this.ml(gc_22, this.pu.I8.wj);
    }

    public final short ml(gc_2 gc_22, byte by) {
        if (gc_22 == gc_2.RC && this.pu.I8.Yb0 == 292) {
            return 1;
        }
        Modern_Battle_XD0 xD0 = this;
        byte by2 = xD0.pu.I8.RI(gc_22);
        short s = xD0.pu.I8.ZY(gc_22);
        VU vU = xD0.pu;
        rz_0 rz_02 = vU.I8.yb;
        int n = vU.SC.Fb(gc_22);
        short s2 = XD0.pD0(gc_22, by2, s, by, rz_02, n);
        if (s2 < 1) {
            return 1;
        }
        return s2;
    }
}



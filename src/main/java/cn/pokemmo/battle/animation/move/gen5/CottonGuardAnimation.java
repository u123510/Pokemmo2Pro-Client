/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 棉花防守 (CottonGuard)
 * 技能编号: 538
 * 原始类: f.EH
 */
public class CottonGuardAnimation
extends MU {
    public CottonGuardAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1535;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.3125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1410;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 480.0f)).xi0(this.Sv0(2, 1, 320.0f, 160.0f));
        n = 1733;
        n2 = 1;
        n3 = 14;
        f = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1733;
        n2 = 2;
        n3 = 14;
        f = 1033.3334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1733;
        n2 = 1;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1733;
        n2 = 2;
        n3 = 14;
        f = 1300.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1733;
        n2 = 1;
        n3 = 14;
        f = 1400.0f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1733;
        n2 = 2;
        n3 = 14;
        f = 1483.3334f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1733;
        n2 = 1;
        n3 = 14;
        f = 1566.6666f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1733;
        n2 = 2;
        n3 = 14;
        f = 1650.0f;
        f2 = 0.234375f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.E2(18, true)).xi0(this.Wt(0, 0.4f)).y80(this.Qh0(702));
        n = 702;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 702;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = pw_112.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 702;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_114 = pw_113.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 702;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.125f;
        this.E8 = pw_114.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(14, 1)).mz0().Xf0().xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).y80(this.E2(18, false)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


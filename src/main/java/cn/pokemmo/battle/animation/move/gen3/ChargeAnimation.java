/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 充电 (Charge)
 * 技能编号: 268
 * 原始类: f.BI0
 */
public class ChargeAnimation
extends MU {
    public ChargeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1461;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1461;
        n2 = 2;
        n3 = 14;
        f = 266.66666f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1461;
        n2 = 1;
        n3 = 14;
        f = 533.3333f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1461;
        n2 = 2;
        n3 = 14;
        f = 800.0f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.05f));
        n = 1407;
        n2 = 1;
        n3 = 14;
        f = 833.3333f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 2500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 800.0f, 1600.0f));
        n = 1458;
        n2 = 2;
        n3 = 14;
        f = 2000.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(433));
        n = 433;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 433;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 433;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 433;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = HB.p30(pw_111, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


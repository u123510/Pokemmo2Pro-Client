/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.FB;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.yr
 */
/**
 * 宝可梦对战技能招式动画 - 投掷 (Fling)
 * 技能编号: 374
 * 原始类: f.yr_2
 */
public class FlingAnimation
extends MU {
    public FlingAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1459;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.546875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pk_1.el(N4.zr(N4.zr(A2.Kj0(FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(549)), this.dA0(549, 0, 9, 11, 0.5f, 360.0f), 0.02f), this.dA0(549, 0, 9, 11, 0.5f, 360.0f), 0.04f), this.dA0(549, 0, 9, 11, 0.5f, 360.0f), 0.08f).xi0(this.Wt(1, 0.4f)), this.dA0(549, 0, 9, 11, 0.5f, 360.0f));
        n = 1468;
        n2 = 1;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1469;
        n2 = 2;
        n3 = 16;
        f = 50.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 0.0f, 480.0f));
        n = 549;
        n2 = 2;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 549;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = HB.p30(pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.064f, 0.19995117f, -0.19995117f)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


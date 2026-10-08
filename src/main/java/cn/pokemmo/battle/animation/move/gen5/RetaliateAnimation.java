/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.a3
 */
/**
 * 宝可梦对战技能招式动画 - 报仇 (Retaliate)
 * 技能编号: 514
 * 原始类: f.a3_0
 */
public class RetaliateAnimation
extends MU {
    public RetaliateAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1426;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1426;
        n2 = 1;
        n3 = 14;
        f = 666.6667f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Wt(0, 0.3f)).y80(this.Qh0(679)).mz0().Xf0();
        n = 679;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.25f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 1444;
        n2 = 1;
        n3 = 14;
        float f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF)).xi0(this.nM(14, 1));
        n = 679;
        n2 = 1;
        n3 = 9;
        int n5 = 8;
        f2 = 0.25f;
        pw_1 pw_16 = A2.Kj0(pw_15, this.fE0(-1, n, n2, n3, n5, f2), 0.32f).xi0(this.Wt(1, 0.25f)).xi0(this.Xq0(16, 2, 6, 0.0f, 0.064f, -0.19995117f, 0.19995117f));
        n = 1420;
        n2 = 1;
        n3 = 16;
        float f4 = 0.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f2, pF));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f4 = 166.66667f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f4 = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f2, pF));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f4 = 500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f4 = 666.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_111 = N4.zr(pw_110, this.i6((byte)2, (short)n, n2, n3, f4, f2, pF), 0.52f);
        n = 679;
        n2 = 0;
        n3 = 11;
        int n6 = 8;
        f2 = 0.5f;
        this.E8 = N4.zr(pw_111, this.fE0(-1, n, n2, n3, n6, f2), 0.72f).xi0(this.tP(0.3f)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


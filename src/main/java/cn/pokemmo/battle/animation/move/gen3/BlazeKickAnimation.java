/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 火焰踢 (BlazeKick)
 * 技能编号: 299
 * 原始类: f.OL0
 */
public class BlazeKickAnimation
extends MU {
    public BlazeKickAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1445;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.E2(18, true)).xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 480.0f));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 583.3333f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1426;
        n2 = 2;
        n3 = 16;
        f = 583.3333f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 750.0f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 916.6667f;
        f2 = 0.15625f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 1083.3334f;
        f2 = 0.078125f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1426;
        n2 = 2;
        n3 = 16;
        f = 750.0f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1426;
        n2 = 2;
        n3 = 16;
        f = 916.6667f;
        f2 = 0.234375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1426;
        n2 = 2;
        n3 = 16;
        f = 1083.3334f;
        f2 = 0.078125f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.EN(14, 2, 3, 0.016f, 0.096f, 1.0f, 0.0f)).xi0(this.nM(16, 1)).y80(this.Qh0(465));
        n = 465;
        n2 = 3;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 465;
        n2 = 4;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_112 = A2.Kj0(pw_111, this.fE0(-1, n, n2, n3, n4, f2), 0.1f);
        n = 465;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = pw_112.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 465;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_114 = pw_113.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 465;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(N4.zr(pw_114, this.fE0(-1, n, n2, n3, n4, f2), 0.5f), this.Xq0(16, 2, 6, 0.0f, 0.048f, 0.39990234f, -0.39990234f)).y80(this.E2(18, false)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


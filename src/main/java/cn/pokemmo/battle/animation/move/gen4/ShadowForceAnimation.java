/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.fv_0;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 暗影潜袭 (ShadowForce)
 * 技能编号: 467
 * 原始类: f.Vi0
 */
public class ShadowForceAnimation
extends MU {
    public ShadowForceAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        short s = 1630;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().p1(0.6f), this.Ue0(4, 16912, 0.0f, 0.75f, 0.1f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1630;
        n = 1;
        n2 = 14;
        f = 250.0f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1630;
        n = 1;
        n2 = 14;
        f = 500.0f;
        f2 = 0.15625f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.df0(14, 3)).TD0().p1(0.04f).Xf0();
        pw_14 = fv_0.Jn(this, 14, 4, pw_14, 0.08f);
        pw_14 = fv_0.Jn(this, 14, 3, pw_14, 0.12f);
        pw_14 = fv_0.Jn(this, 14, 4, pw_14, 0.16f);
        pw_14 = fv_0.Jn(this, 14, 3, pw_14, 0.2f);
        pw_14 = fv_0.Jn(this, 14, 4, pw_14, 0.24f);
        pw_14 = fv_0.Jn(this, 14, 3, pw_14, 0.28f);
        pw_14 = fv_0.Jn(this, 14, 4, pw_14, 0.32f);
        pw_14 = fv_0.Jn(this, 14, 3, pw_14, 0.36f);
        pw_14 = fv_0.Jn(this, 14, 4, pw_14, 0.4f);
        this.E8 = Zw0.H(fv_0.Jn(this, 14, 3, pw_14, 0.44f).xi0(this.df0(14, 4)).mz0().mz0().mz0().Xf0().xi0(this.df0(14, 3)).p1(0.6f), this.Ue0(4, 16912, 0.75f, 0.0f, 0.1f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        return this;
    }

    @Override
    public final MU us() {
        int n = 1492;
        int n2 = 2;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)), this.Ue0(4, 16912, 0.0f, 0.75f, 0.1f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 480.0f, 480.0f));
        n = 1783;
        n2 = 1;
        n3 = 14;
        f = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 480.0f, 640.0f)).xi0(this.Sv0(1, 1, 800.0f, 320.0f));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(643));
        n = 643;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.4f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 643;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.4f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 643;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.4f;
        pw_1 pw_18 = A2.Kj0(pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 9, 0.016f, 0.032f, 0.19995117f, -0.19995117f), 0.04f);
        pw_18 = fv_0.Jn(this, 14, 4, pw_18, 0.08f);
        pw_18 = fv_0.Jn(this, 14, 3, pw_18, 0.12f);
        pw_18 = fv_0.Jn(this, 14, 4, pw_18, 0.16f);
        pw_18 = fv_0.Jn(this, 14, 3, pw_18, 0.2f);
        pw_18 = fv_0.Jn(this, 14, 4, pw_18, 0.24f);
        pw_18 = fv_0.Jn(this, 14, 3, pw_18, 0.28f);
        pw_18 = fv_0.Jn(this, 14, 4, pw_18, 0.32f);
        pw_18 = fv_0.Jn(this, 14, 3, pw_18, 0.36f);
        pw_18 = fv_0.Jn(this, 14, 4, pw_18, 0.4f);
        this.E8 = fv_0.Jn(this, 14, 3, pw_18, 0.44f).xi0(this.df0(14, 4)).mz0().mz0().mz0().Xf0().xi0(this.nM(16, 0)).xi0(this.Ue0(4, 16912, 0.75f, 0.0f, 0.1f)).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


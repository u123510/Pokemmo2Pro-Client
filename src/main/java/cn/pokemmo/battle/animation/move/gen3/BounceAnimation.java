/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 弹跳 (Bounce)
 * 技能编号: 340
 * 原始类: f.Pl
 */
public class BounceAnimation
extends MU {
    public BounceAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        pw_1 pw_12;
        BounceAnimation pl = this;
        BounceAnimation pl2 = this;
        short s = 1407;
        int n = 2;
        int n2 = 14;
        float f = 500.0f;
        float f2 = 0.9375f;
        PF pF = pl2.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(pl2.i6((byte)2, s, n, n2, f, f2, pF));
        BounceAnimation pl3 = this;
        s = 1376;
        n = 2;
        n2 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = pl3.Vz0;
        pw_1 pw_14 = pw_13.xi0(pl3.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 1120.0f)).xi0(this.Sv0(2, 1, 800.0f, 480.0f)).xi0(this.df0(14, 3)).y80(this.Qh0(511));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, 511, s, n, n2, f), 0.2f);
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(pw_15, this.fE0(-1, 511, s, n, n2, f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        pl.Vs.jH(this.E8);
        return pl;
    }

    @Override
    public final MU us() {
        int n = 1407;
        int n2 = 2;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1705;
        n2 = 1;
        n3 = 16;
        f = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 480.0f)).y80(this.Qh0(512));
        n = 512;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.25f;
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, n, n2, n3, n4, f2), 0.4f).xi0(this.Xq0(16, 2, 2, 0.0f, 0.064f, 0.30004883f, -0.30004883f));
        n = 512;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 512;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.tP(0.4f)).mz0().mz0().mz0().Xf0().xi0(this.df0(14, 4)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


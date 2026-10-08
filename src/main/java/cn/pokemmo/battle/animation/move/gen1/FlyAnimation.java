/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.Zw0;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 飞翔 (Fly)
 * 技能编号: 19
 * 原始类: f.FZ
 */
public class FlyAnimation
extends MU {
    public FlyAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        int n = 1489;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1497;
        n2 = 1;
        n3 = 14;
        f = 1000.0f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1833.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1538;
        n2 = 2;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = HB.p30(pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 960.0f, 640.0f)), this.Sv0(1, 1, 1440.0f, 320.0f)).y80(this.Qh0(180));
        n = 180;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 180;
        n2 = 4;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 180;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 180;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 180;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.df0(14, 3)).mz0().Xf0().xi0(this.tP(0.8f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        return this;
    }

    @Override
    public final MU us() {
        int n = 1497;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().TD0().p1(0.32f).Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 480.0f));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(181));
        n = 181;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 181;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 181;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = Zw0.H(N4.zr(pw_15, this.fE0(-1, n, n2, n3, n4, f2), 0.58f).xi0(this.Wt(1, 0.3f)).mz0().mz0().TD0().p1(0.84f).Xf0().xi0(this.Xq0(16, 2, 1, 0.0f, 0.064f, 0.60009766f, -0.60009766f)).xi0(this.EN(14, 1, 0, 0.0f, 0.016f, 0.0f, 2.0f)).y80(this.E2(14, true)).mz0().mz0().mz0().Xf0().xi0(this.tP(0.4f)).xi0(this.df0(14, 4)).y80(this.E2(14, false)), this.EN(14, 5, 0, 0.0f, 0.192f, 0.0f, 0.0f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


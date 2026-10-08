/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 潜水 (Dive)
 * 技能编号: 291
 * 原始类: f.SO
 */
public class DiveAnimation
extends MU {
    public DiveAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        pw_1 pw_12;
        DiveAnimation sO = this;
        DiveAnimation sO2 = this;
        int n = 1762;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = sO2.Vz0;
        pw_1 pw_13 = N4.zr(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).TD0().p1(0.32f).Xf0().xi0(sO2.i6((byte)2, (short)n, n2, n3, f, f2, pF)), this.Xq0(14, 2, 1, 0.0f, 0.128f, -0.39990234f, 0.39990234f), 0.4f).y80(this.Qh0(457)).xi0(this.EN(14, 1, 1, 0.016f, 0.48f, 0.0f, -20.0f));
        n = 2;
        n2 = 9;
        n3 = 8;
        f = 0.0f;
        pw_1 pw_14 = N4.zr(pw_13, this.fE0(-1, 457, n, n2, n3, f), 0.56f);
        n = 2;
        n2 = 9;
        n3 = 8;
        f = -0.25f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 457, n, n2, n3, f));
        n = 2;
        n2 = 9;
        n3 = 8;
        f = -0.25f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 457, n, n2, n3, f));
        n = 0;
        n2 = 9;
        n3 = 8;
        f = 0.0f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 457, n, n2, n3, f));
        n = 0;
        n2 = 9;
        n3 = 8;
        f = 0.0f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, 457, n, n2, n3, f));
        n = 0;
        n2 = 9;
        n3 = 8;
        f = 0.0f;
        this.E8 = pw_12 = pw_18.xi0(this.fE0(-1, 457, n, n2, n3, f)).mz0().mz0().TD0().p1(1.16f).Xf0().xi0(this.df0(14, 3)).xi0(this.EN(14, 5, 0, 0.0f, 0.016f, 0.0f, 0.0f)).xi0(this.tP(0.4f)).mz0().mz0().mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        sO.Vs.jH(this.E8);
        return sO;
    }

    @Override
    public final MU us() {
        int n = 1686;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.3f)).mz0().Xf0().xi0(this.EN(14, 1, 0, 0.0f, 0.0f, 0.0f, -20.0f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1407;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 800.0f, 160.0f));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 1166.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 480.0f, 480.0f)).xi0(this.Sv0(2, 1, 480.0f, 480.0f)).y80(this.Qh0(458));
        n = 458;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.4f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 458;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.4f;
        this.E8 = A2.Kj0(pw_15, this.fE0(-1, n, n2, n3, n4, f2), 0.4f).xi0(this.Wt(0, 0.4f)).xi0(this.EN(14, 1, 0, 0.016f, 0.48f, 0.0f, 20.0f)).xi0(this.df0(14, 4)).mz0().mz0().mz0().Xf0().TD0().p1(0.4f).Xf0().xi0(this.tP(0.25f)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


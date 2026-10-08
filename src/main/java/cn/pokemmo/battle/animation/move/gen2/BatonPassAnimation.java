/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 接棒 (BatonPass)
 * 技能编号: 226
 * 原始类: f.Fm0
 */
public class BatonPassAnimation
extends MU {
    public BatonPassAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1410;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 624.0f));
        n = 1420;
        n2 = 1;
        n3 = 14;
        f = 750.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Xq0(14, 2, 1, 0.0f, 0.16f, -0.19995117f, 0.19995117f)).xi0(this.nM(14, 1)).y80(this.Qh0(392));
        n = 392;
        n2 = 1;
        n3 = 9;
        int n4 = 8;
        f2 = 0.625f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 392;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f2 = 0.625f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 392;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.625f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 392;
        n2 = 4;
        n3 = 9;
        n4 = 8;
        f2 = 0.625f;
        this.E8 = A2.Kj0(pw_16, this.fE0(-1, n, n2, n3, n4, f2), 0.6f).xi0(this.Xq0(14, 2, 1, 0.0f, 0.16f, 0.19995117f, -0.19995117f)).mz0().mz0().mz0().Xf0().p1(0.6f).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 抓狂 (Flail)
 * 技能编号: 175
 * 原始类: f.Mk
 */
public class FlailAnimation
extends MU {
    public FlailAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1726;
        int n2 = 3;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.546875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().mz0().Xf0().p1(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1726;
        n2 = 3;
        n3 = 14;
        f = 666.6667f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(342));
        n = 342;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = HB.p30(pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.EN(14, 2, 4, 0.016f, 0.064f, 2.0f, 0.0f));
        n = 1420;
        n2 = 1;
        n3 = 16;
        float f3 = 266.66666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF)).xi0(this.nM(16, 1)).xi0(this.Wt(1, 0.4f)).TD0().p1(0.32f).Xf0().xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.19995117f, -0.19995117f));
        n = 342;
        n2 = 1;
        n3 = 11;
        int n5 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_15, this.fE0(-1, n, n2, n3, n5, f2)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


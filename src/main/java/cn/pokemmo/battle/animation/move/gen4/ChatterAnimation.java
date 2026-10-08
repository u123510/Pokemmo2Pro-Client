/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 喋喋不休 (Chatter)
 * 技能编号: 448
 * 原始类: f.Pd0
 */
public class ChatterAnimation
extends MU {
    public ChatterAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1848;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.546875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Uv(false, 0.0f)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1642;
        n2 = 2;
        n3 = 14;
        f = 666.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1642;
        n2 = 2;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(623));
        n = 623;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.75f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 623;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.25f;
        this.E8 = HB.p30(pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.EN(14, 2, 3, 0.016f, 0.096f, 1.0f, 0.0f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


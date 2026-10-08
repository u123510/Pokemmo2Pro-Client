/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.pj
 */
/**
 * 宝可梦对战技能招式动画 - 吹捧 (Flatter)
 * 技能编号: 260
 * 原始类: f.pj_2
 */
public class FlatterAnimation
extends MU {
    public FlatterAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        FlatterAnimation pj_22 = this;
        FlatterAnimation pj_23 = this;
        short s = 1493;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = pj_23.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(pj_23.i6((byte)2, s, n, n2, f, f2, pF));
        FlatterAnimation pj_24 = this;
        s = 1376;
        n = 1;
        n2 = 14;
        f = 2166.6667f;
        f2 = 0.0f;
        pF = pj_24.Vz0;
        pw_1 pw_14 = pw_13.xi0(pj_24.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 1600.0f, 480.0f)).p1(0.6f).mz0().Xf0();
        FlatterAnimation pj_25 = this;
        s = 1502;
        n = 2;
        n2 = 16;
        f = 500.0f;
        f2 = 0.9375f;
        pF = pj_25.Vz0;
        pw_1 pw_15 = pw_14.xi0(pj_25.i6((byte)2, s, n, n2, f, f2, pF));
        FlatterAnimation pj_26 = this;
        s = 1502;
        n = 2;
        n2 = 16;
        f = 750.0f;
        f2 = 0.9375f;
        pF = pj_26.Vz0;
        pw_1 pw_16 = pw_15.xi0(pj_26.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(426));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.4f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 426, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.4f;
        this.E8 = pw_12 = A2.Kj0(pw_17, this.fE0(-1, 426, s, n, n2, f), 0.4f).xi0(this.Xq0(16, 2, 2, 0.016f, 0.064f, -0.19995117f, 0.19995117f)).xi0(this.EN(16, 2, 2, 0.016f, 0.064f, 0.0f, 0.5f)).mz0().mz0().mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        pj_22.Vs.jH(this.E8);
        pj_22.Vc();
        return pj_22;
    }
}


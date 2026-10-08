/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.f5
 */
/**
 * 宝可梦对战技能招式动画 - 岩崩 (RockSlide)
 * 技能编号: 157
 * 原始类: f.f5_0
 */
public class RockSlideAnimation
extends MU {
    public RockSlideAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1417;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1416;
        n = 0;
        n2 = 16;
        f = 0.0f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 16;
        f = 2333.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 0;
        n2 = 16;
        f = 2333.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(0, 1, 1600.0f, 640.0f)).xi0(this.Sv0(1, 1, 1600.0f, 640.0f)).y80(this.E2(18, true)).mz0().Xf0().y80(this.Qh0(321));
        s = 321;
        n = 1;
        n2 = 11;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = A2.Kj0(pw_15, this.fE0(-1, s, n, n2, n3, f2), 0.12f);
        s = 321;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 321;
        n = 2;
        n2 = 11;
        n3 = 8;
        f2 = 0.25f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 321;
        n = 0;
        n2 = 11;
        n3 = 8;
        f2 = 0.25f;
        pw_1 pw_19 = N4.zr(pw_18, this.fE0(-1, s, n, n2, n3, f2), 0.24f);
        s = 321;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 321;
        n = 2;
        n2 = 11;
        n3 = 8;
        f2 = 0.25f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 321;
        n = 0;
        n2 = 11;
        n3 = 8;
        f2 = 0.25f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 1475;
        n = 2;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_113 = pw_112.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1475;
        n = 2;
        n2 = 16;
        f3 = 333.33334f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_114 = pw_113.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1475;
        n = 2;
        n2 = 16;
        f3 = 500.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_115 = pw_114.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1475;
        n = 2;
        n2 = 16;
        f3 = 666.6667f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_116 = pw_115.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1475;
        n = 2;
        n2 = 16;
        f3 = 833.3333f;
        f2 = 0.703125f;
        pF = this.Vz0;
        this.E8 = pk_1.el(N4.zr(pw_116, this.i6((byte)2, s, n, n2, f3, f2, pF), 0.64f).xi0(this.nM(16, 1)), this.Xq0(16, 2, 6, 0.016f, 0.032f, 0.19995117f, -0.19995117f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).y80(this.E2(18, false)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


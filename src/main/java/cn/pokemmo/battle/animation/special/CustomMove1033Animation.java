/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.pw_1;

/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1033]
 * 原始类: f.GB0
 */
public class CustomMove1033Animation
extends MU {
    public CustomMove1033Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1438;
        int n = 1;
        int n2 = 14;
        float f = 166.66667f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1711;
        n = 2;
        n2 = 14;
        f = 833.3333f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1711;
        n = 2;
        n2 = 14;
        f = 1333.3334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(14, 1)).xi0(this.nM(16, 1)).y80(this.Qh0(434)).y80(this.Qh0(435));
        s = 434;
        n = 0;
        n2 = 9;
        int n3 = 8;
        f2 = 0.75f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 434;
        n = 1;
        n2 = 9;
        n3 = 8;
        f2 = 0.75f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 434;
        n = 2;
        n2 = 9;
        n3 = 8;
        f2 = 0.75f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 434;
        n = 3;
        n2 = 9;
        n3 = 8;
        f2 = 0.75f;
        pw_1 pw_18 = HB.p30(pw_17, this.fE0(-1, s, n, n2, n3, f2));
        s = 434;
        n = 0;
        n2 = 9;
        n3 = 8;
        f2 = 0.75f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 434;
        n = 1;
        n2 = 9;
        n3 = 8;
        f2 = 0.75f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 435;
        n = 1;
        n2 = 9;
        n3 = 8;
        f2 = 0.75f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 435;
        n = 2;
        n2 = 9;
        n3 = 8;
        f2 = 0.75f;
        pw_1 pw_112 = HB.p30(pw_111, this.fE0(-1, s, n, n2, n3, f2)).xi0(this.Wt(1, 0.4f));
        s = 1463;
        n = 3;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_113 = pw_112.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1376;
        n = 3;
        n2 = 16;
        f3 = 916.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_114 = pw_113.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.Sv0(3, 0, 0.0f, 880.0f)).xi0(this.Sv0(3, 1, 640.0f, 160.0f));
        s = 1464;
        n = 1;
        n2 = 16;
        f3 = 0.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_115 = pw_114.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1376;
        n = 1;
        n2 = 16;
        f3 = 916.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_116 = pw_115.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 880.0f)).xi0(this.Sv0(1, 1, 640.0f, 160.0f));
        s = 1712;
        n = 2;
        n2 = 16;
        f3 = 333.33334f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_117 = pw_116.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1712;
        n = 2;
        n2 = 16;
        f3 = 666.6667f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        this.E8 = Zw0.H(pw_117, this.i6((byte)2, s, n, n2, f3, f2, pF));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


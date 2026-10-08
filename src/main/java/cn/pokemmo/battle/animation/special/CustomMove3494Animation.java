/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [3494]
 * 原始类: f.R8
 */
public class CustomMove3494Animation
extends MU {
    public CustomMove3494Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1731;
        int n = 1;
        int n2 = 14;
        float f = 166.66667f;
        float f2 = 0.546875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1551;
        n = 2;
        n2 = 14;
        f = 166.66667f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1551;
        n = 2;
        n2 = 14;
        f = 366.66666f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1551;
        n = 2;
        n2 = 14;
        f = 566.6667f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_15 = A2.Kj0(HB.p30(pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).mz0().Xf0(), this.Xq0(14, 2, 2, 0.0f, 0.24f, -0.100097656f, 0.100097656f)).xi0(this.nM(14, 0)).TD0().p1(0.2f).Xf0().xi0(this.Wt(3, 0.4f)).xi0(this.nM(16, 1)).mz0().mz0().mz0().Xf0(), this.Xq0(16, 2, 2, 0.0f, 0.16f, -0.100097656f, 0.100097656f), 0.08f);
        s = 1731;
        n = 1;
        n2 = 16;
        f = 0.0f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1551;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1551;
        n = 2;
        n2 = 16;
        f = 200.0f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1551;
        n = 2;
        n2 = 16;
        f = 400.0f;
        f2 = 0.390625f;
        pF = this.Vz0;
        this.E8 = pk_1.el(pw_18, this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


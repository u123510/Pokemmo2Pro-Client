/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Cl0
 */
/**
 * 宝可梦对战技能招式动画 - 破壳 (ShellSmash)
 * 技能编号: 504
 * 原始类: f.cl0_0
 */
public class ShellSmashAnimation
extends MU {
    public ShellSmashAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1487;
        int n = 1;
        int n2 = 14;
        float f = 333.33334f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.Xq0(14, 1, 0, 0.0f, 0.32f, 0.100097656f, 0.100097656f)).y80(this.Qh0(670));
        s = 670;
        n = 0;
        n2 = 9;
        int n3 = 8;
        f2 = 0.3499756f;
        pw_1 pw_13 = A2.Kj0(pw_12, this.fE0(-1, s, n, n2, n3, f2), 0.2f);
        s = 670;
        n = 3;
        n2 = 9;
        n3 = 8;
        f2 = 0.25f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 670;
        n = 1;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = N4.zr(pw_14, this.fE0(-1, s, n, n2, n3, f2), 0.4f);
        s = 670;
        n = 2;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 670;
        n = 2;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 670;
        n = 2;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = N4.zr(N4.zr(pw_17, this.fE0(-1, s, n, n2, n3, f2), 0.6f).xi0(this.nM(16, 1)).xi0(this.EN(14, 2, 16, 0.0f, 0.032f, 0.100097656f, 0.0f)), this.Xq0(14, 1, 1, 0.0f, 0.128f, 1.1999512f, 1.1999512f), 0.8f);
        s = 1532;
        n = 1;
        n2 = 14;
        float f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1449;
        n = 2;
        n2 = 14;
        f3 = 83.333336f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        this.E8 = pk_1.el(pw_19.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)), this.Xq0(14, 1, 0, 0.0f, 0.032f, 1.0f, 1.0f)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


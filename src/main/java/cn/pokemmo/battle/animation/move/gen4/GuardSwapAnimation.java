/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 防守互换 (GuardSwap)
 * 技能编号: 385
 * 原始类: f.FK0
 */
public class GuardSwapAnimation
extends MU {
    public GuardSwapAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1473;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.5078125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1452;
        n = 2;
        n2 = 14;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1452;
        n = 1;
        n2 = 16;
        f = 750.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Wt(1, 0.25f)).y80(this.Qh0(560));
        s = 560;
        n = 0;
        n2 = 9;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = A2.Kj0(pk_1.el(N4.zr(N4.zr(N4.zr(N4.zr(A2.Kj0(pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2)), this.dA0(560, 0, 11, 9, 0.5f, 360.0f), 0.06f), this.dA0(560, 0, 11, 9, 0.5f, 360.0f), 0.12f), this.dA0(560, 0, 11, 9, 0.5f, 360.0f), 0.18f), this.dA0(560, 0, 11, 9, 0.5f, 360.0f), 0.24f).xi0(this.dA0(560, 0, 11, 9, 0.5f, 360.0f)).xi0(this.Wt(0, 0.25f)).mz0().mz0().TD0().p1(0.3f).Xf0(), this.dA0(560, 0, 11, 9, 0.5f, 360.0f), 0.36f), this.dA0(560, 0, 11, 9, 0.5f, 360.0f)), this.dA0(560, 0, 9, 11, 0.5f, 360.0f), 0.06f);
        s = 1471;
        n = 1;
        n2 = 14;
        float f3 = 0.0f;
        f2 = 0.5078125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1452;
        n = 2;
        n2 = 16;
        f3 = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1452;
        n = 1;
        n2 = 14;
        f3 = 750.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        this.E8 = pk_1.el(N4.zr(N4.zr(N4.zr(N4.zr(pw_17.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.Wt(1, 0.25f)), this.dA0(560, 0, 9, 11, 0.5f, 360.0f), 0.12f), this.dA0(560, 0, 9, 11, 0.5f, 360.0f), 0.18f), this.dA0(560, 0, 9, 11, 0.5f, 360.0f), 0.24f), this.dA0(560, 0, 9, 11, 0.5f, 360.0f), 0.3f), this.dA0(560, 0, 9, 11, 0.5f, 360.0f)).xi0(this.tP(0.25f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 特性互换 (SkillSwap)
 * 技能编号: 285
 * 原始类: f.VI
 */
public class SkillSwapAnimation
extends MU {
    public SkillSwapAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1510;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.8984375f;
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
        n2 = 14;
        f = 750.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = N4.zr(A2.Kj0(pk_1.el(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(A2.Kj0(pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(452)), this.dA0(452, 0, 11, 9, 0.5f, 360.0f), 0.06f), this.dA0(452, 0, 11, 9, 0.5f, 360.0f), 0.12f), this.dA0(452, 0, 11, 9, 0.5f, 360.0f), 0.18f), this.dA0(452, 0, 11, 9, 0.5f, 360.0f), 0.24f), this.dA0(452, 0, 11, 9, 0.5f, 360.0f), 0.3f), this.dA0(452, 0, 11, 9, 0.5f, 360.0f), 0.36f), this.dA0(452, 0, 11, 9, 0.5f, 360.0f)), this.dA0(452, 0, 9, 11, 0.5f, 360.0f), 0.06f), this.dA0(452, 0, 9, 11, 0.5f, 360.0f), 0.12f);
        s = 1510;
        n = 1;
        n2 = 14;
        f = 0.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1455;
        n = 2;
        n2 = 16;
        f = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 2;
        n2 = 16;
        f = 1833.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        this.E8 = N4.zr(N4.zr(N4.zr(N4.zr(pw_16.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 1600.0f)), this.dA0(452, 0, 9, 11, 0.5f, 360.0f), 0.18f), this.dA0(452, 0, 9, 11, 0.5f, 360.0f), 0.24f), this.dA0(452, 0, 9, 11, 0.5f, 360.0f), 0.3f), this.dA0(452, 0, 9, 11, 0.5f, 360.0f), 0.9f).xi0(this.tP(0.4f)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


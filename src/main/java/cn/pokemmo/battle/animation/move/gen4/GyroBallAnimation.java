/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 陀螺球 (GyroBall)
 * 技能编号: 360
 * 原始类: f.Qz
 */
public class GyroBallAnimation
extends MU {
    public GyroBallAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1876;
        int n2 = 2;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(534));
        n = 534;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 534;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = A2.Kj0(pw_13, this.fE0(-1, n, n2, n3, n4, f2), 0.8f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(1.2f).Xf0();
        n = 1686;
        n2 = 2;
        n3 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF)).xi0(this.nM(16, 1));
        n = 534;
        n2 = 2;
        n3 = 11;
        int n5 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 534;
        n2 = 3;
        n3 = 11;
        n5 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_16.xi0(this.fE0(-1, n, n2, n3, n5, f2)), this.Xq0(16, 2, 1, 0.016f, 0.048f, -0.19995117f, 0.19995117f)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


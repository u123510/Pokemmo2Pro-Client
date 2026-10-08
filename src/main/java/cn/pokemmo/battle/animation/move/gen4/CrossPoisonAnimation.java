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
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 十字毒刃 (CrossPoison)
 * 技能编号: 440
 * 原始类: f.CZ
 */
public class CrossPoisonAnimation
extends MU {
    public CrossPoisonAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        CrossPoisonAnimation cZ = this;
        CrossPoisonAnimation cZ2 = this;
        int n = 1423;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = cZ2.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(cZ2.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        CrossPoisonAnimation cZ3 = this;
        n = 1455;
        n2 = 2;
        n3 = 16;
        f = 166.66667f;
        f2 = 0.859375f;
        pF = cZ3.Vz0;
        pw_1 pw_14 = pw_13.xi0(cZ3.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(615));
        n = 2;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 615, n, n2, n3, f));
        n = 3;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = A2.Kj0(pw_15, this.fE0(-1, 615, n, n2, n3, f), 0.2f);
        n = 0;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 615, n, n2, n3, f));
        n = 1;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(pw_17.xi0(this.fE0(-1, 615, n, n2, n3, f)).xi0(this.Xq0(16, 2, 4, 0.016f, 0.032f, 0.19995117f, -0.19995117f)), this.WW(16, 0.75f, 0.0f, 0.8125f, px_1.ep0(31764))).xi0(this.WW(16, 0.75f, 0.8125f, 0.0f, px_1.ep0(31764))).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        cZ.Vs.jH(this.E8);
        cZ.Vc();
        return cZ;
    }
}


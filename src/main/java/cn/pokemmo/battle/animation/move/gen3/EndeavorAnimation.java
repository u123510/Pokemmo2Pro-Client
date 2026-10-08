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
 * 宝可梦对战技能招式动画 - 蛮干 (Endeavor)
 * 技能编号: 283
 * 原始类: f.K1
 */
public class EndeavorAnimation
extends MU {
    public EndeavorAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1478;
        int n2 = 0;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1478;
        n2 = 0;
        n3 = 14;
        f = 333.33334f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f = 416.66666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Xq0(14, 2, 3, 0.016f, 0.064f, 0.30004883f, -0.30004883f)).y80(this.Qh0(450)).xi0(this.nM(16, 1));
        n = 450;
        n2 = 1;
        n3 = 9;
        int n4 = 8;
        f2 = 0.4f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 450;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.4f;
        pw_1 pw_18 = A2.Kj0(pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.Xq0(16, 2, 1, 0.016f, 0.048f, -0.19995117f, 0.19995117f), 0.24f);
        n = 450;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.4f;
        pw_1 pw_19 = N4.zr(pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.Xq0(16, 2, 1, 0.016f, 0.048f, -0.19995117f, 0.19995117f), 0.48f);
        n = 450;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.4f;
        this.E8 = pk_1.el(pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.Xq0(16, 2, 1, 0.016f, 0.048f, -0.19995117f, 0.19995117f)).xi0(this.nM(16, 0)).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


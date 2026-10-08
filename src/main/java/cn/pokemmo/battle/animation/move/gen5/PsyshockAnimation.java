/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 精神冲击 (Psyshock)
 * 技能编号: 473
 * 原始类: f.MH0
 */
public class PsyshockAnimation
extends MU {
    public PsyshockAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1363;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.nM(14, 1)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1363;
        n2 = 1;
        n3 = 14;
        f = 100.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1363;
        n2 = 1;
        n3 = 14;
        f = 200.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1363;
        n2 = 1;
        n3 = 14;
        f = 300.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_15 = A2.Kj0(pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)), this.EN(14, 2, 10, 0.0f, 0.032f, 0.30004883f, 0.0f), 0.4f).xi0(this.Wt(1, 0.4f));
        n = 1895;
        n2 = 1;
        n3 = 16;
        f = 0.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1589;
        n2 = 1;
        n3 = 16;
        f = 416.66666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1623;
        n2 = 2;
        n3 = 16;
        f = 616.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 0, 672.0f, 320.0f));
        n = 1652;
        n2 = 1;
        n3 = 16;
        f = 1250.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 1;
        n3 = 16;
        f = 1500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(646));
        n = 646;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 646;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_112 = N4.zr(pw_111, this.fE0(-1, n, n2, n3, n4, f2), 0.6f).y80(this.E2(18, true)).y80(this.Qh0(618));
        n = 618;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(N4.zr(pw_112, this.fE0(-1, n, n2, n3, n4, f2), 1.8f).xi0(this.nM(16, 1)), this.Xq0(16, 2, 5, 0.016f, 0.032f, 0.19995117f, -0.19995117f)).xi0(this.tP(0.4f)).y80(this.E2(18, false)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


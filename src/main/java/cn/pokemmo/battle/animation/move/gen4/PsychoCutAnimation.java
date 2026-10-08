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
 * 宝可梦对战技能招式动画 - 精神利刃 (PsychoCut)
 * 技能编号: 427
 * 原始类: f.NS
 */
public class PsychoCutAnimation
extends MU {
    public PsychoCutAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1783;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1264.0f)).xi0(this.Sv0(1, 1, 1120.0f, 144.0f));
        s = 1718;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1816;
        n = 1;
        n2 = 14;
        f = 1333.3334f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(602));
        s = 602;
        n = 1;
        n2 = 9;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 1423;
        n = 2;
        n2 = 16;
        float f3 = 1666.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1423;
        n = 1;
        n2 = 16;
        f3 = 1833.3334f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_18 = A2.Kj0(pw_17, this.i6((byte)2, s, n, n2, f3, f2, pF), 0.1f);
        s = 602;
        n = 0;
        n2 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, s, n, n2, n4, f2));
        s = 602;
        n = 3;
        n2 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = N4.zr(pw_19, this.fE0(-1, s, n, n2, n4, f2), 1.3f).xi0(this.dA0(602, 2, 9, 11, 0.5f, 0.0f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 1)).mz0().mz0().TD0().p1(1.9f).Xf0();
        s = 1376;
        n = 1;
        n2 = 16;
        float f4 = 0.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        this.E8 = pk_1.el(pw_110.xi0(this.i6((byte)2, s, n, n2, f4, f2, pF)), this.EN(16, 2, 4, 0.016f, 0.032f, 0.19995117f, 0.0f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


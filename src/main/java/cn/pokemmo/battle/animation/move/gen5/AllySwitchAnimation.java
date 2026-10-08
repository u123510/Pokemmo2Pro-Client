/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.jl
 */
/**
 * 宝可梦对战技能招式动画 - 交换场地 (AllySwitch)
 * 技能编号: 502
 * 原始类: f.jl_2
 */
public class AllySwitchAnimation
extends MU {
    public AllySwitchAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1437;
        int n = 5;
        int n2 = 2;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1437;
        n = 5;
        n2 = 2;
        f = 266.66666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = A2.Kj0(pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)), this.EN(14, 3, 2, 0.0f, 0.064f, 0.5f, 0.0f), 0.64f).y80(this.E2(14, true));
        s = 1437;
        n = 5;
        n2 = 2;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1437;
        n = 5;
        n2 = 2;
        f = 200.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1437;
        n = 5;
        n2 = 2;
        f = 400.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = N4.zr(pw_15.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)), this.EN(14, 3, 3, 0.0f, 0.048f, 1.0f, 0.0f), 1.36f);
        s = 1437;
        n = 5;
        n2 = 2;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1437;
        n = 5;
        n2 = 2;
        f = 133.33333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1437;
        n = 5;
        n2 = 2;
        f = 266.66666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1437;
        n = 5;
        n2 = 2;
        f = 400.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_110 = N4.zr(pw_19.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)), this.EN(14, 3, 4, 0.0f, 0.032f, 1.5f, 0.0f), 2.0f);
        s = 1437;
        n = 5;
        n2 = 2;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1437;
        n = 5;
        n2 = 2;
        f = 66.666664f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1437;
        n = 5;
        n2 = 2;
        f = 133.33333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_113 = pw_112.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1437;
        n = 5;
        n2 = 2;
        f = 200.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_114 = pw_113.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1437;
        n = 5;
        n2 = 2;
        f = 266.66666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        this.E8 = N4.zr(pw_114.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)), this.EN(14, 3, 5, 0.0f, 0.016f, 2.0f, 0.0f), 2.4f).xi0(this.EN(14, 1, 0, 0.0f, 0.0f, 0.0f, -32.0f)).y80(this.E2(14, false)).xi0(this.tP(0.25f)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 重磅冲撞 (HeavySlam)
 * 技能编号: 484
 * 原始类: f.Nm0
 */
public class HeavySlamAnimation
extends MU {
    public HeavySlamAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1560;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1475;
        n = 1;
        n2 = 14;
        f = 166.66667f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1652;
        n = 2;
        n2 = 14;
        f = 500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = HB.p30(pw_13, this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(582));
        s = 582;
        n = 0;
        n2 = 11;
        int n3 = 8;
        f2 = 0.25f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2)).y80(this.Qh0(198));
        s = 198;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 1413;
        n = 1;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1885;
        n = 2;
        n2 = 16;
        f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        this.E8 = HB.p30(pw_17.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.064f, 0.30004883f, -0.30004883f)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


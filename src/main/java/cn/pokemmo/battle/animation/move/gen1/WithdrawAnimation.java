/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.pA
 */
/**
 * 宝可梦对战技能招式动画 - 缩入壳中 (Withdraw)
 * 技能编号: 110
 * 原始类: f.pa_0
 */
public class WithdrawAnimation
extends MU {
    public WithdrawAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1421;
        int n2 = 1;
        int n3 = 14;
        float f = 166.66667f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1424;
        n2 = 2;
        n3 = 14;
        f = 500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1638;
        n2 = 2;
        n3 = 14;
        f = 666.6667f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 0, 640.0f, 800.0f)).xi0(this.Sv0(2, 1, 1280.0f, 320.0f)).xi0(this.nM(14, 1)).xi0(this.Xq0(14, 2, 1, 0.016f, 0.224f, -0.19995117f, -0.19995117f)).y80(this.Qh0(275));
        n = 275;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.25f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 275;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 275;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 275;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.25f;
        this.E8 = HB.p30(pw_18, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


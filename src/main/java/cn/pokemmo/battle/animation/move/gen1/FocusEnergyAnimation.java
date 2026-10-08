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
 * Renamed from f.Nx
 */
/**
 * 宝可梦对战技能招式动画 - 聚气 (FocusEnergy)
 * 技能编号: 116
 * 原始类: f.nx_0
 */
public class FocusEnergyAnimation
extends MU {
    public FocusEnergyAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 282;
        int n = 0;
        int n2 = 9;
        int n3 = 8;
        float f = 0.375f;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.E2(18, true)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().y80(this.Qh0(282)).xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 282;
        n = 1;
        n2 = 9;
        n3 = 8;
        f = 0.375f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 1474;
        n = 1;
        n2 = 14;
        float f2 = 0.0f;
        f = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1418;
        n = 3;
        n2 = 14;
        f2 = 0.0f;
        f = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f2, f, pF)).xi0(this.Sv0(1, 0, 0.0f, 800.0f)).xi0(this.Sv0(3, 0, 0.0f, 800.0f));
        s = 1376;
        n = 3;
        n2 = 14;
        f2 = 1000.0f;
        f = 0.0f;
        pF = this.Vz0;
        this.E8 = HB.p30(pw_15, this.i6((byte)2, s, n, n2, f2, f, pF)).y80(this.E2(18, false)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


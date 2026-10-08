/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.ga0
 */
/**
 * 宝可梦对战技能招式动画 - 点到为止 (FalseSwipe)
 * 技能编号: 206
 * 原始类: f.ga0_2
 */
public class FalseSwipeAnimation
extends MU {
    public FalseSwipeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1475;
        int n2 = 2;
        int n3 = 16;
        float f = 166.66667f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 160.0f, 240.0f));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1423;
        n2 = 1;
        n3 = 16;
        f = 0.0f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f = 166.66667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(372));
        n = 372;
        n2 = 2;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 372;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 372;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.048f, 0.19995117f, -0.19995117f)).mz0().Xf0().xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.lj
 */
/**
 * 宝可梦对战技能招式动画 - 泡沫 (Bubble)
 * 技能编号: 145
 * 原始类: f.lj_2
 */
public class BubbleAnimation
extends MU {
    public BubbleAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1480;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.3f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1480;
        n2 = 2;
        n3 = 16;
        f = 833.3333f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 960.0f, 480.0f)).xi0(this.Sv0(2, 1, 1760.0f, 480.0f)).y80(this.Qh0(310));
        n = 310;
        n2 = 0;
        n3 = 9;
        int n4 = 11;
        f2 = 0.5f;
        pw_1 pw_14 = A2.Kj0(pw_13, this.fE0(-1, n, n2, n3, n4, f2), 0.4f).xi0(this.Wt(1, 0.8f)).mz0().mz0().mz0().Xf0();
        n = 1452;
        n2 = 2;
        n3 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1452;
        n2 = 1;
        n3 = 16;
        f3 = 166.66667f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1452;
        n2 = 2;
        n3 = 16;
        f3 = 500.0f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 310;
        n2 = 1;
        n3 = 11;
        int n5 = 8;
        f2 = 0.5f;
        this.E8 = HB.p30(pw_17.xi0(this.fE0(-1, n, n2, n3, n5, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 8, 0.016f, 0.032f, 0.050048828f, -0.050048828f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


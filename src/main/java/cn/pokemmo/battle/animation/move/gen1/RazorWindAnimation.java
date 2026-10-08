/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Ih0
 */
/**
 * 宝可梦对战技能招式动画 - 旋风刀 (RazorWind)
 * 技能编号: 13
 * 原始类: f.ih0_0
 */
public class RazorWindAnimation
extends MU {
    public RazorWindAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        pw_1 pw_12;
        RazorWindAnimation ih0_02 = this;
        RazorWindAnimation ih0_03 = this;
        short s = 1497;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = ih0_03.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).xi0(ih0_03.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1120.0f));
        RazorWindAnimation ih0_04 = this;
        s = 1376;
        n = 1;
        n2 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = ih0_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(ih0_04.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 800.0f, 480.0f)).y80(this.Qh0(173));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.0f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 173, s, n, n2, f));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.0f;
        this.E8 = pw_12 = pk_1.el(A2.Kj0(pw_15, this.fE0(-1, 173, s, n, n2, f), 0.2f), this.EN(14, 2, 3, 0.0f, 0.032f, 0.5f, 0.0f)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        ih0_02.Vs.jH(this.E8);
        return ih0_02;
    }

    @Override
    public final MU us() {
        int n = 1421;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 2;
        n3 = 16;
        f = 83.333336f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 1;
        n3 = 16;
        f = 166.66667f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 2;
        n3 = 16;
        f = 250.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 1;
        n3 = 16;
        f = 333.33334f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 2;
        n3 = 16;
        f = 416.66666f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 480.0f)).xi0(this.nM(16, 1)).xi0(this.nM(14, 1)).y80(this.Qh0(174));
        n = 174;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        this.E8 = HB.p30(pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.EN(16, 2, 5, 0.032f, 0.016f, 0.30004883f, 0.0f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


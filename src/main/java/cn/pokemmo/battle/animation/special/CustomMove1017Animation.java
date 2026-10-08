/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1017]
 * 原始类: f.Z60
 */
public class CustomMove1017Animation
extends MU {
    public CustomMove1017Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        pw_1 pw_12;
        PF pF = this.Vz0;
        int n = pF.Jo0;
        if (n > 0) {
            pF.Jo0 = (byte)(n + 1);
            return this;
        }
        CustomMove1017Animation z60 = this;
        CustomMove1017Animation z602 = this;
        short s = 1407;
        n = 2;
        int n2 = 14;
        float f = 500.0f;
        float f2 = 0.9375f;
        PF pF2 = z602.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(z602.i6((byte)2, s, n, n2, f, f2, pF2));
        CustomMove1017Animation z603 = this;
        s = 1376;
        n = 2;
        n2 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF2 = z603.Vz0;
        pw_1 pw_14 = pw_13.xi0(z603.i6((byte)2, s, n, n2, f, f2, pF2)).xi0(this.Sv0(2, 0, 0.0f, 1120.0f)).xi0(this.Sv0(2, 1, 800.0f, 480.0f)).xi0(this.df0(14, 3)).y80(this.Qh0(511));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, 511, s, n, n2, f), 0.2f);
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(pw_15, this.fE0(-1, 511, s, n, n2, f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        z60.Vs.jH(this.E8);
        z60.Vz0.Jo0 = 1;
        return z60;
    }

    @Override
    public final MU us() {
        int n = 1407;
        int n2 = 2;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1705;
        n2 = 1;
        n3 = 16;
        f = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 480.0f)).y80(this.Qh0(512)).y80(this.Qh0(256));
        n = 512;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.25f;
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, n, n2, n3, n4, f2), 0.4f).xi0(this.Xq0(16, 2, 2, 0.0f, 0.064f, 0.30004883f, -0.30004883f));
        n = 512;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 512;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = A2.Kj0(pw_16, this.fE0(-1, n, n2, n3, n4, f2), 0.2f);
        n = 1475;
        n2 = 2;
        n3 = 16;
        float f3 = 0.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f3 = 666.6667f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f3 = 833.3333f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f3 = 1166.6666f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f3 = 1333.3334f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1416;
        n2 = 1;
        n3 = 16;
        f3 = 0.0f;
        f2 = 0.9765625f;
        pF = this.Vz0;
        pw_1 pw_113 = pw_112.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1418;
        n2 = 3;
        n3 = 16;
        f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_114 = pw_113.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f3 = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_115 = pw_114.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f3 = 1833.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_116 = pw_115.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1376;
        n2 = 3;
        n3 = 16;
        f3 = 1833.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_117 = pw_116.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF)).xi0(this.Sv0(3, 1, 1280.0f, 320.0f)).xi0(this.Sv0(2, 1, 960.0f, 800.0f)).xi0(this.Sv0(1, 1, 960.0f, 800.0f));
        n = 256;
        n2 = 0;
        n3 = 11;
        int n5 = 8;
        f2 = 0.0f;
        pw_1 pw_118 = pw_117.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 256;
        n2 = 1;
        n3 = 11;
        n5 = 8;
        f2 = 0.0f;
        pw_1 pw_119 = pw_118.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 256;
        n2 = 1;
        n3 = 11;
        n5 = 8;
        f2 = 0.0f;
        this.E8 = pw_119.xi0(this.fE0(-1, n, n2, n3, n5, f2)).mz0().xi0(this.tP(0.4f)).mz0().mz0().mz0().mz0().Xf0().xi0(this.df0(14, 4)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vz0.Jo0 = 0;
        this.Vc();
        return this;
    }
}


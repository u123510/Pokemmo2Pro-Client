/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.lpt5
 */
/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1003, 1006]
 * 原始类: f.lpt5__6
 */
public class CustomMove1003Animation
extends MU {
    public CustomMove1003Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1492;
        int n2 = 2;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(1, 0.6f)), this.Ue0(4, 16912, 0.0f, 0.75f, 0.1f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 480.0f, 480.0f));
        n = 1783;
        n2 = 1;
        n3 = 14;
        f = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 480.0f, 640.0f)).xi0(this.Sv0(1, 1, 800.0f, 320.0f));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(643));
        n = 643;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.4f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 643;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.4f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 643;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.4f;
        this.E8 = A2.Kj0(pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 9, 0.016f, 0.032f, 0.19995117f, -0.19995117f), 0.04f).xi0(this.df0(14, 4)).mz0().mz0().TD0().p1(0.08f).Xf0().xi0(this.df0(14, 3)).mz0().mz0().TD0().p1(0.12f).Xf0().xi0(this.df0(14, 4)).mz0().mz0().TD0().p1(0.16f).Xf0().xi0(this.df0(14, 3)).mz0().mz0().TD0().p1(0.2f).Xf0().xi0(this.df0(14, 4)).mz0().mz0().TD0().p1(0.24f).Xf0().xi0(this.df0(14, 3)).mz0().mz0().TD0().p1(0.28f).Xf0().xi0(this.df0(14, 4)).mz0().mz0().TD0().p1(0.32f).Xf0().xi0(this.df0(14, 3)).mz0().mz0().TD0().p1(0.36f).Xf0().xi0(this.df0(14, 4)).mz0().mz0().TD0().p1(0.4f).Xf0().xi0(this.df0(14, 3)).mz0().mz0().TD0().p1(0.44f).Xf0().xi0(this.df0(14, 4)).mz0().mz0().mz0().Xf0().xi0(this.nM(16, 0)).xi0(this.Ue0(4, 16912, 0.75f, 0.0f, 0.1f)).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.Dy
 */
/**
 * 宝可梦对战技能招式动画 - 大声咆哮 (Snarl)
 * 技能编号: 555
 * 原始类: f.dy_0
 */
public class SnarlAnimation
extends MU {
    public SnarlAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1467;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.E2(18, true)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1455;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 1280.0f)).xi0(this.Sv0(2, 1, 960.0f, 320.0f));
        s = 1376;
        n = 2;
        n2 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(726));
        s = 726;
        n = 1;
        n2 = 9;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 726;
        n = 3;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 726;
        n = 0;
        n2 = 9;
        n3 = 11;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 726;
        n = 2;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = A2.Kj0(pw_17.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.Xq0(14, 2, 1, 0.016f, 0.32f, 0.19995117f, -0.19995117f)), this.EN(14, 2, 10, 0.0f, 0.048f, 0.30004883f, 0.0f), 0.8f).xi0(this.Xq0(16, 2, 4, 0.016f, 0.032f, -0.19995117f, 0.19995117f)).xi0(this.Wt(1, 0.3f));
        s = 1420;
        n = 1;
        n2 = 16;
        float f3 = 166.66667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1420;
        n = 1;
        n2 = 16;
        f3 = 250.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1420;
        n = 1;
        n2 = 16;
        f3 = 333.33334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        this.E8 = pw_110.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.nM(16, 1)).mz0().mz0().mz0().Xf0().xi0(this.tP(0.3f)).xi0(this.nM(16, 0)).y80(this.E2(18, false)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


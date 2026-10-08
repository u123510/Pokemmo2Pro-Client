/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 隐形岩 (StealthRock)
 * 技能编号: 446
 * 原始类: f.MN
 */
public class StealthRockAnimation
extends MU {
    public StealthRockAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1760;
        int n2 = 1;
        int n3 = 14;
        float f = 250.0f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 560.0f, 1120.0f));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f = 1083.3334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f = 1166.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(A2.Kj0(pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(621)), this.dA0(621, 2, 9, 1, 0.5f, 360.0f), 0.12f), this.dA0(621, 2, 9, 1, 0.5f, 360.0f), 0.24f), this.dA0(621, 2, 9, 1, 0.5f, 360.0f), 0.36f).xi0(this.dA0(621, 2, 9, 1, 0.5f, 360.0f)).p1(0.4f).mz0().mz0().TD0().p1(0.42f).Xf0(), this.dA0(621, 2, 9, 1, 0.5f, 360.0f), 0.54f), this.dA0(621, 2, 9, 1, 0.5f, 360.0f), 0.66f), this.dA0(621, 2, 9, 1, 0.5f, 360.0f), 0.74f);
        n = 621;
        n2 = 0;
        n3 = 1;
        int n4 = 8;
        f2 = 0.25f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 621;
        n2 = 1;
        n3 = 1;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_17 = N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.dA0(621, 2, 9, 0, 0.5f, 360.0f), 0.86f), this.dA0(621, 2, 9, 0, 0.5f, 360.0f), 0.98f), this.dA0(621, 2, 9, 0, 0.5f, 360.0f), 1.1f).xi0(this.dA0(621, 2, 9, 0, 0.5f, 360.0f)).p1(0.4f).mz0().mz0().TD0().p1(1.16f).Xf0(), this.dA0(621, 2, 9, 0, 0.5f, 360.0f), 1.28f), this.dA0(621, 2, 9, 0, 0.5f, 360.0f), 1.4f), this.dA0(621, 2, 9, 0, 0.5f, 360.0f), 1.48f);
        n = 621;
        n2 = 0;
        n3 = 0;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 621;
        n2 = 1;
        n3 = 0;
        n4 = 8;
        f2 = 0.25f;
        this.E8 = pk_1.el(pw_18, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


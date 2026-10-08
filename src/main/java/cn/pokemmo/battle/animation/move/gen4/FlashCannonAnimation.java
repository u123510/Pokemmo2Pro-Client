/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 加农光炮 (FlashCannon)
 * 技能编号: 430
 * 原始类: f.ZF
 */
public class FlashCannonAnimation
extends MU {
    public FlashCannonAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1487;
        int n2 = 1;
        int n3 = 14;
        float f = 500.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.075f)).y80(this.E2(18, true)).xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 1600.0f, 480.0f));
        n = 1437;
        n2 = 2;
        n3 = 14;
        f = 2166.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(605)).y80(this.Qh0(606));
        n = 605;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 605;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 605;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 605;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 605;
        n2 = 4;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 606;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 606;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = A2.Kj0(pw_19, this.fE0(-1, n, n2, n3, n4, f2), 2.5f).xi0(this.dA0(606, 0, 9, 11, 0.5f, 192.0f)).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(2.82f).Xf0();
        n = 1483;
        n2 = 2;
        n3 = 16;
        float f3 = 0.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1475;
        n2 = 1;
        n3 = 16;
        f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 606;
        n2 = 1;
        n3 = 11;
        int n5 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = N4.zr(pw_112, this.fE0(-1, n, n2, n3, n5, f2), 2.92f);
        n = 606;
        n2 = 1;
        n3 = 11;
        n5 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_113.xi0(this.fE0(-1, n, n2, n3, n5, f2)).xi0(this.nM(16, 1)).mz0().mz0().TD0().p1(3.52f).Xf0().xi0(this.Xq0(16, 2, 8, 0.0f, 0.032f, -0.19995117f, 0.19995117f)), this.EN(16, 2, 10, 0.0f, 0.032f, 0.19995117f, 0.0f)).xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.075f)).xi0(this.tP(0.4f)).y80(this.E2(14, false)).xi0(this.nM(18, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


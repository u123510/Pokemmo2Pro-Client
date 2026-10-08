/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.Zw0;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 意念头锤 (ZenHeadbutt)
 * 技能编号: 428
 * 原始类: f.t40
 */
public class ZenHeadbuttAnimation
extends MU {
    public ZenHeadbuttAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1483;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.25f)), this.Ue0(4, 0, 0.0f, 0.8125f, 0.075f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1024.0f));
        n = 1437;
        n2 = 2;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(603));
        n = 603;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 603;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = N4.zr(A2.Kj0(pw_14, this.fE0(-1, n, n2, n3, n4, f2), 1.2f), this.EN(14, 2, 1, 0.016f, 0.032f, 2.0f, 0.0f), 1.22f).xi0(this.Wt(1, 0.2f)).mz0().mz0().TD0().p1(1.42f).Xf0();
        n = 1448;
        n2 = 1;
        n3 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 603;
        n2 = 1;
        n3 = 11;
        int n5 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 603;
        n2 = 2;
        n3 = 11;
        n5 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 603;
        n2 = 4;
        n3 = 11;
        n5 = 8;
        f2 = 0.5f;
        this.E8 = Zw0.H(pk_1.el(pw_19.xi0(this.fE0(-1, n, n2, n3, n5, f2)).xi0(this.nM(14, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, -0.19995117f, 0.19995117f)).xi0(this.tP(0.25f)).xi0(this.nM(14, 0)), this.Ue0(4, 0, 0.8125f, 0.0f, 0.075f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


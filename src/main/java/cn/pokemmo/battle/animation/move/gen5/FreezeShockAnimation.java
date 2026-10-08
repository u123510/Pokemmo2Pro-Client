/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 冰封伏特 (FreezeShock)
 * 技能编号: 553
 * 原始类: f.vy0
 */
public class FreezeShockAnimation
extends MU {
    public FreezeShockAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        pw_1 pw_12;
        FreezeShockAnimation vy02 = this;
        FreezeShockAnimation vy03 = this;
        int n = 1522;
        int n2 = 1;
        int n3 = 14;
        float f = 166.66667f;
        float f2 = 0.9921875f;
        PF pF = vy03.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).mz0().Xf0().xi0(vy03.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        FreezeShockAnimation vy04 = this;
        n = 1895;
        n2 = 2;
        n3 = 14;
        f = 333.33334f;
        f2 = 0.9921875f;
        pF = vy04.Vz0;
        pw_1 pw_14 = pw_13.xi0(vy04.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(720));
        n = 0;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 720, n, n2, n3, f));
        n = 1;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 720, n, n2, n3, f));
        n = 2;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 720, n, n2, n3, f));
        n = 3;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_17.xi0(this.fE0(-1, 720, n, n2, n3, f)), this.Xq0(16, 2, 1, 0.0f, 0.032f, 0.100097656f, -0.100097656f)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        vy02.Vs.jH(this.E8);
        return vy02;
    }

    @Override
    public final MU us() {
        int n = 2;
        boolean bl = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl);
        n = 0;
        boolean bl2 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl2);
        n = 722;
        int n2 = 1;
        int n3 = 9;
        int n4 = 8;
        float f = 0.5f;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().y80(this.QO(20)).y80(ao_1.pc(lpt4__42)).xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)), this.Ue0(4, 0, 0.0f, 1.0f, 0.075f)).y80(ao_1.pc(lpt4__43)).y80(this.Qh0(721)).y80(this.Qh0(722)).y80(this.Qh0(723)).xi0(this.fE0(-1, n, n2, n3, n4, f));
        n = 723;
        int n5 = 1;
        n3 = 9;
        n4 = 8;
        f = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, n, n5, n3, n4, f));
        n = 721;
        int n6 = 3;
        n3 = 9;
        n4 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n6, n3, n4, f));
        n = 1522;
        int n7 = 0;
        n3 = 14;
        float f2 = 250.0f;
        f = 0.546875f;
        PF pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n7, n3, f2, f, pF));
        n = 1488;
        int n8 = 1;
        n3 = 14;
        f2 = 0.0f;
        f = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n8, n3, f2, f, pF));
        n = 1707;
        int n9 = 2;
        n3 = 14;
        f2 = 1166.6666f;
        f = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n9, n3, f2, f, pF)).xi0(this.Sv0(2, 0, 1120.0f, 480.0f));
        n = 1376;
        int n10 = 2;
        n3 = 14;
        f2 = 1666.6666f;
        f = 0.0f;
        pF = this.Vz0;
        pw_1 pw_18 = A2.Kj0(pw_17, this.i6((byte)2, (short)n, n10, n3, f2, f, pF), 1.2f).xi0(this.Wt(1, 0.4f)).xi0(this.nM(16, 1)).xi0(this.dA0(721, 0, 9, 11, 0.5f, 240.0f)).xi0(this.dA0(722, 2, 9, 11, 0.5f, 240.0f)).xi0(this.dA0(723, 2, 9, 11, 0.5f, 240.0f));
        n = 1;
        boolean bl3 = false;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl3);
        n = 1521;
        int n11 = 1;
        n3 = 16;
        f2 = 166.66667f;
        f = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.y80(ao_1.pc(lpt4__44)).mz0().mz0().TD0().p1(1.6f).Xf0().xi0(this.i6((byte)2, (short)n, n11, n3, f2, f, pF));
        n = 1521;
        int n12 = 1;
        n3 = 16;
        f2 = 500.0f;
        f = 0.625f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n12, n3, f2, f, pF));
        n = 1521;
        int n13 = 1;
        n3 = 16;
        f2 = 1000.0f;
        f = 0.4296875f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n, n13, n3, f2, f, pF));
        n = 1908;
        int n14 = 2;
        n3 = 16;
        f2 = 166.66667f;
        f = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, (short)n, n14, n3, f2, f, pF));
        n = 1748;
        int n15 = 3;
        n3 = 16;
        f2 = 0.0f;
        f = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_113 = pw_112.xi0(this.i6((byte)2, (short)n, n15, n3, f2, f, pF)).xi0(this.Sv0(3, 0, 0.0f, 1600.0f)).xi0(this.Sv0(3, 1, 1120.0f, 320.0f));
        n = 1376;
        int n16 = 3;
        n3 = 16;
        f2 = 1666.6666f;
        f = 0.0f;
        pF = this.Vz0;
        pw_1 pw_114 = pw_113.xi0(this.i6((byte)2, (short)n, n16, n3, f2, f, pF)).xi0(this.Ue0(3, 0, 1.0f, 0.0f, 0.075f)).xi0(this.mf0(2, 0, 8, 0.032f)).xi0(this.Xq0(16, 3, 3, 0.0f, 0.032f, 0.30004883f, -0.30004883f));
        n = 721;
        int n17 = 1;
        n3 = 11;
        int n18 = 8;
        f = 0.5f;
        pw_1 pw_115 = pw_114.xi0(this.fE0(-1, n, n17, n3, n18, f));
        n = 722;
        int n19 = 0;
        n3 = 11;
        n18 = 8;
        f = 0.5f;
        pw_1 pw_116 = pw_115.xi0(this.fE0(-1, n, n19, n3, n18, f));
        n = 721;
        int n20 = 2;
        n3 = 11;
        n18 = 8;
        f = 0.5f;
        pw_1 pw_117 = HB.p30(pk_1.el(pw_116, this.fE0(-1, n, n20, n3, n18, f)), this.Ue0(3, 0, 0.0f, 1.0f, 0.075f));
        n = 0;
        boolean bl4 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl4);
        n = 1;
        boolean bl5 = true;
        this.E8 = pw_117.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n, bl5))).mz0().Xf0().xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.075f)).xi0(this.nM(16, 0)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 近身战 (CloseCombat)
 * 技能编号: 370
 * 原始类: f.BF0
 */
public class CloseCombatAnimation
extends MU {
    public CloseCombatAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1423;
        int bl = 1;
        int n2 = 16;
        float f = 166.66667f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, (short)n, bl, n2, f, f2, pF)).xi0(this.Wt(1, 0.4f)).y80(this.QO(29));
        n = 2;
        boolean bl2 = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl2);
        n = 0;
        boolean bl3 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl3);
        n = 1;
        boolean bl4 = false;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl4);
        n = 1475;
        int n3 = 1;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = HB.p30(pw_12.y80(ao_1.pc(lpt4__42)), this.Ue0(4, 0, 0.0f, 0.9375f, 0.025f)).xi0(this.mf0(4, 24, 0, 1.44f)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.Ue0(3, 0, 0.8125f, 0.0f, 0.025f)).xi0(this.i6((byte)2, (short)n, n3, n2, f, f2, pF));
        n = 1475;
        int n4 = 1;
        n2 = 16;
        f = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n4, n2, f, f2, pF));
        n = 1475;
        int n5 = 1;
        n2 = 16;
        f = 500.0f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n5, n2, f, f2, pF));
        n = 1475;
        int n6 = 1;
        n2 = 16;
        f = 666.6667f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n6, n2, f, f2, pF));
        n = 1475;
        int n7 = 1;
        n2 = 16;
        f = 833.3333f;
        f2 = 0.078125f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n7, n2, f, f2, pF));
        n = 1420;
        int n8 = 2;
        n2 = 16;
        f = 166.66667f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n8, n2, f, f2, pF));
        n = 1420;
        int n9 = 2;
        n2 = 16;
        f = 250.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n9, n2, f, f2, pF));
        n = 1420;
        int n10 = 2;
        n2 = 16;
        f = 333.33334f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n10, n2, f, f2, pF));
        n = 1420;
        int n11 = 2;
        n2 = 16;
        f = 416.66666f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n, n11, n2, f, f2, pF));
        n = 1420;
        int n12 = 2;
        n2 = 16;
        f = 500.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, (short)n, n12, n2, f, f2, pF)).y80(this.Qh0(545));
        n = 545;
        int n13 = 0;
        n2 = 11;
        int n14 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = pw_112.xi0(this.fE0(-1, n, n13, n2, n14, f2));
        n = 545;
        int n15 = 1;
        n2 = 11;
        n14 = 8;
        f2 = 0.5f;
        pw_1 pw_114 = pw_113.xi0(this.fE0(-1, n, n15, n2, n14, f2));
        n = 545;
        int n16 = 2;
        n2 = 11;
        n14 = 8;
        f2 = 0.5f;
        pw_1 pw_115 = HB.p30(HB.p30(pw_114.xi0(this.fE0(-1, n, n16, n2, n14, f2)).xi0(this.nM(16, 1)).xi0(this.EN(16, 2, 16, 0.016f, 0.016f, 0.19995117f, 0.0f)), this.Xq0(16, 2, 4, 0.016f, 0.032f, -0.19995117f, 0.19995117f)), this.Ue0(3, 0, 0.0f, 0.9375f, 0.025f));
        n = 0;
        boolean bl5 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl5);
        n = 1;
        boolean bl6 = true;
        this.E8 = Zw0.H(pw_115.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n, bl6))).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)), this.Ue0(2, 0, 0.9375f, 0.0f, 0.025f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


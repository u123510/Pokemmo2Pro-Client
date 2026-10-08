/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 舍身冲撞 (DoubleEdge)
 * 技能编号: 38
 * 原始类: f.kz0
 */
public class DoubleEdgeAnimation
extends MU {
    public DoubleEdgeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1445;
        int bl = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().p1(0.6f).xi0(this.i6((byte)2, (short)n, bl, n2, f, f2, pF));
        n = 1376;
        int n3 = 1;
        n2 = 14;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = HB.p30(HB.p30(pw_12.xi0(this.i6((byte)2, (short)n, n3, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1600.0f)), this.Sv0(1, 1, 960.0f, 640.0f)).xi0(this.Wt(1, 0.4f)), this.Ue0(2, 0, 0.0f, 1.0f, 0.05f)).xi0(this.Ue0(3, 0, 1.0f, 0.0f, 0.05f)).y80(this.QO(3));
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
        int n4 = 1;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.i6((byte)2, (short)n, n4, n2, f, f2, pF));
        n = 1521;
        int n5 = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n5, n2, f, f2, pF)).y80(this.Qh0(200));
        n = 200;
        int n6 = 0;
        n2 = 11;
        int n7 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n6, n2, n7, f2));
        n = 200;
        int n8 = 1;
        n2 = 11;
        n7 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n8, n2, n7, f2));
        n = 200;
        int n9 = 2;
        n2 = 11;
        n7 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n9, n2, n7, f2));
        n = 200;
        int n10 = 3;
        n2 = 11;
        n7 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n10, n2, n7, f2));
        n = 200;
        int n11 = 4;
        n2 = 11;
        n7 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n11, n2, n7, f2)).xi0(this.nM(16, 1));
        n = 2;
        boolean bl5 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl5);
        n = 0;
        boolean bl6 = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n, bl6);
        n = 1;
        boolean bl7 = true;
        lpt4__4 lpt4__47 = new lpt4__4(this, n, bl7);
        n = 2;
        boolean bl8 = false;
        this.E8 = HB.p30(HB.p30(pw_110.y80(ao_1.pc(lpt4__45)).xi0(this.mf0(2, 0, 10, 0.032f)).xi0(this.EN(16, 2, 1, 0.032f, 0.032f, 1.0f, 0.0f)), this.Xq0(16, 2, 1, 0.032f, 0.064f, 0.30004883f, -0.30004883f)), this.Ue0(3, 0, 0.0f, 1.0f, 0.025f)).xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.025f)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(lpt4__47)).y80(ao_1.pc(new lpt4__4(this, n, bl8))).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


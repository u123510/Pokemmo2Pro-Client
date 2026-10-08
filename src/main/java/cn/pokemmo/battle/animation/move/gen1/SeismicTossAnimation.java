/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;

/*
 * Renamed from f.z10
 */
/**
 * 宝可梦对战技能招式动画 - 地球上投 (SeismicToss)
 * 技能编号: 69
 * 原始类: f.z10_0
 */
public class SeismicTossAnimation
extends MU {
    public SeismicTossAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1895;
        int bl = 1;
        int n2 = 16;
        float f = 333.33334f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, (short)n, bl, n2, f, f2, pF));
        n = 1895;
        int n3 = 2;
        n2 = 16;
        f = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = HB.p30(pw_12.xi0(this.i6((byte)2, (short)n, n3, n2, f, f2, pF)), this.Ue0(2, 0, 0.0f, 0.8125f, 0.05f)).y80(this.QO(10));
        n = 2;
        boolean bl2 = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl2);
        n = 1;
        boolean bl3 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl3);
        n = 0;
        boolean bl4 = false;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl4);
        n = 1416;
        int n4 = 1;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = HB.p30(HB.p30(HB.p30(HB.p30(pw_13.y80(ao_1.pc(lpt4__42)).xi0(this.mf0(4, 0, 22, 0.48f)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.Wt(1, 0.4f)).mz0().Xf0(), this.mf0(4, 0, 18, 0.32f)), this.mf0(4, 0, 14, 0.16f)), this.mf0(4, 0, 10, 0.16f)), this.mf0(4, 0, -14, 0.16f)).xi0(this.mf0(4, 0, -22, 0.96f)).xi0(this.nM(14, 1)).xi0(this.i6((byte)2, (short)n, n4, n2, f, f2, pF));
        n = 1376;
        int n5 = 1;
        n2 = 16;
        f = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n5, n2, f, f2, pF));
        n = 1418;
        int n6 = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n6, n2, f, f2, pF));
        n = 1376;
        int n7 = 2;
        n2 = 16;
        f = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n7, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 640.0f, 320.0f)).xi0(this.Sv0(2, 1, 640.0f, 320.0f)).y80(this.Qh0(230));
        n = 230;
        int n8 = 0;
        n2 = 11;
        int n9 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n8, n2, n9, f2));
        n = 230;
        int n10 = 1;
        n2 = 11;
        n9 = 8;
        f2 = 0.25f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n10, n2, n9, f2));
        n = 230;
        int n11 = 2;
        n2 = 11;
        n9 = 8;
        f2 = 0.25f;
        pw_1 pw_110 = HB.p30(pw_19.xi0(this.fE0(-1, n, n11, n2, n9, f2)), this.EN(16, 3, 3, 0.032f, 0.016f, 0.30004883f, 0.0f));
        n = 1;
        boolean bl5 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl5);
        n = 0;
        boolean bl6 = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n, bl6);
        n = 2;
        boolean bl7 = false;
        this.E8 = Zw0.H(pw_110.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n, bl7))).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)), this.Ue0(2, 0, 0.8125f, 0.0f, 0.05f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


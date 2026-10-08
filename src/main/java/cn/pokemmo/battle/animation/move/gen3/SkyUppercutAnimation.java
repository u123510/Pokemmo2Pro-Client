/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.pp0
 */
/**
 * 宝可梦对战技能招式动画 - 冲天拳 (SkyUppercut)
 * 技能编号: 327
 * 原始类: f.pp0_0
 */
public class SkyUppercutAnimation
extends MU {
    public SkyUppercutAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 2;
        boolean bl = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl);
        n = 1;
        boolean bl2 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl2);
        n = 0;
        boolean bl3 = false;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl3);
        n = 1418;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).y80(this.QO(26)).y80(ao_1.pc(lpt4__42)).mz0().Xf0(), this.Ue0(4, 0, 0.0f, 0.9375f, 0.025f)).xi0(this.mf0(4, 0, 24, 1.12f)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.Ue0(4, 0, 0.9375f, 0.0f, 0.025f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        int n4 = 1;
        n3 = 16;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n4, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1120.0f)).xi0(this.Sv0(1, 1, 800.0f, 480.0f));
        n = 1475;
        int n5 = 2;
        n3 = 16;
        f = 333.33334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n5, n3, f, f2, pF));
        n = 1475;
        int n6 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n6, n3, f, f2, pF));
        n = 1475;
        int n7 = 2;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.234375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n7, n3, f, f2, pF));
        n = 1475;
        int n8 = 2;
        n3 = 16;
        f = 1333.3334f;
        f2 = 0.078125f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n8, n3, f, f2, pF)).y80(this.Qh0(497));
        n = 497;
        int n9 = 0;
        n3 = 11;
        int n10 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n9, n3, n10, f2));
        n = 497;
        int n11 = 1;
        n3 = 11;
        n10 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n11, n3, n10, f2));
        n = 497;
        int n12 = 2;
        n3 = 11;
        n10 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n12, n3, n10, f2));
        n = 497;
        int n13 = 3;
        n3 = 11;
        n10 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = HB.p30(pk_1.el(A2.Kj0(pw_110, this.fE0(-1, n, n13, n3, n10, f2), 0.4f).xi0(this.nM(16, 1)), this.Xq0(16, 2, 4, 0.016f, 0.032f, -0.30004883f, 0.39990234f)), this.Ue0(4, 0, 0.0f, 0.9375f, 0.05f));
        n = 0;
        boolean bl4 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl4);
        n = 1;
        boolean bl5 = true;
        this.E8 = Zw0.H(pw_111.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n, bl5))).mz0().Xf0().xi0(this.nM(16, 0)).xi0(this.tP(0.4f)), this.Ue0(4, 0, 0.9375f, 0.0f, 0.025f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


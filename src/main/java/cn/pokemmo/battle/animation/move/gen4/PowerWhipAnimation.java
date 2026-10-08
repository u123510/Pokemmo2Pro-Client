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

/*
 * Renamed from f.ps0
 */
/**
 * 宝可梦对战技能招式动画 - 强力鞭打 (PowerWhip)
 * 技能编号: 438
 * 原始类: f.ps0_0
 */
public class PowerWhipAnimation
extends MU {
    public PowerWhipAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 2;
        boolean bl = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl);
        n = 0;
        boolean bl2 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl2);
        n = 1;
        boolean bl3 = false;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl3);
        n = 1445;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.QO(33)).y80(ao_1.pc(lpt4__42)).xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.075f)).xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.mf0(2, 8, 0, 0.032f)).xi0(this.Ue0(3, 0, 0.8125f, 0.0f, 0.025f)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        int n4 = 1;
        n3 = 14;
        f = 666.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n4, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 640.0f)).xi0(this.Sv0(1, 1, 480.0f, 160.0f));
        n = 1420;
        int n5 = 2;
        n3 = 16;
        f = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n5, n3, f, f2, pF));
        n = 1420;
        int n6 = 2;
        n3 = 16;
        f = 583.3333f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n6, n3, f, f2, pF));
        n = 1420;
        int n7 = 2;
        n3 = 16;
        f = 833.3333f;
        f2 = 0.15625f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n7, n3, f, f2, pF));
        n = 1420;
        int n8 = 2;
        n3 = 16;
        f = 1083.3334f;
        f2 = 0.0390625f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n8, n3, f, f2, pF)).y80(this.Qh0(613));
        n = 613;
        int n9 = 0;
        n3 = 11;
        int n10 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n9, n3, n10, f2));
        n = 613;
        int n11 = 1;
        n3 = 11;
        n10 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n11, n3, n10, f2));
        n = 613;
        int n12 = 2;
        n3 = 11;
        n10 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = HB.p30(HB.p30(pw_19.xi0(this.fE0(-1, n, n12, n3, n10, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 4, 0.016f, 0.032f, 0.19995117f, -0.19995117f)), this.Ue0(3, 0, 0.0f, 0.8125f, 0.075f));
        n = 0;
        boolean bl4 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl4);
        n = 1;
        boolean bl5 = true;
        this.E8 = Zw0.H(pw_110.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n, bl5))).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)), this.Ue0(2, 0, 0.8125f, 0.125f, 0.075f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


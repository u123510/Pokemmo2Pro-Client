/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Ae0
 */
/**
 * 宝可梦对战技能招式动画 - 真气拳 (FocusPunch)
 * 技能编号: 264
 * 原始类: f.ae0_0
 */
public class FocusPunchAnimation
extends MU {
    public FocusPunchAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1421;
        int bl = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = A2.Kj0(A2.Kj0(FB.zd0(0.6f), this.i6((byte)2, (short)n, bl, n2, f, f2, pF), 0.16f).xi0(this.Wt(1, 0.3f)).y80(this.QO(24)).mz0().mz0().mz0().Xf0(), this.Ue0(2, 0, 0.0f, 0.8125f, 0.05f), 0.2f).xi0(this.Ue0(3, 0, 0.8125f, 0.0f, 0.05f));
        n = 0;
        boolean bl2 = false;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl2);
        n = 1;
        boolean bl3 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl3);
        n = 2;
        boolean bl4 = true;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl4);
        n = 1407;
        int n3 = 1;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.i6((byte)2, (short)n, n3, n2, f, f2, pF));
        n = 1376;
        int n4 = 1;
        n2 = 16;
        f = 333.33334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n4, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 320.0f));
        n = 1420;
        int n5 = 1;
        n2 = 16;
        f = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n5, n2, f, f2, pF));
        n = 1475;
        int n6 = 2;
        n2 = 16;
        f = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n6, n2, f, f2, pF)).y80(this.Qh0(430));
        n = 430;
        int n7 = 2;
        n2 = 11;
        int n8 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n7, n2, n8, f2));
        n = 430;
        int n9 = 3;
        n2 = 11;
        n8 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n9, n2, n8, f2));
        n = 430;
        int n10 = 4;
        n2 = 11;
        n8 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n10, n2, n8, f2));
        n = 430;
        int n11 = 0;
        n2 = 11;
        n8 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n11, n2, n8, f2));
        n = 430;
        int n12 = 1;
        n2 = 11;
        n8 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = A2.Kj0(pk_1.el(pw_110.xi0(this.fE0(-1, n, n12, n2, n8, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 8, 0.016f, 0.032f, -0.19995117f, 0.19995117f)), this.Ue0(3, 0, 0.0f, 1.0f, 0.05f), 0.32f).xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.025f));
        n = 0;
        boolean bl5 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl5);
        n = 1;
        boolean bl6 = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n, bl6);
        n = 2;
        boolean bl7 = false;
        this.E8 = pw_111.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n, bl7))).xi0(this.tP(0.3f)).xi0(this.nM(16, 0)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


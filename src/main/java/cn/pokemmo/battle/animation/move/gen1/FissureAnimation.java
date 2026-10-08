/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.FB;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 地裂 (Fissure)
 * 技能编号: 90
 * 原始类: f.Uv0
 */
public class FissureAnimation
extends MU {
    public FissureAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 0;
        boolean bl = false;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl);
        n = 1;
        boolean bl2 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl2);
        n = 2;
        boolean bl3 = true;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl3);
        n = 1417;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(FB.zd0(0.6f).xi0(this.nM(14, 1)), this.Ue0(2, 0, 0.0f, 1.0f, 0.025f)).xi0(this.Ue0(3, 0, 1.0f, 0.0f, 0.05f)).y80(this.QO(12)).xi0(this.mf0(2, 8, 0, 0.032f)).y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        int n4 = 1;
        n3 = 16;
        f = 2333.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n4, n3, f, f2, pF));
        n = 1418;
        int n5 = 3;
        n3 = 16;
        f = 0.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n5, n3, f, f2, pF));
        n = 1376;
        int n6 = 3;
        n3 = 16;
        f = 2333.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n6, n3, f, f2, pF));
        n = 1488;
        int n7 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n7, n3, f, f2, pF));
        n = 1488;
        int n8 = 2;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n8, n3, f, f2, pF));
        n = 1488;
        int n9 = 2;
        n3 = 16;
        f = 1333.3334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = A2.Kj0(pw_17, this.i6((byte)2, (short)n, n9, n3, f, f2, pF), 0.4f).y80(this.Qh0(257)).y80(this.Qh0(258));
        n = 258;
        int n10 = 0;
        n3 = 11;
        int n11 = 8;
        f2 = -0.25f;
        pw_1 pw_19 = N4.zr(pw_18, this.fE0(-1, n, n10, n3, n11, f2), 0.8f);
        n = 257;
        int n12 = 0;
        n3 = 11;
        n11 = 8;
        f2 = 0.0f;
        pw_1 pw_110 = HB.p30(pk_1.el(pw_19.xi0(this.fE0(-1, n, n12, n3, n11, f2)).xi0(this.nM(16, 1)), this.EN(16, 2, 14, 0.032f, 0.016f, 0.30004883f, 0.0f)), this.Ue0(3, 0, 0.0f, 1.0f, 0.05f)).xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.025f));
        n = 1;
        boolean bl4 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl4);
        n = 0;
        boolean bl5 = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n, bl5);
        n = 2;
        boolean bl6 = false;
        this.E8 = pw_110.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n, bl6))).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


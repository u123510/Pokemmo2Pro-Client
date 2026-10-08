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
 * 宝可梦对战技能招式动画 - 百万吨重踢 (MegaKick)
 * 技能编号: 25
 * 原始类: f.K60
 */
public class MegaKickAnimation
extends MU {
    public MegaKickAnimation(PF pF) {
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
        n = 1421;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.QO(1)), this.Ue0(2, 0, 0.0f, 1.0f, 0.025f)).xi0(this.mf0(2, 0, 4, 0.016f)).y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1526;
        int n4 = 2;
        n3 = 16;
        f = 250.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n4, n3, f, f2, pF));
        n = 1424;
        int n5 = 1;
        n3 = 16;
        f = 250.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n5, n3, f, f2, pF)).y80(this.Qh0(187));
        n = 187;
        int n6 = 0;
        n3 = 11;
        int n7 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n6, n3, n7, f2));
        n = 187;
        int n8 = 1;
        n3 = 11;
        n7 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n8, n3, n7, f2));
        n = 187;
        int n9 = 2;
        n3 = 11;
        n7 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n9, n3, n7, f2));
        n = 187;
        int n10 = 3;
        n3 = 11;
        n7 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = HB.p30(HB.p30(pw_17.xi0(this.fE0(-1, n, n10, n3, n7, f2)).xi0(this.nM(16, 1)), this.EN(16, 2, 16, 0.016f, 0.016f, 0.60009766f, 0.0f)), this.Ue0(3, 0, 0.0f, 1.0f, 0.025f)).xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.025f));
        n = 0;
        boolean bl4 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl4);
        n = 1;
        boolean bl5 = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n, bl5);
        n = 2;
        boolean bl6 = false;
        this.E8 = pw_18.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n, bl6))).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


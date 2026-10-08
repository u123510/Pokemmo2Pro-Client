/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

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
 * 宝可梦对战技能招式动画 - 暗黑洞 (DarkVoid)
 * 技能编号: 464
 * 原始类: f.v5
 */
public class DarkVoidAnimation
extends MU {
    public DarkVoidAnimation(PF pF) {
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
        n = 1536;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().y80(this.E2(18, true)).xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.QO(39)).y80(ao_1.pc(lpt4__42)), this.Ue0(4, 0, 0.0f, 0.8125f, 0.05f)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.Ue0(3, 0, 0.8125f, 0.0f, 0.05f)).xi0(this.mf0(4, 0, -1, 3.84f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1535;
        int n4 = 2;
        n3 = 16;
        f = 833.3333f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n4, n3, f, f2, pF));
        n = 1630;
        int n5 = 1;
        n3 = 16;
        f = 1666.6666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n5, n3, f, f2, pF)).y80(this.Qh0(640));
        n = 640;
        int n6 = 1;
        n3 = 11;
        int n7 = 8;
        f2 = 0.07501221f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n6, n3, n7, f2));
        n = 640;
        int n8 = 2;
        n3 = 11;
        n7 = 8;
        f2 = 0.049987793f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n8, n3, n7, f2));
        n = 640;
        int n9 = 0;
        n3 = 11;
        n7 = 8;
        f2 = 0.049987793f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n9, n3, n7, f2));
        n = 640;
        int n10 = 4;
        n3 = 11;
        n7 = 8;
        f2 = 0.049987793f;
        pw_1 pw_18 = pk_1.el(A2.Kj0(pw_17, this.fE0(-1, n, n10, n3, n7, f2), 0.2f), this.EN(16, 2, 1, 0.0f, 0.032f, 0.0f, -0.30004883f)).xi0(this.EN(16, 2, 1, 0.0f, 0.16f, 0.0f, -1.0f));
        n = 640;
        int n11 = 3;
        n3 = 11;
        n7 = 8;
        f2 = 0.25f;
        pw_1 pw_19 = HB.p30(A2.Kj0(HB.p30(pw_18, this.fE0(-1, n, n11, n3, n7, f2)), this.EN(16, 2, 1, 0.0f, 0.96f, 0.0f, -12.0f), 0.02f).xi0(this.df0(16, 3)).mz0().mz0().mz0().Xf0(), this.Ue0(4, 0, 0.0f, 0.9375f, 0.05f));
        n = 0;
        boolean bl4 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl4);
        n = 1;
        boolean bl5 = true;
        this.E8 = pw_19.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n, bl5))).mz0().Xf0().xi0(this.Ue0(4, 0, 0.9375f, 0.0f, 0.05f)).xi0(this.df0(16, 4)).y80(this.E2(18, false)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


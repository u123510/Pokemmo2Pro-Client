/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.Zw0;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Zi
 */
/**
 * 宝可梦对战技能招式动画 - 波导弹 (AuraSphere)
 * 技能编号: 396
 * 原始类: f.zi_0
 */
public class AuraSphereAnimation
extends MU {
    public AuraSphereAnimation(PF pF) {
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
        int n2 = 3;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().y80(this.QO(7)).y80(ao_1.pc(lpt4__42)), this.Ue0(4, 0, 0.0f, 0.9375f, 0.075f)).xi0(this.mf0(4, -22, 0, 2.4f)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.Ue0(4, 0, 0.9375f, 0.0f, 0.075f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        int n4 = 3;
        n3 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n4, n3, f, f2, pF)).xi0(this.Sv0(3, 0, 0.0f, 1280.0f)).xi0(this.Sv0(3, 1, 960.0f, 320.0f)).xi0(this.Wt(0, 0.4f));
        n = 1785;
        int n5 = 1;
        n3 = 14;
        f = 1333.3334f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n5, n3, f, f2, pF));
        n = 1686;
        int n6 = 2;
        n3 = 16;
        f = 1666.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n6, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 1280.0f, 480.0f)).y80(this.Qh0(571));
        n = 571;
        int n7 = 0;
        n3 = 9;
        int n8 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n7, n3, n8, f2));
        n = 571;
        int n9 = 4;
        n3 = 9;
        n8 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = A2.Kj0(pw_16, this.fE0(-1, n, n9, n3, n8, f2), 1.2f);
        n = 571;
        int n10 = 3;
        n3 = 9;
        n8 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pk_1.el(N4.zr(pw_17, this.fE0(-1, n, n10, n3, n8, f2), 1.4f).xi0(this.dA0(571, 1, 9, 11, 0.5f, 0.0f)).xi0(this.dA0(571, 2, 9, 11, 0.5f, 0.0f)).xi0(this.nM(16, 1)).xi0(this.tP(0.25f)).mz0().mz0().TD0().p1(1.64f).Xf0().xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, -0.30004883f, 0.30004883f)).xi0(this.EN(16, 2, 4, 0.016f, 0.032f, 0.30004883f, 0.0f)), this.Ue0(4, 0, 0.0f, 0.9375f, 0.075f));
        n = 1;
        boolean bl4 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl4);
        n = 0;
        boolean bl5 = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n, bl5);
        n = 2;
        boolean bl6 = false;
        this.E8 = Zw0.H(pw_18.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).mz0().Xf0().y80(ao_1.pc(new lpt4__4(this, n, bl6))).xi0(this.nM(16, 0)), this.Ue0(4, 0, 0.9375f, 0.0f, 0.075f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


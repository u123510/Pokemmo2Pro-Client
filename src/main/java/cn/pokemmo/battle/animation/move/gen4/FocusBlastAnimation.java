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
import f.pw_1;

/*
 * Renamed from f.Co
 */
/**
 * 宝可梦对战技能招式动画 - 真气弹 (FocusBlast)
 * 技能编号: 411
 * 原始类: f.co_0
 */
public class FocusBlastAnimation
extends MU {
    public FocusBlastAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1707;
        int bl = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)), this.Ue0(2, 0, 0.0f, 0.8125f, 0.075f)).xi0(this.i6((byte)2, (short)n, bl, n2, f, f2, pF));
        n = 1376;
        int n3 = 1;
        n2 = 14;
        f = 1833.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n3, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1760.0f)).xi0(this.Sv0(1, 1, 1280.0f, 480.0f));
        n = 1966;
        int n4 = 1;
        n2 = 14;
        f = 1850.0f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n4, n2, f, f2, pF));
        n = 1707;
        int n5 = 2;
        n2 = 14;
        f = 1850.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n5, n2, f, f2, pF));
        n = 1376;
        int n6 = 2;
        n2 = 16;
        f = 2833.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n6, n2, f, f2, pF)).xi0(this.Sv0(2, 1, 2560.0f, 160.0f)).y80(this.Qh0(586));
        n = 586;
        int n7 = 0;
        n2 = 9;
        int n8 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n7, n2, n8, f2));
        n = 586;
        int n9 = 1;
        n2 = 9;
        n8 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = HB.p30(pw_17, this.fE0(-1, n, n9, n2, n8, f2)).y80(this.QO(6));
        n = 1;
        boolean bl2 = false;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl2);
        n = 0;
        boolean bl3 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl3);
        n = 2;
        boolean bl4 = true;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl4);
        n = 586;
        int n10 = 3;
        n2 = 11;
        n8 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = A2.Kj0(pw_18.y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.mf0(4, -20, 0, 1.12f)), this.dA0(586, 2, 9, 11, 0.5f, 720.0f), 0.6f).xi0(this.Wt(1, 0.4f)).mz0().mz0().mz0().Xf0().xi0(this.mf0(4, -20, 0, 1.6f)).xi0(this.fE0(-1, n, n10, n2, n8, f2)).xi0(this.nM(16, 1));
        n = 1785;
        int n11 = 1;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n11, n2, f3, f2, pF));
        n = 1686;
        int n12 = 2;
        n2 = 16;
        f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_111 = HB.p30(pw_110.xi0(this.i6((byte)2, (short)n, n12, n2, f3, f2, pF)), this.EN(16, 2, 8, 0.0f, 0.032f, 0.60009766f, 0.0f)).xi0(this.nM(16, 0));
        n = 1;
        boolean bl5 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl5);
        n = 0;
        boolean bl6 = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n, bl6);
        n = 2;
        boolean bl7 = false;
        this.E8 = pw_111.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n, bl7))).xi0(this.Ue0(2, 0, 0.8125f, 0.0f, 0.075f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


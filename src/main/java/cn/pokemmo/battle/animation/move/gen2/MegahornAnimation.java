/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.yy
 */
/**
 * 宝可梦对战技能招式动画 - 超级角击 (Megahorn)
 * 技能编号: 224
 * 原始类: f.yy_1
 */
public class MegahornAnimation
extends MU {
    public MegahornAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1450;
        int bl = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).xi0(this.EN(14, 2, 6, 0.032f, 0.016f, 0.30004883f, 0.0f)).xi0(this.i6((byte)2, (short)n, bl, n2, f, f2, pF));
        n = 1376;
        int n3 = 1;
        n2 = 14;
        f = 833.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n3, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 800.0f));
        n = 1407;
        int n4 = 2;
        n2 = 14;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n4, n2, f, f2, pF));
        n = 1376;
        int n5 = 2;
        n2 = 14;
        f = 1166.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = A2.Kj0(HB.p30(pw_14.xi0(this.i6((byte)2, (short)n, n5, n2, f, f2, pF)), this.Sv0(2, 0, 640.0f, 480.0f)).xi0(this.EN(14, 2, 1, 0.016f, 0.064f, 2.0f, 0.0f)).xi0(this.Wt(1, 0.55f)).xi0(this.Ue0(2, 0, 0.0f, 0.8125f, 0.05f)).y80(this.Qh0(390)).xi0(this.dA0(390, 3, 9, 11, 0.5f, 192.0f)), this.dA0(390, 4, 9, 11, 0.5f, 192.0f), 0.32f).y80(this.QO(1)).xi0(this.mf0(2, 0, 4, 0.016f));
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
        int n6 = 1;
        n2 = 16;
        f = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.i6((byte)2, (short)n, n6, n2, f, f2, pF));
        n = 390;
        int n7 = 0;
        n2 = 11;
        int n8 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n7, n2, n8, f2));
        n = 390;
        int n9 = 1;
        n2 = 11;
        n8 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n9, n2, n8, f2));
        n = 390;
        int n10 = 2;
        n2 = 11;
        n8 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pk_1.el(pw_18.xi0(this.fE0(-1, n, n10, n2, n8, f2)).xi0(this.nM(16, 1)), this.EN(16, 2, 6, 0.032f, 0.016f, 0.30004883f, 0.0f));
        n = 1;
        boolean bl5 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl5);
        n = 0;
        boolean bl6 = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n, bl6);
        n = 2;
        boolean bl7 = false;
        this.E8 = pw_19.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n, bl7))).mz0().Xf0().xi0(this.Ue0(2, 0, 0.8125f, 0.0f, 0.05f)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


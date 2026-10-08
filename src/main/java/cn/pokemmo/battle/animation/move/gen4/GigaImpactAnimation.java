/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.pJ
 */
/**
 * 宝可梦对战技能招式动画 - 终极冲击 (GigaImpact)
 * 技能编号: 416
 * 原始类: f.pj_1
 */
public class GigaImpactAnimation
extends MU {
    public GigaImpactAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1688;
        int bl = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(1, 0.3f)), this.i6((byte)2, (short)n, bl, n2, f, f2, pF));
        n = 1418;
        int n3 = 3;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n3, n2, f, f2, pF));
        n = 1376;
        int n4 = 3;
        n2 = 16;
        f = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n4, n2, f, f2, pF)).xi0(this.Sv0(3, 0, 0.0f, 640.0f)).xi0(this.Sv0(3, 1, 640.0f, 320.0f));
        n = 1475;
        int n5 = 1;
        n2 = 16;
        f = 1000.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n5, n2, f, f2, pF));
        n = 1475;
        int n6 = 1;
        n2 = 16;
        f = 1166.6666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n6, n2, f, f2, pF));
        n = 1475;
        int n7 = 1;
        n2 = 16;
        f = 1500.0f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n7, n2, f, f2, pF));
        n = 1475;
        int n8 = 1;
        n2 = 16;
        f = 1833.3334f;
        f2 = 0.078125f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n8, n2, f, f2, pF));
        n = 1505;
        int n9 = 2;
        n2 = 16;
        f = 1000.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n9, n2, f, f2, pF)).y80(this.Qh0(591));
        n = 591;
        int n10 = 0;
        n2 = 11;
        int n11 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n10, n2, n11, f2));
        n = 591;
        int n12 = 1;
        n2 = 11;
        n11 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n12, n2, n11, f2));
        n = 591;
        int n13 = 2;
        n2 = 11;
        n11 = 8;
        f2 = 0.5f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, n, n13, n2, n11, f2));
        n = 591;
        int n14 = 3;
        n2 = 11;
        n11 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = pw_112.xi0(this.fE0(-1, n, n14, n2, n11, f2));
        n = 591;
        int n15 = 4;
        n2 = 11;
        n11 = 8;
        f2 = 0.5f;
        pw_1 pw_114 = pw_113.xi0(this.fE0(-1, n, n15, n2, n11, f2)).xi0(this.nM(16, 1)).TD0().p1(0.8f).Xf0().y80(this.QO(2)).xi0(this.Ue0(2, 0, 0.0f, 0.8125f, 0.025f)).xi0(this.mf0(2, 0, 4, 0.016f));
        n = 1;
        boolean bl2 = false;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl2);
        n = 0;
        boolean bl3 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl3);
        n = 2;
        boolean bl4 = true;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl4);
        n = 1;
        boolean bl5 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl5);
        n = 0;
        boolean bl6 = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n, bl6);
        n = 2;
        boolean bl7 = false;
        this.E8 = pk_1.el(pw_114.y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).mz0().mz0().TD0().p1(1.0f).Xf0(), this.Xq0(16, 2, 4, 0.016f, 0.032f, -0.19995117f, 0.19995117f)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n, bl7))).xi0(this.Ue0(2, 0, 0.8125f, 0.0f, 0.05f)).xi0(this.tP(0.3f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.cP
 */
/**
 * 宝可梦对战技能招式动画 - 破坏光线 (HyperBeam)
 * 技能编号: 63
 * 原始类: f.cp_1
 */
public class HyperBeamAnimation
extends MU {
    public HyperBeamAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1976;
        int bl = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().y80(this.QO(9)).xi0(this.i6((byte)2, (short)n, bl, n2, f, f2, pF)), this.Ue0(2, 0, 0.0f, 1.0f, 0.025f)).xi0(this.Ue0(3, 0, 1.0f, 0.0f, 0.025f)).xi0(this.Wt(0, 0.4f));
        n = 0;
        boolean bl2 = false;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl2);
        n = 1;
        boolean bl3 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl3);
        n = 2;
        boolean bl4 = true;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl4);
        n = 1424;
        int n3 = 1;
        n2 = 14;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = A2.Kj0(pw_12.y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)), this.mf0(4, -30, 0, 2.24f), 0.12f).xi0(this.nM(14, 1)).mz0().mz0().TD0().p1(0.52f).Xf0().xi0(this.Wt(1, 1.45f)).xi0(this.i6((byte)2, (short)n, n3, n2, f, f2, pF));
        n = 1376;
        int n4 = 1;
        n2 = 14;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n4, n2, f, f2, pF));
        n = 1963;
        int n5 = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n5, n2, f, f2, pF));
        n = 1420;
        int n6 = 2;
        n2 = 16;
        f = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n6, n2, f, f2, pF));
        n = 1420;
        int n7 = 1;
        n2 = 16;
        f = 916.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n7, n2, f, f2, pF));
        n = 1420;
        int n8 = 2;
        n2 = 16;
        f = 1000.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n8, n2, f, f2, pF));
        n = 1420;
        int n9 = 1;
        n2 = 16;
        f = 1083.3334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n9, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 800.0f)).xi0(this.Sv0(1, 1, 1280.0f, 320.0f)).xi0(this.Sv0(2, 1, 960.0f, 640.0f)).y80(this.Qh0(224));
        n = 224;
        int n10 = 0;
        n2 = 9;
        int n11 = 11;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n10, n2, n11, f2));
        n = 224;
        int n12 = 1;
        n2 = 11;
        n11 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n12, n2, n11, f2));
        n = 224;
        int n13 = 2;
        n2 = 9;
        n11 = 8;
        f2 = 0.5f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, n, n13, n2, n11, f2));
        n = 224;
        int n14 = 3;
        n2 = 9;
        n11 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = pk_1.el(N4.zr(N4.zr(pw_112, this.fE0(-1, n, n14, n2, n11, f2), 0.8f), this.EN(16, 2, 8, 0.032f, 0.016f, 0.30004883f, 0.0f), 1.96f), this.Ue0(3, 0, 0.0f, 1.0f, 0.05f)).xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.025f));
        n = 0;
        boolean bl5 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl5);
        n = 1;
        boolean bl6 = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n, bl6);
        n = 2;
        boolean bl7 = false;
        this.E8 = pw_113.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n, bl7))).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


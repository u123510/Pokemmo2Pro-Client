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
 * Renamed from f.Lpt2
 */
/**
 * 宝可梦对战技能招式动画 - 岩石炮 (RockWrecker)
 * 技能编号: 439
 * 原始类: f.lpt2__1
 */
public class RockWreckerAnimation
extends MU {
    public RockWreckerAnimation(PF pF) {
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
        n = 1416;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.QO(34)).y80(ao_1.pc(lpt4__42)).xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.075f)).y80(ao_1.pc(lpt4__43)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.mf0(4, -36, 0, 2.56f)).y80(ao_1.pc(lpt4__44)).y80(this.E2(14, true)).y80(this.E2(16, true)).xi0(this.Ue0(3, 0, 0.8125f, 0.0f, 0.075f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        int n4 = 1;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n4, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1120.0f)).xi0(this.Sv0(1, 1, 960.0f, 160.0f)).y80(this.Qh0(614));
        n = 614;
        int n5 = 3;
        n3 = 9;
        int n6 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n5, n3, n6, f2));
        n = 614;
        int n7 = 4;
        n3 = 9;
        n6 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = HB.p30(pw_14, this.fE0(-1, n, n7, n3, n6, f2));
        n = 1510;
        int n8 = 2;
        n3 = 16;
        float f3 = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n8, n3, f3, f2, pF)).xi0(this.dA0(614, 0, 9, 11, 0.5f, 360.0f)).xi0(this.Wt(1, 0.4f)).TD0().p1(0.4f).Xf0();
        n = 1475;
        int n9 = 1;
        n3 = 16;
        f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n9, n3, f3, f2, pF));
        n = 1424;
        int n10 = 2;
        n3 = 16;
        f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n10, n3, f3, f2, pF));
        n = 1475;
        int n11 = 1;
        n3 = 16;
        f3 = 250.0f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n11, n3, f3, f2, pF));
        n = 1475;
        int n12 = 2;
        n3 = 16;
        f3 = 500.0f;
        f2 = 0.15625f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n12, n3, f3, f2, pF));
        n = 614;
        int n13 = 1;
        n3 = 11;
        int n14 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n13, n3, n14, f2));
        n = 614;
        int n15 = 2;
        n3 = 11;
        n14 = 8;
        f2 = 0.5f;
        pw_1 pw_112 = HB.p30(pk_1.el(pw_111.xi0(this.fE0(-1, n, n15, n3, n14, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 4, 0.016f, 0.032f, 0.19995117f, -0.19995117f)), this.Ue0(3, 0, 0.0f, 0.8125f, 0.075f));
        n = 1;
        boolean bl4 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl4);
        n = 0;
        boolean bl5 = true;
        this.E8 = pw_112.y80(ao_1.pc(lpt4__45)).y80(this.E2(14, false)).y80(this.E2(16, false)).xi0(this.tP(0.4f)).xi0(this.Ue0(4, 0, 0.8125f, 0.125f, 0.075f)).xi0(this.nM(16, 0)).y80(ao_1.pc(new lpt4__4(this, n, bl5))).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


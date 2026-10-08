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
import f.Zw0;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;

/*
 * Renamed from f.x10
 */
/**
 * 宝可梦对战技能招式动画 - 水炮 (HydroPump)
 * 技能编号: 56
 * 原始类: f.x10_0
 */
public class HydroPumpAnimation
extends MU {
    public HydroPumpAnimation(PF pF) {
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
        n = 1706;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().p1(0.6f).y80(this.E2(18, true)).mz0().Xf0().y80(this.QO(4)).y80(ao_1.pc(lpt4__42)), this.Ue0(4, 0, 0.0f, 0.875f, 0.025f)).xi0(this.mf0(4, -20, 0, 2.08f)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.Ue0(3, 0, 0.875f, 0.375f, 0.025f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1417;
        int n4 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9765625f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n4, n3, f, f2, pF));
        n = 1376;
        int n5 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n5, n3, f, f2, pF));
        n = 1897;
        int n6 = 1;
        n3 = 16;
        f = 1500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n6, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 1920.0f, 480.0f));
        n = 1376;
        int n7 = 1;
        n3 = 16;
        f = 2500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n7, n3, f, f2, pF));
        n = 1475;
        int n8 = 2;
        n3 = 16;
        f = 1500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n8, n3, f, f2, pF)).y80(this.Qh0(217));
        n = 217;
        int n9 = 4;
        n3 = 9;
        int n10 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = N4.zr(N4.zr(A2.Kj0(pw_17.xi0(this.fE0(-1, n, n9, n3, n10, f2)), this.dA0(217, 3, 9, 11, 0.5f, 360.0f), 0.12f), this.dA0(217, 3, 9, 11, 0.5f, 240.0f), 0.24f).xi0(this.dA0(217, 2, 9, 11, 0.5f, 1440.0f)), this.dA0(217, 3, 9, 11, 0.5f, 240.0f), 0.36f);
        n = 217;
        int n11 = 0;
        n3 = 11;
        n10 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n11, n3, n10, f2)).xi0(this.Wt(1, 0.4f)).xi0(this.dA0(217, 3, 9, 11, 0.5f, 240.0f));
        n = 217;
        int n12 = 0;
        n3 = 11;
        n10 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = N4.zr(N4.zr(pw_19, this.fE0(-1, n, n12, n3, n10, f2), 0.48f), this.dA0(217, 3, 9, 11, 0.5f, 240.0f), 0.6f).xi0(this.dA0(217, 2, 9, 11, 0.5f, 1440.0f)).xi0(this.dA0(217, 3, 9, 11, 0.5f, 240.0f));
        n = 217;
        int n13 = 0;
        n3 = 11;
        n10 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = N4.zr(pw_110, this.fE0(-1, n, n13, n3, n10, f2), 0.72f);
        n = 217;
        int n14 = 0;
        n3 = 11;
        n10 = 8;
        f2 = 0.5f;
        pw_1 pw_112 = N4.zr(N4.zr(pw_111.xi0(this.fE0(-1, n, n14, n3, n10, f2)), this.dA0(217, 3, 9, 11, 0.5f, 240.0f), 0.92f), this.dA0(217, 3, 9, 11, 0.5f, 240.0f), 1.12f);
        n = 217;
        int n15 = 0;
        n3 = 11;
        n10 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = pw_112.xi0(this.fE0(-1, n, n15, n3, n10, f2));
        n = 217;
        int n16 = 1;
        n3 = 11;
        n10 = 8;
        f2 = 0.5f;
        pw_1 pw_114 = pw_113.xi0(this.fE0(-1, n, n16, n3, n10, f2)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f)).xi0(this.nM(16, 1)).mz0().mz0().TD0().p1(1.72f).Xf0().xi0(this.Ue0(3, 0, 0.375f, 0.875f, 0.05f)).xi0(this.tP(0.4f)).mz0().mz0().mz0().Xf0().xi0(this.nM(16, 0));
        n = 1;
        boolean bl4 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl4);
        n = 0;
        boolean bl5 = true;
        this.E8 = Zw0.H(pw_114.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n, bl5))).mz0().Xf0().y80(this.E2(18, false)), this.Ue0(2, 0, 0.875f, 0.0f, 0.025f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


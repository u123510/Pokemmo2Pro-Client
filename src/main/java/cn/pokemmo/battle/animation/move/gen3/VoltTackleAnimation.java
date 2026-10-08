/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 伏特攻击 (VoltTackle)
 * 技能编号: 344
 * 原始类: f.Yq0
 */
public class VoltTackleAnimation
extends MU {
    public VoltTackleAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 517;
        int bl = 0;
        int n2 = 9;
        int n3 = 8;
        float f = 0.5f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).xi0(this.Ue0(2, 0, 0.0f, 0.8125f, 0.05f)).y80(this.Qh0(517)).xi0(this.fE0(-1, n, bl, n2, n3, f));
        n = 517;
        int n4 = 1;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, n, n4, n2, n3, f));
        n = 1522;
        int n5 = 1;
        n2 = 14;
        float f2 = 166.66667f;
        f = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_14 = A2.Kj0(pw_13, this.i6((byte)2, (short)n, n5, n2, f2, f, pF), 1.4f);
        n = 517;
        int n6 = 3;
        n2 = 9;
        int n7 = 8;
        f = 0.25f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n6, n2, n7, f));
        n = 1427;
        int n8 = 1;
        n2 = 14;
        float f3 = 0.0f;
        f = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n8, n2, f3, f, pF));
        n = 1458;
        int n9 = 2;
        n2 = 14;
        f3 = 0.0f;
        f = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_17 = N4.zr(pw_16, this.i6((byte)2, (short)n, n9, n2, f3, f, pF), 1.8f).xi0(this.Wt(1, 0.8f));
        n = 517;
        int n10 = 4;
        n2 = 0;
        int n11 = 0;
        f = 0.0f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n10, n2, n11, f));
        n = 1427;
        int n12 = 1;
        n2 = 16;
        float f4 = 0.0f;
        f = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n12, n2, f4, f, pF));
        n = 1458;
        int n13 = 2;
        n2 = 16;
        f4 = 0.0f;
        f = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_110 = N4.zr(pw_19, this.i6((byte)2, (short)n, n13, n2, f4, f, pF), 2.2f);
        n = 517;
        int n14 = 3;
        n2 = 11;
        int n15 = 8;
        f = 0.25f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n14, n2, n15, f));
        n = 1427;
        int n16 = 1;
        n2 = 16;
        float f5 = 0.0f;
        f = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, (short)n, n16, n2, f5, f, pF));
        n = 1458;
        int n17 = 2;
        n2 = 14;
        f5 = 0.0f;
        f = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_113 = N4.zr(pw_112, this.i6((byte)2, (short)n, n17, n2, f5, f, pF), 2.6f).y80(this.QO(20)).xi0(this.mf0(2, 0, 8, 0.016f));
        n = 2;
        boolean bl2 = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl2);
        n = 1;
        boolean bl3 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl3);
        n = 0;
        boolean bl4 = false;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl4);
        n = 1849;
        int n18 = 1;
        n2 = 16;
        f5 = 0.0f;
        f = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_114 = pw_113.y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.i6((byte)2, (short)n, n18, n2, f5, f, pF));
        n = 1885;
        int n19 = 2;
        n2 = 16;
        f5 = 0.0f;
        f = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_115 = pw_114.xi0(this.i6((byte)2, (short)n, n19, n2, f5, f, pF));
        n = 1885;
        int n20 = 2;
        n2 = 16;
        f5 = 166.66667f;
        f = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_116 = pw_115.xi0(this.i6((byte)2, (short)n, n20, n2, f5, f, pF));
        n = 1885;
        int n21 = 2;
        n2 = 16;
        f5 = 333.33334f;
        f = 0.15625f;
        pF = this.Vz0;
        pw_1 pw_117 = pw_116.xi0(this.i6((byte)2, (short)n, n21, n2, f5, f, pF));
        n = 517;
        int n22 = 2;
        n2 = 11;
        int n23 = 8;
        f = 0.5f;
        pw_1 pw_118 = pk_1.el(pw_117.xi0(this.fE0(-1, n, n22, n2, n23, f)).xi0(this.nM(16, 1)), this.EN(16, 2, 6, 0.032f, 0.016f, 0.39990234f, 0.0f)).xi0(this.Ue0(2, 0, 0.8125f, 0.0f, 0.05f));
        n = 1;
        boolean bl5 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl5);
        n = 0;
        boolean bl6 = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n, bl6);
        n = 2;
        boolean bl7 = false;
        this.E8 = pw_118.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n, bl7))).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


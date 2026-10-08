/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.FB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 爆炸头突击 (HeadCharge)
 * 技能编号: 543
 * 原始类: f.A4
 */
public class HeadChargeAnimation
extends MU {
    public HeadChargeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12 = FB.zd0(0.6f);
        int n = 1416;
        int n2 = 1;
        int n3 = 14;
        float f = 166.66667f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 683.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.QO(3));
        n = 2;
        n2 = 1;
        pw_1 pw_15 = pw_14.y80(ao_1.pc(new lpt4__4(this, n, (n2 != 0)))).mz0().Xf0().xi0(this.Wt(1, 0.4f));
        n = 1753;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1842;
        n2 = 0;
        n3 = 16;
        f = 83.333336f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.mf0(2, 0, 8, 0.048f)).y80(this.Qh0(706));
        n = 706;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 706;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 706;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.0f, 0.096f, 0.39990234f, -0.39990234f)).xi0(this.EN(16, 2, 10, 0.0f, 0.048f, 1.0f, 0.0f));
        n = 0;
        n2 = 0;
        pw_1 pw_111 = pw_110.y80(ao_1.pc(new lpt4__4(this, n, (n2 != 0))));
        n = 1;
        n2 = 0;
        pw_1 pw_112 = pw_111.y80(ao_1.pc(new lpt4__4(this, n, (n2 != 0)))).mz0().Xf0();
        n = 0;
        n2 = 1;
        pw_1 pw_113 = pw_112.y80(ao_1.pc(new lpt4__4(this, n, (n2 != 0))));
        n = 1;
        n2 = 1;
        (this.E8 = pw_113.y80(ao_1.pc(new lpt4__4(this, n, (n2 != 0)))).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0()).Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.xq0
 */
/**
 * 宝可梦对战技能招式动画 - 时光咆哮 (RoarOfTime)
 * 技能编号: 459
 * 原始类: f.xq0_0
 */
public class RoarOfTimeAnimation
extends MU {
    public RoarOfTimeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 0;
        int n = 0;
        lpt4__4 lpt4__42 = new lpt4__4(this, s, n != 0);
        s = 1487;
        n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.075f)).y80(ao_1.pc(lpt4__42)).mz0().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 480.0f)).y80(this.Qh0(634));
        s = 634;
        n = 3;
        n2 = 9;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 634;
        n = 4;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = HB.p30(pw_13, this.fE0(-1, s, n, n2, n3, f2));
        s = 1473;
        n = 2;
        n2 = 14;
        float f3 = 333.33334f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1941;
        n = 1;
        n2 = 14;
        f3 = 1000.0f;
        f2 = 0.9765625f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1907;
        n = 2;
        n2 = 16;
        f3 = 2000.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 634;
        n = 0;
        n2 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, s, n, n2, n4, f2));
        s = 634;
        n = 5;
        n2 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, s, n, n2, n4, f2));
        s = 634;
        n = 6;
        n2 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = HB.p30(pw_19, this.fE0(-1, s, n, n2, n4, f2)).xi0(this.Wt(1, 0.4f)).TD0().p1(1.2f).Xf0();
        s = 1475;
        n = 1;
        n2 = 16;
        float f4 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, s, n, n2, f4, f2, pF));
        s = 1475;
        n = 1;
        n2 = 16;
        f4 = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, s, n, n2, f4, f2, pF));
        s = 1475;
        n = 1;
        n2 = 16;
        f4 = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_113 = pw_112.xi0(this.i6((byte)2, s, n, n2, f4, f2, pF));
        s = 1475;
        n = 1;
        n2 = 16;
        f4 = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_114 = pw_113.xi0(this.i6((byte)2, s, n, n2, f4, f2, pF));
        s = 1475;
        n = 1;
        n2 = 16;
        f4 = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_115 = pw_114.xi0(this.i6((byte)2, s, n, n2, f4, f2, pF)).xi0(this.nM(16, 1));
        s = 634;
        n = 1;
        n2 = 11;
        int n5 = 8;
        f2 = 0.5f;
        pw_1 pw_116 = pw_115.xi0(this.fE0(-1, s, n, n2, n5, f2));
        s = 634;
        n = 2;
        n2 = 11;
        n5 = 8;
        f2 = 0.5f;
        pw_1 pw_117 = pk_1.el(pw_116.xi0(this.fE0(-1, s, n, n2, n5, f2)), this.EN(16, 2, 6, 0.0f, 0.032f, 0.30004883f, 0.0f)).xi0(this.tP(0.4f)).xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.075f)).xi0(this.nM(16, 0));
        s = 0;
        n = 1;
        lpt4__4 lpt4__43 = new lpt4__4(this, s, n != 0);
        s = 1376;
        n = 2;
        n2 = 16;
        float f5 = 0.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        this.E8 = Zw0.H(pw_117.y80(ao_1.pc(lpt4__43)), this.i6((byte)2, s, n, n2, f5, f2, pF));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


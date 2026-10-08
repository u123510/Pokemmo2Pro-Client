/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.yH0
 */
/**
 * 宝可梦对战技能招式动画 - 清醒猛击 (WakeUpSlap)
 * 技能编号: 358
 * 原始类: f.yh0_1
 */
public class WakeUpSlapAnimation
extends MU {
    public WakeUpSlapAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1422;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.nM(16, 1)).xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1471;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1422;
        n2 = 1;
        n3 = 16;
        f = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1471;
        n2 = 2;
        n3 = 16;
        f = 500.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1422;
        n2 = 1;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1471;
        n2 = 2;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1422;
        n2 = 1;
        n3 = 16;
        f = 1416.6666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1471;
        n2 = 2;
        n3 = 16;
        f = 1416.6666f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(532));
        n = 532;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.7999878f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 532;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.7999878f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 532;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.7999878f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 532;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.7999878f;
        this.E8 = HB.p30(pw_112.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.Xq0(16, 2, 4, 0.032f, 0.064f, -0.30004883f, 0.30004883f)), this.EN(16, 2, 4, 0.032f, 0.064f, 0.30004883f, 0.0f)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


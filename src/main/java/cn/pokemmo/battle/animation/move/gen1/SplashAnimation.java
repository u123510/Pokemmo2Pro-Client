/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.zx0
 */
/**
 * 宝可梦对战技能招式动画 - 跃起 (Splash)
 * 技能编号: 150
 * 原始类: f.zx0_0
 */
public class SplashAnimation
extends MU {
    public SplashAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1502;
        int n2 = 1;
        int n3 = 14;
        float f = 300.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1452;
        n2 = 2;
        n3 = 14;
        f = 300.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(314)).xi0(this.nM(14, 1));
        n = 314;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.0f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 314;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.0f;
        pw_1 pw_15 = HB.p30(pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.Xq0(14, 2, 1, 0.016f, 0.096f, 0.30004883f, -0.30004883f));
        n = 1502;
        n2 = 1;
        n3 = 14;
        float f3 = 300.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1452;
        n2 = 2;
        n3 = 14;
        f3 = 300.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 314;
        n2 = 0;
        n3 = 9;
        int n5 = 8;
        f2 = 0.0f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 314;
        n2 = 1;
        n3 = 9;
        n5 = 8;
        f2 = 0.0f;
        pw_1 pw_19 = HB.p30(pw_18.xi0(this.fE0(-1, n, n2, n3, n5, f2)), this.Xq0(14, 2, 1, 0.016f, 0.096f, 0.30004883f, -0.30004883f));
        n = 1502;
        n2 = 1;
        n3 = 14;
        float f4 = 300.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f2, pF));
        n = 1452;
        n2 = 2;
        n3 = 14;
        f4 = 300.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f2, pF));
        n = 314;
        n2 = 0;
        n3 = 9;
        int n6 = 8;
        f2 = 0.0f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, n, n2, n3, n6, f2));
        n = 314;
        n2 = 1;
        n3 = 9;
        n6 = 8;
        f2 = 0.0f;
        this.E8 = HB.p30(pw_112.xi0(this.fE0(-1, n, n2, n3, n6, f2)), this.Xq0(14, 2, 1, 0.016f, 0.096f, 0.30004883f, -0.30004883f)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


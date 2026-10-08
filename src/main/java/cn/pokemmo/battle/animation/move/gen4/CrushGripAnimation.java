/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 捏碎 (CrushGrip)
 * 技能编号: 462
 * 原始类: f.Tn0
 */
public class CrushGripAnimation
extends MU {
    public CrushGripAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1407;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).y80(this.Qh0(637)).y80(this.Qh0(638)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 16;
        f = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 480.0f)).xi0(this.Sv0(1, 1, 640.0f, 320.0f)).xi0(this.dA0(637, 0, 9, 11, 0.5f, 360.0f));
        s = 637;
        n = 2;
        n2 = 11;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 638;
        n = 0;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 638;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 638;
        n = 2;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = A2.Kj0(pw_16, this.fE0(-1, s, n, n2, n3, f2), 0.3f).xi0(this.Wt(1, 0.5f)).mz0().mz0().TD0().p1(1.0f).Xf0();
        s = 1424;
        n = 2;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1475;
        n = 1;
        n2 = 16;
        f3 = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 4, 0.0f, 0.048f, 0.30004883f, -0.30004883f)).xi0(this.dA0(637, 1, 9, 11, 0.5f, 360.0f));
        s = 637;
        n = 3;
        n2 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, s, n, n2, n4, f2));
        s = 638;
        n = 0;
        n2 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, s, n, n2, n4, f2));
        s = 638;
        n = 1;
        n2 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, s, n, n2, n4, f2));
        s = 638;
        n = 2;
        n2 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = N4.zr(pw_112, this.fE0(-1, s, n, n2, n4, f2), 1.3f).xi0(this.Wt(1, 0.5f)).mz0().mz0().TD0().p1(2.0f).Xf0();
        s = 1424;
        n = 2;
        n2 = 16;
        float f4 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_114 = pw_113.xi0(this.i6((byte)2, s, n, n2, f4, f2, pF));
        s = 1475;
        n = 1;
        n2 = 16;
        f4 = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        this.E8 = pk_1.el(pw_114.xi0(this.i6((byte)2, s, n, n2, f4, f2, pF)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 4, 0.0f, 0.048f, 0.30004883f, -0.30004883f)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


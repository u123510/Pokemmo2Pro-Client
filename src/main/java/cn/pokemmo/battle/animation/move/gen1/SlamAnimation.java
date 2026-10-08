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
 * Renamed from f.l30
 */
/**
 * 宝可梦对战技能招式动画 - 摔打 (Slam)
 * 技能编号: 21
 * 原始类: f.l30_0
 */
public class SlamAnimation
extends MU {
    public SlamAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 183;
        int n = 0;
        int n2 = 11;
        int n3 = 8;
        float f = 0.5f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.EN(14, 2, 1, 0.016f, 0.064f, 1.0f, 0.0f)).y80(this.Qh0(183)).xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 183;
        n = 1;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.032f, 0.064f, 0.30004883f, -0.19995117f));
        s = 1421;
        n = 1;
        n2 = 16;
        float f2 = 0.0f;
        f = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1475;
        n = 2;
        n2 = 16;
        f2 = 83.333336f;
        f = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1424;
        n = 1;
        n2 = 16;
        f2 = 83.333336f;
        f = 0.9375f;
        pF = this.Vz0;
        this.E8 = HB.p30(pw_15, this.i6((byte)2, s, n, n2, f2, f, pF)).xi0(this.tP(0.4f)).mz0().Xf0().xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


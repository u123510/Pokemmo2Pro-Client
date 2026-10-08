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
 * Renamed from f.Fp
 */
/**
 * 宝可梦对战技能招式动画 - 刺耳声 (Screech)
 * 技能编号: 103
 * 原始类: f.fp_0
 */
public class ScreechAnimation
extends MU {
    public ScreechAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 270;
        int n = 0;
        int n2 = 9;
        int n3 = 8;
        float f = 0.5f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().y80(this.Qh0(270)).xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 270;
        n = 1;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 1467;
        n = 1;
        n2 = 14;
        float f2 = 0.0f;
        f = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1467;
        n = 2;
        n2 = 16;
        f2 = 0.0f;
        f = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1467;
        n = 1;
        n2 = 16;
        f2 = 500.0f;
        f = 0.625f;
        pF = this.Vz0;
        this.E8 = HB.p30(HB.p30(pw_15, this.i6((byte)2, s, n, n2, f2, f, pF)).xi0(this.tP(0.4f)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 2, 0.032f, 0.064f, 0.100097656f, -0.100097656f)), this.EN(16, 2, 2, 0.016f, 0.096f, 1.0f, 0.0f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 连环巴掌 (DoubleSlap)
 * 技能编号: 3
 * 原始类: f.Ds0
 */
public class DoubleSlapAnimation
extends MU {
    public DoubleSlapAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 163;
        int n = 1;
        int n2 = 11;
        int n3 = 8;
        float f = 0.5f;
        pw_1 pw_12 = pw_1.xC().Xf0().mz0().Xf0().y80(this.Qh0(163)).xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 163;
        n = 3;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 163;
        n = 4;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 163;
        n = 2;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 2, 0.096f, 0.032f, 0.100097656f, -0.100097656f));
        s = 1422;
        n = 1;
        n2 = 16;
        float f2 = 0.0f;
        f = 0.9765625f;
        PF pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1420;
        n = 2;
        n2 = 16;
        f2 = 0.0f;
        f = 0.2734375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1422;
        n = 1;
        n2 = 16;
        f2 = 416.66666f;
        f = 0.9765625f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1420;
        n = 2;
        n2 = 16;
        f2 = 416.66666f;
        f = 0.2734375f;
        pF = this.Vz0;
        this.E8 = HB.p30(pw_18, this.i6((byte)2, s, n, n2, f2, f, pF)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


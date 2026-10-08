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
 * Renamed from f.ya0
 */
/**
 * 宝可梦对战技能招式动画 - 啄 (Peck)
 * 技能编号: 64
 * 原始类: f.ya0_2
 */
public class PeckAnimation
extends MU {
    public PeckAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        PeckAnimation ya0_22 = this;
        short s = 1;
        int n = 11;
        int n2 = 8;
        float f = 0.5f;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(225)).xi0(this.fE0(-1, 225, s, n, n2, f));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 225, s, n, n2, f));
        s = 2;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 225, s, n, n2, f)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f));
        PeckAnimation ya0_23 = this;
        s = 1438;
        n = 1;
        n2 = 16;
        f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = ya0_23.Vz0;
        pw_1 pw_16 = pw_15.xi0(ya0_23.i6((byte)2, s, n, n2, f, f2, pF));
        PeckAnimation ya0_24 = this;
        s = 1420;
        n = 2;
        n2 = 16;
        f = 166.66667f;
        f2 = 0.9921875f;
        pF = ya0_24.Vz0;
        this.E8 = pw_12 = HB.p30(pw_16, ya0_24.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        ya0_22.Vs.jH(this.E8);
        ya0_22.Vc();
        return ya0_22;
    }
}


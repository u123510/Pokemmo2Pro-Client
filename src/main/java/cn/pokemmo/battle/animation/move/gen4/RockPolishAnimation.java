/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 岩石打磨 (RockPolish)
 * 技能编号: 397
 * 原始类: f.Xf
 */
public class RockPolishAnimation
extends MU {
    public RockPolishAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        RockPolishAnimation xf = this;
        RockPolishAnimation xf2 = this;
        int n = 1411;
        int n2 = 2;
        int n3 = 14;
        float f = 250.0f;
        float f2 = 0.9375f;
        PF pF = xf2.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.025f)).xi0(xf2.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        RockPolishAnimation xf3 = this;
        n = 1358;
        n2 = 2;
        n3 = 14;
        f = 916.6667f;
        f2 = 0.9375f;
        pF = xf3.Vz0;
        pw_1 pw_14 = pw_13.xi0(xf3.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        RockPolishAnimation xf4 = this;
        n = 1449;
        n2 = 1;
        n3 = 14;
        f = 916.6667f;
        f2 = 0.9921875f;
        pF = xf4.Vz0;
        pw_1 pw_15 = pw_14.xi0(xf4.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(572));
        n = 2;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 572, n, n2, n3, f));
        n = 1;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = Zw0.H(HB.p30(pw_16, this.fE0(-1, 572, n, n2, n3, f)).xi0(this.tP(0.4f)), this.Ue0(4, 0, 0.75f, 0.0f, 0.025f));
        pw_12.Ms(this.Vs.wP);
        xf.Vs.jH(this.E8);
        xf.Vc();
        return xf;
    }
}


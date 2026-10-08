/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.cX
 */
/**
 * 宝可梦对战技能招式动画 - 麻痹粉 (StunSpore)
 * 技能编号: 78
 * 原始类: f.cx_1
 */
public class StunSporeAnimation
extends MU {
    public StunSporeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        StunSporeAnimation cx_12 = this;
        short s = 0;
        int n = 11;
        int n2 = 8;
        float f = 0.75f;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(242)).xi0(this.fE0(-1, 242, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.75f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 242, s, n, n2, f)).xi0(this.nM(16, 1));
        StunSporeAnimation cx_13 = this;
        s = 1718;
        n = 1;
        n2 = 16;
        f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = cx_13.Vz0;
        pw_1 pw_15 = pw_14.xi0(cx_13.i6((byte)2, s, n, n2, f, f2, pF));
        StunSporeAnimation cx_14 = this;
        s = 1458;
        n = 2;
        n2 = 16;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = cx_14.Vz0;
        this.E8 = pw_12 = pk_1.el(A2.Kj0(pw_15, cx_14.i6((byte)2, s, n, n2, f, f2, pF), 0.6f).xi0(this.WW(16, 3.25f, 0.0f, 0.5f, px_1.ep0(990))).xi0(this.WW(16, 3.25f, 0.5f, 0.0f, px_1.ep0(990))), this.Xq0(16, 2, 6, 0.032f, 0.016f, 0.020019531f, -0.020019531f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        cx_12.Vs.jH(this.E8);
        cx_12.Vc();
        return cx_12;
    }
}


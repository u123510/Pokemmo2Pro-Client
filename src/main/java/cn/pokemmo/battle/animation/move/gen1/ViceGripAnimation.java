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
 * 宝可梦对战技能招式动画 - 夹住 (ViceGrip)
 * 技能编号: 11
 * 原始类: f.LQ
 */
public class ViceGripAnimation
extends MU {
    public ViceGripAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        ViceGripAnimation lQ = this;
        short s = 0;
        int n = 11;
        int n2 = 8;
        float f = 0.5f;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(171)).xi0(this.fE0(-1, 171, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 171, s, n, n2, f));
        s = 2;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 171, s, n, n2, f));
        ViceGripAnimation lQ2 = this;
        s = 1424;
        n = 1;
        n2 = 16;
        f = 0.0f;
        float f2 = 0.9375f;
        PF pF = lQ2.Vz0;
        this.E8 = pw_12 = HB.p30(pw_15.xi0(lQ2.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, -0.30004883f, 0.30004883f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        lQ.Vs.jH(this.E8);
        lQ.Vc();
        return lQ;
    }
}


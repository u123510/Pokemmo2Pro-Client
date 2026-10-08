/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 扫尾拍打 (TailSlap)
 * 技能编号: 541
 * 原始类: f.WL
 */
public class TailSlapAnimation
extends MU {
    public TailSlapAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        TailSlapAnimation wL = this;
        short s = 2;
        int n = 11;
        int n2 = 8;
        float f = 0.125f;
        pw_1 pw_13 = pw_1.xC().Xf0().y80(this.E2(18, true)).mz0().Xf0().y80(this.Qh0(704)).xi0(this.fE0(-1, 704, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 704, s, n, n2, f));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 704, s, n, n2, f));
        TailSlapAnimation wL2 = this;
        s = 1651;
        n = 1;
        n2 = 16;
        f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = wL2.Vz0;
        pw_1 pw_16 = pw_15.xi0(wL2.i6((byte)2, s, n, n2, f, f2, pF));
        TailSlapAnimation wL3 = this;
        s = 1427;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.390625f;
        pF = wL3.Vz0;
        this.E8 = pw_12 = pk_1.el(A2.Kj0(pw_16, wL3.i6((byte)2, s, n, n2, f, f2, pF), 0.2f).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.064f, -0.39990234f, 0.39990234f)).xi0(this.nM(16, 0)).y80(this.E2(18, false)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        wL.Vs.jH(this.E8);
        wL.Vc();
        return wL;
    }
}


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
 * 宝可梦对战技能招式动画 - 抓 (Scratch)
 * 技能编号: 10
 * 原始类: f.DT
 */
public class ScratchAnimation
extends MU {
    public ScratchAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        ScratchAnimation dT = this;
        short s = 0;
        int n = 11;
        int n2 = 8;
        float f = 0.5f;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(170)).xi0(this.nM(16, 1)).xi0(this.fE0(-1, 170, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 170, s, n, n2, f));
        s = 2;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 170, s, n, n2, f)).xi0(this.Xq0(16, 2, 1, 0.0f, 0.032f, 0.100097656f, 0.30004883f));
        ScratchAnimation dT2 = this;
        s = 1423;
        n = 1;
        n2 = 16;
        f = 83.333336f;
        float f2 = 0.9375f;
        PF pF = dT2.Vz0;
        this.E8 = pw_12 = HB.p30(pw_15, dT2.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(16, 0)).mz0().Xf0().xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        dT.Vs.jH(this.E8);
        dT.Vc();
        return dT;
    }
}


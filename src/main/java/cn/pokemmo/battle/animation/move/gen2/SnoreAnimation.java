/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 打鼾 (Snore)
 * 技能编号: 173
 * 原始类: f.gm0
 */
public class SnoreAnimation
extends MU {
    public SnoreAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1418;
        int n2 = 3;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 3;
        n3 = 14;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1462;
        n2 = 1;
        n3 = 14;
        f = 0.0f;
        f2 = 0.9765625f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1462;
        n2 = 1;
        n3 = 14;
        f = 1000.0f;
        f2 = 0.9765625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(339));
        n = 339;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.4f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 339;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.4f;
        this.E8 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.19995117f, -0.19995117f)).mz0().Xf0().p1(0.6f).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


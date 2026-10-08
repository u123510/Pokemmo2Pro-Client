/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 力量平分 (PowerSplit)
 * 技能编号: 471
 * 原始类: f.PE
 */
public class PowerSplitAnimation
extends MU {
    public PowerSplitAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1884;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = A2.Kj0(pw_1.xC().Xf0().xi0(this.Wt(0, 0.25f)).xi0(this.nM(16, 1)).xi0(this.Ue0(2, 0, 0.0f, 0.625f, 0.075f)).y80(this.Qh0(559)).xi0(this.dA0(559, 0, 9, 11, 0.5f, 360.0f)), this.dA0(559, 0, 11, 9, 0.5f, 360.0f), 0.2f).xi0(this.dA0(559, 0, 9, 11, 0.5f, 360.0f)).xi0(this.dA0(559, 0, 11, 9, 0.5f, 360.0f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 1280.0f, 320.0f));
        s = 1782;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1782;
        n = 2;
        n2 = 14;
        f = 800.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        this.E8 = N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(pw_13, this.i6((byte)2, s, n, n2, f, f2, pF), 0.4f).xi0(this.dA0(559, 0, 9, 11, 0.5f, 360.0f)), this.dA0(559, 0, 11, 9, 0.5f, 360.0f), 0.6f).xi0(this.Wt(1, 0.3f)).xi0(this.dA0(559, 0, 9, 11, 0.5f, 360.0f)), this.dA0(559, 0, 11, 9, 0.5f, 360.0f), 0.8f).xi0(this.dA0(559, 0, 9, 11, 0.5f, 360.0f)), this.dA0(559, 0, 11, 9, 0.5f, 360.0f), 1.0f).xi0(this.dA0(559, 0, 9, 11, 0.5f, 360.0f)), this.dA0(559, 0, 11, 9, 0.5f, 360.0f), 1.2f).xi0(this.Xq0(16, 2, 1, 0.0f, 0.032f, 0.100097656f, -0.100097656f)).xi0(this.tP(0.25f)).mz0().mz0().mz0().Xf0().xi0(this.Ue0(2, 0, 0.625f, 0.0f, 0.075f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


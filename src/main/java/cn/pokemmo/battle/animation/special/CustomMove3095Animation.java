/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [3095]
 * 原始类: f.LV
 */
public class CustomMove3095Animation
extends MU {
    public CustomMove3095Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        CustomMove3095Animation lV = this;
        CustomMove3095Animation lV2 = this;
        short s = 1455;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = lV2.Vz0;
        this.E8 = pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).y80(this.wn0("3095")).xi0(lV2.i6((byte)2, s, n, n2, f, f2, pF)).mz0().p1(1.4f).xi0(this.tP(0.4f));
        pw_12.Ms(this.Vs.wP);
        lV.Vs.jH(this.E8);
        lV.Vc();
        return lV;
    }
}


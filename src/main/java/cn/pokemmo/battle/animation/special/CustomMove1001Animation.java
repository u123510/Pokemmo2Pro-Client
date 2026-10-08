/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1001]
 * 原始类: f.Uq0
 */
public class CustomMove1001Animation
extends MU {
    public CustomMove1001Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        CustomMove1001Animation uq0 = this;
        CustomMove1001Animation uq02 = this;
        short s = 1519;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = uq02.Vz0;
        this.E8 = pw_12 = pw_1.xC().xi0(this.Wt(0, 0.6f)).Xf0().xi0(uq02.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.025f)).y80(this.wn0("1001")).mz0().p1(1.5f).xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.025f)).xi0(this.tP(0.6f));
        pw_12.Ms(this.Vs.wP);
        uq0.Vs.jH(this.E8);
        uq0.Vc();
        return uq0;
    }
}


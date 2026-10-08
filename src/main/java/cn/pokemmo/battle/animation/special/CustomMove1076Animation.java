/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1076]
 * 原始类: f.CD0
 */
public class CustomMove1076Animation
extends MU {
    public CustomMove1076Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        CustomMove1076Animation cD0 = this;
        CustomMove1076Animation cD02 = this;
        short s = 1470;
        int n = 1;
        int n2 = 14;
        float f = 250.0f;
        float f2 = 0.8984375f;
        PF pF = cD02.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().y80(this.fn(1076)).xi0(cD02.i6((byte)2, s, n, n2, f, f2, pF));
        CustomMove1076Animation cD03 = this;
        s = 1472;
        n = 1;
        n2 = 14;
        f = 1200.0f;
        f2 = 0.9921875f;
        pF = cD03.Vz0;
        pw_1 pw_14 = pw_13.xi0(cD03.i6((byte)2, s, n, n2, f, f2, pF));
        CustomMove1076Animation cD04 = this;
        s = 1471;
        n = 2;
        n2 = 14;
        f = 1400.0f;
        f2 = 0.703125f;
        pF = cD04.Vz0;
        pw_1 pw_15 = pw_14.xi0(cD04.i6((byte)2, s, n, n2, f, f2, pF));
        CustomMove1076Animation cD05 = this;
        s = 1481;
        n = 2;
        n2 = 14;
        f = 2400.0f;
        f2 = 0.703125f;
        pF = cD05.Vz0;
        this.E8 = pw_12 = pw_15.xi0(cD05.i6((byte)2, s, n, n2, f, f2, pF)).mz0().p1(2.8f).xi0(this.tP(0.4f));
        pw_12.Ms(this.Vs.wP);
        cD0.Vs.jH(this.E8);
        cD0.Vc();
        return cD0;
    }
}


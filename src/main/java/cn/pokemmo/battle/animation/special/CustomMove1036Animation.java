/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1036]
 * 原始类: f.JL
 */
public class CustomMove1036Animation
extends MU {
    public CustomMove1036Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        CustomMove1036Animation jL = this;
        CustomMove1036Animation jL2 = this;
        PF pF = jL2.Vz0;
        CustomMove1036Animation jL3 = this;
        short s = 1474;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF2 = jL3.Vz0;
        pw_1 pw_13 = pw_1.xC().xi0(this.Wt(0, 0.4f)).Xf0().y80(this.wn0("1036")).xi0(jL2.i6((byte)10, (short)8, 2, 14, 700.0f, 0.8f, pF)).xi0(jL3.i6((byte)2, s, n, n2, f, f2, pF2));
        CustomMove1036Animation jL4 = this;
        s = 1418;
        n = 3;
        n2 = 14;
        f = 0.0f;
        f2 = 0.859375f;
        pF2 = jL4.Vz0;
        pw_1 pw_14 = pw_13.xi0(jL4.i6((byte)2, s, n, n2, f, f2, pF2)).xi0(this.Sv0(1, 0, 0.0f, 800.0f)).xi0(this.Sv0(3, 0, 0.0f, 800.0f));
        CustomMove1036Animation jL5 = this;
        s = 1376;
        n = 3;
        n2 = 14;
        f = 1000.0f;
        f2 = 0.0f;
        pF2 = jL5.Vz0;
        this.E8 = pw_12 = pw_14.xi0(jL5.i6((byte)2, s, n, n2, f, f2, pF2)).mz0().p1(1.35f).xi0(this.tP(0.4f));
        pw_12.Ms(this.Vs.wP);
        jL.Vs.jH(this.E8);
        jL.Vc();
        return jL;
    }
}


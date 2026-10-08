/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 白雾 (Mist)
 * 技能编号: 54
 * 原始类: f.JG0
 */
public class MistAnimation
extends MU {
    public MistAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        MistAnimation jG0 = this;
        MistAnimation jG02 = this;
        short s = 1455;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = jG02.Vz0;
        pw_1 pw_13 = HB.p30(pw_1.xC().Xf0().p1(0.4f), this.Ue0(4, Short.MAX_VALUE, 0.0f, 0.75f, 0.125f)).xi0(jG02.i6((byte)2, s, n, n2, f, f2, pF));
        MistAnimation jG03 = this;
        s = 1440;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.9375f;
        pF = jG03.Vz0;
        pw_1 pw_14 = pw_13.xi0(jG03.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(215));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = Zw0.H(HB.p30(pw_14, this.fE0(-1, 215, s, n, n2, f)).xi0(this.tP(0.4f)), this.Ue0(4, Short.MAX_VALUE, 0.75f, 0.0f, 0.125f));
        pw_12.Ms(this.Vs.wP);
        jG0.Vs.jH(this.E8);
        jG0.Vc();
        return jG0;
    }
}


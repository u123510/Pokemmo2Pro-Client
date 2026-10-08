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
 * 宝可梦对战技能招式动画 - 剑舞 (SwordsDance)
 * 技能编号: 14
 * 原始类: f.KY
 */
public class SwordsDanceAnimation
extends MU {
    public SwordsDanceAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        SwordsDanceAnimation kY = this;
        SwordsDanceAnimation kY2 = this;
        short s = 1434;
        int n = 2;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = kY2.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(kY2.i6((byte)2, s, n, n2, f, f2, pF));
        SwordsDanceAnimation kY3 = this;
        s = 1435;
        n = 1;
        n2 = 14;
        f = 200.0f;
        f2 = 0.78125f;
        pF = kY3.Vz0;
        pw_1 pw_14 = pw_13.xi0(kY3.i6((byte)2, s, n, n2, f, f2, pF));
        SwordsDanceAnimation kY4 = this;
        s = 1436;
        n = 2;
        n2 = 14;
        f = 383.33334f;
        f2 = 0.9921875f;
        pF = kY4.Vz0;
        pw_1 pw_15 = pw_14.xi0(kY4.i6((byte)2, s, n, n2, f, f2, pF));
        SwordsDanceAnimation kY5 = this;
        s = 1436;
        n = 2;
        n2 = 14;
        f = 916.6667f;
        f2 = 0.9921875f;
        pF = kY5.Vz0;
        pw_1 pw_16 = pw_15.xi0(kY5.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(175));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 175, s, n, n2, f));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_17, this.fE0(-1, 175, s, n, n2, f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        kY.Vs.jH(this.E8);
        kY.Vc();
        return kY;
    }
}


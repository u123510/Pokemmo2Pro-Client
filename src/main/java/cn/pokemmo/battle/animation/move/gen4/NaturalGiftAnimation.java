/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 自然之恩 (NaturalGift)
 * 技能编号: 363
 * 原始类: f.N90
 */
public class NaturalGiftAnimation
extends MU {
    public NaturalGiftAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        NaturalGiftAnimation n90 = this;
        NaturalGiftAnimation n902 = this;
        int n = 1515;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = n902.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(n902.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        NaturalGiftAnimation n903 = this;
        n = 1461;
        n2 = 2;
        n3 = 14;
        f = 750.0f;
        f2 = 0.9375f;
        pF = n903.Vz0;
        pw_1 pw_14 = pw_13.xi0(n903.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(537));
        n = 0;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 537, n, n2, n3, f));
        n = 2;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 537, n, n2, n3, f));
        n = 1;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 537, n, n2, n3, f));
        n = 3;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_17, this.fE0(-1, 537, n, n2, n3, f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        n90.Vs.jH(this.E8);
        n90.Vc();
        return n90;
    }
}


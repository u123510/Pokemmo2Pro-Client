/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 哈欠 (Yawn)
 * 技能编号: 281
 * 原始类: f.FN
 */
public class YawnAnimation
extends MU {
    public YawnAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1964;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Xq0(14, 2, 1, 0.016f, 0.128f, -0.19995117f, 0.19995117f)).y80(this.Qh0(448)).xi0(this.dA0(448, 0, 9, 11, 0.5f, 0.0f)).xi0(this.nM(16, 1)).mz0().Xf0().xi0(this.Wt(1, 0.4f));
        s = 448;
        n = 1;
        n2 = 11;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.048f, 0.19995117f, -0.19995117f));
        s = 1461;
        n = 2;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1461;
        n = 1;
        n2 = 16;
        f3 = 133.33333f;
        f2 = 0.625f;
        pF = this.Vz0;
        this.E8 = HB.p30(pw_14, this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


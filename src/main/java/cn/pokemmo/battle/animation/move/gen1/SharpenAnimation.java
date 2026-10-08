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
 * 宝可梦对战技能招式动画 - 棱角化 (Sharpen)
 * 技能编号: 159
 * 原始类: f.PY
 */
public class SharpenAnimation
extends MU {
    public SharpenAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1461;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1461;
        n2 = 2;
        n3 = 14;
        f = 500.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1461;
        n2 = 1;
        n3 = 14;
        f = 1000.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1709;
        n2 = 2;
        n3 = 14;
        f = 1416.6666f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1709;
        n2 = 1;
        n3 = 14;
        f = 1583.3334f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(323));
        n = 323;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 323;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = HB.p30(pw_17, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


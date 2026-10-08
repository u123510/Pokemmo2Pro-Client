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
 * 宝可梦对战技能招式动画 - 纹理 (Conversion)
 * 技能编号: 160
 * 原始类: f.HT
 */
public class ConversionAnimation
extends MU {
    public ConversionAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        ConversionAnimation hT = this;
        short s = 0;
        int n = 9;
        int n2 = 8;
        float f = 0.5f;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().y80(this.Qh0(324)).xi0(this.fE0(-1, 324, s, n, n2, f)).xi0(this.nM(14, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.19995117f, -0.19995117f));
        ConversionAnimation hT2 = this;
        s = 1358;
        n = 1;
        n2 = 14;
        f = 0.0f;
        float f2 = 0.859375f;
        PF pF = hT2.Vz0;
        pw_1 pw_14 = pw_13.xi0(hT2.i6((byte)2, s, n, n2, f, f2, pF));
        ConversionAnimation hT3 = this;
        s = 1471;
        n = 2;
        n2 = 14;
        f = 750.0f;
        f2 = 0.859375f;
        pF = hT3.Vz0;
        this.E8 = pw_12 = HB.p30(pw_14, hT3.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        hT.Vs.jH(this.E8);
        hT.Vc();
        return hT;
    }
}


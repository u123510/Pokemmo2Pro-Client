/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.lA
 */
/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1004]
 * 原始类: f.la_1
 */
public class CustomMove1004Animation
extends MU {
    public CustomMove1004Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        pw_1 pw_12;
        CustomMove1004Animation la_12 = this;
        CustomMove1004Animation la_13 = this;
        short s = 1535;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = la_13.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).mz0().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.025f)).xi0(this.Xq0(14, 2, 2, 0.032f, 0.096f, 0.30004883f, 0.30004883f)).xi0(la_13.i6((byte)2, s, n, n2, f, f2, pF));
        CustomMove1004Animation la_14 = this;
        s = 1535;
        n = 2;
        n2 = 14;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = la_14.Vz0;
        this.E8 = pw_12 = pk_1.el(N4.zr(N4.zr(A2.Kj0(pw_13.xi0(la_14.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.WW(14, 0.75f, 0.0f, 0.625f, px_1.ep0(Short.MAX_VALUE))), this.WW(16, 0.75f, 0.0f, 0.625f, px_1.ep0(0)), 0.2f), this.WW(14, 0.75f, 0.625f, 0.0f, px_1.ep0(Short.MAX_VALUE)), 0.4f), this.WW(14, 0.75f, 0.0f, 0.625f, px_1.ep0(Short.MAX_VALUE)), 0.6f).xi0(this.WW(14, 0.75f, 0.625f, 0.0f, px_1.ep0(Short.MAX_VALUE))), this.WW(16, 0.75f, 0.625f, 0.0f, px_1.ep0(0))).xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.025f)).p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        la_12.Vs.jH(this.E8);
        return la_12;
    }
}


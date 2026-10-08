/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.re0
 */
/**
 * 宝可梦对战技能招式动画 - 替身 (Substitute)
 * 技能编号: 164
 * 原始类: f.re0_2
 */
public class SubstituteAnimation
extends MU {
    public SubstituteAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        SubstituteAnimation re0_22 = this;
        SubstituteAnimation re0_23 = this;
        short s = 1437;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = re0_23.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(re0_23.i6((byte)2, s, n, n2, f, f2, pF));
        SubstituteAnimation re0_24 = this;
        s = 1452;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.78125f;
        pF = re0_24.Vz0;
        pw_1 pw_14 = pw_13.xi0(re0_24.i6((byte)2, s, n, n2, f, f2, pF));
        SubstituteAnimation re0_25 = this;
        s = 1452;
        n = 1;
        n2 = 14;
        f = 416.66666f;
        f2 = 0.390625f;
        pF = re0_25.Vz0;
        pw_1 pw_15 = pw_14.xi0(re0_25.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(14, 1)).y80(this.Qh0(330));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.0f;
        this.E8 = pw_12 = HB.p30(pw_15, this.fE0(-1, 330, s, n, n2, f)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        re0_22.Vs.jH(this.E8);
        re0_22.Vc();
        return re0_22;
    }
}


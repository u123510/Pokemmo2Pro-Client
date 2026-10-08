/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.bd0
 */
/**
 * 宝可梦对战技能招式动画 - 摇晃舞 (TeeterDance)
 * 技能编号: 298
 * 原始类: f.bd0_2
 */
public class TeeterDanceAnimation
extends MU {
    public TeeterDanceAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        TeeterDanceAnimation bd0_22 = this;
        TeeterDanceAnimation bd0_23 = this;
        short s = 1506;
        int n = 2;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = bd0_23.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(bd0_23.i6((byte)2, s, n, n2, f, f2, pF));
        TeeterDanceAnimation bd0_24 = this;
        s = 1452;
        n = 1;
        n2 = 14;
        f = 0.0f;
        f2 = 0.859375f;
        pF = bd0_24.Vz0;
        pw_1 pw_14 = pw_13.xi0(bd0_24.i6((byte)2, s, n, n2, f, f2, pF));
        TeeterDanceAnimation bd0_25 = this;
        s = 1452;
        n = 1;
        n2 = 14;
        f = 500.0f;
        f2 = 0.859375f;
        pF = bd0_25.Vz0;
        pw_1 pw_15 = pw_14.xi0(bd0_25.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.EN(14, 2, 3, 0.016f, 0.096f, 1.0f, 0.0f)).y80(this.Qh0(464));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_15, this.fE0(-1, 464, s, n, n2, f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        bd0_22.Vs.jH(this.E8);
        bd0_22.Vc();
        return bd0_22;
    }
}


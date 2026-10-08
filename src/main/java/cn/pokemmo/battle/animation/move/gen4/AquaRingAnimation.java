/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.oa0
 */
/**
 * 宝可梦对战技能招式动画 - 水流环 (AquaRing)
 * 技能编号: 392
 * 原始类: f.oa0_2
 */
public class AquaRingAnimation
extends MU {
    public AquaRingAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        AquaRingAnimation oa0_22 = this;
        AquaRingAnimation oa0_23 = this;
        short s = 1461;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = oa0_23.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().y80(this.E2(18, true)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(oa0_23.i6((byte)2, s, n, n2, f, f2, pF));
        AquaRingAnimation oa0_24 = this;
        s = 1461;
        n = 1;
        n2 = 14;
        f = 500.0f;
        f2 = 0.234375f;
        pF = oa0_24.Vz0;
        pw_1 pw_14 = pw_13.xi0(oa0_24.i6((byte)2, s, n, n2, f, f2, pF));
        AquaRingAnimation oa0_25 = this;
        s = 1483;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.78125f;
        pF = oa0_25.Vz0;
        pw_1 pw_15 = pw_14.xi0(oa0_25.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(567));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 567, s, n, n2, f));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_16, this.fE0(-1, 567, s, n, n2, f)).xi0(this.tP(0.4f)).y80(this.E2(18, false)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        oa0_22.Vs.jH(this.E8);
        oa0_22.Vc();
        return oa0_22;
    }
}


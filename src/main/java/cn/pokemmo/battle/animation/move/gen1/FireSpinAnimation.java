/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.qb0
 */
/**
 * 宝可梦对战技能招式动画 - 火焰旋涡 (FireSpin)
 * 技能编号: 83
 * 原始类: f.qb0_2
 */
public class FireSpinAnimation
extends MU {
    public FireSpinAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 247;
        int n2 = 0;
        int n3 = 11;
        int n4 = 8;
        float f = 0.25f;
        pw_1 pw_12 = A2.Kj0(pw_1.xC().Xf0().y80(this.E2(18, true)).xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(247)), this.fE0(-1, n, n2, n3, n4, f), 0.12f).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f));
        n = 1426;
        n2 = 1;
        n3 = 16;
        float f2 = 0.0f;
        f = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1425;
        n2 = 2;
        n3 = 16;
        f2 = 0.0f;
        f = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f2 = 1000.0f;
        f = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = N4.zr(pw_14, this.i6((byte)2, (short)n, n2, n3, f2, f, pF), 0.18f);
        n = 247;
        n2 = 1;
        n3 = 11;
        int n5 = 8;
        f = 0.25f;
        this.E8 = pk_1.el(pw_15, this.fE0(-1, n, n2, n3, n5, f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).y80(this.E2(18, false)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


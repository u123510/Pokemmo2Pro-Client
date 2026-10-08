/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 飞膝踢 (RollingKick)
 * 技能编号: 27
 * 原始类: f.F5
 */
public class RollingKickAnimation
extends MU {
    public RollingKickAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1421;
        int n2 = 2;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.0f;
        PF pF = this.Vz0;
        pw_1 pw_12 = A2.Kj0(pw_1.xC().Xf0(), this.i6((byte)2, (short)n, n2, n3, f, f2, pF), 0.04f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(0.08f).Xf0().y80(this.Qh0(189));
        n = 189;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 1421;
        n2 = 1;
        n3 = 16;
        float f3 = 83.333336f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_14 = N4.zr(pw_13, this.i6((byte)2, (short)n, n2, n3, f3, f2, pF), 0.12f);
        n = 189;
        n2 = 2;
        n3 = 11;
        int n5 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pk_1.el(pw_14, this.fE0(-1, n, n2, n3, n5, f2));
        n = 1703;
        n2 = 2;
        n3 = 16;
        float f4 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f2, pF));
        n = 1475;
        n2 = 1;
        n3 = 16;
        f4 = 0.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f2, pF));
        n = 189;
        n2 = 1;
        n3 = 11;
        int n6 = 8;
        f2 = 0.5f;
        this.E8 = HB.p30(pw_17.xi0(this.fE0(-1, n, n2, n3, n6, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


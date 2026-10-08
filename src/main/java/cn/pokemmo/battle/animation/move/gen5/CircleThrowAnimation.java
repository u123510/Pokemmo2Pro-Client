/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.md0
 */
/**
 * 宝可梦对战技能招式动画 - 巴投 (CircleThrow)
 * 技能编号: 509
 * 原始类: f.md0_2
 */
public class CircleThrowAnimation
extends MU {
    public CircleThrowAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        CircleThrowAnimation md0_22 = this;
        CircleThrowAnimation md0_23 = this;
        short s = 1444;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = md0_23.Vz0;
        pw_1 pw_13 = A2.Kj0(FB.zd0(0.6f), md0_23.i6((byte)2, s, n, n2, f, f2, pF), 0.04f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(0.08f).Xf0();
        CircleThrowAnimation md0_24 = this;
        s = 1420;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = md0_24.Vz0;
        pw_1 pw_14 = pw_13.xi0(md0_24.i6((byte)2, s, n, n2, f, f2, pF));
        CircleThrowAnimation md0_25 = this;
        s = 1434;
        n = 2;
        n2 = 16;
        f = 333.33334f;
        f2 = 0.78125f;
        pF = md0_25.Vz0;
        pw_1 pw_15 = pw_14.xi0(md0_25.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(16, 1)).y80(this.Qh0(674));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 674, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(N4.zr(pw_16, this.fE0(-1, 674, s, n, n2, f), 0.24f), this.Xq0(16, 2, 4, 0.0f, 0.048f, 0.39990234f, -0.39990234f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        md0_22.Vs.jH(this.E8);
        md0_22.Vc();
        return md0_22;
    }
}


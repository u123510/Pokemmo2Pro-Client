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
 * Renamed from f.g90
 */
/**
 * 宝可梦对战技能招式动画 - 屏障 (Barrier)
 * 技能编号: 112
 * 原始类: f.g90_0
 */
public class BarrierAnimation
extends MU {
    public BarrierAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BarrierAnimation g90_02 = this;
        short s = 3;
        int n = 9;
        int n2 = 8;
        float f = 0.5f;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().y80(this.Qh0(277)).xi0(this.fE0(-1, 277, s, n, n2, f));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = A2.Kj0(pw_13, this.fE0(-1, 277, s, n, n2, f), 0.2f);
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = N4.zr(pw_14, this.fE0(-1, 277, s, n, n2, f), 0.6f);
        s = 2;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 277, s, n, n2, f));
        BarrierAnimation g90_03 = this;
        s = 1472;
        n = 1;
        n2 = 14;
        f = 0.0f;
        float f2 = 0.78125f;
        PF pF = g90_03.Vz0;
        pw_1 pw_17 = pw_16.xi0(g90_03.i6((byte)2, s, n, n2, f, f2, pF));
        BarrierAnimation g90_04 = this;
        s = 1473;
        n = 2;
        n2 = 14;
        f = 333.33334f;
        f2 = 0.78125f;
        pF = g90_04.Vz0;
        this.E8 = pw_12 = pk_1.el(pw_17, g90_04.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        g90_02.Vs.jH(this.E8);
        g90_02.Vc();
        return g90_02;
    }
}


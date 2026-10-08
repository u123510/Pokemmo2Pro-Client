/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.MU;
import f.N4;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.id0
 */
/**
 * 宝可梦对战技能招式动画 - 传递礼物 (Bestow)
 * 技能编号: 516
 * 原始类: f.id0_2
 */
public class BestowAnimation
extends MU {
    public BestowAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BestowAnimation id0_22 = this;
        BestowAnimation id0_23 = this;
        short s = 1665;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = id0_23.Vz0;
        pw_1 pw_13 = N4.zr(N4.zr(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).TD0().p1(0.6f).Xf0().xi0(id0_23.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 640.0f, 480.0f)).xi0(this.Sv0(1, 0, 320.0f, 640.0f)), this.Xq0(14, 2, 1, 0.0f, 0.096f, 0.19995117f, -0.19995117f), 0.8f).y80(this.Qh0(681)), this.dA0(681, 0, 9, 11, 0.5f, 552.0f), 1.2f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(1.6f).Xf0();
        BestowAnimation id0_24 = this;
        s = 1468;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = id0_24.Vz0;
        this.E8 = pw_12 = pw_13.xi0(id0_24.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Xq0(16, 2, 1, 0.0f, 0.096f, 0.19995117f, -0.19995117f)).mz0().mz0().mz0().Xf0().TD0().p1(0.4f).Xf0().xi0(this.tP(0.4f)).mz0().mz0().mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        id0_22.Vs.jH(this.E8);
        id0_22.Vc();
        return id0_22;
    }
}


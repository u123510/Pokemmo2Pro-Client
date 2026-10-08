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
 * Renamed from f.xD0
 */
/**
 * 宝可梦对战技能招式动画 - 踩踏 (Stomp)
 * 技能编号: 23
 * 原始类: f.xd0_1
 */
public class StompAnimation
extends MU {
    public StompAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        StompAnimation xd0_12 = this;
        short s = 0;
        int n = 11;
        int n2 = 8;
        float f = 0.5f;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(185)).xi0(this.fE0(-1, 185, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 185, s, n, n2, f)).xi0(this.nM(14, 1));
        s = 2;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 185, s, n, n2, f)).xi0(this.Xq0(16, 2, 1, 0.032f, 0.064f, 0.39990234f, -0.39990234f));
        StompAnimation xd0_13 = this;
        s = 1703;
        n = 1;
        n2 = 16;
        f = 0.0f;
        float f2 = 0.9375f;
        PF pF = xd0_13.Vz0;
        pw_1 pw_16 = pw_15.xi0(xd0_13.i6((byte)2, s, n, n2, f, f2, pF));
        StompAnimation xd0_14 = this;
        s = 1475;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.78125f;
        pF = xd0_14.Vz0;
        this.E8 = pw_12 = HB.p30(pw_16, xd0_14.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        xd0_12.Vs.jH(this.E8);
        xd0_12.Vc();
        return xd0_12;
    }
}


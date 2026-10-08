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
 * Renamed from f.Ci
 */
/**
 * 宝可梦对战技能招式动画 - 毒瓦斯 (PoisonGas)
 * 技能编号: 139
 * 原始类: f.ci_0
 */
public class PoisonGasAnimation
extends MU {
    public PoisonGasAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1407;
        int n2 = 2;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.3f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(A2.Kj0(pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 800.0f, 480.0f)).y80(this.Qh0(304)), this.dA0(304, 0, 9, 11, 0.5f, 1200.0f), 0.04f), this.dA0(304, 0, 9, 11, 0.5f, 1200.0f), 0.08f), this.dA0(304, 0, 9, 11, 0.5f, 1200.0f), 0.12f), this.dA0(304, 0, 9, 11, 0.5f, 1200.0f), 0.16f), this.dA0(304, 0, 9, 11, 0.5f, 1200.0f), 0.2f), this.dA0(304, 0, 9, 11, 0.5f, 1200.0f), 0.24f), this.dA0(304, 0, 9, 11, 0.5f, 1200.0f), 0.28f), this.dA0(304, 0, 9, 11, 0.5f, 1200.0f), 0.32f), this.dA0(304, 0, 9, 11, 0.5f, 1200.0f), 0.36f).xi0(this.Wt(1, 0.6f));
        n = 1455;
        n2 = 1;
        n3 = 16;
        f = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = N4.zr(N4.zr(pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 1440.0f, 480.0f)), this.dA0(304, 0, 9, 11, 0.5f, 1200.0f), 0.4f), this.dA0(304, 0, 9, 11, 0.5f, 1200.0f), 0.64f);
        n = 304;
        n2 = 1;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


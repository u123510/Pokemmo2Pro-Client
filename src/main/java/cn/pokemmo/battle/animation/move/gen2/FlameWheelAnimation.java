/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Ji
 */
/**
 * 宝可梦对战技能招式动画 - 火焰轮 (FlameWheel)
 * 技能编号: 172
 * 原始类: f.ji_0
 */
public class FlameWheelAnimation
extends MU {
    public FlameWheelAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 338;
        int n2 = 0;
        int n3 = 9;
        int n4 = 8;
        float f = 0.5f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().y80(this.Qh0(338)).xi0(this.fE0(-1, n, n2, n3, n4, f));
        n = 1425;
        n2 = 1;
        n3 = 14;
        float f2 = 0.0f;
        f = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1535;
        n2 = 2;
        n3 = 14;
        f2 = 0.0f;
        f = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f2 = 916.6667f;
        f = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1535;
        n2 = 2;
        n3 = 14;
        f2 = 500.0f;
        f = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = A2.Kj0(pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF)).xi0(this.Sv0(1, 1, 560.0f, 320.0f)), this.Sv0(2, 1, 560.0f, 320.0f), 0.8f).xi0(this.EN(14, 2, 1, 0.032f, 0.064f, 2.0f, 1.0f)).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(1.04f).Xf0();
        n = 1426;
        n2 = 2;
        n3 = 16;
        f2 = 0.0f;
        f = 0.625f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1885;
        n2 = 1;
        n3 = 16;
        f2 = 0.0f;
        f = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 338;
        n2 = 1;
        n3 = 11;
        int n5 = 8;
        f = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n5, f));
        n = 338;
        n2 = 2;
        n3 = 11;
        n5 = 8;
        f = 0.5f;
        this.E8 = pk_1.el(pw_19.xi0(this.fE0(-1, n, n2, n3, n5, f)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.19995117f, -0.19995117f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 气象球 (WeatherBall)
 * 技能编号: 311
 * 原始类: f.Q10
 */
public class WeatherBallAnimation
extends MU {
    public WeatherBallAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1445;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).y80(this.Qh0(478)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 800.0f)).xi0(this.Sv0(1, 1, 640.0f, 320.0f));
        n = 1445;
        n2 = 1;
        n3 = 16;
        f = 1083.3334f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f = 2083.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 1040.0f, 800.0f)).xi0(this.Sv0(1, 1, 1680.0f, 320.0f));
        n = 1471;
        n2 = 2;
        n3 = 16;
        f = 1666.6666f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 478;
        n2 = 4;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 478;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = HB.p30(pw_17, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.Wt(1, 0.4f));
        n = 478;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.75f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 478;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.75f;
        pw_1 pw_110 = A2.Kj0(pw_19, this.fE0(-1, n, n2, n3, n4, f2), 0.4f);
        n = 478;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(N4.zr(pw_110, this.fE0(-1, n, n2, n3, n4, f2), 1.0f).xi0(this.nM(16, 1)), this.Xq0(16, 2, 4, 0.0f, 0.032f, 0.30004883f, -0.30004883f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


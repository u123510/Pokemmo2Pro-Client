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

/**
 * 宝可梦对战技能招式动画 - 水枪 (WaterGun)
 * 技能编号: 55
 * 原始类: f.KH0
 */
public class WaterGunAnimation
extends MU {
    public WaterGunAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1407;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = N4.zr(A2.Kj0(pw_1.xC().Xf0().y80(this.E2(18, true)).p1(0.6f).mz0().Xf0().y80(this.Qh0(216)), this.dA0(216, 1, 9, 11, 0.5f, 360.0f), 0.02f), this.dA0(216, 1, 9, 11, 0.5f, 360.0f), 0.04f).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1408;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)), this.dA0(216, 1, 9, 11, 0.5f, 360.0f), 0.06f), this.dA0(216, 1, 9, 11, 0.5f, 360.0f), 0.08f), this.dA0(216, 1, 9, 11, 0.5f, 360.0f), 0.1f), this.dA0(216, 1, 9, 11, 0.5f, 360.0f), 0.12f), this.dA0(216, 1, 9, 11, 0.5f, 360.0f), 0.14f).xi0(this.nM(16, 1)).xi0(this.dA0(216, 1, 9, 11, 0.5f, 360.0f)).xi0(this.Xq0(16, 2, 6, 0.016f, 0.032f, 0.30004883f, -0.100097656f)).xi0(this.dA0(216, 1, 9, 11, 0.5f, 360.0f)).xi0(this.Wt(1, 0.4f)), this.dA0(216, 1, 9, 11, 0.5f, 360.0f), 0.16f);
        s = 216;
        n = 0;
        n2 = 11;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = N4.zr(pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2)), this.dA0(216, 1, 9, 11, 0.5f, 360.0f), 0.18f);
        s = 216;
        n = 0;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = N4.zr(pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2)), this.dA0(216, 1, 9, 11, 0.5f, 360.0f), 0.2f).xi0(this.dA0(216, 1, 9, 11, 0.5f, 360.0f));
        s = 1409;
        n = 1;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1376;
        n = 1;
        n2 = 16;
        f3 = 750.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1376;
        n = 2;
        n2 = 16;
        f3 = 750.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        this.E8 = pk_1.el(N4.zr(N4.zr(pw_17, this.i6((byte)2, s, n, n2, f3, f2, pF), 0.22f), this.dA0(216, 1, 9, 11, 0.5f, 360.0f), 0.24f), this.dA0(216, 1, 9, 11, 0.5f, 360.0f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).y80(this.E2(18, false)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


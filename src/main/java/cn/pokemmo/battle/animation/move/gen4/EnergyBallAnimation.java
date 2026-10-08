/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.mK
 */
/**
 * 宝可梦对战技能招式动画 - 能量球 (EnergyBall)
 * 技能编号: 412
 * 原始类: f.mk_0
 */
public class EnergyBallAnimation
extends MU {
    public EnergyBallAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1713;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.05f)).xi0(this.nM(14, 1)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1416.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1360.0f)).y80(this.Qh0(587));
        n = 587;
        n2 = 1;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = A2.Kj0(pw_13, this.fE0(-1, n, n2, n3, n4, f2), 1.6f).xi0(this.Wt(1, 0.8f));
        n = 1510;
        n2 = 2;
        n3 = 16;
        float f3 = 0.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1423;
        n2 = 1;
        n3 = 16;
        f3 = 583.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1423;
        n2 = 2;
        n3 = 16;
        f3 = 666.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1423;
        n2 = 1;
        n3 = 16;
        f3 = 750.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1423;
        n2 = 2;
        n3 = 16;
        f3 = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF)).xi0(this.Sv0(1, 1, 640.0f, 480.0f));
        n = 587;
        n2 = 0;
        n3 = 9;
        int n5 = 11;
        f2 = 0.5f;
        pw_1 pw_110 = N4.zr(pw_19, this.fE0(-1, n, n2, n3, n5, f2), 2.0f);
        n = 587;
        n2 = 2;
        n3 = 11;
        n5 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_110.xi0(this.fE0(-1, n, n2, n3, n5, f2)).xi0(this.nM(16, 1)), this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


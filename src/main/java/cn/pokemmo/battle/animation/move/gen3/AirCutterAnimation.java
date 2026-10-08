/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.uQ
 */
/**
 * 宝可梦对战技能招式动画 - 空气利刃 (AirCutter)
 * 技能编号: 314
 * 原始类: f.uq_1
 */
public class AirCutterAnimation
extends MU {
    public AirCutterAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1815;
        int n2 = 1;
        int n3 = 16;
        float f = 333.33334f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 320.0f, 1280.0f)).xi0(this.Sv0(1, 1, 320.0f, 1280.0f));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1423;
        n2 = 2;
        n3 = 16;
        f = 450.0f;
        f2 = 0.9765625f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1423;
        n2 = 2;
        n3 = 16;
        f = 583.3333f;
        f2 = 0.9765625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1423;
        n2 = 2;
        n3 = 16;
        f = 750.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1423;
        n2 = 2;
        n3 = 16;
        f = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(485));
        n = 485;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 485;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(A2.Kj0(pw_18, this.fE0(-1, n, n2, n3, n4, f2), 0.6f).xi0(this.nM(16, 1)), this.EN(16, 2, 4, 0.016f, 0.048f, 1.0f, 0.0f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.Zs
 */
/**
 * 宝可梦对战技能招式动画 - 吵闹 (Uproar)
 * 技能编号: 253
 * 原始类: f.zs_0
 */
public class UproarAnimation
extends MU {
    public UproarAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1501;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).y80(this.E2(18, true)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1500;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1501;
        n2 = 1;
        n3 = 14;
        f = 250.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1501;
        n2 = 1;
        n3 = 14;
        f = 500.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1501;
        n2 = 1;
        n3 = 14;
        f = 750.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 1120.0f, 160.0f)).y80(this.Qh0(419));
        n = 419;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 419;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = HB.p30(pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(14, 2, 3, 0.016f, 0.096f, 0.19995117f, -0.19995117f)).y80(this.E2(18, false)).xi0(this.tP(0.3f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


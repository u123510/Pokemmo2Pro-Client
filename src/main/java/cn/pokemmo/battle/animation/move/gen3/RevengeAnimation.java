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
 * Renamed from f.l
 */
/**
 * 宝可梦对战技能招式动画 - 报复 (Revenge)
 * 技能编号: 279
 * 原始类: f.l_0
 */
public class RevengeAnimation
extends MU {
    public RevengeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 445;
        int n = 2;
        int n2 = 9;
        int n3 = 8;
        float f = 0.5f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.1f)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().y80(this.Qh0(445)).xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 1440;
        n = 2;
        n2 = 14;
        float f2 = 0.0f;
        f = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1783;
        n = 1;
        n2 = 14;
        f2 = 0.0f;
        f = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f2 = 1666.6666f;
        f = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = HB.p30(pw_14.xi0(this.i6((byte)2, s, n, n2, f2, f, pF)), this.Sv0(1, 1, 640.0f, 800.0f)).xi0(this.Wt(1, 0.25f)).xi0(this.nM(16, 1));
        s = 445;
        n = 0;
        n2 = 11;
        int n4 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n4, f));
        s = 445;
        n = 1;
        n2 = 11;
        n4 = 8;
        f = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n4, f));
        s = 445;
        n = 3;
        n2 = 11;
        n4 = 8;
        f = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, s, n, n2, n4, f)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.048f, -0.19995117f, 0.19995117f));
        s = 1423;
        n = 2;
        n2 = 16;
        float f3 = 0.0f;
        f = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n, n2, f3, f, pF));
        s = 1420;
        n = 1;
        n2 = 16;
        f3 = 0.0f;
        f = 0.78125f;
        pF = this.Vz0;
        this.E8 = HB.p30(pw_19, this.i6((byte)2, s, n, n2, f3, f, pF)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.1f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


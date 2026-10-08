/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.gi
 */
/**
 * 宝可梦对战技能招式动画 - 虫鸣 (BugBuzz)
 * 技能编号: 405
 * 原始类: f.gi_2
 */
public class BugBuzzAnimation
extends MU {
    public BugBuzzAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1572;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.25f)).mz0().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1572;
        n = 1;
        n2 = 14;
        f = 833.3333f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1450;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 1440.0f));
        s = 1376;
        n = 2;
        n2 = 14;
        f = 1250.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(580));
        s = 580;
        n = 0;
        n2 = 9;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 580;
        n = 1;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 580;
        n = 2;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 580;
        n = 3;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 580;
        n = 4;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.nM(16, 1)).mz0().Xf0().xi0(this.Wt(1, 0.25f)).xi0(this.EN(16, 2, 6, 0.016f, 0.032f, 0.19995117f, 0.0f));
        s = 1728;
        n = 1;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        this.E8 = HB.p30(pw_110.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)), this.Sv0(1, 1, 320.0f, 480.0f)).xi0(this.nM(16, 0)).xi0(this.tP(0.25f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


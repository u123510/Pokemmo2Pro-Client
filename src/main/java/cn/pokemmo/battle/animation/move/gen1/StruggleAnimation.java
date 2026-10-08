/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.p30
 */
/**
 * 宝可梦对战技能招式动画 - 挣扎 (Struggle)
 * 技能编号: 165
 * 原始类: f.p30_0
 */
public class StruggleAnimation
extends MU {
    public StruggleAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1463;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.390625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 333.33334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1463;
        n = 1;
        n2 = 14;
        f = 500.0f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 833.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = HB.p30(pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 160.0f)).xi0(this.Sv0(1, 0, 160.0f, 160.0f)).xi0(this.Sv0(1, 0, 480.0f, 160.0f)).xi0(this.Sv0(1, 0, 640.0f, 160.0f)), this.EN(14, 2, 2, 0.016f, 0.096f, 1.0f, 0.0f)).xi0(this.Wt(1, 0.4f)).y80(this.Qh0(331));
        s = 331;
        n = 0;
        n2 = 11;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 331;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.nM(14, 1));
        s = 1420;
        n = 2;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = A2.Kj0(pw_17, this.i6((byte)2, s, n, n2, f3, f2, pF), 0.4f);
        s = 331;
        n = 0;
        n2 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, s, n, n2, n4, f2));
        s = 331;
        n = 1;
        n2 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, s, n, n2, n4, f2));
        s = 1420;
        n = 2;
        n2 = 16;
        float f4 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        this.E8 = pk_1.el(pw_110, this.i6((byte)2, s, n, n2, f4, f2, pF)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


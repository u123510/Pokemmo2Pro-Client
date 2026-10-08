/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.iQ
 */
/**
 * 宝可梦对战技能招式动画 - 虫之抵抗 (StruggleBug)
 * 技能编号: 522
 * 原始类: f.iq_1
 */
public class StruggleBugAnimation
extends MU {
    public StruggleBugAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1867;
        int n = 3;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.234375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1489;
        n = 1;
        n2 = 14;
        f = 500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 833.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = A2.Kj0(pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)), this.EN(14, 2, 6, 0.0f, 0.032f, 0.30004883f, 0.0f), 0.2f).xi0(this.Xq0(14, 2, 1, 0.016f, 0.128f, 0.19995117f, -0.19995117f)).y80(this.Qh0(688));
        s = 688;
        n = 0;
        n2 = 9;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 688;
        n = 1;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.Wt(0, 0.4f)).mz0().mz0().TD0().p1(0.6f).Xf0().xi0(this.Wt(1, 0.4f)).xi0(this.nM(16, 1)).y80(this.Qh0(421));
        s = 421;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = N4.zr(pw_16, this.fE0(-1, s, n, n2, n3, f2), 1.0f);
        s = 1420;
        n = 2;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1420;
        n = 2;
        n2 = 16;
        f3 = 83.333336f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1420;
        n = 2;
        n2 = 16;
        f3 = 166.66667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1568;
        n = 1;
        n2 = 16;
        f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        this.E8 = pk_1.el(pw_110.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)), this.EN(16, 2, 6, 0.0f, 0.032f, 0.30004883f, 0.0f)).xi0(this.tP(0.25f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


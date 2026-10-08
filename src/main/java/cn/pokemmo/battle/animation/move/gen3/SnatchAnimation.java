/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.ze0
 */
/**
 * 宝可梦对战技能招式动画 - 抢夺 (Snatch)
 * 技能编号: 289
 * 原始类: f.ze0_2
 */
public class SnatchAnimation
extends MU {
    public SnatchAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        pw_1 pw_12;
        SnatchAnimation ze0_22 = this;
        SnatchAnimation ze0_23 = this;
        short s = 1421;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = ze0_23.Vz0;
        this.E8 = pw_12 = FB.zd0(0.6f).xi0(ze0_23.i6((byte)2, s, n, n2, f, f2, pF)).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        ze0_22.Vs.jH(this.E8);
        return ze0_22;
    }

    @Override
    public final MU us() {
        int n = 1452;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1510;
        n2 = 1;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1543;
        n2 = 2;
        n3 = 2;
        f = 1166.6666f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(456));
        n = 456;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.25f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 456;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 456;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.25f;
        this.E8 = N4.zr(N4.zr(A2.Kj0(pw_17, this.fE0(-1, n, n2, n3, n4, f2), 0.12f).xi0(this.df0(14, 3)).mz0().mz0().TD0().p1(0.68f).Xf0().xi0(this.Wt(1, 0.4f)), this.dA0(456, 1, 9, 11, 0.25f, 240.0f), 1.06f).xi0(this.tP(0.4f)), this.dA0(456, 1, 11, 9, 0.25f, 168.0f), 1.38f).xi0(this.df0(14, 4)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


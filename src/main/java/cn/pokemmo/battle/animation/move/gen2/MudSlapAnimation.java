/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.n9
 */
/**
 * 宝可梦对战技能招式动画 - 掷泥 (MudSlap)
 * 技能编号: 189
 * 原始类: f.n9_0
 */
public class MudSlapAnimation
extends MU {
    public MudSlapAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1480;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1407;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 1500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 833.3333f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 916.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 1083.3334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_19 = A2.Kj0(pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(355)), this.dA0(355, 1, 9, 11, 0.5f, 0.0f), 0.4f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(0.72f).Xf0();
        n = 355;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.064f, -0.19995117f, 0.19995117f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


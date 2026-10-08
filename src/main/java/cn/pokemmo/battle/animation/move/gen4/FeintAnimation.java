/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Pc
 */
/**
 * 宝可梦对战技能招式动画 - 佯攻 (Feint)
 * 技能编号: 364
 * 原始类: f.pc_0
 */
public class FeintAnimation
extends MU {
    public FeintAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1421;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 2;
        n3 = 16;
        f = 250.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 916.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(538));
        n = 538;
        n2 = 4;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 538;
        n2 = 5;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 538;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = A2.Kj0(pw_17, this.fE0(-1, n, n2, n3, n4, f2), 0.2f);
        n = 538;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 538;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 538;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)).mz0().mz0().TD0().p1(1.0f).Xf0().xi0(this.EN(16, 2, 7, 0.0f, 0.048f, 0.30004883f, 0.0f)), this.Xq0(16, 2, 1, 0.016f, 0.032f, -0.19995117f, 0.19995117f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


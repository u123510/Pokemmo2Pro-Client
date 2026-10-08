/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 双踢 (DoubleKick)
 * 技能编号: 24
 * 原始类: f.AJ0
 */
public class DoubleKickAnimation
extends MU {
    public DoubleKickAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n;
        int n2;
        int n3;
        int n4;
        float f;
        float f2;
        PF pF;
        pw_1 pw_12 = pw_1.xC().Xf0().mz0().Xf0().y80(this.Qh0(186));
        n = 186;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, n, n2, n3, n4, f));
        n = 1421;
        n2 = 1;
        n3 = 16;
        f2 = 0.0f;
        f = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1424;
        n2 = 2;
        n3 = 16;
        f2 = 0.0f;
        f = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_15 = A2.Kj0(pw_14, this.i6((byte)2, (short)n, n2, n3, f2, f, pF), 0.12f).xi0(this.nM(16, 1));
        n = 186;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f));
        n = 186;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f = 0.5f;
        pw_1 pw_17 = N4.zr(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f)), this.Xq0(16, 2, 1, 0.0f, 0.096f, -0.19995117f, 0.19995117f), 0.32f);
        n = 186;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f2 = 0.0f;
        f = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1424;
        n2 = 1;
        n3 = 16;
        f2 = 0.0f;
        f = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_110 = N4.zr(pw_19, this.i6((byte)2, (short)n, n2, n3, f2, f, pF), 0.52f);
        n = 186;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f));
        n = 186;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f = 0.5f;
        this.E8 = pk_1.el(pw_111.xi0(this.fE0(-1, n, n2, n3, n4, f)), this.Xq0(16, 2, 1, 0.0f, 0.096f, -0.19995117f, 0.19995117f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


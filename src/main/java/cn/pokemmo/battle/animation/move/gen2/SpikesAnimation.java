/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 撒菱 (Spikes)
 * 技能编号: 191
 * 原始类: f.J3
 */
public class SpikesAnimation
extends MU {
    public SpikesAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1421;
        int n2 = 1;
        int n3 = 14;
        float f = 166.66667f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.nM(18, 1)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 1;
        n3 = 14;
        f = 333.33334f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 1;
        n3 = 14;
        f = 500.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1436;
        n2 = 2;
        n3 = 16;
        f = 500.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1436;
        n2 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1436;
        n2 = 2;
        n3 = 16;
        f = 833.3333f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_17 = N4.zr(A2.Kj0(pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(357)).p1(0.8f), this.dA0(357, 0, 9, 1, 0.25f, 240.0f), 0.2f), this.dA0(357, 0, 9, 1, 0.25f, 240.0f), 0.4f).xi0(this.dA0(357, 0, 9, 1, 0.25f, 240.0f));
        n = 357;
        n2 = 1;
        n3 = 1;
        int n4 = 8;
        f2 = 0.25f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 357;
        n2 = 2;
        n3 = 1;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_19 = N4.zr(N4.zr(pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2)).p1(0.8f), this.dA0(357, 0, 9, 0, 0.25f, 240.0f), 0.6f), this.dA0(357, 0, 9, 0, 0.25f, 240.0f), 0.8f).xi0(this.dA0(357, 0, 9, 0, 0.25f, 240.0f));
        n = 357;
        n2 = 1;
        n3 = 0;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 357;
        n2 = 2;
        n3 = 0;
        n4 = 8;
        f2 = 0.25f;
        this.E8 = pk_1.el(pw_110, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(18, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


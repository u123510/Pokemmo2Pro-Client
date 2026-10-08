/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.xK
 */
/**
 * 宝可梦对战技能招式动画 - 骨头回力镖 (Bonemerang)
 * 技能编号: 155
 * 原始类: f.xk_1
 */
public class BonemerangAnimation
extends MU {
    public BonemerangAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1531;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.nM(14, 1)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 2;
        n3 = 14;
        f = 83.333336f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 2;
        n3 = 14;
        f = 166.66667f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 2;
        n3 = 14;
        f = 250.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 2;
        n3 = 14;
        f = 333.33334f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 2;
        n3 = 14;
        f = 416.66666f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 640.0f, 320.0f));
        n = 1532;
        n2 = 1;
        n3 = 16;
        f = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 2;
        n3 = 16;
        f = 583.3333f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 2;
        n3 = 16;
        f = 750.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 1;
        n3 = 16;
        f = 833.3333f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(319)).xi0(this.dA0(319, 0, 9, 11, 0.5f, 240.0f));
        n = 319;
        n2 = 1;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(A2.Kj0(pw_112, this.fE0(-1, n, n2, n3, n4, f2), 0.4f).xi0(this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f)), this.dA0(319, 0, 11, 9, 0.25f, 240.0f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


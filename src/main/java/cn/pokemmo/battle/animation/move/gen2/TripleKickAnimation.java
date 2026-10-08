/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.rv
 */
/**
 * 宝可梦对战技能招式动画 - 三连踢 (TripleKick)
 * 技能编号: 167
 * 原始类: f.rv_2
 */
public class TripleKickAnimation
extends MU {
    public TripleKickAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        TripleKickAnimation rv_22 = this;
        TripleKickAnimation rv_23 = this;
        short s = 1560;
        int n = 0;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = rv_23.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(rv_23.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(333));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = A2.Kj0(pw_13, this.fE0(-1, 333, s, n, n2, f), 0.04f);
        TripleKickAnimation rv_24 = this;
        s = 1420;
        n = 1;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = rv_24.Vz0;
        pw_1 pw_15 = pw_14.xi0(rv_24.i6((byte)2, s, n, n2, f, f2, pF));
        TripleKickAnimation rv_25 = this;
        s = 1475;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.78125f;
        pF = rv_25.Vz0;
        pw_1 pw_16 = pw_15.xi0(rv_25.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Xq0(16, 2, 1, 0.032f, 0.032f, -0.30004883f, 0.30004883f)).xi0(this.nM(14, 1));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 333, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(pw_17, this.fE0(-1, 333, s, n, n2, f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        rv_22.Vs.jH(this.E8);
        rv_22.Vc();
        return rv_22;
    }
}


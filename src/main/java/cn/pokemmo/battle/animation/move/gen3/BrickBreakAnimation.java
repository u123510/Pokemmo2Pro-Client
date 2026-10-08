/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 劈瓦 (BrickBreak)
 * 技能编号: 280
 * 原始类: f.Ur0
 */
public class BrickBreakAnimation
extends MU {
    public BrickBreakAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        pw_1 pw_12;
        BrickBreakAnimation ur0 = this;
        BrickBreakAnimation ur02 = this;
        short s = 1476;
        int n = 2;
        int n2 = 16;
        float f = 250.0f;
        float f2 = 0.859375f;
        PF pF = ur02.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(ur02.i6((byte)2, s, n, n2, f, f2, pF));
        BrickBreakAnimation ur03 = this;
        s = 1421;
        n = 1;
        n2 = 16;
        f = 1000.0f;
        f2 = 0.9375f;
        pF = ur03.Vz0;
        pw_1 pw_14 = pw_13.xi0(ur03.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(446));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 446, s, n, n2, f));
        s = 2;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_16 = A2.Kj0(pw_15, this.fE0(-1, 446, s, n, n2, f), 1.2f);
        BrickBreakAnimation ur04 = this;
        s = 1424;
        n = 1;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = ur04.Vz0;
        pw_1 pw_17 = pw_16.xi0(ur04.i6((byte)2, s, n, n2, f, f2, pF));
        BrickBreakAnimation ur05 = this;
        s = 1420;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.78125f;
        pF = ur05.Vz0;
        this.E8 = pw_12 = pk_1.el(pw_17, ur05.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        ur0.Vs.jH(this.E8);
        return ur0;
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BrickBreakAnimation ur0 = this;
        BrickBreakAnimation ur02 = this;
        short s = 1421;
        int n = 1;
        int n2 = 16;
        float f = 1000.0f;
        float f2 = 0.9375f;
        PF pF = ur02.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).xi0(ur02.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(447));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 447, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 447, s, n, n2, f));
        s = 2;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 447, s, n, n2, f));
        s = 3;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 447, s, n, n2, f));
        s = 4;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, 447, s, n, n2, f));
        BrickBreakAnimation ur03 = this;
        s = 1516;
        n = 1;
        n2 = 16;
        f = 1000.0f;
        f2 = 0.9375f;
        pF = ur03.Vz0;
        pw_1 pw_19 = pw_18.xi0(ur03.i6((byte)2, s, n, n2, f, f2, pF));
        BrickBreakAnimation ur04 = this;
        s = 1420;
        n = 2;
        n2 = 16;
        f = 1000.0f;
        f2 = 0.78125f;
        pF = ur04.Vz0;
        this.E8 = pw_12 = HB.p30(pw_19, ur04.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        ur0.Vs.jH(this.E8);
        ur0.Vc();
        return ur0;
    }
}


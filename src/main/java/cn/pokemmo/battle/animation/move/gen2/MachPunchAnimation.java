/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 音速拳 (MachPunch)
 * 技能编号: 183
 * 原始类: f.S7
 */
public class MachPunchAnimation
extends MU {
    public MachPunchAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1425;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 800.0f, 160.0f));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 320.0f));
        n = 1421;
        n2 = 2;
        n3 = 16;
        f = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(349));
        n = 349;
        n2 = 3;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = A2.Kj0(pw_15, this.fE0(-1, n, n2, n3, n4, f2), 0.04f);
        n = 349;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = N4.zr(pw_16, this.fE0(-1, n, n2, n3, n4, f2), 0.14f);
        n = 349;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 349;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.048f, -0.19995117f, 0.19995117f)).mz0().mz0().mz0().Xf0().xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.e0
 */
/**
 * 宝可梦对战技能招式动画 - 百万吨重拳 (MegaPunch)
 * 技能编号: 5
 * 原始类: f.e0_0
 */
public class MegaPunchAnimation
extends MU {
    public MegaPunchAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1421;
        int n2 = 2;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1424;
        n2 = 1;
        n3 = 16;
        f = 166.66667f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.025f)).y80(this.Qh0(165));
        n = 165;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 165;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 165;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 165;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)).TD0().p1(0.16f).Xf0().xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 4, 0.016f, 0.032f, 0.39990234f, -0.19995117f)).mz0().mz0().mz0().Xf0().xi0(this.nM(16, 0)).xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.075f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


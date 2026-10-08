/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Xg0
 */
/**
 * 宝可梦对战技能招式动画 - 魔法叶 (MagicalLeaf)
 * 技能编号: 345
 * 原始类: f.xg0_0
 */
public class MagicalLeafAnimation
extends MU {
    public MagicalLeafAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1413;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1412;
        n2 = 2;
        n3 = 14;
        f = 166.66667f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1414;
        n2 = 1;
        n3 = 14;
        f = 333.33334f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 480.0f, 640.0f));
        n = 1415;
        n2 = 1;
        n3 = 16;
        f = 1166.6666f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1415;
        n2 = 2;
        n3 = 16;
        f = 1416.6666f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1415;
        n2 = 1;
        n3 = 16;
        f = 1500.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(518)).xi0(this.dA0(518, 0, 9, 11, 0.5f, 0.0f));
        n = 518;
        n2 = 1;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = A2.Kj0(pw_18, this.fE0(-1, n, n2, n3, n4, f2), 1.6f).xi0(this.Wt(1, 0.4f));
        n = 1420;
        n2 = 2;
        n3 = 16;
        float f3 = 0.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f3 = 83.333336f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f3 = 166.66667f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f3 = 250.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_113 = pw_112.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 518;
        n2 = 2;
        n3 = 11;
        int n5 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_113.xi0(this.fE0(-1, n, n2, n3, n5, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 4, 0.016f, 0.032f, -0.19995117f, 0.19995117f)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


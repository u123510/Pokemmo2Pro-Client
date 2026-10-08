/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Bj
 */
/**
 * 宝可梦对战技能招式动画 - 山岚摔 (StormThrow)
 * 技能编号: 480
 * 原始类: f.bj_0
 */
public class StormThrowAnimation
extends MU {
    public StormThrowAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1804;
        int n2 = 1;
        int n3 = 16;
        float f = 166.66667f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1804;
        n2 = 1;
        n3 = 16;
        f = 500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f = 1216.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f = 1283.3334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Xq0(14, 2, 3, 0.016f, 0.064f, 0.30004883f, -0.30004883f)).y80(this.Qh0(651)).xi0(this.nM(14, 1));
        n = 651;
        n2 = 2;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 651;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = A2.Kj0(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.Xq0(16, 2, 3, 0.016f, 0.064f, -0.39990234f, 0.5f), 0.9f);
        n = 651;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 651;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = N4.zr(pw_18, this.fE0(-1, n, n2, n3, n4, f2), 0.96f);
        n = 651;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 651;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        this.E8 = pk_1.el(pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.Xq0(16, 2, 1, 0.016f, 0.064f, 0.39990234f, -0.5f)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


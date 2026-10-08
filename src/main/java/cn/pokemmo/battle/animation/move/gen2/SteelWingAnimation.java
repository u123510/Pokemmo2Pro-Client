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

/*
 * Renamed from f.pe
 */
/**
 * 宝可梦对战技能招式动画 - 钢翼 (SteelWing)
 * 技能编号: 211
 * 原始类: f.pe_2
 */
public class SteelWingAnimation
extends MU {
    public SteelWingAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1438;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).mz0().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1438;
        n = 2;
        n2 = 14;
        f = 166.66667f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(377));
        s = 377;
        n = 0;
        n2 = 9;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = A2.Kj0(pw_13, this.fE0(-1, s, n, n2, n3, f2), 0.8f);
        s = 377;
        n = 1;
        n2 = 9;
        n3 = 11;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 377;
        n = 2;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = N4.zr(pw_15, this.fE0(-1, s, n, n2, n3, f2), 1.8f);
        s = 1421;
        n = 1;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1421;
        n = 2;
        n2 = 16;
        f3 = 83.333336f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1421;
        n = 1;
        n2 = 16;
        f3 = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1436;
        n = 2;
        n2 = 16;
        f3 = 250.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1436;
        n = 1;
        n2 = 16;
        f3 = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        this.E8 = pw_110.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 3, 0.016f, 0.032f, 0.30004883f, -0.30004883f)).mz0().mz0().mz0().Xf0().p1(0.6f).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


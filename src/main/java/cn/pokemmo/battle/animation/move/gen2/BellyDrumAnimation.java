/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 腹鼓 (BellyDrum)
 * 技能编号: 187
 * 原始类: f.Jx0
 */
public class BellyDrumAnimation
extends MU {
    public BellyDrumAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1525;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1525;
        n2 = 2;
        n3 = 14;
        f = 166.66667f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1525;
        n2 = 1;
        n3 = 14;
        f = 333.33334f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1525;
        n2 = 2;
        n3 = 14;
        f = 500.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(353));
        n = 353;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 353;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 353;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = HB.p30(pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(14, 1)), this.Xq0(14, 2, 3, 0.016f, 0.048f, 0.19995117f, -0.19995117f)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


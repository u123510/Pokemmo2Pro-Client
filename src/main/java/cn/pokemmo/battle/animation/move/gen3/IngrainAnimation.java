/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.eg0
 */
/**
 * 宝可梦对战技能招式动画 - 扎根 (Ingrain)
 * 技能编号: 275
 * 原始类: f.eg0_2
 */
public class IngrainAnimation
extends MU {
    public IngrainAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1441;
        int n2 = 1;
        int n3 = 14;
        float f = 166.66667f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1441;
        n2 = 2;
        n3 = 14;
        f = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1441;
        n2 = 1;
        n3 = 14;
        f = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1828;
        n2 = 1;
        n3 = 14;
        f = 1000.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1828;
        n2 = 2;
        n3 = 14;
        f = 1333.3334f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1828;
        n2 = 1;
        n3 = 14;
        f = 1700.0f;
        f2 = 0.0625f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(440)).y80(this.Qh0(441));
        n = 440;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.25f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 440;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.0f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 440;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.0f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 441;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f2 = 0.0f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 441;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.0f;
        this.E8 = HB.p30(pw_111, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


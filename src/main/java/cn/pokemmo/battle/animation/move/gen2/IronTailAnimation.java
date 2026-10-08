/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.Vf0
 */
/**
 * 宝可梦对战技能招式动画 - 铁尾 (IronTail)
 * 技能编号: 231
 * 原始类: f.vf0_0
 */
public class IronTailAnimation
extends MU {
    public IronTailAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1449;
        int n2 = 1;
        int n3 = 14;
        float f = 116.666664f;
        float f2 = 0.546875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1701;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(397));
        n = 397;
        n2 = 2;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = HB.p30(pw_13, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.Wt(1, 0.4f)).mz0().Xf0();
        n = 1442;
        n2 = 2;
        n3 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f3 = 166.66667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1436;
        n2 = 0;
        n3 = 16;
        f3 = 116.666664f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 2, 0.016f, 0.032f, 0.19995117f, -0.19995117f));
        n = 397;
        n2 = 3;
        n3 = 11;
        int n5 = 8;
        f2 = 0.25f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 397;
        n2 = 1;
        n3 = 11;
        n5 = 8;
        f2 = 0.25f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 397;
        n2 = 0;
        n3 = 11;
        n5 = 8;
        f2 = 0.125f;
        this.E8 = HB.p30(pw_19, this.fE0(-1, n, n2, n3, n5, f2)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


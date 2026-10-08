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
 * Renamed from f.rL0
 */
/**
 * 宝可梦对战技能招式动画 - 纹理２ (Conversion2)
 * 技能编号: 176
 * 原始类: f.rl0_1
 */
public class Conversion2Animation
extends MU {
    public Conversion2Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 343;
        int n2 = 0;
        int n3 = 11;
        int n4 = 8;
        float f = 0.5f;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.Qh0(343)).xi0(this.fE0(-1, n, n2, n3, n4, f));
        n = 1358;
        n2 = 1;
        n3 = 14;
        float f2 = 0.0f;
        f = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1471;
        n2 = 2;
        n3 = 16;
        f2 = 833.3333f;
        f = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1447;
        n2 = 1;
        n3 = 16;
        f2 = 833.3333f;
        f = 0.625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1473;
        n2 = 2;
        n3 = 16;
        f2 = 1833.3334f;
        f = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1478;
        n2 = 1;
        n3 = 16;
        f2 = 2000.0f;
        f = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_17 = A2.Kj0(pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF)).xi0(this.Wt(1, 0.4f)), this.dA0(343, 1, 11, 9, 0.5f, 0.0f), 1.2f).xi0(this.Wt(0, 0.4f)).xi0(this.nM(16, 1)).mz0().mz0().TD0().p1(1.6f).Xf0();
        n = 343;
        n2 = 2;
        n3 = 9;
        int n5 = 8;
        f = 0.5f;
        this.E8 = pk_1.el(pw_17.xi0(this.fE0(-1, n, n2, n3, n5, f)), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.19995117f, -0.19995117f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


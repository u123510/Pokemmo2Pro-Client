/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Ve
 */
/**
 * 宝可梦对战技能招式动画 - 猛撞 (TakeDown)
 * 技能编号: 36
 * 原始类: f.ve_0
 */
public class TakeDownAnimation
extends MU {
    public TakeDownAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1421;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = A2.Kj0(pw_1.xC().Xf0(), this.i6((byte)2, (short)n, n2, n3, f, f2, pF), 0.08f).xi0(this.Wt(1, 0.25f)).y80(this.E2(18, true)).mz0().mz0().TD0().p1(0.16f).Xf0();
        n = 1424;
        n2 = 1;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(198));
        n = 198;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 198;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 198;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 198;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.064f, 0.30004883f, -0.30004883f)).y80(this.E2(18, false)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


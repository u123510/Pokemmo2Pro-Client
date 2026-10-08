/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 冰雹 (Hail)
 * 技能编号: 258
 * 原始类: f.ME0
 */
public class HailAnimation
extends MU {
    public HailAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1820;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0(), this.Ue0(4, 0, 0.0f, 0.8125f, 0.075f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 320.0f, 320.0f));
        n = 1700;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1700;
        n2 = 2;
        n3 = 14;
        f = 500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1700;
        n2 = 2;
        n3 = 14;
        f = 1000.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(424));
        n = 424;
        n2 = 0;
        n3 = 0;
        int n4 = 0;
        f2 = 1.25f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 424;
        n2 = 2;
        n3 = 0;
        n4 = 0;
        f2 = 1.5f;
        pw_1 pw_17 = A2.Kj0(pw_16, this.fE0(-1, n, n2, n3, n4, f2), 0.4f);
        n = 424;
        n2 = 1;
        n3 = 0;
        n4 = 0;
        f2 = 1.5f;
        this.E8 = Zw0.H(pk_1.el(pw_17, this.fE0(-1, n, n2, n3, n4, f2)), this.Ue0(4, 0, 0.8125f, 0.0f, 0.075f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


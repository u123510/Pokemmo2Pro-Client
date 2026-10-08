/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 金属音 (MetalSound)
 * 技能编号: 319
 * 原始类: f.Yz0
 */
public class MetalSoundAnimation
extends MU {
    public MetalSoundAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1870;
        int n2 = 1;
        int n3 = 14;
        float f = 166.66667f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().y80(this.E2(18, true)).xi0(this.Wt(0, 0.3f)), this.Ue0(4, 0, 0.0f, 0.75f, 0.1f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1870;
        n2 = 1;
        n3 = 14;
        f = 300.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1870;
        n2 = 1;
        n3 = 14;
        f = 433.33334f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1870;
        n2 = 1;
        n3 = 14;
        f = 566.6667f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1870;
        n2 = 1;
        n3 = 16;
        f = 700.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1836;
        n2 = 0;
        n3 = 16;
        f = 700.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1435;
        n2 = 2;
        n3 = 14;
        f = 166.66667f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_18 = A2.Kj0(pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 640.0f, 480.0f)).y80(this.Qh0(489)), this.dA0(489, 0, 9, 11, 0.5f, 552.0f), 0.3f).xi0(this.Wt(1, 0.25f)).mz0().mz0().TD0().p1(0.6f).Xf0();
        n = 489;
        n2 = 1;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_18, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.1f)).xi0(this.tP(0.3f)).y80(this.E2(18, false)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


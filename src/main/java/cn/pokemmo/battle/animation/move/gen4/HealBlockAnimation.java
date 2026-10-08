/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.dL0
 */
/**
 * 宝可梦对战技能招式动画 - 回复封锁 (HealBlock)
 * 技能编号: 377
 * 原始类: f.dl0_1
 */
public class HealBlockAnimation
extends MU {
    public HealBlockAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        HealBlockAnimation dl0_12 = this;
        HealBlockAnimation dl0_13 = this;
        short s = 1517;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = dl0_13.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(dl0_13.i6((byte)2, s, n, n2, f, f2, pF));
        HealBlockAnimation dl0_14 = this;
        s = 1518;
        n = 2;
        n2 = 16;
        f = 750.0f;
        f2 = 0.703125f;
        pF = dl0_14.Vz0;
        pw_1 pw_14 = pw_13.xi0(dl0_14.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(552));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(A2.Kj0(pw_14, this.fE0(-1, 552, s, n, n2, f), 0.6f).xi0(this.Ue0(4, 15855, 0.0f, 0.75f, 0.025f)).xi0(this.nM(16, 1)), this.WW(16, 0.25f, 0.0f, 0.625f, px_1.ep0(0))).xi0(this.WW(16, 0.25f, 0.625f, 0.0f, px_1.ep0(0))).xi0(this.nM(16, 0)).xi0(this.Ue0(4, 15855, 0.75f, 0.0f, 0.025f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        dl0_12.Vs.jH(this.E8);
        dl0_12.Vc();
        return dl0_12;
    }
}


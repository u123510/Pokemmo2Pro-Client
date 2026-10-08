/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 劈开 (Slash)
 * 技能编号: 163
 * 原始类: f.EW
 */
public class SlashAnimation
extends MU {
    public SlashAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        SlashAnimation eW = this;
        SlashAnimation eW2 = this;
        int n = 1725;
        int n2 = 2;
        int n3 = 16;
        float f = 100.0f;
        float f2 = 0.859375f;
        PF pF = eW2.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(eW2.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        SlashAnimation eW3 = this;
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 166.66667f;
        f2 = 0.46875f;
        pF = eW3.Vz0;
        pw_1 pw_14 = pw_13.xi0(eW3.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(329));
        n = 0;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 329, n, n2, n3, f));
        n = 1;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 329, n, n2, n3, f));
        n = 2;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 329, n, n2, n3, f));
        n = 3;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_17.xi0(this.fE0(-1, 329, n, n2, n3, f)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.19995117f, -0.19995117f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        eW.Vs.jH(this.E8);
        eW.Vc();
        return eW;
    }
}


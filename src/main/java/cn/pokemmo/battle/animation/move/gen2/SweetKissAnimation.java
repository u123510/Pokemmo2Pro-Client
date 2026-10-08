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
 * 宝可梦对战技能招式动画 - 天使之吻 (SweetKiss)
 * 技能编号: 186
 * 原始类: f.FE0
 */
public class SweetKissAnimation
extends MU {
    public SweetKissAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        SweetKissAnimation fE0 = this;
        SweetKissAnimation fE02 = this;
        short s = 1723;
        int n = 2;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9765625f;
        PF pF = fE02.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).xi0(fE02.i6((byte)2, s, n, n2, f, f2, pF));
        SweetKissAnimation fE03 = this;
        s = 1723;
        n = 1;
        n2 = 16;
        f = 333.33334f;
        f2 = 0.390625f;
        pF = fE03.Vz0;
        pw_1 pw_14 = pw_13.xi0(fE03.i6((byte)2, s, n, n2, f, f2, pF));
        SweetKissAnimation fE04 = this;
        s = 1358;
        n = 2;
        n2 = 16;
        f = 1666.6666f;
        f2 = 0.859375f;
        pF = fE04.Vz0;
        pw_1 pw_15 = pw_14.xi0(fE04.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(14, 1)).y80(this.Qh0(352));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 352, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_16, this.fE0(-1, 352, s, n, n2, f)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        fE0.Vs.jH(this.E8);
        fE0.Vc();
        return fE0;
    }
}


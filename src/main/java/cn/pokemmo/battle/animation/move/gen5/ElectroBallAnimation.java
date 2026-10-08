/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 电球 (ElectroBall)
 * 技能编号: 486
 * 原始类: f.s9
 */
public class ElectroBallAnimation
extends MU {
    public ElectroBallAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 656;
        int n = 2;
        int n2 = 9;
        int n3 = 8;
        float f = 1.0f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().y80(this.Qh0(656)).xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 656;
        n = 5;
        n2 = 9;
        n3 = 8;
        f = 1.0f;
        pw_1 pw_13 = A2.Kj0(pw_12, this.fE0(-1, s, n, n2, n3, f), 0.4f);
        s = 656;
        n = 1;
        n2 = 9;
        n3 = 8;
        f = 0.75f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.0f, 0.032f, 0.100097656f, -0.100097656f));
        s = 1522;
        n = 1;
        n2 = 14;
        float f2 = 0.0f;
        f = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1427;
        n = 1;
        n2 = 14;
        f2 = 1166.6666f;
        f = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = N4.zr(pw_15, this.i6((byte)2, s, n, n2, f2, f, pF), 1.8f).xi0(this.dA0(656, 0, 9, 11, 0.5f, 360.0f)).xi0(this.dA0(656, 3, 9, 11, 0.5f, 360.0f)).xi0(this.Wt(1, 0.4f));
        s = 656;
        n = 4;
        n2 = 11;
        int n4 = 8;
        f = 0.5f;
        pw_1 pw_17 = N4.zr(pw_16, this.fE0(-1, s, n, n2, n4, f), 2.2f).xi0(this.Xq0(16, 2, 16, 0.0f, 0.048f, 0.100097656f, -0.100097656f));
        s = 1849;
        n = 2;
        n2 = 16;
        float f3 = 0.0f;
        f = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, s, n, n2, f3, f, pF));
        s = 1522;
        n = 1;
        n2 = 16;
        f3 = 500.0f;
        f = 0.78125f;
        pF = this.Vz0;
        this.E8 = pw_18.xi0(this.i6((byte)2, s, n, n2, f3, f, pF)).xi0(this.nM(16, 0)).mz0().mz0().mz0().Xf0().xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


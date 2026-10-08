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
 * Renamed from f.kJ
 */
/**
 * 宝可梦对战技能招式动画 - 封印 (Imprison)
 * 技能编号: 286
 * 原始类: f.kj_1
 */
public class ImprisonAnimation
extends MU {
    public ImprisonAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        ImprisonAnimation kj_12 = this;
        ImprisonAnimation kj_13 = this;
        int n = 1421;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = kj_13.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).xi0(kj_13.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        ImprisonAnimation kj_14 = this;
        n = 1448;
        n2 = 2;
        n3 = 16;
        f = 416.66666f;
        f2 = 0.9375f;
        pF = kj_14.Vz0;
        pw_1 pw_14 = pw_13.xi0(kj_14.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        ImprisonAnimation kj_15 = this;
        n = 1478;
        n2 = 1;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.859375f;
        pF = kj_15.Vz0;
        pw_1 pw_15 = pw_14.xi0(kj_15.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(453));
        n = 3;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 453, n, n2, n3, f));
        n = 2;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 453, n, n2, n3, f));
        n = 4;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, 453, n, n2, n3, f));
        n = 0;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, 453, n, n2, n3, f));
        n = 1;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_19, this.fE0(-1, 453, n, n2, n3, f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        kj_12.Vs.jH(this.E8);
        kj_12.Vc();
        return kj_12;
    }
}


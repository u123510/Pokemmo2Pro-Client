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
 * 宝可梦对战技能招式动画 - 折弯汤匙 (Kinesis)
 * 技能编号: 134
 * 原始类: f.DV
 */
public class KinesisAnimation
extends MU {
    public KinesisAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        KinesisAnimation dV = this;
        KinesisAnimation dV2 = this;
        short s = 1478;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = dV2.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).xi0(dV2.i6((byte)2, s, n, n2, f, f2, pF));
        KinesisAnimation dV3 = this;
        s = 1461;
        n = 2;
        n2 = 14;
        f = 1166.6666f;
        f2 = 0.9375f;
        pF = dV3.Vz0;
        pw_1 pw_14 = pw_13.xi0(dV3.i6((byte)2, s, n, n2, f, f2, pF));
        KinesisAnimation dV4 = this;
        s = 1452;
        n = 1;
        n2 = 14;
        f = 1500.0f;
        f2 = 0.78125f;
        pF = dV4.Vz0;
        pw_1 pw_15 = pw_14.xi0(dV4.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(299));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 299, s, n, n2, f));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_16, this.fE0(-1, 299, s, n, n2, f)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        dV.Vs.jH(this.E8);
        dV.Vc();
        return dV;
    }
}


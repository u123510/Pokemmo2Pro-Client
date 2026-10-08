/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.xb0
 */
/**
 * 宝可梦对战技能招式动画 - 电网 (Electroweb)
 * 技能编号: 527
 * 原始类: f.xb0_2
 */
public class ElectrowebAnimation
extends MU {
    public ElectrowebAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 692;
        int n2 = 3;
        int n3 = 11;
        int n4 = 8;
        float f = 0.5f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(2, 0, 0.0f, 0.5f, 0.075f)).xi0(this.Wt(1, 0.4f)).y80(this.Qh0(692)).xi0(this.fE0(-1, n, n2, n3, n4, f));
        n = 692;
        n2 = 4;
        n3 = 11;
        n4 = 8;
        f = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, n, n2, n3, n4, f));
        n = 1759;
        n2 = 3;
        n3 = 16;
        float f2 = 166.66667f;
        f = 0.3125f;
        PF pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1522;
        n2 = 1;
        n3 = 16;
        f2 = 1000.0f;
        f = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1491;
        n2 = 2;
        n3 = 16;
        f2 = 666.6667f;
        f = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.0f, 0.032f, 0.100097656f, -0.100097656f));
        n = 692;
        n2 = 0;
        n3 = 11;
        int n5 = 8;
        f = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n5, f));
        n = 692;
        n2 = 1;
        n3 = 11;
        n5 = 8;
        f = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n5, f));
        n = 692;
        n2 = 2;
        n3 = 11;
        n5 = 8;
        f = 0.5f;
        this.E8 = HB.p30(pw_18, this.fE0(-1, n, n2, n3, n5, f)).xi0(this.nM(16, 0)).xi0(this.Ue0(2, 0, 0.5f, 0.0f, 0.075f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


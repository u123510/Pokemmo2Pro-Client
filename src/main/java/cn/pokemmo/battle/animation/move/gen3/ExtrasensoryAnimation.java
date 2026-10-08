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
 * Renamed from f.nk0
 */
/**
 * 宝可梦对战技能招式动画 - 神通力 (Extrasensory)
 * 技能编号: 326
 * 原始类: f.nk0_2
 */
public class ExtrasensoryAnimation
extends MU {
    public ExtrasensoryAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1450;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.46875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)), this.Ue0(4, 0, 0.0f, 0.75f, 0.025f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 480.0f, 480.0f));
        s = 1467;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(496));
        s = 496;
        n = 0;
        n2 = 9;
        int n3 = 8;
        f2 = 0.4f;
        pw_1 pw_15 = HB.p30(pw_14, this.fE0(-1, s, n, n2, n3, f2));
        s = 1501;
        n = 1;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1429;
        n = 2;
        n2 = 14;
        f3 = 1000.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        this.E8 = pw_16.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.nM(16, 1)).xi0(this.EN(16, 2, 10, 0.0f, 0.032f, 0.5f, 0.0f)).mz0().Xf0().TD0().p1(0.4f).Xf0().xi0(this.Xq0(14, 2, 20, 0.0f, 0.016f, 0.19995117f, 0.19995117f)).xi0(this.nM(16, 0)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.025f)).p1(0.6f).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


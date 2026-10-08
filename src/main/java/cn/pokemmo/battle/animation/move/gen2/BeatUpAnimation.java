/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.ew
 */
/**
 * 宝可梦对战技能招式动画 - 围攻 (BeatUp)
 * 技能编号: 251
 * 原始类: f.ew_2
 */
public class BeatUpAnimation
extends MU {
    public BeatUpAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BeatUpAnimation ew_22 = this;
        BeatUpAnimation ew_23 = this;
        short s = 1420;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = ew_23.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(ew_23.i6((byte)2, s, n, n2, f, f2, pF));
        BeatUpAnimation ew_24 = this;
        s = 1424;
        n = 2;
        n2 = 16;
        f = 83.333336f;
        f2 = 0.78125f;
        pF = ew_24.Vz0;
        pw_1 pw_14 = pw_13.xi0(ew_24.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(417));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_14.xi0(this.fE0(-1, 417, s, n, n2, f)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.048f, -0.19995117f, 0.19995117f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        ew_22.Vs.jH(this.E8);
        ew_22.Vc();
        return ew_22;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 啄钻 (DrillPeck)
 * 技能编号: 65
 * 原始类: f.YG0
 */
public class DrillPeckAnimation
extends MU {
    public DrillPeckAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1489;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(FB.zd0(0.6f), this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(14, 1)).xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.EN(14, 2, 8, 0.016f, 0.032f, 0.19995117f, 0.0f)).y80(this.Qh0(226));
        s = 226;
        n = 0;
        n2 = 11;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 226;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 226;
        n = 2;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 8, 0.016f, 0.032f, 0.100097656f, -0.100097656f));
        s = 1883;
        n = 2;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.Sv0(2, 1, 800.0f, 160.0f));
        s = 1376;
        n = 2;
        n2 = 16;
        f3 = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1815;
        n = 1;
        n2 = 16;
        f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.Sv0(1, 1, 800.0f, 160.0f)).xi0(this.Sv0(1, 0, 0.0f, 960.0f));
        s = 1376;
        n = 1;
        n2 = 16;
        f3 = 1000.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        this.E8 = HB.p30(pw_18, this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


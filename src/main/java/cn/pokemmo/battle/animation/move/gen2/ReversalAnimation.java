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
 * Renamed from f.aD
 */
/**
 * 宝可梦对战技能招式动画 - 起死回生 (Reversal)
 * 技能编号: 179
 * 原始类: f.ad_1
 */
public class ReversalAnimation
extends MU {
    public ReversalAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1485;
        int n = 1;
        int n2 = 2;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(HB.p30(pw_1.xC().Xf0().xi0(this.Ue0(4, 31710, 0.0f, 0.75f, 0.05f)), this.i6((byte)2, s, n, n2, f, f2, pF)), this.Ue0(4, 31710, 0.75f, 0.0f, 0.05f)).xi0(this.Ue0(4, 31710, 0.0f, 0.75f, 0.05f));
        s = 1485;
        n = 1;
        n2 = 2;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = HB.p30(HB.p30(pw_12, this.i6((byte)2, s, n, n2, f, f2, pF)), this.Ue0(4, 31710, 0.75f, 0.0f, 0.05f)).xi0(this.Wt(0, 0.4f)).y80(this.Qh0(346));
        s = 346;
        n = 0;
        n2 = 9;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 1487;
        n = 1;
        n2 = 14;
        float f3 = 0.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f3 = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_16 = HB.p30(pw_15.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)), this.Sv0(1, 1, 960.0f, 320.0f));
        s = 1486;
        n = 1;
        n2 = 2;
        f3 = 250.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1432;
        n = 2;
        n2 = 2;
        f3 = 250.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_18 = HB.p30(pw_17.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.EN(14, 2, 1, 0.016f, 0.096f, 1.0f, 0.0f)), this.Ue0(4, 31710, 0.0f, 0.75f, 0.05f)).xi0(this.Ue0(4, 31710, 0.75f, 0.0f, 0.05f)).xi0(this.Wt(1, 0.35f)).mz0().Xf0();
        s = 346;
        n = 1;
        n2 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, s, n, n2, n4, f2));
        s = 346;
        n = 2;
        n2 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, s, n, n2, n4, f2)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.0f, 0.032f, -0.30004883f, 0.30004883f));
        s = 1475;
        n = 1;
        n2 = 16;
        float f4 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, s, n, n2, f4, f2, pF));
        s = 1420;
        n = 2;
        n2 = 16;
        f4 = 0.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        this.E8 = HB.p30(pw_111, this.i6((byte)2, s, n, n2, f4, f2, pF)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


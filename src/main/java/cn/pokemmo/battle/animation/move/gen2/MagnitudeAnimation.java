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
 * Renamed from f.yu0
 */
/**
 * 宝可梦对战技能招式动画 - 震级 (Magnitude)
 * 技能编号: 222
 * 原始类: f.yu0_0
 */
public class MagnitudeAnimation
extends MU {
    public MagnitudeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        MagnitudeAnimation yu0_02 = this;
        MagnitudeAnimation yu0_03 = this;
        short s = 1417;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = yu0_03.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).xi0(yu0_03.i6((byte)2, s, n, n2, f, f2, pF));
        MagnitudeAnimation yu0_04 = this;
        s = 1418;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.859375f;
        pF = yu0_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(yu0_04.i6((byte)2, s, n, n2, f, f2, pF));
        MagnitudeAnimation yu0_05 = this;
        s = 1376;
        n = 1;
        n2 = 16;
        f = 1833.3334f;
        f2 = 0.0f;
        pF = yu0_05.Vz0;
        pw_1 pw_15 = pw_14.xi0(yu0_05.i6((byte)2, s, n, n2, f, f2, pF));
        MagnitudeAnimation yu0_06 = this;
        s = 1376;
        n = 2;
        n2 = 16;
        f = 1833.3334f;
        f2 = 0.0f;
        pF = yu0_06.Vz0;
        this.E8 = pw_12 = HB.p30(pw_15.xi0(yu0_06.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 960.0f, 800.0f)).xi0(this.Sv0(2, 1, 960.0f, 800.0f)).xi0(this.nM(14, 1)), this.EN(16, 2, 12, 0.032f, 0.016f, 0.30004883f, 0.30004883f)).xi0(this.nM(14, 0)).p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        yu0_02.Vs.jH(this.E8);
        yu0_02.Vc();
        return yu0_02;
    }
}


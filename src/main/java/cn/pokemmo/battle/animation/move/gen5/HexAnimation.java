/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.Rl
 */
/**
 * 宝可梦对战技能招式动画 - 祸不单行 (Hex)
 * 技能编号: 506
 * 原始类: f.rl_0
 */
public class HexAnimation
extends MU {
    public HexAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1450;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.EN(14, 2, 3, 0.0f, 0.048f, 1.0f, 0.0f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 112.0f, 160.0f));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 333.33334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = HB.p30(pw_12, this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Wt(1, 0.4f)).y80(this.Qh0(672));
        s = 672;
        n = 1;
        n2 = 11;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 1446;
        n = 2;
        n2 = 16;
        float f3 = 333.33334f;
        f2 = 0.15625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1420;
        n = 1;
        n2 = 16;
        f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        this.E8 = HB.p30(pw_15.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 10, 0.0f, 0.032f, 0.19995117f, -0.30004883f)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


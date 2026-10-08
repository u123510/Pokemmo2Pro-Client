/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.Sx
 */
/**
 * 宝可梦对战技能招式动画 - 忍耐 (Bide)
 * 技能编号: 117
 * 原始类: f.sx_0
 */
public class BideAnimation
extends MU {
    public BideAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        float f = 1.25f;
        float f2 = 0.0f;
        float f3 = 0.625f;
        Color color = px_1.ep0(31);
        short s = 283;
        int n = 0;
        int n2 = 9;
        int n3 = 8;
        float f4 = 0.5f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.WW(14, f, f2, f3, color)).y80(this.Qh0(283)).xi0(this.fE0(-1, s, n, n2, n3, f4));
        s = 283;
        n = 1;
        n2 = 9;
        n3 = 8;
        f4 = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f4));
        s = 1418;
        n = 1;
        n2 = 14;
        float f5 = 0.0f;
        f4 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f5, f4, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f5 = 166.66667f;
        f4 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f5, f4, pF));
        s = 1418;
        n = 1;
        n2 = 14;
        f5 = 200.0f;
        f4 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f5, f4, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f5 = 366.66666f;
        f4 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f5, f4, pF));
        s = 1418;
        n = 1;
        n2 = 14;
        f5 = 400.0f;
        f4 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, s, n, n2, f5, f4, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f5 = 566.6667f;
        f4 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n, n2, f5, f4, pF));
        s = 1418;
        n = 1;
        n2 = 14;
        f5 = 600.0f;
        f4 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, s, n, n2, f5, f4, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f5 = 766.6667f;
        f4 = 0.0f;
        pF = this.Vz0;
        float f6 = 1.25f;
        float f7 = 0.625f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(31);
        this.E8 = HB.p30(pw_110.xi0(this.i6((byte)2, s, n, n2, f5, f4, pF)), this.Sv0(1, 0, 320.0f, 1600.0f)).xi0(this.WW(14, f6, f7, f8, color2)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        return this;
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BideAnimation sx_02 = this;
        this.E8 = pw_12 = pw_1.xC().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        sx_02.Vs.jH(this.E8);
        sx_02.Vc();
        return sx_02;
    }
}


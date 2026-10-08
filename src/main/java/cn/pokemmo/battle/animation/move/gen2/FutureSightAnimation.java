/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.dF
 */
/**
 * 宝可梦对战技能招式动画 - 预知未来 (FutureSight)
 * 技能编号: 248
 * 原始类: f.df_1
 */
public class FutureSightAnimation
extends MU {
    public FutureSightAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        pw_1 pw_12;
        FutureSightAnimation df_12 = this;
        FutureSightAnimation df_13 = this;
        short s = 1965;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = df_13.Vz0;
        this.E8 = pw_12 = HB.p30(HB.p30(pw_1.xC().Xf0().p1(0.6f), this.Ue0(4, 0, 0.0f, 0.8125f, 0.075f)).xi0(df_13.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.WW(14, 0.75f, 0.0f, 0.625f, px_1.ep0(Short.MAX_VALUE))), this.EN(14, 2, 3, 0.0f, 0.064f, 0.5f, 0.0f)).xi0(this.WW(14, 0.75f, 0.625f, 0.0f, px_1.ep0(Short.MAX_VALUE))).xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.075f)).p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        df_12.Vs.jH(this.E8);
        return df_12;
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        FutureSightAnimation df_12 = this;
        FutureSightAnimation df_13 = this;
        short s = 1427;
        int n = 0;
        int n2 = 2;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = df_13.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().p1(0.6f).xi0(this.EN(16, 2, 12, 0.0f, 0.032f, 0.30004883f, 0.0f)).xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.075f)).xi0(df_13.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(16, 1)).mz0().Xf0();
        FutureSightAnimation df_14 = this;
        s = 1536;
        n = 1;
        n2 = 16;
        f = 0.0f;
        f2 = 0.8984375f;
        pF = df_14.Vz0;
        this.E8 = pw_12 = pk_1.el(A2.Kj0(pw_13.xi0(df_14.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Xq0(16, 3, 1, 0.032f, 0.032f, -0.39990234f, 0.39990234f)).xi0(this.WW(16, 0.75f, 0.0f, 0.625f, px_1.ep0(Short.MAX_VALUE))), this.EN(16, 2, 4, 0.0f, 0.032f, 0.6999512f, 0.0f), 0.28f).xi0(this.WW(16, 0.75f, 0.625f, 0.0f, px_1.ep0(Short.MAX_VALUE))), this.EN(16, 2, 4, 0.0f, 0.032f, 0.30004883f, 0.0f)).xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.025f)).p1(0.6f).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        df_12.Vs.jH(this.E8);
        df_12.Vc();
        return df_12;
    }
}


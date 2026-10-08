/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 念力 (Confusion)
 * 技能编号: 93
 * 原始类: f.SC
 */
public class ConfusionAnimation
extends MU {
    public ConfusionAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1450;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.nM(14, 1)).xi0(this.nM(16, 1)).xi0(this.Ue0(2, 0, 0.0f, 0.75f, 0.05f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.5f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_13 = A2.Kj0(pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 320.0f, 160.0f)).xi0(this.EN(14, 2, 3, 0.016f, 0.032f, 0.30004883f, 0.0f)), this.WW(14, f3, f4, f5, color), 0.2f);
        f3 = 0.5f;
        f4 = 0.5f;
        f5 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        short s2 = 1461;
        int n3 = 1;
        int n4 = 16;
        float f6 = 166.66667f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_14 = pk_1.el(pw_13, this.WW(14, f3, f4, f5, color)).xi0(this.Wt(1, 0.4f)).xi0(this.i6((byte)2, s2, n3, n4, f6, f2, pF));
        s2 = 1452;
        n3 = 2;
        n4 = 16;
        f6 = 250.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        float f7 = 0.5f;
        float f8 = 0.0f;
        float f9 = 0.75f;
        Color color2 = px_1.ep0(22732);
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s2, n3, n4, f6, f2, pF)).xi0(this.WW(16, f7, f8, f9, color2)).xi0(this.Xq0(16, 3, 3, 0.016f, 0.032f, -0.19995117f, 0.0f)).xi0(this.EN(16, 2, 6, 0.032f, 0.016f, 0.19995117f, 0.0f)).y80(this.Qh0(262));
        int n5 = 262;
        int n6 = 0;
        int n7 = 11;
        int n8 = 8;
        f2 = 0.5f;
        float f10 = 0.5f;
        float f11 = 0.75f;
        float f12 = 0.0f;
        Color color3 = px_1.ep0(22732);
        this.E8 = pk_1.el(A2.Kj0(pw_15, this.fE0(-1, n5, n6, n7, n8, f2), 0.44f), this.WW(16, f10, f11, f12, color3)).xi0(this.Ue0(2, 0, 0.75f, 0.0f, 0.05f)).xi0(this.nM(16, 0)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


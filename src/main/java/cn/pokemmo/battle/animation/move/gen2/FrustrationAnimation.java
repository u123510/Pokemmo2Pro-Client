/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 迁怒 (Frustration)
 * 技能编号: 218
 * 原始类: f.UA0
 */
public class FrustrationAnimation
extends MU {
    public FrustrationAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f = 0.75f;
        float f2 = 0.0f;
        float f3 = 0.75f;
        Color color = px_1.ep0(31);
        short s = 1463;
        int n = 1;
        int n2 = 14;
        float f4 = 0.0f;
        float f5 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.WW(14, f, f2, f3, color)).xi0(this.i6((byte)2, s, n, n2, f4, f5, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f4 = 166.66667f;
        f5 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f4, f5, pF)).xi0(this.Sv0(1, 0, 0.0f, 160.0f));
        s = 1463;
        n = 1;
        n2 = 14;
        f4 = 666.6667f;
        f5 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f4, f5, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f4 = 833.3333f;
        f5 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f4, f5, pF)).xi0(this.Sv0(1, 0, 640.0f, 160.0f));
        s = 1440;
        n = 0;
        n2 = 14;
        f4 = 0.0f;
        f5 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f4, f5, pF));
        s = 1440;
        n = 0;
        n2 = 14;
        f4 = 666.6667f;
        f5 = 0.859375f;
        pF = this.Vz0;
        float f6 = 0.75f;
        float f7 = 0.75f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(31);
        pw_1 pw_17 = HB.p30(pw_16, this.i6((byte)2, s, n, n2, f4, f5, pF)).xi0(this.WW(14, f6, f7, f8, color2)).p1(0.6f).mz0().Xf0().xi0(this.EN(14, 2, 4, 0.016f, 0.032f, 1.0f, 0.5f)).xi0(this.Xq0(14, 2, 2, 0.032f, 0.064f, 0.19995117f, -0.19995117f));
        int n3 = 1489;
        int n4 = 1;
        int n5 = 16;
        float f9 = 0.0f;
        f5 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n3, n4, n5, f9, f5, pF));
        n3 = 1489;
        n4 = 2;
        n5 = 16;
        f9 = 166.66667f;
        f5 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n3, n4, n5, f9, f5, pF));
        n3 = 1482;
        n4 = 1;
        n5 = 16;
        f9 = 166.66667f;
        f5 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n3, n4, n5, f9, f5, pF)).y80(this.Qh0(385));
        n3 = 385;
        n4 = 0;
        n5 = 11;
        int n6 = 8;
        f5 = 0.4f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n3, n4, n5, n6, f5));
        n3 = 385;
        n4 = 1;
        n5 = 11;
        n6 = 8;
        f5 = 0.4f;
        this.E8 = pw_111.xi0(this.fE0(-1, n3, n4, n5, n6, f5)).xi0(this.Xq0(16, 2, 1, 0.032f, 0.064f, -0.19995117f, 0.19995117f)).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


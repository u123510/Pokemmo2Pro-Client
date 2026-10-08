/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 奇迹之眼 (MiracleEye)
 * 技能编号: 357
 * 原始类: f.Cm0
 */
public class MiracleEyeAnimation
extends MU {
    public MiracleEyeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1782;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(FB.zd0(0.6f), this.Ue0(4, 0, 0.0f, 0.75f, 0.025f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1782;
        n2 = 2;
        n3 = 14;
        f = 250.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(531));
        n = 531;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.4f;
        pw_1 pw_14 = A2.Kj0(pw_13, this.fE0(-1, n, n2, n3, n4, f2), 0.24f);
        n = 531;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.4f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 531;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.4f;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2)).mz0().mz0().mz0().Xf0().p1(0.6f).mz0().Xf0().y80(this.E2(18, true)).xi0(this.WW(16, f3, f4, f5, color));
        short s = 531;
        int n5 = 4;
        int n6 = 11;
        int n7 = 8;
        f2 = 0.4f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n5, n6, n7, f2));
        s = 531;
        n5 = 3;
        n6 = 11;
        n7 = 8;
        f2 = 0.4f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, s, n5, n6, n7, f2));
        s = 1452;
        n5 = 2;
        n6 = 16;
        float f6 = 166.66667f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n5, n6, f6, f2, pF));
        s = 1358;
        n5 = 1;
        n6 = 16;
        f6 = 666.6667f;
        f2 = 0.46875f;
        pF = this.Vz0;
        float f7 = 0.25f;
        float f8 = 0.625f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = HB.p30(pw_19, this.i6((byte)2, s, n5, n6, f6, f2, pF)).xi0(this.WW(16, f7, f8, f9, color2)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.025f)).y80(this.E2(18, false)).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


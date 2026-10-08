/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.FB;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.Zw0;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.yi
 */
/**
 * 宝可梦对战技能招式动画 - 单纯光束 (SimpleBeam)
 * 技能编号: 493
 * 原始类: f.yi_2
 */
public class SimpleBeamAnimation
extends MU {
    public SimpleBeamAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f = 0.75f;
        float f2 = 0.0f;
        float f3 = 0.5f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        short s = 1450;
        int n = 1;
        int n2 = 14;
        float f4 = 0.0f;
        float f5 = 0.703125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(FB.zd0(0.6f), this.Ue0(4, 0, 0.0f, 0.75f, 0.05f)).xi0(this.WW(14, f, f2, f3, color)).xi0(this.Xq0(14, 2, 6, 0.0f, 0.032f, 0.100097656f, -0.100097656f)).y80(this.Qh0(662)).xi0(this.dA0(662, 0, 9, 11, 0.5f, 840.0f)).xi0(this.i6((byte)2, s, n, n2, f4, f5, pF)).xi0(this.Sv0(1, 1, 640.0f, 320.0f));
        s = 1376;
        n = 1;
        n2 = 14;
        f4 = 1000.0f;
        f5 = 0.0f;
        pF = this.Vz0;
        float f6 = 0.75f;
        float f7 = 0.5f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_13 = N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(A2.Kj0(pw_12, this.i6((byte)2, s, n, n2, f4, f5, pF), 0.04f), this.dA0(662, 0, 9, 11, 0.5f, 840.0f), 0.08f), this.dA0(662, 0, 9, 11, 0.5f, 840.0f), 0.12f), this.dA0(662, 0, 9, 11, 0.5f, 840.0f), 0.16f), this.dA0(662, 0, 9, 11, 0.5f, 840.0f), 0.2f).xi0(this.WW(14, f6, f7, f8, color2)), this.dA0(662, 0, 9, 11, 0.5f, 840.0f), 0.24f).xi0(this.dA0(662, 0, 9, 11, 0.5f, 840.0f)).xi0(this.Wt(1, 0.25f)).mz0().mz0().TD0().p1(0.54f).Xf0().xi0(this.nM(16, 1));
        int n3 = 662;
        int n4 = 0;
        int n5 = 11;
        int n6 = 8;
        f5 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n3, n4, n5, n6, f5));
        n3 = 1865;
        n4 = 2;
        n5 = 16;
        float f9 = 0.0f;
        f5 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = N4.zr(pw_14, this.i6((byte)2, (short)n3, n4, n5, f9, f5, pF), 0.84f);
        n3 = 662;
        n4 = 0;
        n5 = 11;
        int n7 = 8;
        f5 = 0.5f;
        float f10 = 0.75f;
        float f11 = 0.0f;
        float f12 = 0.5f;
        Color color3 = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_16 = N4.zr(pw_15.xi0(this.fE0(-1, n3, n4, n5, n7, f5)), this.WW(16, f10, f11, f12, color3), 1.14f);
        int n8 = 662;
        int n9 = 0;
        int n10 = 11;
        int n11 = 8;
        f5 = 0.5f;
        float f13 = 0.75f;
        float f14 = 0.5f;
        float f15 = 0.0f;
        Color color4 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = Zw0.H(pk_1.el(N4.zr(pw_16, this.fE0(-1, n8, n9, n10, n11, f5), 1.24f), this.EN(16, 2, 3, 0.0f, 0.032f, 0.30004883f, 0.0f)).xi0(this.WW(16, f13, f14, f15, color4)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)), this.Ue0(4, 0, 0.75f, 0.0f, 0.05f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


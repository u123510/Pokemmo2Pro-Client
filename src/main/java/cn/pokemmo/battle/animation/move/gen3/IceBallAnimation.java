/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.cf0
 */
/**
 * 宝可梦对战技能招式动画 - 冰球 (IceBall)
 * 技能编号: 301
 * 原始类: f.cf0_2
 */
public class IceBallAnimation
extends MU {
    public IceBallAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1457;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.5078125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1358;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(467)).xi0(this.dA0(467, 0, 9, 11, 0.5f, 360.0f)).xi0(this.dA0(467, 1, 9, 11, 0.5f, 360.0f)).xi0(this.dA0(467, 2, 9, 11, 0.5f, 360.0f)).xi0(this.Wt(1, 0.5f)).xi0(this.nM(16, 1));
        n = 467;
        n2 = 3;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_14 = A2.Kj0(pw_13, this.fE0(-1, n, n2, n3, n4, f2), 0.8f).xi0(this.WW(16, f3, f4, f5, color)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.064f, 0.19995117f, -0.19995117f)).xi0(this.EN(16, 2, 6, 0.016f, 0.016f, 0.5f, 0.0f));
        short s = 1505;
        int n5 = 1;
        int n6 = 16;
        float f6 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n5, n6, f6, f2, pF));
        s = 1719;
        n5 = 2;
        n6 = 16;
        f6 = 33.333332f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n5, n6, f6, f2, pF));
        s = 1719;
        n5 = 2;
        n6 = 16;
        f6 = 166.66667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n5, n6, f6, f2, pF));
        s = 1719;
        n5 = 2;
        n6 = 16;
        f6 = 233.33333f;
        f2 = 0.625f;
        pF = this.Vz0;
        float f7 = 0.75f;
        float f8 = 0.75f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = pk_1.el(pw_17, this.i6((byte)2, s, n5, n6, f6, f2, pF)).xi0(this.WW(16, f7, f8, f9, color2)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


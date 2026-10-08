/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.wv0
 */
/**
 * 宝可梦对战技能招式动画 - 暗影拳 (ShadowPunch)
 * 技能编号: 325
 * 原始类: f.wv0_0
 */
public class ShadowPunchAnimation
extends MU {
    public ShadowPunchAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f = 0.25f;
        float f2 = 0.0f;
        float f3 = 0.8125f;
        Color color = px_1.ep0(0);
        short s = 1421;
        int n = 2;
        int n2 = 14;
        float f4 = 0.0f;
        float f5 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(FB.zd0(0.6f), this.WW(14, f, f2, f3, color)).xi0(this.i6((byte)2, s, n, n2, f4, f5, pF));
        s = 1873;
        n = 1;
        n2 = 14;
        f4 = 0.0f;
        f5 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f4, f5, pF)).y80(this.Qh0(495)).xi0(this.EN(14, 2, 1, 0.0f, 0.048f, 2.0f, 0.0f)).p1(0.6f).mz0().Xf0();
        s = 495;
        n = 3;
        n2 = 11;
        int n3 = 8;
        f5 = 0.4f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f5));
        s = 495;
        n = 0;
        n2 = 11;
        n3 = 8;
        f5 = 0.4f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f5));
        s = 495;
        n = 1;
        n2 = 11;
        n3 = 8;
        f5 = 0.4f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f5));
        s = 1420;
        n = 2;
        n2 = 16;
        float f6 = 133.33333f;
        f5 = 0.9375f;
        pF = this.Vz0;
        float f7 = 0.25f;
        float f8 = 0.8125f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(0);
        this.E8 = HB.p30(pw_16.xi0(this.i6((byte)2, s, n, n2, f6, f5, pF)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.064f, -0.19995117f, 0.19995117f)).xi0(this.WW(14, f7, f8, f9, color2)).p1(0.6f).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


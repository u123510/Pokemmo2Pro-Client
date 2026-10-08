/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.Zw0;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [3435]
 * 原始类: f.TY
 */
public class CustomMove3435Animation
extends MU {
    public CustomMove3435Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f = 1.75f;
        float f2 = 0.0f;
        float f3 = 0.75f;
        Color color = px_1.ep0(13311);
        int n = 1445;
        int n2 = 1;
        int n3 = 14;
        float f4 = 166.66667f;
        float f5 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.05f)).xi0(this.WW(14, f, f2, f3, color)).xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f4 = 1000.0f;
        f5 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF)).xi0(this.Sv0(1, 0, 160.0f, 640.0f));
        n = 1505;
        n2 = 1;
        n3 = 14;
        f4 = 1000.0f;
        f5 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1458;
        n2 = 2;
        n3 = 14;
        f4 = 333.33334f;
        f5 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1458;
        n2 = 2;
        n3 = 14;
        f4 = 666.6667f;
        f5 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF)).xi0(this.nM(14, 1)).y80(this.Qh0(3435));
        n = 3435;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f5 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f5));
        n = 3435;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f5 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f5));
        n = 3435;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f5 = 0.5f;
        float f6 = 0.5f;
        float f7 = 0.75f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(13311);
        pw_1 pw_19 = A2.Kj0(pw_18, this.fE0(-1, n, n2, n3, n4, f5), 1.4f).xi0(this.WW(14, f6, f7, f8, color2)).xi0(this.Wt(3, 0.8f));
        short s = 1458;
        int n5 = 2;
        int n6 = 16;
        float f9 = 666.6667f;
        f5 = 0.9375f;
        pF = this.Vz0;
        float f10 = 0.5f;
        float f11 = 0.0f;
        float f12 = 0.75f;
        Color color3 = px_1.ep0(13311);
        pw_1 pw_110 = N4.zr(pw_19, this.i6((byte)2, s, n5, n6, f9, f5, pF), 1.8f).xi0(this.WW(16, f10, f11, f12, color3));
        int n7 = 3435;
        int n8 = 1;
        int n9 = 3;
        int n10 = 8;
        f5 = 0.5f;
        float f13 = 0.5f;
        float f14 = 0.75f;
        float f15 = 0.0f;
        Color color4 = px_1.ep0(13311);
        this.E8 = Zw0.H(pk_1.el(pw_110.xi0(this.fE0(-1, n7, n8, n9, n10, f5)).xi0(this.nM(16, 1)), this.EN(16, 2, 6, 0.032f, 0.016f, 0.30004883f, 0.0f)).xi0(this.WW(16, f13, f14, f15, color4)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)), this.Ue0(4, 0, 0.75f, 0.0f, 0.05f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


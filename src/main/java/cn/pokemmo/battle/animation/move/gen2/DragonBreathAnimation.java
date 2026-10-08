/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 龙息 (DragonBreath)
 * 技能编号: 225
 * 原始类: f.M10
 */
public class DragonBreathAnimation
extends MU {
    public DragonBreathAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1492;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 800.0f));
        s = 1491;
        n = 2;
        n2 = 16;
        f = 1166.6666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        float f3 = 1.0f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(31);
        pw_1 pw_14 = pk_1.el(N4.zr(A2.Kj0(pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(391)).xi0(this.dA0(391, 0, 9, 11, 0.5f, 0.0f)), this.dA0(391, 1, 9, 11, 0.5f, 0.0f), 0.6f).xi0(this.Wt(1, 0.4f)).xi0(this.EN(16, 2, 4, 0.032f, 0.032f, 0.5f, 0.0f)), this.WW(16, f3, f4, f5, color), 1.2f).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.048f, 0.032f, -0.100097656f, 0.100097656f));
        f3 = 1.0f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(31);
        this.E8 = pw_14.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


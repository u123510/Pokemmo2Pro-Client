/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 生长 (Growth)
 * 技能编号: 74
 * 原始类: f.Yt0
 */
public class GrowthAnimation
extends MU {
    public GrowthAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f = 0.5f;
        float f2 = 0.0f;
        float f3 = 0.75f;
        Color color = px_1.ep0(13302);
        short s = 237;
        int n = 0;
        int n2 = 9;
        int n3 = 8;
        float f4 = 0.25f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.nM(14, 1)).xi0(this.WW(14, f, f2, f3, color)).xi0(this.Xq0(14, 3, 1, 0.016f, 0.064f, -0.100097656f, -0.19995117f)).y80(this.Qh0(237)).xi0(this.fE0(-1, s, n, n2, n3, f4));
        s = 237;
        n = 1;
        n2 = 9;
        n3 = 8;
        f4 = 0.0f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f4));
        s = 1463;
        n = 1;
        n2 = 14;
        float f5 = 0.0f;
        f4 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f5, f4, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f5 = 666.6667f;
        f4 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f5, f4, pF));
        s = 1456;
        n = 2;
        n2 = 14;
        f5 = 0.0f;
        f4 = 0.8984375f;
        pF = this.Vz0;
        float f6 = 0.5f;
        float f7 = 0.75f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(13302);
        this.E8 = pk_1.el(A2.Kj0(pw_15.xi0(this.i6((byte)2, s, n, n2, f5, f4, pF)).xi0(this.Sv0(1, 0, 0.0f, 640.0f)), this.Sv0(1, 1, 480.0f, 160.0f), 0.44f), this.WW(14, f6, f7, f8, color2)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


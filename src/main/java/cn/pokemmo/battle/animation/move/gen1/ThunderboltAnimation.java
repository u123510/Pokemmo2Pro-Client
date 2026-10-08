/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 十万伏特 (Thunderbolt)
 * 技能编号: 85
 * 原始类: f.PJ
 */
public class ThunderboltAnimation
extends MU {
    public ThunderboltAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1710;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = A2.Kj0(pw_1.xC().Xf0().xi0(this.Wt(1, 0.25f)).xi0(this.nM(14, 1)), this.Ue0(4, 0, 0.0f, 0.75f, 0.05f), 0.4f).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1710;
        n = 2;
        n2 = 16;
        f = 250.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1445;
        n = 1;
        n2 = 16;
        f = 333.33334f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 16;
        f = 1500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 320.0f, 1120.0f));
        s = 1710;
        n = 2;
        n2 = 16;
        f = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1458;
        n = 2;
        n2 = 16;
        f = 1500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(0);
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(16, 1)).xi0(this.WW(16, f3, f4, f5, color)).y80(this.Qh0(249)).y80(this.Qh0(250));
        int n3 = 249;
        int n4 = 0;
        int n5 = 11;
        int n6 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 250;
        n4 = 0;
        n5 = 11;
        n6 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 249;
        n4 = 1;
        n5 = 11;
        n6 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 250;
        n4 = 1;
        n5 = 11;
        n6 = 8;
        f2 = 0.5f;
        float f6 = 0.5f;
        float f7 = 0.75f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(0);
        this.E8 = pk_1.el(N4.zr(pw_110.xi0(this.fE0(-1, n3, n4, n5, n6, f2)), this.EN(16, 2, 8, 0.032f, 0.016f, 0.5f, 0.0f), 1.4f), this.WW(16, f6, f7, f8, color2)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.nM(16, 0)).xi0(this.nM(14, 0)).xi0(this.tP(0.25f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


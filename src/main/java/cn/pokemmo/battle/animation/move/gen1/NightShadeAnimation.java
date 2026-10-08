/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.ck0
 */
/**
 * 宝可梦对战技能招式动画 - 黑夜魔影 (NightShade)
 * 技能编号: 101
 * 原始类: f.ck0_2
 */
public class NightShadeAnimation
extends MU {
    public NightShadeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1535;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.nM(14, 1)).xi0(this.Wt(0, 0.6f)), this.Ue0(4, 0, 0.0f, 0.625f, 0.05f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1536;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.5f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_13 = A2.Kj0(pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.WW(14, f3, f4, f5, color)).y80(this.E2(14, true)), this.Xq0(14, 1, 1, 0.016f, 0.064f, 1.1999512f, 1.1999512f), 0.44f);
        f3 = 0.75f;
        f4 = 0.0f;
        f5 = 0.875f;
        color = px_1.ep0(0);
        pw_1 pw_14 = pk_1.el(pw_13.xi0(this.WW(16, f3, f4, f5, color)), this.EN(16, 2, 5, 0.032f, 0.016f, 0.5f, 0.0f)).y80(this.E2(14, false));
        f3 = 0.5f;
        f4 = 0.5f;
        f5 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_15 = pw_14.xi0(this.WW(14, f3, f4, f5, color)).xi0(this.Xq0(14, 1, 1, 0.016f, 0.064f, 1.0f, 1.0f));
        f3 = 0.5f;
        f4 = 0.875f;
        f5 = 0.0f;
        color = px_1.ep0(0);
        this.E8 = pw_15.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.Ue0(4, 0, 0.625f, 0.0f, 0.05f)).mz0().Xf0().p1(0.6f).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


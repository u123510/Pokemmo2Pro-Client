/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.Ty
 */
/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [3475]
 * 原始类: f.ty_0
 */
public class CustomMove3475Animation
extends MU {
    public CustomMove3475Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f = 0.5f;
        float f2 = 0.0f;
        float f3 = 0.625f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        int n = 1410;
        int n2 = 1;
        int n3 = 14;
        float f4 = 0.0f;
        float f5 = 0.546875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.WW(14, f, f2, f3, color)).xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1556;
        n2 = 2;
        n3 = 14;
        f4 = 0.0f;
        f5 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1556;
        n2 = 2;
        n3 = 14;
        f4 = 333.33334f;
        f5 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF)).xi0(this.EN(14, 2, 6, 0.0f, 0.048f, 1.0f, 0.0f)).xi0(this.Xq0(14, 2, 1, 0.0f, 0.48f, 0.19995117f, -0.19995117f)).y80(this.Qh0(3475));
        n = 3475;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f5 = 0.25f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f5));
        n = 3475;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f5 = 0.25f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f5));
        n = 3475;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f5 = 0.25f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f5));
        n = 3475;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f5 = 0.25f;
        float f6 = 0.5f;
        float f7 = 0.625f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = HB.p30(pw_17, this.fE0(-1, n, n2, n3, n4, f5)).xi0(this.WW(14, f6, f7, f8, color2)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


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
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 闪光 (Flash)
 * 技能编号: 148
 * 原始类: f.SG0
 */
public class FlashAnimation
extends MU {
    public FlashAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f = 0.25f;
        float f2 = 0.0f;
        float f3 = 1.0f;
        Color color = px_1.ep0(0);
        short s = 1724;
        int n = 1;
        int n2 = 14;
        float f4 = 0.0f;
        float f5 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).xi0(this.nM(14, 1)).mz0().Xf0().xi0(this.WW(14, f, f2, f3, color)).xi0(this.Ue0(4, Short.MAX_VALUE, 0.0f, 0.9375f, 0.05f)).xi0(this.i6((byte)2, s, n, n2, f4, f5, pF));
        s = 1724;
        n = 1;
        n2 = 14;
        f4 = 333.33334f;
        f5 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f4, f5, pF));
        s = 1724;
        n = 1;
        n2 = 14;
        f4 = 666.6667f;
        f5 = 0.15625f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f4, f5, pF));
        s = 1724;
        n = 1;
        n2 = 14;
        f4 = 1000.0f;
        f5 = 0.0390625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f4, f5, pF));
        s = 1724;
        n = 2;
        n2 = 16;
        f4 = 0.0f;
        f5 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f4, f5, pF));
        s = 1724;
        n = 2;
        n2 = 16;
        f4 = 333.33334f;
        f5 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f4, f5, pF));
        s = 1724;
        n = 2;
        n2 = 16;
        f4 = 666.6667f;
        f5 = 0.15625f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, s, n, n2, f4, f5, pF));
        s = 1724;
        n = 2;
        n2 = 16;
        f4 = 1000.0f;
        f5 = 0.0390625f;
        pF = this.Vz0;
        float f6 = 0.25f;
        float f7 = 1.0f;
        float f8 = 1.0f;
        Color color2 = px_1.ep0(0);
        pw_1 pw_19 = A2.Kj0(HB.p30(pw_18, this.i6((byte)2, s, n, n2, f4, f5, pF)).xi0(this.WW(14, f6, f7, f8, color2)), this.Ue0(4, Short.MAX_VALUE, 0.9375f, 0.9375f, 0.025f), 1.0f);
        f6 = 0.5f;
        f7 = 1.0f;
        f8 = 0.0f;
        color2 = px_1.ep0(0);
        this.E8 = pw_19.xi0(this.WW(14, f6, f7, f8, color2)).xi0(this.Ue0(4, Short.MAX_VALUE, 0.9375f, 0.0f, 0.05f)).xi0(this.nM(14, 0)).p1(0.6f).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


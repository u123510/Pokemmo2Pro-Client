/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

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
 * Renamed from f.rP
 */
/**
 * 宝可梦对战技能招式动画 - 光合作用 (Synthesis)
 * 技能编号: 235
 * 原始类: f.rp_1
 */
public class SynthesisAnimation
extends MU {
    public SynthesisAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1495;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1450;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 960.0f, 480.0f)).xi0(this.Sv0(2, 0, 0.0f, 1440.0f));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 1500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1495;
        n2 = 1;
        n3 = 14;
        f = 666.6667f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(402));
        n = 402;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 402;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(660);
        pw_1 pw_17 = HB.p30(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.WW(14, f3, f4, f5, color));
        f3 = 0.5f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(660);
        int n5 = 402;
        int n6 = 0;
        int n7 = 9;
        int n8 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = A2.Kj0(pw_17, this.WW(14, f3, f4, f5, color), 0.14f).xi0(this.fE0(-1, n5, n6, n7, n8, f2));
        n5 = 402;
        n6 = 1;
        n7 = 9;
        n8 = 8;
        f2 = 0.5f;
        float f6 = 0.5f;
        float f7 = 0.0f;
        float f8 = 0.75f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_19 = HB.p30(pk_1.el(pw_18, this.fE0(-1, n5, n6, n7, n8, f2)), this.WW(14, f6, f7, f8, color2));
        f6 = 0.5f;
        f7 = 0.75f;
        f8 = 0.0f;
        color2 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = HB.p30(pw_19, this.WW(14, f6, f7, f8, color2)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


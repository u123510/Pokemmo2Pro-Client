/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 看穿 (Detect)
 * 技能编号: 197
 * 原始类: f.L40
 */
public class DetectAnimation
extends MU {
    public DetectAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f = 1.0f;
        float f2 = 0.0f;
        float f3 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        int n = 1486;
        int n2 = 1;
        int n3 = 14;
        float f4 = 0.0f;
        float f5 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 1.0f, 0.075f)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.WW(14, f, f2, f3, color)).xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1471;
        n2 = 2;
        n3 = 14;
        f4 = 0.0f;
        f5 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF)).y80(this.Qh0(363));
        n = 363;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f5 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f5));
        n = 363;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f5 = 0.5f;
        float f6 = 1.0f;
        float f7 = 0.75f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = HB.p30(pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f5)).xi0(this.nM(14, 1)), this.Xq0(16, 2, 1, 0.016f, 0.064f, -0.19995117f, 0.19995117f)).xi0(this.tP(0.4f)).xi0(this.WW(14, f6, f7, f8, color2)).xi0(this.Ue0(4, 0, 1.0f, 0.0f, 0.075f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


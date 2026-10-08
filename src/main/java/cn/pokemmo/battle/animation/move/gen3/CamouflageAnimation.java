/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.sm
 */
/**
 * 宝可梦对战技能招式动画 - 伪装 (Camouflage)
 * 技能编号: 293
 * 原始类: f.sm_2
 */
public class CamouflageAnimation
extends MU {
    public CamouflageAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1504;
        int n = 1;
        int n2 = 14;
        float f = 166.66667f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 640.0f)).xi0(this.nM(14, 1)).y80(this.E2(14, true)), this.WW(14, f3, f4, f5, color)).xi0(this.EN(14, 3, 3, 0.016f, 0.048f, 0.19995117f, 0.0f));
        short s2 = 1530;
        int n3 = 2;
        int n4 = 14;
        float f6 = 166.66667f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s2, n3, n4, f6, f2, pF));
        s2 = 1376;
        n3 = 2;
        n4 = 14;
        f6 = 1166.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        float f7 = 0.5f;
        float f8 = 0.75f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = HB.p30(HB.p30(pw_13.xi0(this.i6((byte)2, s2, n3, n4, f6, f2, pF)), this.Sv0(2, 1, 640.0f, 480.0f)), this.WW(14, f7, f8, f9, color2)).y80(this.E2(14, false)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


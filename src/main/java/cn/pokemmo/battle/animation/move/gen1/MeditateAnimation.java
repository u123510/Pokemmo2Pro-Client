/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 瑜伽姿势 (Meditate)
 * 技能编号: 96
 * 原始类: f.Hs0
 */
public class MeditateAnimation
extends MU {
    public MeditateAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        MeditateAnimation hs0 = this;
        MeditateAnimation hs02 = this;
        short s = 1708;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = hs02.Vz0;
        pw_1 pw_13 = HB.p30(pw_1.xC().Xf0().xi0(this.nM(14, 1)).xi0(this.Ue0(4, 0, 0.0f, 0.625f, 0.05f)).p1(0.6f).mz0().Xf0().xi0(hs02.i6((byte)2, s, n, n2, f, f2, pF)), this.Xq0(14, 2, 1, 0.016f, 0.096f, 0.8000488f, -0.39990234f));
        MeditateAnimation hs03 = this;
        s = 1708;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.9375f;
        pF = hs03.Vz0;
        this.E8 = pw_12 = HB.p30(pw_13.xi0(hs03.i6((byte)2, s, n, n2, f, f2, pF)), this.Xq0(14, 2, 1, 0.016f, 0.096f, -0.19995117f, 0.39990234f)).xi0(this.Xq0(14, 1, 1, 0.016f, 0.064f, 1.0f, 1.0f)).xi0(this.Ue0(4, 0, 0.625f, 0.0f, 0.05f)).p1(0.6f).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        hs0.Vs.jH(this.E8);
        hs0.Vc();
        return hs0;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.f70
 */
/**
 * 宝可梦对战技能招式动画 - 火花 (Ember)
 * 技能编号: 52
 * 原始类: f.f70_0
 */
public class EmberAnimation
extends MU {
    public EmberAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        EmberAnimation f70_02 = this;
        short s = 0;
        int n = 11;
        int n2 = 8;
        float f = 0.5f;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(213)).xi0(this.fE0(-1, 213, s, n, n2, f)).xi0(this.WW(16, 0.75f, 0.0f, 0.75f, px_1.ep0(30))).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.048f, 0.30004883f, -0.19995117f));
        EmberAnimation f70_03 = this;
        s = 1426;
        n = 1;
        n2 = 16;
        f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = f70_03.Vz0;
        pw_1 pw_14 = pw_13.xi0(f70_03.i6((byte)2, s, n, n2, f, f2, pF));
        EmberAnimation f70_04 = this;
        s = 1426;
        n = 2;
        n2 = 16;
        f = 333.33334f;
        f2 = 0.46875f;
        pF = f70_04.Vz0;
        this.E8 = pw_12 = HB.p30(pw_14, f70_04.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.tP(0.4f)).xi0(this.WW(16, 0.75f, 0.75f, 0.0f, px_1.ep0(30))).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        f70_02.Vs.jH(this.E8);
        f70_02.Vc();
        return f70_02;
    }
}


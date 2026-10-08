/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.xv
 */
/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1016]
 * 原始类: f.xv_2
 */
public class CustomMove1016Animation
extends MU {
    public CustomMove1016Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        CustomMove1016Animation xv_22 = this;
        CustomMove1016Animation xv_23 = this;
        short s = 1680;
        int n = 2;
        int n2 = 14;
        float f = 166.66667f;
        float f2 = 0.9921875f;
        PF pF = xv_23.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.1f)).xi0(xv_23.i6((byte)2, s, n, n2, f, f2, pF));
        CustomMove1016Animation xv_24 = this;
        s = 1376;
        n = 2;
        n2 = 14;
        f = 2000.0f;
        f2 = 0.0f;
        pF = xv_24.Vz0;
        this.E8 = pw_12 = HB.p30(pw_13.xi0(xv_24.i6((byte)2, s, n, n2, f, f2, pF)), this.Sv0(2, 1, 1280.0f, 640.0f)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.075f)).p1(0.6f).mz0();
        pw_12.Ms(this.Vs.wP);
        xv_22.Vs.jH(this.E8);
        xv_22.Vc();
        return xv_22;
    }
}


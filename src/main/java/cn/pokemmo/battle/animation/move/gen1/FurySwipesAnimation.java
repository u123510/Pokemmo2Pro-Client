/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.zM
 */
/**
 * 宝可梦对战技能招式动画 - 乱抓 (FurySwipes)
 * 技能编号: 154
 * 原始类: f.zm_1
 */
public class FurySwipesAnimation
extends MU {
    public FurySwipesAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        FurySwipesAnimation zm_12 = this;
        FurySwipesAnimation zm_13 = this;
        int n = 1423;
        int n2 = 1;
        int n3 = 16;
        float f = 166.66667f;
        float f2 = 0.8984375f;
        PF pF = zm_13.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().mz0().Xf0().xi0(zm_13.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        FurySwipesAnimation zm_14 = this;
        n = 1423;
        n2 = 2;
        n3 = 16;
        f = 333.33334f;
        f2 = 0.8984375f;
        pF = zm_14.Vz0;
        pw_1 pw_14 = pw_13.xi0(zm_14.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(318));
        n = 0;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 318, n, n2, n3, f));
        n = 1;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 318, n, n2, n3, f));
        n = 2;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 318, n, n2, n3, f));
        n = 3;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_17.xi0(this.fE0(-1, 318, n, n2, n3, f)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.032f, 0.048f, 0.30004883f, -0.30004883f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        zm_12.Vs.jH(this.E8);
        zm_12.Vc();
        return zm_12;
    }
}


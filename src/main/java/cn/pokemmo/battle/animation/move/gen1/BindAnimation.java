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
 * Renamed from f.ci0
 */
/**
 * 宝可梦对战技能招式动画 - 绑紧 (Bind)
 * 技能编号: 20
 * 原始类: f.ci0_2
 */
public class BindAnimation
extends MU {
    public BindAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BindAnimation ci0_22 = this;
        short s = 0;
        int n = 11;
        int n2 = 8;
        float f = 0.5f;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.Xq0(14, 2, 3, 0.016f, 0.064f, 0.30004883f, -0.30004883f)).y80(this.Qh0(182)).xi0(this.nM(14, 1)).xi0(this.fE0(-1, 182, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 182, s, n, n2, f)).xi0(this.Xq0(16, 2, 3, 0.016f, 0.064f, -0.39990234f, 0.5f));
        BindAnimation ci0_23 = this;
        s = 1441;
        n = 1;
        n2 = 16;
        f = 0.0f;
        float f2 = 0.9765625f;
        PF pF = ci0_23.Vz0;
        pw_1 pw_15 = pw_14.xi0(ci0_23.i6((byte)2, s, n, n2, f, f2, pF));
        BindAnimation ci0_24 = this;
        s = 1441;
        n = 2;
        n2 = 16;
        f = 250.0f;
        f2 = 0.9765625f;
        pF = ci0_24.Vz0;
        this.E8 = pw_12 = HB.p30(pw_15, ci0_24.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        ci0_22.Vs.jH(this.E8);
        ci0_22.Vc();
        return ci0_22;
    }
}


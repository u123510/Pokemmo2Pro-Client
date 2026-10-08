/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.xl0
 */
/**
 * 宝可梦对战技能招式动画 - 下盘踢 (LowSweep)
 * 技能编号: 490
 * 原始类: f.xl0_1
 */
public class LowSweepAnimation
extends MU {
    public LowSweepAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1415;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 240.0f, 128.0f)).xi0(this.Wt(1, 0.4f)).TD0().p1(0.4f).Xf0().y80(this.Qh0(185));
        s = 185;
        n = 0;
        n2 = 11;
        int n3 = 8;
        f2 = 0.25f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 185;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.25f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 185;
        n = 2;
        n2 = 11;
        n3 = 8;
        f2 = 0.25f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 1653;
        n = 2;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        this.E8 = pk_1.el(pw_15.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.0f, 0.096f, -0.30004883f, 0.30004883f)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


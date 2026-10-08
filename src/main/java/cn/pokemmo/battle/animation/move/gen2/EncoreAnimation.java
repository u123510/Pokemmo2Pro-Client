/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.oA0
 */
/**
 * 宝可梦对战技能招式动画 - 再来一次 (Encore)
 * 技能编号: 227
 * 原始类: f.oa0_1
 */
public class EncoreAnimation
extends MU {
    public EncoreAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1778;
        int n2 = 1;
        int n3 = 16;
        float f = 500.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(2, 0, 0.0f, 0.625f, 0.075f)).xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1578;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 1600.0f, 320.0f));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 2000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(393));
        n = 393;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 393;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.2000122f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 393;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.2000122f;
        this.E8 = HB.p30(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.Xq0(16, 2, 3, 0.0f, 0.16f, -0.30004883f, 0.30004883f)).xi0(this.Ue0(2, 0, 0.625f, 0.0f, 0.075f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.uy0
 */
/**
 * 宝可梦对战技能招式动画 - 龙尾 (DragonTail)
 * 技能编号: 525
 * 原始类: f.uy0_0
 */
public class DragonTailAnimation
extends MU {
    public DragonTailAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1438;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).y80(this.E2(18, true)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f = 250.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(690));
        n = 690;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.25f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 690;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 690;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 690;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 690;
        n2 = 4;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        this.E8 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.EN(16, 2, 12, 0.0f, 0.032f, 1.0f, 0.0f)).xi0(this.Xq0(16, 2, 1, 0.0f, 0.064f, 0.30004883f, -0.30004883f)).xi0(this.nM(16, 1)).mz0().Xf0().xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).y80(this.E2(18, false)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


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
 * 宝可梦对战技能招式动画 - 自我再生 (Recover)
 * 技能编号: 105
 * 原始类: f.Zs0
 */
public class RecoverAnimation
extends MU {
    public RecoverAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1786;
        int n2 = 1;
        int n3 = 14;
        float f = 600.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1358;
        n2 = 2;
        n3 = 14;
        f = 1250.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1358;
        n2 = 2;
        n3 = 14;
        f = 1500.0f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1358;
        n2 = 2;
        n3 = 14;
        f = 1750.0f;
        f2 = 0.15625f;
        pF = this.Vz0;
        pw_1 pw_15 = HB.p30(pw_14, this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(271));
        n = 271;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 271;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = HB.p30(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


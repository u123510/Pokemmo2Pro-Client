/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 烟幕 (Smokescreen)
 * 技能编号: 108
 * 原始类: f.UI0
 */
public class SmokescreenAnimation
extends MU {
    public SmokescreenAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1426;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = A2.Kj0(FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(273)), this.dA0(273, 0, 9, 11, 0.5f, 360.0f), 0.4f).xi0(this.Wt(1, 0.4f));
        n = 1426;
        n2 = 1;
        n3 = 16;
        f = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1407;
        n2 = 2;
        n3 = 16;
        f = 333.33334f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 1500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 480.0f, 960.0f));
        n = 273;
        n2 = 1;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = N4.zr(pw_15, this.fE0(-1, n, n2, n3, n4, f2), 0.52f);
        n = 273;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = N4.zr(pw_16, this.fE0(-1, n, n2, n3, n4, f2), 0.62f);
        n = 273;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        this.E8 = pk_1.el(pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


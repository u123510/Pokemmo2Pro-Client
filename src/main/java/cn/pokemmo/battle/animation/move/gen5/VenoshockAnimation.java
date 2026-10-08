/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 毒液冲击 (Venoshock)
 * 技能编号: 474
 * 原始类: f.Uo0
 */
public class VenoshockAnimation
extends MU {
    public VenoshockAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1887;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).y80(this.E2(18, true)).mz0().Xf0().y80(this.Qh0(647)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1410;
        n2 = 1;
        n3 = 16;
        f = 583.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1887;
        n2 = 1;
        n3 = 16;
        f = 1166.6666f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1886;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.234375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 2000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 1920.0f)).xi0(this.Sv0(2, 1, 1600.0f, 320.0f));
        n = 647;
        n2 = 1;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 647;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_18 = A2.Kj0(pw_17, this.fE0(-1, n, n2, n3, n4, f2), 0.4f);
        n = 647;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.049987793f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 647;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 647;
        n2 = 4;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        this.E8 = pk_1.el(N4.zr(pw_110, this.fE0(-1, n, n2, n3, n4, f2), 1.2f).xi0(this.nM(16, 1)), this.Xq0(16, 2, 5, 0.016f, 0.032f, 0.30004883f, -0.30004883f)).xi0(this.tP(0.4f)).y80(this.E2(18, false)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


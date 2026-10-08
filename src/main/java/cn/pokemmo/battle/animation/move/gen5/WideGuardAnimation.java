/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 广域防守 (WideGuard)
 * 技能编号: 469
 * 原始类: f.K00
 */
public class WideGuardAnimation
extends MU {
    public WideGuardAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1863;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.4f).xi0(this.nM(16, 1)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1450;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1450;
        n2 = 2;
        n3 = 14;
        f = 1500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 2500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.EN(14, 3, 7, 0.0f, 0.032f, 1.5f, 0.0f)).y80(this.Qh0(645));
        n = 645;
        n2 = 2;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 645;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = A2.Kj0(pw_17, this.fE0(-1, n, n2, n3, n4, f2), 1.6f);
        n = 645;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_18, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


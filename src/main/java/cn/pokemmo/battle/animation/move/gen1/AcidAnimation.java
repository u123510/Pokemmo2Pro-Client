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

/*
 * Renamed from f.vV
 */
/**
 * 宝可梦对战技能招式动画 - 溶解液 (Acid)
 * 技能编号: 51
 * 原始类: f.vv_1
 */
public class AcidAnimation
extends MU {
    public AcidAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1453;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).y80(this.Qh0(212)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1454;
        n2 = 2;
        n3 = 16;
        f = 750.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1452;
        n2 = 1;
        n3 = 16;
        f = 916.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = N4.zr(N4.zr(N4.zr(A2.Kj0(pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)), this.dA0(212, 1, 9, 11, 0.5f, 360.0f), 0.06f), this.dA0(212, 1, 9, 11, 0.5f, 360.0f), 0.12f), this.dA0(212, 1, 9, 11, 0.5f, 360.0f), 0.18f), this.dA0(212, 1, 9, 11, 0.5f, 360.0f), 0.34f).xi0(this.Wt(1, 0.4f));
        n = 212;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 212;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 212;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.096f, 0.30004883f, -0.30004883f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


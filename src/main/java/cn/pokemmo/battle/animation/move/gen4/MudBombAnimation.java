/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.y40
 */
/**
 * 宝可梦对战技能招式动画 - 泥巴炸弹 (MudBomb)
 * 技能编号: 426
 * 原始类: f.y40_0
 */
public class MudBombAnimation
extends MU {
    public MudBombAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1452;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1849;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 1;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1686;
        n2 = 2;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = A2.Kj0(pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(601)), this.dA0(601, 0, 9, 11, 0.5f, 648.0f), 0.72f).y80(this.E2(18, true)).xi0(this.Wt(1, 0.4f));
        n = 601;
        n2 = 1;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 601;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 601;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)).mz0().mz0().TD0().p1(1.12f).Xf0(), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.19995117f, -0.19995117f)).xi0(this.tP(0.4f)).y80(this.E2(18, false)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.yp
 */
/**
 * 宝可梦对战技能招式动画 - 炸蛋 (EggBomb)
 * 技能编号: 121
 * 原始类: f.yp_2
 */
public class EggBombAnimation
extends MU {
    public EggBombAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        EggBombAnimation yp_22 = this;
        EggBombAnimation yp_23 = this;
        short s = 1459;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = yp_23.Vz0;
        pw_1 pw_13 = A2.Kj0(FB.zd0(0.6f).xi0(yp_23.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(286)), this.dA0(286, 2, 9, 11, 0.5f, 480.0f), 0.4f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(0.8f).Xf0();
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 286, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 286, s, n, n2, f));
        s = 3;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 286, s, n, n2, f)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.048f, 0.30004883f, -0.30004883f));
        EggBombAnimation yp_24 = this;
        s = 1475;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = yp_24.Vz0;
        this.E8 = pw_12 = pk_1.el(pw_16, yp_24.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        yp_22.Vs.jH(this.E8);
        yp_22.Vc();
        return yp_22;
    }
}


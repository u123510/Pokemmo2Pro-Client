/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.ae
 */
/**
 * 宝可梦对战技能招式动画 - 吼叫 (Roar)
 * 技能编号: 46
 * 原始类: f.ae_1
 */
public class RoarAnimation
extends MU {
    public RoarAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        RoarAnimation ae_12 = this;
        int n = 0;
        int n2 = 9;
        int n3 = 11;
        float f = 0.5f;
        this.E8 = pw_12 = pk_1.el(FB.zd0(0.6f).xi0(this.nM(16, 1)).xi0(this.Xq0(14, 2, 6, 0.0f, 0.048f, 0.0f, 0.19995117f)).xi0(this.Uv(false, 0.0f)).xi0(this.Uv(false, 200.0f)).y80(this.Qh0(207)).xi0(this.fE0(-1, 207, n, n2, n3, f)).xi0(this.dA0(207, 1, 9, 11, 0.5f, 2160.0f)).xi0(this.EN(16, 2, 8, 0.016f, 0.016f, 0.30004883f, 0.0f)).xi0(this.Wt(1, 0.65f)).TD0().p1(0.52f).Xf0(), this.EN(16, 1, 1, 0.016f, 0.256f, -30.0f, 0.0f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        ae_12.Vs.jH(this.E8);
        ae_12.Vc();
        return ae_12;
    }
}


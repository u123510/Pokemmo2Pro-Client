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
 * Renamed from f.b10
 */
/**
 * 宝可梦对战技能招式动画 - 聚宝功 (PayDay)
 * 技能编号: 6
 * 原始类: f.b10_0
 */
public class PayDayAnimation
extends MU {
    public PayDayAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1432;
        int n = 1;
        int n2 = 16;
        float f = 166.66667f;
        float f2 = 0.0f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).y80(this.Qh0(166)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1430;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = A2.Kj0(pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)), this.dA0(166, 0, 9, 11, 0.5f, 0.0f), 0.4f).xi0(this.Wt(1, 0.4f));
        s = 166;
        n = 1;
        n2 = 11;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 166;
        n = 2;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 166;
        n = 3;
        n2 = 11;
        n3 = 8;
        f2 = 0.0f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f));
        s = 1431;
        n = 1;
        n2 = 16;
        float f3 = 250.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1433;
        n = 2;
        n2 = 16;
        f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        this.E8 = pk_1.el(pw_17, this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


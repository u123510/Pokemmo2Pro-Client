/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 酸液炸弹 (AcidSpray)
 * 技能编号: 491
 * 原始类: f.As0
 */
public class AcidSprayAnimation
extends MU {
    public AcidSprayAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1434;
        int n2 = 2;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = A2.Kj0(FB.zd0(0.6f).y80(this.Qh0(660)).xi0(this.dA0(660, 2, 9, 11, 0.5f, 480.0f)), this.i6((byte)2, (short)n, n2, n3, f, f2, pF), 0.02f).xi0(this.dA0(660, 2, 9, 11, 0.5f, 480.0f));
        n = 1382;
        n2 = 1;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = N4.zr(N4.zr(pw_12, this.i6((byte)2, (short)n, n2, n3, f, f2, pF), 0.04f).xi0(this.Wt(1, 0.6f)), this.dA0(660, 2, 9, 11, 0.5f, 480.0f), 0.06f).xi0(this.dA0(660, 2, 9, 11, 0.5f, 480.0f)).y80(this.E2(18, true)).mz0().mz0().TD0().p1(0.46f).Xf0();
        n = 660;
        n2 = 4;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 660;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 660;
        n2 = 6;
        n3 = 11;
        n4 = 8;
        f2 = 0.75f;
        pw_1 pw_16 = N4.zr(pw_15, this.fE0(-1, n, n2, n3, n4, f2), 0.54f).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.0f, 0.128f, 0.100097656f, -0.30004883f));
        n = 660;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.125f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 660;
        n2 = 5;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 1446;
        n2 = 1;
        n3 = 16;
        float f3 = 0.0f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 660;
        n2 = 1;
        n3 = 11;
        int n5 = 8;
        f2 = 0.125f;
        this.E8 = pk_1.el(pw_19, this.fE0(-1, n, n2, n3, n5, f2)).xi0(this.nM(16, 0)).y80(this.E2(18, false)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


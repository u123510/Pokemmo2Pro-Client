/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Wu
 */
/**
 * 宝可梦对战技能招式动画 - 岩石爆击 (RockBlast)
 * 技能编号: 350
 * 原始类: f.wu_0
 */
public class RockBlastAnimation
extends MU {
    public RockBlastAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        RockBlastAnimation wu_02 = this;
        RockBlastAnimation wu_03 = this;
        short s = 1874;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = wu_03.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(wu_03.i6((byte)2, s, n, n2, f, f2, pF));
        RockBlastAnimation wu_04 = this;
        s = 1513;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = wu_04.Vz0;
        pw_1 pw_14 = A2.Kj0(pw_13.xi0(wu_04.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(523)), this.dA0(523, 1, 9, 11, 0.5f, 240.0f), 0.4f).xi0(this.nM(16, 1));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 523, s, n, n2, f));
        s = 2;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 523, s, n, n2, f)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, -0.19995117f, 0.19995117f));
        RockBlastAnimation wu_05 = this;
        s = 1532;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = wu_05.Vz0;
        this.E8 = pw_12 = pk_1.el(pw_16.xi0(wu_05.i6((byte)2, s, n, n2, f, f2, pF)), this.EN(16, 2, 6, 0.016f, 0.032f, 0.19995117f, 0.0f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        wu_02.Vs.jH(this.E8);
        wu_02.Vc();
        return wu_02;
    }
}


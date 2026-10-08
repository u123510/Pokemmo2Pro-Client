/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 鬼火 (WillOWisp)
 * 技能编号: 261
 * 原始类: f.On0
 */
public class WillOWispAnimation
extends MU {
    public WillOWispAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        WillOWispAnimation on0 = this;
        WillOWispAnimation on02 = this;
        short s = 1455;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = on02.Vz0;
        pw_1 pw_13 = FB.zd0(0.6f).xi0(on02.i6((byte)2, s, n, n2, f, f2, pF));
        WillOWispAnimation on03 = this;
        s = 1467;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.703125f;
        pF = on03.Vz0;
        pw_1 pw_14 = pw_13.xi0(on03.i6((byte)2, s, n, n2, f, f2, pF));
        WillOWispAnimation on04 = this;
        s = 1426;
        n = 1;
        n2 = 16;
        f = 833.3333f;
        f2 = 0.9375f;
        pF = on04.Vz0;
        pw_1 pw_15 = A2.Kj0(pw_14.xi0(on04.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(427)), this.dA0(427, 0, 9, 11, 0.5f, 0.0f), 0.4f).xi0(this.Wt(1, 0.4f)).xi0(this.nM(16, 1)).mz0().mz0().TD0().p1(0.8f).Xf0();
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(pw_15.xi0(this.fE0(-1, 427, s, n, n2, f)), this.Xq0(16, 2, 1, 0.016f, 0.064f, 0.19995117f, -0.19995117f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        on0.Vs.jH(this.E8);
        on0.Vc();
        return on0;
    }
}


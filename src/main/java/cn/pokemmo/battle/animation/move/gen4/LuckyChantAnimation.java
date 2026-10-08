/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.Jx
 */
/**
 * 宝可梦对战技能招式动画 - 幸运咒语 (LuckyChant)
 * 技能编号: 381
 * 原始类: f.jx_0
 */
public class LuckyChantAnimation
extends MU {
    public LuckyChantAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        LuckyChantAnimation jx_02 = this;
        LuckyChantAnimation jx_03 = this;
        short s = 1474;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = jx_03.Vz0;
        pw_1 pw_13 = FB.zd0(0.4f).xi0(jx_03.i6((byte)2, s, n, n2, f, f2, pF));
        LuckyChantAnimation jx_04 = this;
        s = 1784;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.859375f;
        pF = jx_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(jx_04.i6((byte)2, s, n, n2, f, f2, pF));
        LuckyChantAnimation jx_05 = this;
        s = 1509;
        n = 1;
        n2 = 14;
        f = 666.6667f;
        f2 = 0.546875f;
        pF = jx_05.Vz0;
        pw_1 pw_15 = pw_14.xi0(jx_05.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(556));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 556, s, n, n2, f));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = Zw0.H(HB.p30(pw_16.xi0(this.fE0(-1, 556, s, n, n2, f)), this.WW(14, 0.25f, 0.0f, 0.75f, px_1.ep0(Short.MAX_VALUE))).xi0(this.tP(0.4f)), this.WW(14, 0.25f, 0.75f, 0.0f, px_1.ep0(Short.MAX_VALUE)));
        pw_12.Ms(this.Vs.wP);
        jx_02.Vs.jH(this.E8);
        jx_02.Vc();
        return jx_02;
    }
}


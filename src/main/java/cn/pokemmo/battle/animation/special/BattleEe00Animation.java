/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Ee0
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleEe00Animation
 * 原始类: f.ee0_0
 */
public class BattleEe00Animation
extends MU {
    public BattleEe00Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleEe00Animation ee0_02 = this;
        BattleEe00Animation ee0_03 = this;
        short s = 1804;
        int n = 1;
        int n2 = 14;
        float f = 166.66667f;
        float f2 = 0.78125f;
        PF pF = ee0_03.Vz0;
        pw_1 pw_13 = FB.zd0(0.6f).xi0(this.nM(14, 1)).y80(this.Qh0(197)).xi0(ee0_03.i6((byte)2, s, n, n2, f, f2, pF));
        BattleEe00Animation ee0_04 = this;
        s = 1804;
        n = 1;
        n2 = 14;
        f = 800.0f;
        f2 = 0.9921875f;
        pF = ee0_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(ee0_04.i6((byte)2, s, n, n2, f, f2, pF));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.4f;
        pw_1 pw_15 = N4.zr(A2.Kj0(pw_14, this.fE0(-1, 197, s, n, n2, f), 0.12f), this.Xq0(14, 2, 5, 0.0f, 0.128f, -0.19995117f, 0.30004883f), 0.72f);
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.4f;
        this.E8 = pw_12 = pk_1.el(pw_15, this.fE0(-1, 197, s, n, n2, f)).xi0(this.nM(14, 0)).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        ee0_02.Vs.jH(this.E8);
        ee0_02.Vc();
        return ee0_02;
    }
}


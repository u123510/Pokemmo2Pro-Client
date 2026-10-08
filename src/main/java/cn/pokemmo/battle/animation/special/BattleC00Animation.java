/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleC00Animation
 * 原始类: f.C00
 */
public class BattleC00Animation
extends MU {
    public BattleC00Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleC00Animation c00 = this;
        BattleC00Animation c002 = this;
        short s = 1507;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = c002.Vz0;
        this.E8 = pw_12 = HB.p30(FB.zd0(0.6f).xi0(c002.i6((byte)2, s, n, n2, f, f2, pF)), this.Xq0(14, 2, 3, 0.032f, 0.096f, 0.19995117f, -0.19995117f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        c00.Vs.jH(this.E8);
        c00.Vc();
        return c00;
    }
}


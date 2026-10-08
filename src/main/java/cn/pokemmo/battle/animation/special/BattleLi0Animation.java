/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleLi0Animation
 * 原始类: f.LI0
 */
public class BattleLi0Animation
extends MU {
    public BattleLi0Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleLi0Animation lI0 = this;
        BattleLi0Animation lI02 = this;
        short s = 1547;
        int n = 1;
        int n2 = 14;
        float f = 416.66666f;
        float f2 = 0.9921875f;
        PF pF = lI02.Vz0;
        pw_1 pw_13 = pw_1.xC().y80(this.Qh0(146)).Xf0().xi0(lI02.i6((byte)2, s, n, n2, f, f2, pF));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.4f;
        this.E8 = pw_12 = pw_13.xi0(this.fE0(-1, 146, s, n, n2, f)).mz0().p1(0.6f);
        pw_12.Ms(this.Vs.wP);
        lI0.Vs.jH(this.E8);
        lI0.Vc();
        return lI0;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}


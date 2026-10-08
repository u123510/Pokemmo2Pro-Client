/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.or
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleOr2Animation
 * 原始类: f.or_2
 */
public class BattleOr2Animation
extends MU {
    public BattleOr2Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleOr2Animation or_22 = this;
        BattleOr2Animation or_23 = this;
        short s = 1516;
        int n = 1;
        int n2 = 14;
        float f = 800.0f;
        float f2 = 0.9375f;
        PF pF = or_23.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().p1(0.4f).xi0(or_23.i6((byte)2, s, n, n2, f, f2, pF));
        BattleOr2Animation or_24 = this;
        s = 1420;
        n = 2;
        n2 = 14;
        f = 800.0f;
        f2 = 0.78125f;
        pF = or_24.Vz0;
        this.E8 = pw_12 = pw_13.xi0(or_24.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.wn0("boss_shield_break")).TD0().mz0().mz0().p1(0.8f).Xf0().xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0();
        pw_12.Ms(this.Vs.wP);
        or_22.Vs.jH(this.E8);
        or_22.Vc();
        return or_22;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}


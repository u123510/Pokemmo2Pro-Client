/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.Ck0
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleCk00Animation
 * 原始类: f.ck0_0
 */
public class BattleCk00Animation
extends MU {
    public BattleCk00Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleCk00Animation ck0_02 = this;
        BattleCk00Animation ck0_03 = this;
        short s = 1358;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = ck0_03.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().p1(0.4f).xi0(ck0_03.i6((byte)2, s, n, n2, f, f2, pF));
        BattleCk00Animation ck0_04 = this;
        s = 1471;
        n = 2;
        n2 = 14;
        f = 166.66667f;
        f2 = 0.9375f;
        pF = ck0_04.Vz0;
        this.E8 = pw_12 = pw_13.xi0(ck0_04.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.wn0("boss_shield")).TD0().mz0().mz0().p1(0.8f).Xf0().xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0();
        pw_12.Ms(this.Vs.wP);
        ck0_02.Vs.jH(this.E8);
        ck0_02.Vc();
        return ck0_02;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}


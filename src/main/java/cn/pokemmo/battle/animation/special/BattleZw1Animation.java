/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.zW
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleZw1Animation
 * 原始类: f.zw_1
 */
public class BattleZw1Animation
extends MU {
    public BattleZw1Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleZw1Animation zw_12 = this;
        BattleZw1Animation zw_13 = this;
        short s = 1998;
        int n = 1;
        int n2 = 14;
        float f = 100.0f;
        float f2 = 1.0f;
        PF pF = zw_13.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(zw_13.i6((byte)2, s, n, n2, f, f2, pF));
        BattleZw1Animation zw_14 = this;
        s = 1998;
        n = 1;
        n2 = 14;
        f = 400.0f;
        f2 = 1.0f;
        pF = zw_14.Vz0;
        this.E8 = pw_12 = pw_13.xi0(zw_14.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.wn0("ability_suppression")).mz0();
        pw_12.Ms(this.Vs.wP);
        zw_12.Vs.jH(this.E8);
        zw_12.Vc();
        return zw_12;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}


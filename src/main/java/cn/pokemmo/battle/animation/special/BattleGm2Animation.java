/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.gm
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleGm2Animation
 * 原始类: f.gm_2
 */
public class BattleGm2Animation
extends MU {
    public BattleGm2Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleGm2Animation gm_22 = this;
        short s = 0;
        int n = 9;
        int n2 = 8;
        float f = 0.5f;
        pw_1 pw_13 = pw_1.xC().y80(this.Qh0(348)).p1(0.4f).Xf0().xi0(this.fE0(-1, 348, s, n, n2, f));
        BattleGm2Animation gm_23 = this;
        s = 1471;
        n = 1;
        n2 = 14;
        f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = gm_23.Vz0;
        pw_1 pw_14 = pw_13.xi0(gm_23.i6((byte)2, s, n, n2, f, f2, pF));
        BattleGm2Animation gm_24 = this;
        s = 1358;
        n = 2;
        n2 = 14;
        f = 333.33334f;
        f2 = 0.625f;
        pF = gm_24.Vz0;
        this.E8 = pw_12 = pw_14.xi0(gm_24.i6((byte)2, s, n, n2, f, f2, pF)).mz0();
        pw_12.Ms(this.Vs.wP);
        gm_22.Vs.jH(this.E8);
        gm_22.Vc();
        return gm_22;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.N4;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.Oh
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleOh0Animation
 * 原始类: f.oh_0
 */
public class BattleOh0Animation
extends MU {
    public BattleOh0Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleOh0Animation oh_02 = this;
        BattleOh0Animation oh_03 = this;
        short s = 1665;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = oh_03.Vz0;
        this.E8 = pw_12 = N4.zr(pw_1.xC().Xf0().TD0().p1(0.6f).Xf0().xi0(oh_03.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 640.0f, 480.0f)).xi0(this.Sv0(1, 0, 320.0f, 640.0f)), this.Xq0(14, 2, 1, 0.0f, 0.096f, 0.19995117f, -0.19995117f), 0.8f).y80(this.Qh0(10999)).xi0(this.dA0(10999, 0, 9, 11, 0.5f, 552.0f)).mz0().mz0().p1(1.2f).TD0().xi0(this.Xq0(16, 2, 1, 0.0f, 0.096f, 0.19995117f, -0.19995117f)).mz0().mz0().p1(0.4f);
        pw_12.Ms(this.Vs.wP);
        oh_02.Vs.jH(this.E8);
        oh_02.Vc();
        return oh_02;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}


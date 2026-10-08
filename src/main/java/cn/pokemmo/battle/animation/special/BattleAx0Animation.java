/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.Ax
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleAx0Animation
 * 原始类: f.ax_0
 */
public class BattleAx0Animation
extends MU {
    public BattleAx0Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleAx0Animation ax_02 = this;
        BattleAx0Animation ax_03 = this;
        short s = 1713;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = ax_03.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(ax_03.i6((byte)2, s, n, n2, f, f2, pF));
        BattleAx0Animation ax_04 = this;
        s = 1376;
        n = 1;
        n2 = 14;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = ax_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(ax_04.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 1120.0f, 480.0f)).y80(this.Qh0(444));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pw_14.xi0(this.fE0(-1, 444, s, n, n2, f)).mz0();
        pw_12.Ms(this.Vs.wP);
        ax_02.Vs.jH(this.E8);
        ax_02.Vc();
        return ax_02;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}


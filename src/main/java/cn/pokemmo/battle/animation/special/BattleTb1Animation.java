/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.tb
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleTb1Animation
 * 原始类: f.tb_1
 */
public class BattleTb1Animation
extends MU {
    public BattleTb1Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleTb1Animation tb_12 = this;
        BattleTb1Animation tb_13 = this;
        short s = 1573;
        int n = 1;
        int n2 = 14;
        float f = 100.0f;
        float f2 = 0.6f;
        PF pF = tb_13.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(tb_13.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.wn0("bad_candy_proc"));
        BattleTb1Animation tb_14 = this;
        s = 1555;
        n = 1;
        n2 = 14;
        f = 500.0f;
        f2 = 0.6f;
        pF = tb_14.Vz0;
        pw_1 pw_14 = pw_13.xi0(tb_14.i6((byte)2, s, n, n2, f, f2, pF));
        BattleTb1Animation tb_15 = this;
        s = 1555;
        n = 1;
        n2 = 14;
        f = 700.0f;
        f2 = 0.6f;
        pF = tb_15.Vz0;
        pw_1 pw_15 = pw_14.xi0(tb_15.i6((byte)2, s, n, n2, f, f2, pF));
        BattleTb1Animation tb_16 = this;
        s = 1555;
        n = 1;
        n2 = 14;
        f = 900.0f;
        f2 = 0.6f;
        pF = tb_16.Vz0;
        this.E8 = pw_12 = pw_15.xi0(tb_16.i6((byte)2, s, n, n2, f, f2, pF)).mz0();
        pw_12.Ms(this.Vs.wP);
        tb_12.Vs.jH(this.E8);
        tb_12.Vc();
        return tb_12;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}


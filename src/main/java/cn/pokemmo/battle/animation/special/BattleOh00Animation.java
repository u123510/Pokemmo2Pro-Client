/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.oH0
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleOh00Animation
 * 原始类: f.oh0_0
 */
public class BattleOh00Animation
extends MU {
    public BattleOh00Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleOh00Animation oh0_02 = this;
        int n = 0;
        int n2 = 9;
        int n3 = 8;
        float f = 0.4f;
        pw_1 pw_13 = pw_1.xC().Xf0().y80(this.Qh0(440)).y80(this.Qh0(441)).p1(0.6f).mz0().Xf0().xi0(this.fE0(-1, 440, n, n2, n3, f));
        BattleOh00Animation oh0_03 = this;
        n = 1812;
        n2 = 1;
        n3 = 14;
        f = 1000.0f;
        float f2 = 0.78125f;
        PF pF = oh0_03.Vz0;
        pw_1 pw_14 = pw_13.xi0(oh0_03.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        BattleOh00Animation oh0_04 = this;
        n = 1813;
        n2 = 2;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.78125f;
        pF = oh0_04.Vz0;
        pw_1 pw_15 = pw_14.xi0(oh0_04.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 2;
        n2 = 9;
        n3 = 8;
        f = 0.4f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 440, n, n2, n3, f));
        n = 1;
        n2 = 9;
        n3 = 8;
        f = 0.4f;
        this.E8 = pw_12 = pw_16.xi0(this.fE0(-1, 441, n, n2, n3, f)).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        oh0_02.Vs.jH(this.E8);
        oh0_02.Vc();
        return oh0_02;
    }
}


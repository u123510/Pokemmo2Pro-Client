/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.hp
 */
/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1079]
 * 原始类: f.hp_2
 */
public class CustomMove1079Animation
extends MU {
    public CustomMove1079Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1421;
        int n = 1;
        int n2 = 14;
        float f = 166.66667f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.nM(18, 1)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1421;
        n = 1;
        n2 = 14;
        f = 333.33334f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1421;
        n = 1;
        n2 = 14;
        f = 500.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1436;
        n = 2;
        n2 = 16;
        f = 500.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1436;
        n = 2;
        n2 = 16;
        f = 666.6667f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1436;
        n = 2;
        n2 = 16;
        f = 833.3333f;
        f2 = 0.78125f;
        pF = this.Vz0;
        this.E8 = pw_16.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.fn(1079)).xi0(this.Wt(4, 0.8f)).mz0().p1(1.5f).Xf0().xi0(this.nM(18, 0)).xi0(this.tP(0.4f)).mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


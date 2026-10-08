/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.pa
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattlePa1Animation
 * 原始类: f.pa_1
 */
public class BattlePa1Animation
extends MU {
    public BattlePa1Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1811;
        int n2 = 1;
        int n3 = 14;
        float f = 166.66667f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.Qh0(498)).p1(0.6f).y80(this.E2(18, true)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1811;
        n2 = 1;
        n3 = 14;
        f = 300.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1811;
        n2 = 1;
        n3 = 14;
        f = 433.33334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1811;
        n2 = 1;
        n3 = 14;
        f = 566.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1811;
        n2 = 1;
        n3 = 14;
        f = 700.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1811;
        n2 = 1;
        n3 = 14;
        f = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1811;
        n2 = 1;
        n3 = 14;
        f = 966.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1810;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.15625f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 498;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.4f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 498;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.4f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 498;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.4f;
        this.E8 = pk_1.el(pw_111.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(14, 1)).TD0().p1(0.6f).Xf0(), this.EN(14, 2, 8, 0.016f, 0.048f, 0.30004883f, 0.0f)).xi0(this.nM(14, 0)).mz0().Xf0().p1(0.6f).y80(this.E2(18, false)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


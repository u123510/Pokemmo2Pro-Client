/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Vd0
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleVd00Animation
 * 原始类: f.vd0_0
 */
public class BattleVd00Animation
extends MU {
    public BattleVd00Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1436;
        int n2 = 1;
        int n3 = 14;
        float f = 333.33334f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = A2.Kj0(FB.zd0(0.6f), this.Ue0(2, 0, 0.0f, 0.625f, 0.1f), 0.4f).y80(this.Qh0(341)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1441;
        n2 = 2;
        n3 = 14;
        f = 416.66666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 320.0f, 320.0f));
        n = 1436;
        n2 = 1;
        n3 = 14;
        f = 666.6667f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1441;
        n2 = 2;
        n3 = 14;
        f = 750.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 640.0f, 320.0f));
        n = 1436;
        n2 = 1;
        n3 = 14;
        f = 1000.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1441;
        n2 = 2;
        n3 = 14;
        f = 1083.3334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 960.0f, 320.0f));
        n = 341;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.4f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)).mz0().mz0().TD0().p1(0.64f).Xf0();
        n = 341;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.4f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 341;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.4f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 341;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.4f;
        this.E8 = pk_1.el(pw_110, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.Ue0(2, 0, 0.625f, 0.0f, 0.1f)).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


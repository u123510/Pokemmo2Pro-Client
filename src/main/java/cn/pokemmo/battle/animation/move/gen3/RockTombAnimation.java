/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.Zm
 */
/**
 * 宝可梦对战技能招式动画 - 岩石封锁 (RockTomb)
 * 技能编号: 317
 * 原始类: f.zm_0
 */
public class RockTombAnimation
extends MU {
    public RockTombAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1416;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1418;
        n = 3;
        n2 = 14;
        f = 0.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 3;
        n2 = 14;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(487));
        s = 487;
        n = 1;
        n2 = 0;
        int n3 = 8;
        f2 = 0.4f;
        pw_1 pw_16 = A2.Kj0(pw_15, this.fE0(-1, s, n, n2, n3, f2), 0.4f);
        s = 487;
        n = 0;
        n2 = 11;
        n3 = 8;
        f2 = 0.4f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 1699;
        n = 2;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1699;
        n = 2;
        n2 = 16;
        f3 = 166.66667f;
        f2 = 0.78125f;
        pF = this.Vz0;
        this.E8 = pw_18.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).mz0().mz0().mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


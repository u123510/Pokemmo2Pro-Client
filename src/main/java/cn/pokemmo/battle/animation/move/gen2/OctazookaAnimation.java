/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Uh
 */
/**
 * 宝可梦对战技能招式动画 - 章鱼桶炮 (Octazooka)
 * 技能编号: 190
 * 原始类: f.uh_0
 */
public class OctazookaAnimation
extends MU {
    public OctazookaAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1475;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1407;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 320.0f, 320.0f)).y80(this.Qh0(356)).xi0(this.dA0(356, 0, 9, 11, 0.5f, 0.0f));
        n = 356;
        n2 = 1;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, n, n2, n3, n4, f2), 0.4f).xi0(this.Wt(1, 0.4f));
        n = 1420;
        n2 = 2;
        n3 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1475;
        n2 = 1;
        n3 = 16;
        f3 = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF)).xi0(this.nM(16, 1));
        n = 356;
        n2 = 2;
        n3 = 11;
        int n5 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_17.xi0(this.fE0(-1, n, n2, n3, n5, f2)), this.Xq0(16, 2, 1, 0.016f, 0.064f, -0.19995117f, 0.19995117f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


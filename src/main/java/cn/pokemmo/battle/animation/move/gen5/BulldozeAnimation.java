/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.cW
 */
/**
 * 宝可梦对战技能招式动画 - 重踏 (Bulldoze)
 * 技能编号: 523
 * 原始类: f.cw_1
 */
public class BulldozeAnimation
extends MU {
    public BulldozeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1876;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.546875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.Xq0(14, 2, 20, 0.0f, 0.032f, 0.19995117f, -0.19995117f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1652;
        n = 2;
        n2 = 14;
        f = 583.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1652;
        n = 2;
        n2 = 14;
        f = 750.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1652;
        n = 2;
        n2 = 14;
        f = 916.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1748;
        n = 3;
        n2 = 14;
        f = 0.0f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 3;
        n2 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        this.E8 = pk_1.el(pw_16.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).TD0().p1(0.4f).Xf0().p1(0.6f).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.0f, 0.032f, 0.100097656f, -0.100097656f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


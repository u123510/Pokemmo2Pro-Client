/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.l8
 */
/**
 * 宝可梦对战技能招式动画 - 生蛋 (SoftBoiled)
 * 技能编号: 135
 * 原始类: f.l8_0
 */
public class SoftBoiledAnimation
extends MU {
    public SoftBoiledAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        SoftBoiledAnimation l8_02 = this;
        SoftBoiledAnimation l8_03 = this;
        int n = 1502;
        int n2 = 1;
        int n3 = 14;
        float f = 250.0f;
        float f2 = 0.9375f;
        PF pF = l8_03.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.Xq0(14, 2, 1, 0.016f, 0.096f, 0.30004883f, -0.30004883f)).xi0(l8_03.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        SoftBoiledAnimation l8_04 = this;
        n = 1358;
        n2 = 2;
        n3 = 14;
        f = 916.6667f;
        f2 = 0.859375f;
        pF = l8_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(l8_04.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(300));
        n = 2;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 300, n, n2, n3, f));
        n = 3;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = A2.Kj0(pw_15, this.fE0(-1, 300, n, n2, n3, f), 0.04f);
        n = 1;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 300, n, n2, n3, f));
        n = 0;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, 300, n, n2, n3, f));
        n = 4;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(pw_18, this.fE0(-1, 300, n, n2, n3, f)).xi0(this.tP(0.25f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        l8_02.Vs.jH(this.E8);
        l8_02.Vc();
        return l8_02;
    }
}


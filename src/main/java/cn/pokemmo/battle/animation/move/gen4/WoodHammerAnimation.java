/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.kx
 */
/**
 * 宝可梦对战技能招式动画 - 木槌 (WoodHammer)
 * 技能编号: 452
 * 原始类: f.kx_2
 */
public class WoodHammerAnimation
extends MU {
    public WoodHammerAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1715;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.nM(14, 1)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(627));
        n = 627;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 627;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.0f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 627;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.025024414f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 627;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.0f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 627;
        n2 = 4;
        n3 = 11;
        n4 = 8;
        f2 = 0.0f;
        this.E8 = pk_1.el(A2.Kj0(pw_17, this.fE0(-1, n, n2, n3, n4, f2), 0.1f).xi0(this.nM(16, 1)), this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


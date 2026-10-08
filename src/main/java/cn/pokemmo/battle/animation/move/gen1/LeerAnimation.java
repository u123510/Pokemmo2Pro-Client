/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 瞪眼 (Leer)
 * 技能编号: 43
 * 原始类: f.DD0
 */
public class LeerAnimation
extends MU {
    public LeerAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 204;
        int n = 0;
        int n2 = 9;
        int n3 = 8;
        float f = 0.5f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.05f)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().y80(this.Qh0(204)).xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 204;
        n = 1;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 204;
        n = 2;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 1449;
        n = 1;
        n2 = 14;
        float f2 = 0.0f;
        f = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1449;
        n = 2;
        n2 = 14;
        f2 = 250.0f;
        f = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_16 = HB.p30(pw_15, this.i6((byte)2, s, n, n2, f2, f, pF)).xi0(this.tP(0.25f)).xi0(this.nM(16, 1));
        s = 1836;
        n = 1;
        n2 = 16;
        f2 = 0.0f;
        f = 0.9921875f;
        pF = this.Vz0;
        this.E8 = Zw0.H(HB.p30(HB.p30(pw_16, this.i6((byte)2, s, n, n2, f2, f, pF)).xi0(this.EN(16, 2, 6, 0.0f, 0.032f, 0.30004883f, 0.0f)), this.Xq0(16, 2, 1, 0.016f, 0.16f, -0.19995117f, 0.19995117f)).xi0(this.nM(16, 0)), this.Ue0(4, 0, 0.75f, 0.0f, 0.05f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


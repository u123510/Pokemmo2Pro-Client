/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.lg0
 */
/**
 * 宝可梦对战技能招式动画 - 落石 (RockThrow)
 * 技能编号: 88
 * 原始类: f.lg0_2
 */
public class RockThrowAnimation
extends MU {
    public RockThrowAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 255;
        int n = 0;
        int n2 = 11;
        int n3 = 8;
        float f = 0.5f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(255)).xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 255;
        n = 1;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 255;
        n = 2;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f)).xi0(this.nM(16, 1));
        s = 1416;
        n = 1;
        n2 = 16;
        float f2 = 0.0f;
        f = 0.9765625f;
        PF pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1376;
        n = 1;
        n2 = 16;
        f2 = 583.3333f;
        f = 0.0f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1460;
        n = 2;
        n2 = 16;
        f2 = 583.3333f;
        f = 0.9375f;
        pF = this.Vz0;
        this.E8 = pk_1.el(N4.zr(A2.Kj0(pw_16, this.i6((byte)2, s, n, n2, f2, f, pF), 0.8f), this.Xq0(16, 2, 1, 0.016f, 0.048f, 0.30004883f, -0.30004883f), 1.0f), this.Xq0(16, 2, 4, 0.016f, 0.032f, 0.050048828f, -0.050048828f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


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
 * Renamed from f.le
 */
/**
 * 宝可梦对战技能招式动画 - 头锤 (Headbutt)
 * 技能编号: 29
 * 原始类: f.le_0
 */
public class HeadbuttAnimation
extends MU {
    public HeadbuttAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1421;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = A2.Kj0(pw_1.xC().Xf0(), this.i6((byte)2, s, n, n2, f, f2, pF), 0.08f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(0.2f).Xf0().y80(this.Qh0(191));
        s = 191;
        n = 0;
        n2 = 11;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 191;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f));
        s = 1475;
        n = 1;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1376;
        n = 1;
        n2 = 16;
        f3 = 500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.Sv0(1, 1, 320.0f, 160.0f));
        s = 1703;
        n = 2;
        n2 = 16;
        f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        this.E8 = pk_1.el(pw_16, this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


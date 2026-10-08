/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 蝶舞 (QuiverDance)
 * 技能编号: 483
 * 原始类: f.Ro0
 */
public class QuiverDanceAnimation
extends MU {
    public QuiverDanceAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1863;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 800.0f, 320.0f));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1820;
        n2 = 2;
        n3 = 14;
        f = 416.66666f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_14 = A2.Kj0(pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Wt(0, 0.3f)).mz0().Xf0(), this.Ue0(2, 0, 0.0f, 0.5f, 0.075f), 0.2f).y80(this.Qh0(654));
        n = 654;
        n2 = 1;
        n3 = 9;
        int n4 = 8;
        f2 = 0.25f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 654;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.0f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 654;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.0f;
        this.E8 = HB.p30(pk_1.el(pw_16, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.0f, 0.032f, 0.100097656f, -0.100097656f)).xi0(this.Ue0(2, 0, 0.5f, 0.0f, 0.075f)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


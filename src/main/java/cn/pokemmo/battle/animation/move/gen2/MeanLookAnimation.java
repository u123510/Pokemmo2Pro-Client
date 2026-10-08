/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Zf0
 */
/**
 * 宝可梦对战技能招式动画 - 黑色目光 (MeanLook)
 * 技能编号: 212
 * 原始类: f.zf0_0
 */
public class MeanLookAnimation
extends MU {
    public MeanLookAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1418;
        int n = 3;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 3;
        n2 = 16;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(3, 0, 0.0f, 1600.0f)).xi0(this.nM(14, 1)).y80(this.Qh0(378));
        s = 378;
        n = 0;
        n2 = 11;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 378;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 378;
        n = 2;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 378;
        n = 3;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = A2.Kj0(pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2)), this.Ue0(4, 31775, 0.0f, 0.75f, 0.05f), 2.0f);
        s = 1509;
        n = 1;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        this.E8 = pk_1.el(N4.zr(pw_17.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)), this.Ue0(4, Short.MAX_VALUE, 0.75f, 0.75f, 0.05f), 2.08f), this.Ue0(4, Short.MAX_VALUE, 0.75f, 0.0f, 0.05f)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


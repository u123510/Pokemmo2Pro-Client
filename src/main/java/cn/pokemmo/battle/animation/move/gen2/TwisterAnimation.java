/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.Com4
 */
/**
 * 宝可梦对战技能招式动画 - 龙卷风 (Twister)
 * 技能编号: 239
 * 原始类: f.com4__2
 */
public class TwisterAnimation
extends MU {
    public TwisterAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1717;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 160.0f, 1600.0f)).xi0(this.Sv0(1, 1, 800.0f, 1600.0f));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f = 2500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1497;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 0, 160.0f, 1600.0f)).xi0(this.Sv0(2, 1, 800.0f, 1600.0f));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 2500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(406));
        n = 406;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.125f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 406;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.0f;
        this.E8 = A2.Kj0(pw_16, this.fE0(-1, n, n2, n3, n4, f2), 0.8f).xi0(this.EN(16, 2, 4, 0.016f, 0.048f, 1.0f, 0.0f)).xi0(this.nM(16, 1)).mz0().mz0().mz0().Xf0().xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


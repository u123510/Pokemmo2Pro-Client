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

/**
 * 宝可梦对战技能招式动画 - 冰冻光束 (IceBeam)
 * 技能编号: 58
 * 原始类: f.YK0
 */
public class IceBeamAnimation
extends MU {
    public IceBeamAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1450;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.703125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = A2.Kj0(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)), this.Ue0(4, 32592, 0.0f, 0.75f, 0.05f), 0.4f).xi0(this.Wt(1, 0.8f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 816.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1488;
        n2 = 2;
        n3 = 16;
        f = 416.66666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1488;
        n2 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1516;
        n2 = 1;
        n3 = 16;
        f = 416.66666f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(219));
        n = 219;
        n2 = 0;
        n3 = 9;
        int n4 = 11;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 219;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 219;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(N4.zr(pw_18, this.fE0(-1, n, n2, n3, n4, f2), 0.6f), this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f)).xi0(this.Ue0(4, 32592, 0.75f, 0.0f, 0.05f)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


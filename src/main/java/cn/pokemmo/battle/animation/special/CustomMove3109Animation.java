/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.pw_1;

/*
 * Renamed from f.c30
 */
/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [3109]
 * 原始类: f.c30_0
 */
public class CustomMove3109Animation
extends MU {
    public CustomMove3109Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1843;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().p1(0.6f), this.Ue0(4, 0, 0.0f, 0.75f, 0.075f)).y80(this.Qh0(3109)).xi0(this.dA0(3109, 1, 9, 11, 0.5f, 1440.0f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1848;
        n = 2;
        n2 = 14;
        f = 250.0f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_13 = A2.Kj0(pw_12, this.i6((byte)2, s, n, n2, f, f2, pF), 0.6f).xi0(this.Wt(1, 0.8f)).mz0().mz0().TD0().p1(1.2f).Xf0();
        s = 3109;
        n = 0;
        n2 = 11;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 1713;
        n = 1;
        n2 = 16;
        float f3 = 666.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1350;
        n = 1;
        n2 = 16;
        f3 = 2166.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        this.E8 = Zw0.H(pw_15.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.Sv0(1, 1, 1280.0f, 800.0f)).xi0(this.nM(16, 1)).mz0().mz0().mz0().Xf0().xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.075f)), this.Xq0(16, 2, 1, 0.032f, 0.032f, 0.100097656f, -0.100097656f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


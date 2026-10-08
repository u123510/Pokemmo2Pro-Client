/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.i6
 */
/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1012]
 * 原始类: f.i6_0
 */
public class CustomMove1012Animation
extends MU {
    public CustomMove1012Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        pw_1 pw_12;
        CustomMove1012Animation i6_02 = this;
        CustomMove1012Animation i6_03 = this;
        short s = 1535;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = i6_03.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).mz0().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.025f)).xi0(this.Xq0(14, 2, 2, 0.032f, 0.096f, 0.30004883f, 0.30004883f)).xi0(i6_03.i6((byte)2, s, n, n2, f, f2, pF));
        CustomMove1012Animation i6_04 = this;
        s = 1535;
        n = 2;
        n2 = 14;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = i6_04.Vz0;
        this.E8 = pw_12 = pk_1.el(N4.zr(N4.zr(A2.Kj0(pw_13.xi0(i6_04.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.WW(14, 0.75f, 0.0f, 0.625f, px_1.ep0(Short.MAX_VALUE))), this.WW(16, 0.75f, 0.0f, 0.625f, px_1.ep0(0)), 0.2f), this.WW(14, 0.75f, 0.625f, 0.0f, px_1.ep0(Short.MAX_VALUE)), 0.4f), this.WW(14, 0.75f, 0.0f, 0.625f, px_1.ep0(Short.MAX_VALUE)), 0.6f).xi0(this.WW(14, 0.75f, 0.625f, 0.0f, px_1.ep0(Short.MAX_VALUE))), this.WW(16, 0.75f, 0.625f, 0.0f, px_1.ep0(0))).xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.025f)).p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        i6_02.Vs.jH(this.E8);
        return i6_02;
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        CustomMove1012Animation i6_02 = this;
        CustomMove1012Animation i6_03 = this;
        int n = 1533;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = i6_03.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.8f, 0.05f)).xi0(i6_03.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        CustomMove1012Animation i6_04 = this;
        n = 1505;
        n2 = 2;
        n3 = 14;
        f = 1083.3334f;
        f2 = 0.9375f;
        pF = i6_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(i6_04.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(1012));
        n = 0;
        n2 = 0;
        n3 = 0;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 1012, n, n2, n3, f));
        n = 1;
        n2 = 0;
        n3 = 0;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 1012, n, n2, n3, f));
        n = 2;
        n2 = 0;
        n3 = 0;
        f = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 1012, n, n2, n3, f));
        n = 3;
        n2 = 0;
        n3 = 0;
        f = 0.5f;
        this.E8 = pw_12 = A2.Kj0(pw_17, this.fE0(-1, 1012, n, n2, n3, f), 3.0f).xi0(this.Ue0(4, 0, 1.0f, 0.0f, 0.05f)).xi0(this.tP(0.4f)).mz0().mz0().mz0();
        pw_12.Ms(this.Vs.wP);
        i6_02.Vs.jH(this.E8);
        i6_02.Vc();
        return i6_02;
    }
}


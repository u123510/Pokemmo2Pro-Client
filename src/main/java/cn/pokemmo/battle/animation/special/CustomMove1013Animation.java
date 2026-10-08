/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.Rn
 */
/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1013]
 * 原始类: f.rn_0
 */
public class CustomMove1013Animation
extends MU {
    public CustomMove1013Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1533;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.Ue0(4, 6150, 0.0f, 0.75f, 0.05f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1505;
        n2 = 2;
        n3 = 14;
        f = 1083.3334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(1013)).y80(this.Qh0(642));
        n = 642;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.0f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 1013;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 1013;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 1013;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 1013;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 1013;
        n2 = 4;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = N4.zr(A2.Kj0(pw_18, this.fE0(-1, n, n2, n3, n4, f2), 0.4f).xi0(this.nM(16, 1)), this.EN(16, 2, 13, 0.032f, 0.016f, 0.30004883f, 0.0f), 3.0f).xi0(this.Ue0(4, 0, 1.0f, 0.0f, 0.05f)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().mz0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


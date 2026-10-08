/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.ki0
 */
/**
 * 宝可梦对战技能招式动画 - 帮助 (HelpingHand)
 * 技能编号: 270
 * 原始类: f.ki0_2
 */
public class HelpingHandAnimation
extends MU {
    public HelpingHandAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1422;
        int n2 = 1;
        int n3 = 14;
        float f = 333.33334f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(436));
        n = 436;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.75f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 436;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.75f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 436;
        n2 = 6;
        n3 = 9;
        n4 = 8;
        f2 = 0.75f;
        pw_1 pw_15 = A2.Kj0(pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.EN(14, 2, 1, 0.0f, 0.096f, 1.0f, 0.0f), 0.4f);
        n = 1422;
        n2 = 1;
        n3 = 14;
        float f3 = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 436;
        n2 = 3;
        n3 = 9;
        int n5 = 8;
        f2 = 0.75f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 436;
        n2 = 4;
        n3 = 9;
        n5 = 8;
        f2 = 0.75f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 436;
        n2 = 6;
        n3 = 9;
        n5 = 8;
        f2 = 0.75f;
        pw_1 pw_19 = N4.zr(pw_18.xi0(this.fE0(-1, n, n2, n3, n5, f2)), this.EN(14, 2, 1, 0.0f, 0.096f, 1.0f, 0.0f), 0.8f);
        n = 1422;
        n2 = 1;
        n3 = 14;
        float f4 = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f2, pF));
        n = 436;
        n2 = 5;
        n3 = 9;
        int n6 = 8;
        f2 = 0.75f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n2, n3, n6, f2));
        n = 436;
        n2 = 2;
        n3 = 9;
        n6 = 8;
        f2 = 0.75f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, n, n2, n3, n6, f2));
        n = 436;
        n2 = 6;
        n3 = 9;
        n6 = 8;
        f2 = 0.75f;
        this.E8 = pk_1.el(pw_112.xi0(this.fE0(-1, n, n2, n3, n6, f2)), this.EN(14, 2, 1, 0.0f, 0.096f, 1.0f, 0.0f)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


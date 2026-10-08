/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.qf
 */
/**
 * 宝可梦对战技能招式动画 - 愤怒门牙 (SuperFang)
 * 技能编号: 162
 * 原始类: f.qf_0
 */
public class SuperFangAnimation
extends MU {
    public SuperFangAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        SuperFangAnimation qf_02 = this;
        SuperFangAnimation qf_03 = this;
        int n = 1420;
        int n2 = 1;
        int n3 = 16;
        float f = 166.66667f;
        float f2 = 0.703125f;
        PF pF = qf_03.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(qf_03.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        SuperFangAnimation qf_04 = this;
        n = 1720;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = qf_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(qf_04.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(328));
        n = 0;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 328, n, n2, n3, f));
        n = 1;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 328, n, n2, n3, f));
        n = 2;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 328, n, n2, n3, f));
        n = 3;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_17.xi0(this.fE0(-1, 328, n, n2, n3, f)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.19995117f, -0.19995117f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        qf_02.Vs.jH(this.E8);
        qf_02.Vc();
        return qf_02;
    }
}


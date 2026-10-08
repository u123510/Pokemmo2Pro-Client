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
 * Renamed from f.Wh0
 */
/**
 * 宝可梦对战技能招式动画 - 舌舔 (Lick)
 * 技能编号: 122
 * 原始类: f.wh0_0
 */
public class LickAnimation
extends MU {
    public LickAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        LickAnimation wh0_02 = this;
        short s = 0;
        int n = 11;
        int n2 = 8;
        float f = 0.5f;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.35f)).mz0().Xf0().y80(this.Qh0(287)).xi0(this.fE0(-1, 287, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 287, s, n, n2, f)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.144f, -0.30004883f, 0.30004883f));
        LickAnimation wh0_03 = this;
        s = 1476;
        n = 1;
        n2 = 16;
        f = 0.0f;
        float f2 = 0.9375f;
        PF pF = wh0_03.Vz0;
        pw_1 pw_15 = pw_14.xi0(wh0_03.i6((byte)2, s, n, n2, f, f2, pF));
        LickAnimation wh0_04 = this;
        s = 1477;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.390625f;
        pF = wh0_04.Vz0;
        this.E8 = pw_12 = pk_1.el(A2.Kj0(pw_15, wh0_04.i6((byte)2, s, n, n2, f, f2, pF), 0.16f), this.EN(16, 2, 6, 0.016f, 0.032f, 0.100097656f, 0.0f)).xi0(this.tP(0.35f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        wh0_02.Vs.jH(this.E8);
        wh0_02.Vc();
        return wh0_02;
    }
}


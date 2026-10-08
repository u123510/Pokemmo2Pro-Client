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
 * Renamed from f.r90
 */
/**
 * 宝可梦对战技能招式动画 - 空手劈 (KarateChop)
 * 技能编号: 2
 * 原始类: f.r90_0
 */
public class KarateChopAnimation
extends MU {
    public KarateChopAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        KarateChopAnimation r90_02 = this;
        short s = 0;
        int n = 11;
        int n2 = 8;
        float f = 0.5f;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(162)).xi0(this.fE0(-1, 162, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 162, s, n, n2, f)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f));
        KarateChopAnimation r90_03 = this;
        s = 1421;
        n = 1;
        n2 = 16;
        f = 0.0f;
        float f2 = 0.9765625f;
        PF pF = r90_03.Vz0;
        pw_1 pw_15 = pw_14.xi0(r90_03.i6((byte)2, s, n, n2, f, f2, pF));
        KarateChopAnimation r90_04 = this;
        s = 1420;
        n = 2;
        n2 = 16;
        f = 166.66667f;
        f2 = 0.859375f;
        pF = r90_04.Vz0;
        this.E8 = pw_12 = HB.p30(pw_15, r90_04.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        r90_02.Vs.jH(this.E8);
        r90_02.Vc();
        return r90_02;
    }
}


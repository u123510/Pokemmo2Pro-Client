/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 欺诈 (FoulPlay)
 * 技能编号: 492
 * 原始类: f.A7
 */
public class FoulPlayAnimation
extends MU {
    public FoulPlayAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        (this.E8 = pk_1.el(
            A2.Kj0(
                pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).mz0().Xf0()
                    .xi0(this.i6((byte)2, (short)1489, 1, 14, 0.0f, 0.9921875f, this.Vz0)),
                this.i6((byte)2, (short)1420, 2, 16, 450.0f, 0.9921875f, this.Vz0),
                0.2f
            ).y80(this.Qh0(661))
             .xi0(this.fE0(-1, 661, 2, 11, 8, 0.4f))
             .xi0(this.fE0(-1, 661, 1, 11, 8, 0.4f))
             .xi0(this.fE0(-1, 661, 0, 11, 8, 0.4f))
             .xi0(this.nM(16, 1)),
            this.Xq0(16, 2, 1, 0.0f, 0.096f, -0.30004883f, 0.30004883f)
        ).xi0(this.nM(16, 0)).p1(0.6f).mz0().Xf0().mz0())
        .Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


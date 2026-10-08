/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 金属爆炸 (MetalBurst)
 * 技能编号: 368
 * 原始类: f.AF0
 */
public class MetalBurstAnimation
extends MU {
    public MetalBurstAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        (this.E8 = Zw0.H(
            pk_1.el(
                A2.Kj0(
                    HB.p30(
                        pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)),
                        this.Ue0(4, 0, 0.0f, 0.8125f, 0.025f)
                    ).xi0(this.i6((byte)2, (short)1714, 2, 14, 0.0f, 0.859375f, this.Vz0))
                     .xi0(this.Sv0(2, 0, 240.0f, 320.0f))
                     .xi0(this.i6((byte)2, (short)1516, 1, 14, 666.6667f, 0.9375f, this.Vz0))
                     .xi0(this.i6((byte)2, (short)1775, 1, 16, 833.3333f, 0.859375f, this.Vz0))
                     .xi0(this.i6((byte)2, (short)1424, 2, 16, 833.3333f, 0.9921875f, this.Vz0))
                     .y80(this.Qh0(542))
                     .xi0(this.fE0(-1, 542, 0, 9, 8, 0.4f))
                     .xi0(this.fE0(-1, 542, 2, 9, 8, 0.4f)),
                    this.fE0(-1, 542, 3, 9, 8, 0.4f),
                    0.8f
                ).xi0(this.nM(16, 1))
                 .xi0(this.EN(16, 2, 6, 0.016f, 0.032f, 0.19995117f, 0.0f)),
                this.fE0(-1, 542, 1, 11, 8, 0.4f)
            ).xi0(this.nM(16, 0)).p1(0.6f),
            this.Ue0(4, 0, 0.8125f, 0.0f, 0.025f)
        )).Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


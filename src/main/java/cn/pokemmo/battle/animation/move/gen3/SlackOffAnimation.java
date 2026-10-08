/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 偷懒 (SlackOff)
 * 技能编号: 303
 * 原始类: f.A60
 */
public class SlackOffAnimation
extends MU {
    public SlackOffAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        (this.E8 = HB.p30(
            pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0()
                .xi0(this.i6((byte)2, (short)1964, 1, 14, 0.0f, 0.9375f, this.Vz0))
                .xi0(this.i6((byte)2, (short)1780, 2, 14, 0.0f, 0.546875f, this.Vz0))
                .xi0(this.Xq0(14, 2, 1, 0.016f, 0.096f, 0.30004883f, -0.30004883f))
                .y80(this.Qh0(469))
                .xi0(this.WW(14, 1.0f, 0.0f, 0.75f, px_1.ep0(Short.MAX_VALUE))),
            this.fE0(-1, 469, 0, 9, 8, 0.5f)
        ).xi0(this.WW(14, 1.0f, 0.75f, 0.0f, px_1.ep0(Short.MAX_VALUE)))
         .xi0(this.tP(0.4f)).mz0().Xf0().mz0())
        .Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


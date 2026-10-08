/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 喷烟 (LavaPlume)
 * 技能编号: 436
 * 原始类: f.AW
 */
public class LavaPlumeAnimation
extends MU {
    public LavaPlumeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        (this.E8 = pk_1.el(
            pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).mz0().Xf0()
                .xi0(this.i6((byte)2, (short)1475, 1, 16, 0.0f, 0.9375f, this.Vz0))
                .xi0(this.i6((byte)2, (short)1425, 2, 14, 0.0f, 0.9375f, this.Vz0))
                .xi0(this.Sv0(2, 1, 320.0f, 800.0f))
                .xi0(this.i6((byte)2, (short)1376, 2, 2, 666.6667f, 0.0f, this.Vz0))
                .xi0(this.i6((byte)2, (short)1419, 3, 16, 750.0f, 0.390625f, this.Vz0))
                .xi0(this.i6((byte)2, (short)1535, 1, 16, 750.0f, 0.9921875f, this.Vz0))
                .y80(this.Qh0(611))
                .xi0(this.fE0(-1, 611, 0, 9, 8, 0.4f))
                .xi0(this.fE0(-1, 611, 1, 9, 8, 0.4f))
                .xi0(this.fE0(-1, 611, 2, 9, 8, 0.4f))
                .xi0(this.nM(16, 1))
                .TD0().p1(0.8f).Xf0()
                .xi0(this.EN(16, 2, 4, 0.016f, 0.032f, 0.30004883f, 0.0f)),
            this.WW(16, 0.75f, 0.0f, 0.8125f, px_1.ep0(31))
        ).xi0(this.WW(16, 0.75f, 0.8125f, 0.0f, px_1.ep0(31)))
         .xi0(this.nM(16, 0)).p1(0.6f).mz0().Xf0().mz0())
        .Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleA6Animation
 * 原始类: f.A6
 */
public class BattleA6Animation
extends MU {
    public BattleA6Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        (this.E8 = Zw0.H(
            pk_1.el(
                A2.Kj0(
                    HB.p30(
                        pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)),
                        this.Ue0(4, 0, 0.0f, 1.0f, 0.1f)
                    ).y80(ao_1.pc(new lpt4__4(this, 0, false))).mz0().Xf0()
                     .xi0(this.i6((byte)2, (short)1483, 1, 14, 166.66667f, 0.8984375f, this.Vz0))
                     .xi0(this.Sv0(1, 0, 0.0f, 800.0f))
                     .xi0(this.i6((byte)2, (short)1358, 2, 14, 1166.6666f, 0.8984375f, this.Vz0))
                     .y80(this.Qh0(1)),
                    this.fE0(-1, 1, 1, 9, 8, 0.5f),
                    1.0f
                ).xi0(this.fE0(-1, 1, 0, 9, 8, 0.5f)),
                this.WW(14, 0.25f, 0.0f, 0.625f, px_1.ep0(Short.MAX_VALUE))
            ).y80(ao_1.pc(new lpt4__4(this, 0, true)))
             .xi0(this.Ue0(4, 0, 1.0f, 0.0f, 0.1f))
             .xi0(this.tP(0.4f)),
            this.WW(14, 0.25f, 0.625f, 0.0f, px_1.ep0(Short.MAX_VALUE))
        )).Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


package cn.pokemmo.battle.animation.special;

import f.*;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleEa1Animation
 * 原始类: f.ea_1
 */
public class BattleEa1Animation extends MU {
    public final PF[] HE;

    public BattleEa1Animation(PF... effects) {
        super(effects[0]);
        this.HE = effects;
    }

    @Override
    public final MU us() {
        this.E8 = pw_1.xC();
        for (PF effect : this.HE) {
            this.E8.TD0()
                    .y80(ao_1.pc((index, timeline) -> this.ZS(effect, index, timeline)))
                    .Xf0()
                    .y80(this.E2(18, true))
                    .mz0()
                    .Xf0()
                    .y80(this.wn0("10th_anniv_getting_pumped"));

            this.E8.xi0(this.i6((byte)2, (short)1474, 1, 14, 0.0F, 0.9375F, this.Vz0));
            this.E8.xi0(this.i6((byte)2, (short)1418, 3, 14, 0.0F, 0.859375F, this.Vz0));
            this.E8.xi0(this.Sv0(1, 0, 0.0F, 800.0F));
            this.E8.xi0(this.Sv0(3, 0, 0.0F, 800.0F));
            pw_1 burst = this.i6((byte)2, (short)1376, 3, 14, 1000.0F, 0.0F, this.Vz0);
            this.E8 = HB.p30(this.E8, burst)
                    .y80(this.E2(18, false))
                    .xi0(this.tP(0.400000006F))
                    .mz0()
                    .mz0();
        }
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }

    @Override
    public final boolean Bv0(boolean value) {
        return false;
    }
}

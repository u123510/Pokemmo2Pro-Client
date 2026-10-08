package cn.pokemmo.battle.animation.special;

import f.*;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleLpt75Animation
 * 原始类: f.lpt7__5
 */
public class BattleLpt75Animation extends MU {
    public BattleLpt75Animation(PF pf, PF... pfArr) {
        super(pf);
        kA0(pfArr);
    }

    public final MU us() {
        this.E8 = HB.p30(
            pw_1.xC()
                .xi0(Wt(4, 0.4F))
                .Xf0()
                .p1(0.6F)
                .Xf0()
                .y80(QO(38))
                .y80(ao_1.pc(new lpt4__4(this, 2, true))),
            Ue0(4, 0, 0.0F, 1.0F, 0.05F)
        )
        .y80(ao_1.pc(new lpt4__4(this, 0, false)))
        .y80(ao_1.pc(new lpt4__4(this, 1, false)))
        .xi0(Ue0(3, 0, 0.8125F, 0.0F, 0.05F))
        .xi0(mf0(4, 0, 24, 2.88F))
        .y80(E2(18, true))
        .y80(Qh0(639))
        .xi0(i6((byte) 2, (short) 1806, 1, 14, 0.0F, 0.9921875F, this.Vz0))
        .mz0();

        I2 i2 = this.CoM9.ZD();
        while (i2.hasNext()) {
            PF pf = (PF) i2.next();
            this.E8.xi0(kL0(pf))
                .TD0()
                .xi0(
                    pk_1.el(
                        N4.zr(
                            pw_1.xC()
                                .Xf0()
                                .xi0(nM(14, 1))
                                .TD0()
                                .Xf0()
                                .xi0(Xq0(14, 2, 6, 0.032F, 0.064F, -0.1000976562F, 0.1000976562F))
                                .mz0()
                                .mz0()
                                .TD0()
                                .p1(0.64F)
                                .xi0(WW(14, 0.5F, 0.0F, 0.625F, px_1.ep0(31)))
                                .mz0()
                                .TD0()
                                .p1(0.96F)
                                .Xf0(),
                            WW(14, 0.5F, 0.625F, 0.0F, px_1.ep0(31)),
                            1.28F
                        ),
                        WW(14, 0.5F, 0.0F, 0.625F, px_1.ep0(31))
                    )
                    .xi0(Ue0(3, 0, 0.0F, 1.0F, 0.05F))
                    .mz0()
                    .p1(0.4F)
                    .xi0(nM(14, 0))
                    .mz0()
                );
        }

        this.E8.Xf0()
            .xi0(Ue0(2, 0, 1.0F, 0.0F, 0.025F))
            .y80(ao_1.pc(new lpt4__4(this, 0, true)))
            .y80(ao_1.pc(new lpt4__4(this, 1, true)))
            .y80(ao_1.pc(new lpt4__4(this, 2, false)))
            .xi0(WW(14, 0.5F, 0.625F, 0.0F, px_1.ep0(31)))
            .xi0(nM(14, 0))
            .y80(E2(18, false))
            .p1(0.6F)
            .mz0();

        this.E8.mz0();
        this.E8.xi0(tP(0.4F));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        Vc();
        return this;
    }
}

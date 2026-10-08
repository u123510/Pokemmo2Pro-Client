package cn.pokemmo.battle.animation.special;

import f.*;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleM900Animation
 * 原始类: f.m90_0
 */
public class BattleM900Animation extends MU {
    public final PF[] a50;

    public BattleM900Animation(PF pf, PF[] pfArr) {
        super(pf);
        this.a50 = pfArr;
        this.kA0(pfArr);
    }

    @Override
    public final MU us() {
        co_1.Xh = this.nn0() ? ri_0.pN : ri_0.xQ;
        co_1.Kl0.np(this.Vz0.LpT9.j);
        co_1.cOm6.np(this.a50[0].LpT9.j);

        pw_1 action = pw_1.xC().Xf0()
                .xi0(this.Wt(0, 0.400000006F))
                .xi0(this.i6((byte) 2, (short) 1897, 1, 14, 500.0F, 0.46875F, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1511, 2, 14, 0.0F, 0.9921875F, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1511, 2, 14, 833.3333129883F, 0.9921875F, this.Vz0))
                .xi0(this.nM(14, 1))
                .y80(this.E2(18, true))
                .xi0(this.Xq0(14, 2, 1, 0.0160000008F, 0.1920000017F, 0.3000488281F, -0.3000488281F))
                .y80(this.Qh0(218))
                .xi0(this.fE0(-1, 218, 3, 9, 8, 0.0F))
                .xi0(this.fE0(-1, 218, 1, 11, 8, 0.0F))
                .xi0(this.fE0(-1, 218, 4, 9, 8, 0.0F));

        action = A2.Kj0(action, this.fE0(-1, 218, 5, 9, 11, 0.0F), 0.400000006F)
                .xi0(this.Wt(0, 1.0F))
                .mz0()
                .mz0()
                .TD0()
                .p1(1.0F)
                .Xf0()
                .xi0(this.Wt(1, 0.8000000119F))
                .xi0(this.Xq0(14, 2, 1, 0.0160000008F, 0.0799999982F, -0.3000488281F, 0.3000488281F))
                .xi0(this.i6((byte) 2, (short) 1511, 1, 16, 500.0F, 0.9921875F, this.Vz0))
                .xi0(this.i6((byte) 2, (short) 1897, 2, 16, 500.0F, 0.9921875F, this.Vz0));

        action = N4.zr(action, this.i6((byte) 2, (short) 1376, 2, 16, 1666.6666259766F, 0.0F, this.Vz0), 1.3999999762F)
                .xi0(this.fE0(-1, 218, 2, 11, 8, 0.0F));

        action = N4.zr(action, this.Sv0(2, 1, 320.0F, 400.0F), 1.6000000238F)
                .xi0(this.nM(16, 1))
                .xi0(this.WW(16, 0.75F, 0.0F, 0.75F, px_1.ep0(32767)));

        action = N4.zr(action, this.EN(16, 2, 8, 0.0320000015F, 0.0160000008F, 0.3000488281F, 0.0F), 2.0399999619F);

        action = pk_1.el(action, this.WW(16, 0.75F, 0.75F, 0.0F, px_1.ep0(32767)))
                .xi0(this.tP(0.400000006F))
                .TD0()
                .p1(0.1199999973F)
                .Xf0()
                .y80(this.E2(18, false))
                .xi0(this.nM(14, 0))
                .xi0(this.nM(16, 0))
                .mz0()
                .mz0()
                .mz0()
                .Xf0()
                .mz0();

        this.E8 = action;
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

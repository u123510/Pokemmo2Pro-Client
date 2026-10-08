package cn.pokemmo.battle.animation.special;

import f.*;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleKm0Animation
 * 原始类: f.km_0
 */
public class BattleKm0Animation extends MU {
    public final boolean um0;

    public BattleKm0Animation(PF pf, boolean z) {
        super(pf);
        this.um0 = z;
    }

    @Override
    public final MU us() {
        float f1 = (this.nn0() ? 1.0f : -1.0f) * dw_2.ej;
        pw_1 pw_1Var = pw_1.xC()
                .y80(Qh0(729))
                .Xf0()
                .xi0(Wt(0, 0.6f))
                .xi0(nM(14, 1))
                .mz0()
                .Xf0()
                .xi0(fE0(-1, 729, 0, 9, 8, 0.0f))
                .xi0(WW(14, 0.5f, 0.0f, 0.5f, px_1.ep0(31)))
                .xi0(Xq0(14, 1, 2, 0.016f, 0.228f, 1.2f, 1.2f))
                .xi0(i6((byte) 2, (short) 1412, 0, 14, 100.0f, 1.0f, this.Vz0))
                .xi0(i6((byte) 2, (short) 1440, 0, 14, 950.0f, 1.0f, this.Vz0));
        this.E8 = pw_1Var;
        if (this.um0) {
            pw_1Var.TD0().p1(1.0f).y80(MU.eK0((short) 1557, this.Vz0.COm2())).mz0();
        }
        this.E8.mz0()
                .y80(ao_1.pc((i, d2) -> ra0(f1, i, d2)))
                .Xf0()
                .xi0(nM(14, 0))
                .xi0(WW(14, 0.5f, 0.5f, 0.0f, px_1.ep0(31)))
                .xi0(Xq0(14, 1, 2, 0.016f, 0.228f, 1.0f, 1.0f))
                .mz0()
                .xi0(tP(0.4f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        Vc();
        return this;
    }

    public final /* synthetic */ void ra0(float f, int i, D2 d2) {
        tw0_0.RE0.IE((byte) 2, (short) 1, this.Vz0.p10(), true, f, 0.6f, 1.0f, 200);
    }
}

package cn.pokemmo.battle.animation.special;

import f.*;

import java.util.List;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleBs1Animation
 * 原始类: f.bs_1
 */
public class BattleBs1Animation extends MU {
    public final List F8;
    public final List yz0;
    public final boolean YD;

    public BattleBs1Animation(boolean bl, List list, List list2) {
        super(null);
        this.F8 = list;
        this.yz0 = list2;
        this.YD = bl;
    }

    @Override
    public final MU us() {
        this.E8 = pw_1.xC().Xf0();
        short s = this.F8.size() > this.yz0.size() ? (short) 1557 : 1558;
        this.E8.y80(MU.eK0(s, this.YD));
        if (!this.F8.isEmpty()) {
            float f = 0.2f;
            for (Object obj : this.F8) {
                PF pF = (PF) obj;
                this.E8.TD0().p1(f).xi0(this.kL0(pF)).y80(ao_1.pc(this::h50)).mz0();
                f += 0.15f;
            }
        }
        if (!this.yz0.isEmpty()) {
            float f = 0.2f;
            for (Object obj : this.yz0) {
                PF pF = (PF) obj;
                this.E8.TD0().p1(f).xi0(this.kL0(pF)).y80(ao_1.pc(this::kd0)).mz0();
                f += 0.15f;
            }
        }
        this.E8.mz0();
        this.E8.xi0(this.tP(0.4f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }

    public final void kd0(int n, D2 d2) {
        this.Mr0(this.Jv("status/down"));
    }

    public final void h50(int n, D2 d2) {
        this.Mr0(this.Jv("status/up"));
    }
}


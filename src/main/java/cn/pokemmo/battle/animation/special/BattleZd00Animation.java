package cn.pokemmo.battle.animation.special;

import f.*;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleZd00Animation
 * 原始类: f.zd0_0
 */
public class BattleZd00Animation extends MU {
    public final PF Rd0;
    public final short HG;

    public BattleZd00Animation(PF pf, short s) {
        super(pf);
        this.vv(pf);
        this.Rd0 = pf;
        this.HG = s;
    }

    @Override
    public final void R10() {
        super.R10();
        this.Rd0.zi0.Fe0((byte) 2);
        this.Rd0.zi0.Sj = this.HG;
        this.Rd0.zi0.Bn.hB(this.HG);
    }

    @Override
    public final MU us() {
        this.Rd0.U7(0.75f);
        this.E8 = pw_1.xC();
        pw_1 pw = this.E8.TD0();
        float f1 = di0_0.Ks(this.Rd0.p10()) / 1000.0f + 0.25f;
        pw.Sq0 += f1;
        this.E8.xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).Xf0();

        com3__3[] parts = this.Rd0.Br0;
        int len = parts.length;
        for (int i = 0; i < len; i++) {
            com3__3 part = parts[i];
            ao_1 ao1 = ao_1.DX(part, 7, 2.5f);
            ao1.h5[0] = 0.667f;
            this.E8.y80(ao1);
            this.E8.y80(ao_1.DX(part, 4, 2.5f).kt(5.2f, 3.08f, 1.0f));
        }

        this.E8.TD0().p1(0.25f).Xf0();
        this.E8.xi0(this.i6((byte) 2, (short) 1440, 0, 16, 166.66667f, 0.859375f, this.Vz0));
        this.E8.y80(this.wn0("titan_steam")).mz0().mz0().mz0();
        this.E8.y80(ao_1.pc(this::sl0));

        com3__3[] parts2 = this.Rd0.Br0;
        int len2 = parts2.length;
        for (int i = 0; i < len2; i++) {
            com3__3 part = parts2[i];
            ao_1 ao2 = ao_1.DX(part, 13, 1.0f);
            ao2.h5[0] = 1.0f;
            this.E8.y80(ao2);
        }

        this.E8.p1(0.4f);
        this.E8.xi0(this.tP(0.4f)).mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }

    @Override
    public final boolean Bv0(boolean booleanValue) {
        return true;
    }

    public final void sl0(int i, D2 d2) {
        na0_0 na = (na0_0) this.Rd0.LpT9.K7.sg(na0_0.UG);
        if (na != null) {
            na.aD = 0.0f;
        }
    }
}

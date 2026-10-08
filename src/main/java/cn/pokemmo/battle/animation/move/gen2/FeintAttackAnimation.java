/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Ya0
 */
/**
 * 宝可梦对战技能招式动画 - 出奇一击 (FeintAttack)
 * 技能编号: 185
 * 原始类: f.ya0_0
 */
public class FeintAttackAnimation
extends MU {
    public FeintAttackAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1445;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().p1(0.6f), this.Ue0(4, 0, 0.0f, 0.8125f, 0.025f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 833.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 480.0f, 320.0f)).TD0().p1(0.6f).Xf0().p1(0.6f).mz0().mz0().TD0().p1(1.2f).Xf0();
        n = 1420;
        n2 = 2;
        n3 = 16;
        f = 250.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f = 316.66666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.df0(14, 3)).y80(this.Qh0(351));
        n = 351;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.4f;
        pw_1 pw_16 = N4.zr(pw_15, this.fE0(-1, n, n2, n3, n4, f2), 1.4f);
        n = 351;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.4f;
        this.E8 = pk_1.el(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f)).xi0(this.nM(16, 0)).xi0(this.df0(14, 4)).xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.025f)).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


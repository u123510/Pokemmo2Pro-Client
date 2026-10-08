/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.gb
 */
/**
 * 宝可梦对战技能招式动画 - 惩罚 (Punishment)
 * 技能编号: 386
 * 原始类: f.gb_1
 */
public class PunishmentAnimation
extends MU {
    public PunishmentAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        PunishmentAnimation gb_12 = this;
        PunishmentAnimation gb_13 = this;
        int n = 1435;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = gb_13.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).xi0(gb_13.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        PunishmentAnimation gb_14 = this;
        n = 1420;
        n2 = 1;
        n3 = 14;
        f = 500.0f;
        f2 = 0.9375f;
        pF = gb_14.Vz0;
        pw_1 pw_14 = pw_13.xi0(gb_14.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(561));
        n = 0;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 561, n, n2, n3, f));
        n = 1;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 561, n, n2, n3, f));
        n = 2;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(A2.Kj0(pw_16, this.fE0(-1, 561, n, n2, n3, f), 0.4f).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.19995117f, -0.19995117f)).xi0(this.nM(16, 0)).mz0().Xf0().xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        gb_12.Vs.jH(this.E8);
        gb_12.Vc();
        return gb_12;
    }
}


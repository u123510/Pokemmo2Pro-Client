/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.px
 */
/**
 * 宝可梦对战技能招式动画 - 魔法反射 (MagicCoat)
 * 技能编号: 277
 * 原始类: f.px_2
 */
public class MagicCoatAnimation
extends MU {
    public MagicCoatAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        MagicCoatAnimation px_22 = this;
        MagicCoatAnimation px_23 = this;
        int n = 1472;
        int n2 = 1;
        int n3 = 14;
        float f = 333.33334f;
        float f2 = 0.9921875f;
        PF pF = px_23.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(px_23.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        MagicCoatAnimation px_24 = this;
        n = 1433;
        n2 = 2;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.9921875f;
        pF = px_24.Vz0;
        pw_1 pw_14 = pw_13.xi0(px_24.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        MagicCoatAnimation px_25 = this;
        n = 1473;
        n2 = 1;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.546875f;
        pF = px_25.Vz0;
        pw_1 pw_15 = pw_14.xi0(px_25.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(443));
        n = 2;
        n2 = 9;
        n3 = 8;
        f = 0.375f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 443, n, n2, n3, f));
        n = 0;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_17 = A2.Kj0(pw_16, this.fE0(-1, 443, n, n2, n3, f), 0.32f);
        n = 1;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_18 = N4.zr(pw_17, this.fE0(-1, 443, n, n2, n3, f), 1.12f);
        n = 3;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(pw_18, this.fE0(-1, 443, n, n2, n3, f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        px_22.Vs.jH(this.E8);
        px_22.Vc();
        return px_22;
    }
}


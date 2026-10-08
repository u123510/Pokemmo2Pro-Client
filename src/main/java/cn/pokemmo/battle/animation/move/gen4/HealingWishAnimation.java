/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;

/*
 * Renamed from f.yj0
 */
/**
 * 宝可梦对战技能招式动画 - 治愈之愿 (HealingWish)
 * 技能编号: 361
 * 原始类: f.yj0_2
 */
public class HealingWishAnimation
extends MU {
    public HealingWishAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        HealingWishAnimation yj0_22 = this;
        int n = 0;
        boolean bl = false;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl);
        HealingWishAnimation yj0_23 = this;
        n = 1483;
        int n2 = 1;
        int n3 = 14;
        float f = 166.66667f;
        float f2 = 0.8984375f;
        PF pF = yj0_23.Vz0;
        pw_1 pw_13 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)), this.Ue0(4, 0, 0.0f, 1.0f, 0.1f)).y80(ao_1.pc(lpt4__42)).mz0().Xf0().xi0(yj0_23.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        HealingWishAnimation yj0_24 = this;
        n = 1358;
        int n4 = 2;
        n3 = 14;
        f = 333.33334f;
        f2 = 0.8984375f;
        pF = yj0_24.Vz0;
        pw_1 pw_14 = pw_13.xi0(yj0_24.i6((byte)2, (short)n, n4, n3, f, f2, pF)).y80(this.Qh0(535));
        n = 0;
        int n5 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 535, n, n5, n3, f));
        n = 1;
        int n6 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 535, n, n6, n3, f));
        n = 2;
        int n7 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_17 = HB.p30(pw_16, this.fE0(-1, 535, n, n7, n3, f));
        n = 0;
        boolean bl2 = true;
        this.E8 = pw_12 = pw_17.y80(ao_1.pc(new lpt4__4(this, n, bl2))).xi0(this.Ue0(4, 0, 1.0f, 0.0f, 0.1f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        yj0_22.Vs.jH(this.E8);
        yj0_22.Vc();
        return yj0_22;
    }
}


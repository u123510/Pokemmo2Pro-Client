/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;

/*
 * Renamed from f.an
 */
/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1027]
 * 原始类: f.an_2
 */
public class CustomMove1027Animation
extends MU {
    public CustomMove1027Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 0;
        int n2 = 0;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, n2 != 0);
        n = 1487;
        n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.E2(18, true)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.075f)).y80(ao_1.pc(lpt4__42)).mz0().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 480.0f)).y80(this.Qh0(634));
        n = 634;
        n2 = 3;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 634;
        n2 = 4;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = HB.p30(pw_13, this.fE0(-1, n, n2, n3, n4, f2));
        n = 1473;
        n2 = 2;
        n3 = 14;
        float f3 = 333.33334f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1941;
        n2 = 1;
        n3 = 14;
        f3 = 1000.0f;
        f2 = 0.9765625f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 634;
        n2 = 0;
        n3 = 9;
        int n5 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 634;
        n2 = 5;
        n3 = 9;
        n5 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 634;
        n2 = 6;
        n3 = 9;
        n5 = 8;
        f2 = 0.5f;
        this.E8 = pw_18.xi0(this.fE0(-1, n, n2, n3, n5, f2)).mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


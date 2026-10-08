/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.h90
 */
/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1008]
 * 原始类: f.h90_0
 */
public class CustomMove1008Animation
extends MU {
    public CustomMove1008Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        CustomMove1008Animation h90_02 = this;
        CustomMove1008Animation h90_03 = this;
        int n = 1534;
        int n2 = 2;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = h90_03.Xp;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.5f)).xi0(h90_03.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(1008)).xi0(this.WW(16, 0.25f, 0.0f, 0.75f, px_1.ep0(31))).p1(0.6f);
        n = 0;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 1008, n, n2, n3, f));
        n = 1;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 1008, n, n2, n3, f));
        n = 2;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pw_15.xi0(this.fE0(-1, 1008, n, n2, n3, f)).xi0(this.EN(16, 2, 6, 0.016f, 0.032f, 0.19995117f, 0.0f)).xi0(this.Sv0(1, 1, 320.0f, 480.0f)).p1(0.6f).xi0(this.nM(16, 1)).mz0().Xf0().xi0(this.WW(16, 0.25f, 0.625f, 0.0f, px_1.ep0(31))).xi0(this.nM(16, 0)).xi0(this.tP(0.25f)).mz0();
        pw_12.Ms(this.Vs.wP);
        h90_02.Vs.jH(this.E8);
        h90_02.Vc();
        return h90_02;
    }
}


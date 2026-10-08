/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 碎岩 (RockSmash)
 * 技能编号: 249
 * 原始类: f.WO
 */
public class RockSmashAnimation
extends MU {
    public RockSmashAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1460;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 48.0f, 128.0f));
        n = 1885;
        n2 = 2;
        n3 = 16;
        f = 183.33333f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1488;
        n2 = 1;
        n3 = 16;
        f = 283.33334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(415));
        n = 415;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 415;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = HB.p30(pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.0f, 0.096f, 0.39990234f, -0.39990234f)).xi0(this.tP(0.25f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.Zi0
 */
/**
 * 宝可梦对战技能招式动画 - 恶魔之吻 (LovelyKiss)
 * 技能编号: 142
 * 原始类: f.zi0_0
 */
public class LovelyKissAnimation
extends MU {
    public LovelyKissAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        LovelyKissAnimation zi0_02 = this;
        LovelyKissAnimation zi0_03 = this;
        short s = 1437;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = zi0_03.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.25f)).mz0().Xf0().xi0(zi0_03.i6((byte)2, s, n, n2, f, f2, pF));
        LovelyKissAnimation zi0_04 = this;
        s = 1723;
        n = 2;
        n2 = 16;
        f = 166.66667f;
        f2 = 0.9375f;
        pF = zi0_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(zi0_04.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(307));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 307, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_15.xi0(this.fE0(-1, 307, s, n, n2, f)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f)).xi0(this.tP(0.25f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        zi0_02.Vs.jH(this.E8);
        zi0_02.Vc();
        return zi0_02;
    }
}


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
 * Renamed from f.cOM5
 */
/**
 * 宝可梦对战技能招式动画 - 拍击 (Pound)
 * 技能编号: 1
 * 原始类: f.com5__3
 */
public class PoundAnimation
extends MU {
    public PoundAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        PoundAnimation com5__32 = this;
        short s = 0;
        int n = 11;
        int n2 = 8;
        float f = 0.5f;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(161)).xi0(this.fE0(-1, 161, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 161, s, n, n2, f));
        PoundAnimation com5__33 = this;
        s = 1420;
        n = 1;
        n2 = 16;
        f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = com5__33.Vz0;
        pw_1 pw_15 = pw_14.xi0(com5__33.i6((byte)2, s, n, n2, f, f2, pF));
        PoundAnimation com5__34 = this;
        s = 1420;
        n = 2;
        n2 = 16;
        f = 133.33333f;
        f2 = 0.78125f;
        pF = com5__34.Vz0;
        this.E8 = pw_12 = HB.p30(pw_15.xi0(com5__34.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.0f, 0.032f, 0.100097656f, -0.100097656f)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        com5__32.Vs.jH(this.E8);
        com5__32.Vc();
        return com5__32;
    }
}


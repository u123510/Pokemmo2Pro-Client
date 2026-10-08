/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.lPt5
 */
/**
 * 宝可梦对战技能招式动画 - 顺风 (Tailwind)
 * 技能编号: 366
 * 原始类: f.lpt5__4
 */
public class TailwindAnimation
extends MU {
    public TailwindAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        TailwindAnimation lpt5__42 = this;
        TailwindAnimation lpt5__43 = this;
        short s = 1497;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = lpt5__43.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().p1(0.4f).y80(this.Qh0(540)).xi0(lpt5__43.i6((byte)2, s, n, n2, f, f2, pF));
        TailwindAnimation lpt5__44 = this;
        s = 1376;
        n = 1;
        n2 = 14;
        f = 1833.3334f;
        f2 = 0.0f;
        pF = lpt5__44.Vz0;
        pw_1 pw_14 = pw_13.xi0(lpt5__44.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1760.0f)).xi0(this.Sv0(1, 1, 1440.0f, 320.0f));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 540, s, n, n2, f));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.0f;
        this.E8 = pw_12 = HB.p30(pw_15, this.fE0(-1, 540, s, n, n2, f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        lpt5__42.Vs.jH(this.E8);
        lpt5__42.Vc();
        return lpt5__42;
    }
}


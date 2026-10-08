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
 * Renamed from f.CON
 */
/**
 * 宝可梦对战技能招式动画 - 诱惑 (Captivate)
 * 技能编号: 445
 * 原始类: f.CON_
 */
public class CaptivateAnimation
extends MU {
    public CaptivateAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        CaptivateAnimation cON_ = this;
        CaptivateAnimation cON_2 = this;
        short s = 1786;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = cON_2.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).mz0().Xf0().xi0(cON_2.i6((byte)2, s, n, n2, f, f2, pF));
        CaptivateAnimation cON_3 = this;
        s = 1786;
        n = 1;
        n2 = 14;
        f = 500.0f;
        f2 = 0.234375f;
        pF = cON_3.Vz0;
        pw_1 pw_14 = pw_13.xi0(cON_3.i6((byte)2, s, n, n2, f, f2, pF));
        CaptivateAnimation cON_4 = this;
        s = 1473;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.859375f;
        pF = cON_4.Vz0;
        pw_1 pw_15 = pw_14.xi0(cON_4.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(620));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 620, s, n, n2, f));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_16, this.fE0(-1, 620, s, n, n2, f)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        cON_.Vs.jH(this.E8);
        cON_.Vc();
        return cON_;
    }
}


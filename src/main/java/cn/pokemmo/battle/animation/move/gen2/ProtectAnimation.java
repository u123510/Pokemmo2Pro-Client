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
 * 宝可梦对战技能招式动画 - 守住 (Protect)
 * 技能编号: 182
 * 原始类: f.QC0
 */
public class ProtectAnimation
extends MU {
    public ProtectAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        ProtectAnimation qC0 = this;
        short s = 0;
        int n = 9;
        int n2 = 8;
        float f = 0.5f;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().y80(this.Qh0(348)).xi0(this.fE0(-1, 348, s, n, n2, f));
        ProtectAnimation qC02 = this;
        s = 1471;
        n = 1;
        n2 = 14;
        f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = qC02.Vz0;
        pw_1 pw_14 = pw_13.xi0(qC02.i6((byte)2, s, n, n2, f, f2, pF));
        ProtectAnimation qC03 = this;
        s = 1358;
        n = 2;
        n2 = 14;
        f = 333.33334f;
        f2 = 0.625f;
        pF = qC03.Vz0;
        this.E8 = pw_12 = HB.p30(pw_14, qC03.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        qC0.Vs.jH(this.E8);
        qC0.Vc();
        return qC0;
    }
}


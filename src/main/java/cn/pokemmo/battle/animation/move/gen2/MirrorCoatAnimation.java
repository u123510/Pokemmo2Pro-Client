/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 镜面反射 (MirrorCoat)
 * 技能编号: 243
 * 原始类: f.T
 */
public class MirrorCoatAnimation
extends MU {
    public MirrorCoatAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        MirrorCoatAnimation t = this;
        MirrorCoatAnimation t2 = this;
        int n = 1358;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = t2.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(t2.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        MirrorCoatAnimation t3 = this;
        n = 1471;
        n2 = 2;
        n3 = 14;
        f = 750.0f;
        f2 = 0.859375f;
        pF = t3.Vz0;
        pw_1 pw_14 = pw_13.xi0(t3.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(410));
        n = 2;
        n2 = 9;
        n3 = 8;
        f = 0.3499756f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 410, n, n2, n3, f));
        n = 0;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = A2.Kj0(pw_15, this.fE0(-1, 410, n, n2, n3, f), 0.2f);
        n = 1;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_17 = N4.zr(pw_16, this.fE0(-1, 410, n, n2, n3, f), 1.0f);
        n = 3;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(pw_17, this.fE0(-1, 410, n, n2, n3, f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        t.Vs.jH(this.E8);
        t.Vc();
        return t;
    }
}


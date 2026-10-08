/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.tp
 */
/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1077]
 * 原始类: f.tp_2
 */
public class CustomMove1077Animation
extends MU {
    public CustomMove1077Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1427;
        int n = 3;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(3, 0.4f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1427;
        n = 3;
        n2 = 16;
        f = 250.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1427;
        n = 3;
        n2 = 16;
        f = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = A2.Kj0(pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(3, 0, 0.0f, 1600.0f)).xi0(this.nM(18, 1)).y80(this.fn(1077)), this.Ue0(4, 0, 0.0f, 0.75f, 0.05f), 1.74f);
        s = 1509;
        n = 1;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        this.E8 = pk_1.el(N4.zr(pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)), this.Ue0(4, 0, 0.75f, 0.75f, 0.05f), 2.08f), this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.nM(18, 0)).xi0(this.tP(0.4f)).mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


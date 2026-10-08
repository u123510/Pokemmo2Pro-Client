/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.xC
 */
/**
 * 宝可梦对战技能招式动画 - 延后 (Quash)
 * 技能编号: 511
 * 原始类: f.xc_0
 */
public class QuashAnimation
extends MU {
    public QuashAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1427;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1455;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 320.0f, 160.0f));
        n = 1441;
        n2 = 2;
        n3 = 16;
        f = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1441;
        n2 = 1;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(676)).xi0(this.Wt(1, 0.5f)).TD0().p1(0.2f).Xf0();
        n = 676;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.75f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 676;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.75f;
        this.E8 = pk_1.el(N4.zr(pw_16, this.fE0(-1, n, n2, n3, n4, f2), 0.8f).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.0f, 0.32f, 0.39990234f, -0.39990234f)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.cOm9
 */
/**
 * 宝可梦对战技能招式动画 - 反射壁 (Reflect)
 * 技能编号: 115
 * 原始类: f.com9__3
 */
public class ReflectAnimation
extends MU {
    public ReflectAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        ReflectAnimation com9__32 = this;
        ReflectAnimation com9__33 = this;
        int n = 1358;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = com9__33.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().p1(0.4f).xi0(com9__33.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        ReflectAnimation com9__34 = this;
        n = 1471;
        n2 = 2;
        n3 = 14;
        f = 166.66667f;
        f2 = 0.9375f;
        pF = com9__34.Vz0;
        pw_1 pw_14 = pw_13.xi0(com9__34.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.nM(14, 1)).y80(this.Qh0(281));
        n = 0;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 281, n, n2, n3, f));
        n = 1;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 281, n, n2, n3, f));
        n = 2;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(A2.Kj0(pw_16, this.fE0(-1, 281, n, n2, n3, f), 0.8f), this.WW(14, 1.0f, 1.0f, 0.0f, px_1.ep0(Short.MAX_VALUE))).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        com9__32.Vs.jH(this.E8);
        com9__32.Vc();
        return com9__32;
    }
}


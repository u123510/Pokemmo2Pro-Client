/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 快速防守 (QuickGuard)
 * 技能编号: 501
 * 原始类: f.UQ
 */
public class QuickGuardAnimation
extends MU {
    public QuickGuardAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1434;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1630;
        n = 2;
        n2 = 14;
        f = 333.33334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        float f3 = 1.0f;
        float f4 = 0.625f;
        float f5 = 0.0f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_13 = A2.Kj0(pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).p1(0.4f).xi0(this.nM(14, 1)).xi0(this.Xq0(14, 2, 1, 0.0f, 0.32f, -0.100097656f, 0.39990234f)), this.WW(14, f3, f4, f5, color), 0.12f).y80(this.Qh0(668));
        int n3 = 668;
        int n4 = 0;
        int n5 = 9;
        int n6 = 8;
        f2 = 0.625f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 668;
        n4 = 1;
        n5 = 9;
        n6 = 8;
        f2 = 0.625f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 668;
        n4 = 2;
        n5 = 9;
        n6 = 8;
        f2 = 0.625f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 668;
        n4 = 3;
        n5 = 9;
        n6 = 8;
        f2 = 0.625f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 668;
        n4 = 4;
        n5 = 9;
        n6 = 8;
        f2 = 0.625f;
        this.E8 = pk_1.el(pw_17, this.fE0(-1, n3, n4, n5, n6, f2)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


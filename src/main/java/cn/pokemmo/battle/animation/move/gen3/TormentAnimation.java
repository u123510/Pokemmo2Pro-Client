/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.uG
 */
/**
 * 宝可梦对战技能招式动画 - 无理取闹 (Torment)
 * 技能编号: 259
 * 原始类: f.ug_1
 */
public class TormentAnimation
extends MU {
    public TormentAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1826;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.390625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1826;
        n = 2;
        n2 = 14;
        f = 250.0f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1826;
        n = 1;
        n2 = 14;
        f = 500.0f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1826;
        n = 2;
        n2 = 14;
        f = 750.0f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(425));
        s = 425;
        n = 5;
        n2 = 9;
        int n3 = 8;
        f2 = 0.25f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 425;
        n = 6;
        n2 = 9;
        n3 = 8;
        f2 = 0.25f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 425;
        n = 7;
        n2 = 9;
        n3 = 8;
        f2 = 0.25f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 425;
        n = 8;
        n2 = 9;
        n3 = 8;
        f2 = 0.25f;
        pw_1 pw_19 = A2.Kj0(pw_18.xi0(this.fE0(-1, s, n, n2, n3, f2)), this.Xq0(14, 2, 4, 0.016f, 0.048f, 0.0f, 0.30004883f), 0.2f);
        s = 425;
        n = 0;
        n2 = 9;
        n3 = 8;
        f2 = 0.25f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 425;
        n = 1;
        n2 = 9;
        n3 = 8;
        f2 = 0.25f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 425;
        n = 2;
        n2 = 9;
        n3 = 8;
        f2 = 0.25f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 425;
        n = 3;
        n2 = 9;
        n3 = 8;
        f2 = 0.25f;
        pw_1 pw_113 = pk_1.el(pw_112, this.fE0(-1, s, n, n2, n3, f2)).xi0(this.Wt(1, 0.4f)).TD0().p1(0.4f).Xf0();
        s = 1827;
        n = 1;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_114 = pw_113.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1827;
        n = 1;
        n2 = 16;
        f3 = 300.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_115 = pw_114.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1827;
        n = 1;
        n2 = 16;
        f3 = 500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 0.75f;
        Color color = px_1.ep0(22);
        pw_1 pw_116 = pw_115.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.WW(16, f4, f5, f6, color));
        int n4 = 425;
        int n5 = 4;
        int n6 = 11;
        int n7 = 8;
        f2 = 0.5f;
        float f7 = 0.5f;
        float f8 = 0.75f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(22);
        this.E8 = pk_1.el(N4.zr(pw_116, this.fE0(-1, n4, n5, n6, n7, f2), 0.6f).xi0(this.nM(16, 1)).xi0(this.WW(16, f7, f8, f9, color2)), this.EN(16, 2, 3, 0.032f, 0.016f, 0.0f, 0.30004883f)).xi0(this.nM(16, 0)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


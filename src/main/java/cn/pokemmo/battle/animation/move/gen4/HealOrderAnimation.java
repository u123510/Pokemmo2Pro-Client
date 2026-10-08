/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.nO
 */
/**
 * 宝可梦对战技能招式动画 - 回复指令 (HealOrder)
 * 技能编号: 456
 * 原始类: f.no_0
 */
public class HealOrderAnimation
extends MU {
    public HealOrderAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1875;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 1440.0f, 320.0f));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 1833.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1678;
        n = 2;
        n2 = 14;
        f = 166.66667f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(631));
        s = 631;
        n = 0;
        n2 = 9;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 631;
        n = 1;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 631;
        n = 2;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 631;
        n = 3;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = HB.p30(pw_17, this.fE0(-1, s, n, n2, n3, f2));
        s = 1358;
        n = 2;
        n2 = 14;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1358;
        n = 1;
        n2 = 14;
        f3 = 333.33334f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1358;
        n = 2;
        n2 = 14;
        f3 = 666.6667f;
        f2 = 0.46875f;
        pF = this.Vz0;
        float f4 = 0.75f;
        float f5 = 0.0f;
        float f6 = 0.75f;
        Color color = px_1.ep0(21460);
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.WW(14, f4, f5, f6, color));
        int n4 = 631;
        int n5 = 4;
        int n6 = 9;
        int n7 = 8;
        f2 = 0.5f;
        float f7 = 0.75f;
        float f8 = 0.75f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(21460);
        this.E8 = Zw0.H(HB.p30(pw_111, this.fE0(-1, n4, n5, n6, n7, f2)).xi0(this.tP(0.4f)), this.WW(14, f7, f8, f9, color2));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


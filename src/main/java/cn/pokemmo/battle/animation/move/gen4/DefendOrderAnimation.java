/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 防御指令 (DefendOrder)
 * 技能编号: 455
 * 原始类: f.Y9
 */
public class DefendOrderAnimation
extends MU {
    public DefendOrderAnimation(PF pF) {
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
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).y80(this.E2(18, true)).mz0().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 1040.0f, 240.0f));
        s = 1678;
        n = 2;
        n2 = 14;
        f = 166.66667f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(630));
        s = 630;
        n = 0;
        n2 = 9;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 630;
        n = 1;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 630;
        n = 2;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 630;
        n = 3;
        n2 = 9;
        n3 = 8;
        f2 = 0.0f;
        pw_1 pw_18 = HB.p30(pw_17, this.fE0(-1, s, n, n2, n3, f2));
        s = 1848;
        n = 2;
        n2 = 14;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.Sv0(2, 1, 240.0f, 640.0f));
        s = 1848;
        n = 1;
        n2 = 14;
        f3 = 83.333336f;
        f2 = 0.46875f;
        pF = this.Vz0;
        float f4 = 0.75f;
        float f5 = 0.0f;
        float f6 = 0.75f;
        Color color = px_1.ep0(30);
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.Sv0(1, 1, 320.0f, 640.0f)).xi0(this.WW(14, f4, f5, f6, color));
        int n4 = 630;
        int n5 = 4;
        int n6 = 9;
        int n7 = 8;
        f2 = 0.5f;
        float f7 = 0.75f;
        float f8 = 0.75f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(30);
        this.E8 = HB.p30(pw_110, this.fE0(-1, n4, n5, n6, n7, f2)).xi0(this.WW(14, f7, f8, f9, color2)).y80(this.E2(18, false)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


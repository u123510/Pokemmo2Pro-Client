/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.jz
 */
/**
 * 宝可梦对战技能招式动画 - 仿效 (Copycat)
 * 技能编号: 383
 * 原始类: f.jz_1
 */
public class CopycatAnimation
extends MU {
    public CopycatAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1504;
        int n2 = 2;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.3125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(558));
        n = 558;
        n2 = 2;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 558;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 1541;
        n2 = 1;
        n3 = 14;
        float f3 = 0.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_15 = A2.Kj0(pw_14, this.i6((byte)2, (short)n, n2, n3, f3, f2, pF), 0.6f);
        n = 558;
        n2 = 1;
        n3 = 9;
        int n5 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pk_1.el(pw_15, this.fE0(-1, n, n2, n3, n5, f2));
        n = 558;
        n2 = 3;
        n3 = 9;
        n5 = 8;
        f2 = 0.5f;
        float f4 = 0.25f;
        float f5 = 0.0f;
        float f6 = 0.375f;
        Color color = px_1.ep0(15488);
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n5, f2)).xi0(this.WW(14, f4, f5, f6, color));
        short s = 1452;
        int n6 = 2;
        int n7 = 14;
        float f7 = 0.0f;
        f2 = 0.5859375f;
        pF = this.Vz0;
        float f8 = 0.25f;
        float f9 = 0.375f;
        float f10 = 0.0f;
        Color color2 = px_1.ep0(15680);
        this.E8 = HB.p30(pw_17, this.i6((byte)2, s, n6, n7, f7, f2, pF)).xi0(this.WW(14, f8, f9, f10, color2)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


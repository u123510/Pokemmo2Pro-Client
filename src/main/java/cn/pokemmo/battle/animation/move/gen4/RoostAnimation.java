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
 * Renamed from f.Ez
 */
/**
 * 宝可梦对战技能招式动画 - 羽栖 (Roost)
 * 技能编号: 355
 * 原始类: f.ez_0
 */
public class RoostAnimation
extends MU {
    public RoostAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1438;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1438;
        n = 2;
        n2 = 14;
        f = 83.333336f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1438;
        n = 1;
        n2 = 14;
        f = 166.66667f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(528));
        s = 528;
        n = 0;
        n2 = 9;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = HB.p30(pw_14, this.fE0(-1, s, n, n2, n3, f2));
        s = 1483;
        n = 2;
        n2 = 14;
        float f3 = 0.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        float f4 = 0.75f;
        float f5 = 0.0f;
        float f6 = 0.8125f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_16 = A2.Kj0(pw_15.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)), this.WW(14, f4, f5, f6, color), 0.6f);
        f4 = 0.75f;
        f5 = 0.8125f;
        f6 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        short s2 = 528;
        int n4 = 1;
        int n5 = 9;
        int n6 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.WW(14, f4, f5, f6, color)).xi0(this.fE0(-1, s2, n4, n5, n6, f2));
        s2 = 1358;
        n4 = 2;
        n5 = 14;
        float f7 = 1000.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        this.E8 = pk_1.el(pw_17, this.i6((byte)2, s2, n4, n5, f7, f2, pF)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


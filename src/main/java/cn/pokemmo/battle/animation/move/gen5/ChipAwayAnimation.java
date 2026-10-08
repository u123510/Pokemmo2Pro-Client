/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.e20
 */
/**
 * 宝可梦对战技能招式动画 - 逐步击破 (ChipAway)
 * 技能编号: 498
 * 原始类: f.e20_0
 */
public class ChipAwayAnimation
extends MU {
    public ChipAwayAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1415;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.WW(14, f3, f4, f5, color)).xi0(this.Wt(1, 0.4f)).TD0().p1(0.4f).Xf0().y80(this.Qh0(665));
        short s2 = 665;
        int n3 = 0;
        int n4 = 11;
        int n5 = 8;
        f2 = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s2, n3, n4, n5, f2));
        s2 = 665;
        n3 = 1;
        n4 = 11;
        n5 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s2, n3, n4, n5, f2));
        s2 = 1420;
        n3 = 2;
        n4 = 16;
        float f6 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        float f7 = 0.75f;
        float f8 = 0.75f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = pk_1.el(pw_14.xi0(this.i6((byte)2, s2, n3, n4, f6, f2, pF)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.0f, 0.096f, -0.30004883f, 0.30004883f)).xi0(this.WW(14, f7, f8, f9, color2)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


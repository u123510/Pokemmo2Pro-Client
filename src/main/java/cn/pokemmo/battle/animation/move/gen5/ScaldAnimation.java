/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 热水 (Scald)
 * 技能编号: 503
 * 原始类: f.T5
 */
public class ScaldAnimation
extends MU {
    public ScaldAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 669;
        int n2 = 2;
        int n3 = 9;
        int n4 = 11;
        float f = 0.5f;
        pw_1 pw_12 = A2.Kj0(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).y80(this.E2(18, true)).mz0().Xf0().y80(this.Qh0(669)), this.fE0(-1, n, n2, n3, n4, f), 0.2f).xi0(this.Wt(1, 0.4f));
        n = 1857;
        n2 = 1;
        n3 = 14;
        float f2 = 0.0f;
        f = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1718;
        n2 = 1;
        n3 = 14;
        f2 = 583.3333f;
        f = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1718;
        n2 = 2;
        n3 = 16;
        f2 = 833.3333f;
        f = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1718;
        n2 = 1;
        n3 = 16;
        f2 = 1166.6666f;
        f = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = N4.zr(pw_15, this.i6((byte)2, (short)n, n2, n3, f2, f, pF), 0.4f);
        n = 669;
        n2 = 0;
        n3 = 11;
        int n5 = 8;
        f = 0.5f;
        pw_1 pw_17 = N4.zr(pw_16, this.fE0(-1, n, n2, n3, n5, f), 1.2f);
        n = 669;
        n2 = 1;
        n3 = 11;
        n5 = 8;
        f = 0.5f;
        pw_1 pw_18 = N4.zr(pw_17, this.fE0(-1, n, n2, n3, n5, f), 1.4f);
        n = 669;
        n2 = 1;
        n3 = 11;
        n5 = 8;
        f = 0.5f;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.5f;
        Color color = px_1.ep0(31);
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n5, f)).xi0(this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 1)).mz0().mz0().TD0().p1(1.6f).Xf0();
        int n6 = 669;
        int n7 = 1;
        int n8 = 11;
        int n9 = 8;
        f = 0.5f;
        float f6 = 0.75f;
        float f7 = 0.5f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(31);
        this.E8 = pk_1.el(pw_19, this.fE0(-1, n6, n7, n8, n9, f)).xi0(this.WW(16, f6, f7, f8, color2)).xi0(this.nM(16, 0)).y80(this.E2(18, false)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


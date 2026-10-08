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
 * 宝可梦对战技能招式动画 - 烧尽 (Incinerate)
 * 技能编号: 510
 * 原始类: f.CH
 */
public class IncinerateAnimation
extends MU {
    public IncinerateAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1806;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.46875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.E2(18, true)).p1(0.6f).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(675));
        n = 675;
        n2 = 1;
        n3 = 9;
        int n4 = 11;
        f2 = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 675;
        n2 = 0;
        n3 = 9;
        n4 = 11;
        f2 = 0.5f;
        pw_1 pw_14 = A2.Kj0(pw_13, this.fE0(-1, n, n2, n3, n4, f2), 0.4f).xi0(this.Wt(1, 0.25f)).mz0().mz0().TD0().p1(0.8f).Xf0();
        n = 1426;
        n2 = 2;
        n3 = 16;
        float f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1426;
        n2 = 2;
        n3 = 16;
        f3 = 333.33334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1426;
        n2 = 2;
        n3 = 16;
        f3 = 666.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 675;
        n2 = 3;
        n3 = 11;
        int n5 = 8;
        f2 = 0.25f;
        float f4 = 0.75f;
        float f5 = 0.0f;
        float f6 = 0.625f;
        Color color = px_1.ep0(31);
        pw_1 pw_18 = N4.zr(pw_17, this.fE0(-1, n, n2, n3, n5, f2), 1.2f).xi0(this.WW(16, f4, f5, f6, color));
        int n6 = 675;
        int n7 = 2;
        int n8 = 11;
        int n9 = 8;
        f2 = 0.25f;
        pw_1 pw_19 = N4.zr(pw_18, this.fE0(-1, n6, n7, n8, n9, f2), 1.6f).xi0(this.nM(16, 1));
        n6 = 675;
        n7 = 4;
        n8 = 11;
        n9 = 8;
        f2 = 0.25f;
        pw_1 pw_110 = N4.zr(N4.zr(pw_19, this.fE0(-1, n6, n7, n8, n9, f2), 1.9f), this.Xq0(16, 2, 6, 0.016f, 0.032f, 0.30004883f, -0.100097656f), 2.3f);
        n6 = 675;
        n7 = 5;
        n8 = 11;
        n9 = 8;
        f2 = 0.5f;
        float f7 = 1.25f;
        float f8 = 0.625f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(31);
        this.E8 = pk_1.el(pw_110, this.fE0(-1, n6, n7, n8, n9, f2)).xi0(this.WW(16, f7, f8, f9, color2)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).y80(this.E2(18, false)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


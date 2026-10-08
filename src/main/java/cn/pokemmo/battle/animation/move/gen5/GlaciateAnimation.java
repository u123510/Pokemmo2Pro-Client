/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.rC
 */
/**
 * 宝可梦对战技能招式动画 - 冰封世界 (Glaciate)
 * 技能编号: 549
 * 原始类: f.rc_0
 */
public class GlaciateAnimation
extends MU {
    public GlaciateAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1440;
        int n2 = 1;
        int n3 = 14;
        float f = 333.33334f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Wt(0, 0.4f)).y80(this.E2(18, true)).y80(this.Qh0(716));
        n = 716;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_13 = HB.p30(pw_12.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.Xq0(14, 2, 1, 0.0f, 0.48f, 0.30004883f, -0.30004883f)).xi0(this.Wt(1, 0.4f));
        n = 1440;
        n2 = 1;
        n3 = 16;
        float f3 = 500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1859;
        n2 = 2;
        n3 = 16;
        f3 = 666.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1488;
        n2 = 2;
        n3 = 16;
        f3 = 1666.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1488;
        n2 = 2;
        n3 = 16;
        f3 = 2833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1449;
        n2 = 1;
        n3 = 16;
        f3 = 1500.0f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1449;
        n2 = 1;
        n3 = 16;
        f3 = 3333.3333f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_19 = A2.Kj0(pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF)), this.Ue0(2, 0, 0.0f, 0.5f, 0.075f), 0.6f);
        n = 716;
        n2 = 6;
        n3 = 11;
        int n5 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 716;
        n2 = 7;
        n3 = 11;
        n5 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = N4.zr(pw_110, this.fE0(-1, n, n2, n3, n5, f2), 1.0f);
        n = 716;
        n2 = 4;
        n3 = 11;
        n5 = 8;
        f2 = 0.75f;
        float f4 = 0.75f;
        float f5 = 0.0f;
        float f6 = 0.5f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_112 = N4.zr(pw_111, this.fE0(-1, n, n2, n3, n5, f2), 1.8f).xi0(this.WW(16, f4, f5, f6, color));
        int n6 = 716;
        int n7 = 2;
        int n8 = 11;
        int n9 = 8;
        f2 = 0.625f;
        pw_1 pw_113 = N4.zr(pw_112, this.fE0(-1, n6, n7, n8, n9, f2), 2.2f);
        n6 = 716;
        n7 = 3;
        n8 = 11;
        n9 = 8;
        f2 = 0.5f;
        pw_1 pw_114 = pw_113.xi0(this.fE0(-1, n6, n7, n8, n9, f2));
        n6 = 716;
        n7 = 2;
        n8 = 11;
        n9 = 8;
        f2 = 0.625f;
        float f7 = 0.75f;
        float f8 = 0.5f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = HB.p30(pk_1.el(pw_114, this.fE0(-1, n6, n7, n8, n9, f2)).xi0(this.Ue0(2, 0, 0.5f, 0.0f, 0.075f)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.0f, 0.032f, 0.100097656f, -0.100097656f)).xi0(this.WW(16, f7, f8, f9, color2)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).y80(this.E2(18, false)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


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
 * Renamed from f.zo0
 */
/**
 * 宝可梦对战技能招式动画 - 火之舞 (FieryDance)
 * 技能编号: 552
 * 原始类: f.zo0_0
 */
public class FieryDanceAnimation
extends MU {
    public FieryDanceAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1818;
        int n = 0;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(0, 0, 0.0f, 800.0f));
        s = 1376;
        n = 0;
        n2 = 16;
        f = 833.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        float f3 = 1.25f;
        float f4 = 0.0f;
        float f5 = 0.5f;
        Color color = px_1.ep0(31);
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Wt(1, 0.4f)).y80(this.E2(18, true)).mz0().Xf0().xi0(this.Ue0(2, 31, 0.0f, 0.5f, 0.075f)).xi0(this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 1)).y80(this.Qh0(719));
        int n3 = 719;
        int n4 = 0;
        int n5 = 11;
        int n6 = 8;
        f2 = 0.25f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 719;
        n4 = 2;
        n5 = 11;
        n6 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, n3, n4, n5, n6, f2), 0.2f);
        n3 = 1561;
        n4 = 1;
        n5 = 16;
        float f6 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n3, n4, n5, f6, f2, pF));
        n3 = 1907;
        n4 = 2;
        n5 = 16;
        f6 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n3, n4, n5, f6, f2, pF));
        n3 = 1907;
        n4 = 1;
        n5 = 16;
        f6 = 1333.3334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n3, n4, n5, f6, f2, pF));
        n3 = 719;
        n4 = 1;
        n5 = 11;
        int n7 = 8;
        f2 = 0.0f;
        pw_1 pw_19 = N4.zr(pw_18, this.fE0(-1, n3, n4, n5, n7, f2), 1.4f).xi0(this.Xq0(16, 2, 23, 0.0f, 0.064f, 0.100097656f, -0.100097656f));
        n3 = 719;
        n4 = 2;
        n5 = 11;
        n7 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = N4.zr(pw_19, this.fE0(-1, n3, n4, n5, n7, f2), 1.6f);
        n3 = 719;
        n4 = 0;
        n5 = 11;
        n7 = 8;
        f2 = 0.0f;
        pw_1 pw_111 = N4.zr(pw_110, this.fE0(-1, n3, n4, n5, n7, f2), 2.6f);
        n3 = 719;
        n4 = 3;
        n5 = 11;
        n7 = 8;
        f2 = 0.5f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, n3, n4, n5, n7, f2));
        n3 = 719;
        n4 = 1;
        n5 = 11;
        n7 = 8;
        f2 = 0.25f;
        float f7 = 0.75f;
        float f8 = 0.5f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(31);
        this.E8 = HB.p30(pk_1.el(pw_112, this.fE0(-1, n3, n4, n5, n7, f2)).xi0(this.Ue0(2, 31, 0.5f, 0.0f, 0.075f)).xi0(this.WW(16, f7, f8, f9, color2)), this.Xq0(16, 2, 1, 0.0f, 0.032f, 0.100097656f, -0.100097656f)).xi0(this.nM(16, 0)).y80(this.E2(18, false)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


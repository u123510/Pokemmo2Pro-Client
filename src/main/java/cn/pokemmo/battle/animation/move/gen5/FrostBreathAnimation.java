/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.Ne
 */
/**
 * 宝可梦对战技能招式动画 - 冰息 (FrostBreath)
 * 技能编号: 524
 * 原始类: f.ne_0
 */
public class FrostBreathAnimation
extends MU {
    public FrostBreathAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1439;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.Ue0(4, 0, 0.0f, 1.0f, 0.05f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1515;
        n = 2;
        n2 = 16;
        f = 500.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        float f3 = 1.0f;
        float f4 = 0.0f;
        float f5 = 0.375f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_13 = A2.Kj0(pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 1280.0f, 160.0f)).y80(this.Qh0(689)).xi0(this.dA0(689, 2, 9, 11, 0.5f, 0.0f)), this.dA0(689, 4, 9, 11, 0.5f, 0.0f), 0.6f).xi0(this.Wt(1, 0.35f)).xi0(this.WW(16, f3, f4, f5, color));
        int n3 = 1488;
        int n4 = 2;
        int n5 = 16;
        float f6 = 1000.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n3, n4, n5, f6, f2, pF));
        n3 = 1488;
        n4 = 2;
        n5 = 16;
        f6 = 1666.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n3, n4, n5, f6, f2, pF));
        n3 = 1449;
        n4 = 2;
        n5 = 16;
        f6 = 3000.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n3, n4, n5, f6, f2, pF)).xi0(this.nM(16, 1)).xi0(this.EN(16, 2, 32, 0.0f, 0.032f, 0.19995117f, 0.0f));
        n3 = 689;
        n4 = 1;
        n5 = 11;
        int n6 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 689;
        n4 = 0;
        n5 = 11;
        n6 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 689;
        n4 = 3;
        n5 = 11;
        n6 = 8;
        f2 = 0.5f;
        float f7 = 1.0f;
        float f8 = 0.375f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = pk_1.el(N4.zr(pw_18, this.fE0(-1, n3, n4, n5, n6, f2), 4.5f), this.EN(16, 2, 2, 0.0f, 0.032f, 0.19995117f, 0.0f)).xi0(this.tP(0.4f)).xi0(this.Ue0(4, 0, 1.0f, 0.0f, 0.05f)).xi0(this.WW(16, f7, f8, f9, color2)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.Fy
 */
/**
 * 宝可梦对战技能招式动画 - 细雪 (PowderSnow)
 * 技能编号: 181
 * 原始类: f.fy_0
 */
public class PowderSnowAnimation
extends MU {
    public PowderSnowAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1457;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1358;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_13 = A2.Kj0(pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Ue0(4, 0, 0.0f, 1.0f, 0.05f)).y80(this.Qh0(347)), this.dA0(347, 0, 9, 11, 0.5f, 0.0f), 0.6f).xi0(this.Wt(1, 0.35f));
        s = 1488;
        n = 2;
        n2 = 16;
        f = 1000.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1488;
        n = 1;
        n2 = 16;
        f = 1583.3334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        float f3 = 1.0f;
        float f4 = 0.0f;
        float f5 = 0.375f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 1));
        int n3 = 347;
        int n4 = 1;
        int n5 = 11;
        int n6 = 8;
        f2 = 0.5f;
        float f6 = 1.0f;
        float f7 = 0.375f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = pk_1.el(pw_15, this.fE0(-1, n3, n4, n5, n6, f2)).xi0(this.tP(0.4f)).xi0(this.Ue0(4, 0, 1.0f, 0.0f, 0.05f)).xi0(this.WW(16, f6, f7, f8, color2)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


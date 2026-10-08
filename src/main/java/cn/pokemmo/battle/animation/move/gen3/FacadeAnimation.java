/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.gf
 */
/**
 * 宝可梦对战技能招式动画 - 硬撑 (Facade)
 * 技能编号: 263
 * 原始类: f.gf_2
 */
public class FacadeAnimation
extends MU {
    public FacadeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 429;
        int n = 0;
        int n2 = 9;
        int n3 = 8;
        float f = 0.4f;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.Xq0(14, 2, 3, 0.016f, 0.096f, 0.30004883f, -0.30004883f)).y80(this.Qh0(429)).xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 429;
        n = 1;
        n2 = 9;
        n3 = 8;
        f = 0.4f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 429;
        n = 2;
        n2 = 9;
        n3 = 8;
        f = 0.4f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 1412;
        n = 1;
        n2 = 14;
        float f2 = 0.0f;
        f = 0.9921875f;
        PF pF = this.Vz0;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.5f;
        Color color = px_1.ep0(31);
        pw_1 pw_15 = A2.Kj0(pw_14.xi0(this.i6((byte)2, s, n, n2, f2, f, pF)).xi0(this.Sv0(1, 1, 640.0f, 480.0f)), this.WW(14, f3, f4, f5, color), 0.12f);
        f3 = 0.75f;
        f4 = 0.5f;
        f5 = 0.0f;
        color = px_1.ep0(31);
        pw_1 pw_16 = N4.zr(pw_15, this.WW(14, f3, f4, f5, color), 0.24f);
        f3 = 0.75f;
        f4 = 0.0f;
        f5 = 0.5f;
        color = px_1.ep0(31744);
        pw_1 pw_17 = N4.zr(pw_16, this.WW(14, f3, f4, f5, color), 0.36f);
        f3 = 0.75f;
        f4 = 0.5f;
        f5 = 0.0f;
        color = px_1.ep0(31744);
        pw_1 pw_18 = N4.zr(pw_17, this.WW(14, f3, f4, f5, color), 0.48f);
        f3 = 0.75f;
        f4 = 0.0f;
        f5 = 0.75f;
        color = px_1.ep0(1023);
        pw_1 pw_19 = N4.zr(pw_18, this.WW(14, f3, f4, f5, color), 0.6f);
        f3 = 0.75f;
        f4 = 0.5f;
        f5 = 0.0f;
        color = px_1.ep0(1023);
        short s2 = 429;
        int n4 = 3;
        int n5 = 11;
        int n6 = 8;
        f = 0.4f;
        pw_1 pw_110 = pw_19.xi0(this.WW(14, f3, f4, f5, color)).mz0().mz0().mz0().Xf0().p1(0.6f).mz0().Xf0().xi0(this.nM(16, 1)).xi0(this.fE0(-1, s2, n4, n5, n6, f)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.048f, 0.30004883f, -0.30004883f));
        s2 = 1420;
        n4 = 2;
        n5 = 16;
        float f6 = 0.0f;
        f = 0.8984375f;
        pF = this.Vz0;
        this.E8 = pw_110.xi0(this.i6((byte)2, s2, n4, n5, f6, f, pF)).mz0().Xf0().p1(0.6f).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


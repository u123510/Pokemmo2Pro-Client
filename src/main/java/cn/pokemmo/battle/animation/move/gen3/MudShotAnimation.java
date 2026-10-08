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
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 泥巴射击 (MudShot)
 * 技能编号: 341
 * 原始类: f.J8
 */
public class MudShotAnimation
extends MU {
    public MudShotAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1455;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1407;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 2;
        n2 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(2, 1, 960.0f, 320.0f));
        s = 1452;
        n = 1;
        n2 = 16;
        f = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1452;
        n = 1;
        n2 = 16;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1452;
        n = 1;
        n2 = 16;
        f = 833.3333f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1452;
        n = 1;
        n2 = 16;
        f = 1000.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 0.8125f;
        Color color = px_1.ep0(0);
        pw_1 pw_18 = N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(A2.Kj0(pw_17.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(513)).xi0(this.dA0(513, 0, 9, 11, 0.5f, 0.0f)).xi0(this.dA0(513, 1, 9, 11, 0.5f, 0.0f)), this.dA0(513, 2, 9, 11, 0.5f, 240.0f), 0.1f), this.dA0(513, 2, 9, 11, 0.5f, 240.0f), 0.2f).xi0(this.Wt(1, 0.25f)), this.dA0(513, 2, 9, 11, 0.5f, 240.0f), 0.3f), this.dA0(513, 2, 9, 11, 0.5f, 240.0f), 0.4f).xi0(this.dA0(513, 2, 9, 11, 0.5f, 240.0f)).xi0(this.EN(16, 2, 10, 0.016f, 0.016f, 0.19995117f, 0.0f)), this.WW(16, f3, f4, f5, color), 0.5f), this.dA0(513, 2, 9, 11, 0.5f, 240.0f), 0.6f).xi0(this.nM(16, 1)), this.dA0(513, 2, 9, 11, 0.5f, 240.0f), 0.8f);
        f3 = 0.25f;
        f4 = 0.8125f;
        f5 = 0.0f;
        color = px_1.ep0(0);
        int n3 = 513;
        int n4 = 2;
        int n5 = 11;
        int n6 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_18.xi0(this.WW(16, f3, f4, f5, color)), this.fE0(-1, n3, n4, n5, n6, f2)).xi0(this.tP(0.25f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


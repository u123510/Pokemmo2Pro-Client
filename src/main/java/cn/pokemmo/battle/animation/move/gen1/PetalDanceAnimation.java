/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 花瓣舞 (PetalDance)
 * 技能编号: 80
 * 原始类: f.Pn0
 */
public class PetalDanceAnimation
extends MU {
    public PetalDanceAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1445;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.nM(14, 1)).y80(this.Qh0(244)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 640.0f, 320.0f));
        n = 244;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.049987793f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 244;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.049987793f;
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, n, n2, n3, n4, f2), 0.64f).xi0(this.nM(16, 1)).xi0(this.Wt(1, 0.4f));
        n = 1497;
        n2 = 2;
        n3 = 16;
        float f3 = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f3 = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 1280.0f)).xi0(this.Sv0(2, 1, 960.0f, 320.0f));
        n = 244;
        n2 = 0;
        n3 = 11;
        int n5 = 8;
        f2 = 0.0f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 244;
        n2 = 1;
        n3 = 11;
        n5 = 8;
        f2 = 0.049987793f;
        this.E8 = pk_1.el(pw_18.xi0(this.fE0(-1, n, n2, n3, n5, f2)), this.EN(16, 2, 12, 0.032f, 0.016f, 0.30004883f, 0.0f)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


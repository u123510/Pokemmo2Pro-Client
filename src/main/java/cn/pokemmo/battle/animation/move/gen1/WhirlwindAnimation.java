/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.yk0
 */
/**
 * 宝可梦对战技能招式动画 - 吹飞 (Whirlwind)
 * 技能编号: 18
 * 原始类: f.yk0_2
 */
public class WhirlwindAnimation
extends MU {
    public WhirlwindAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1439;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1717;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 2;
        n2 = 16;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 320.0f)).xi0(this.Sv0(2, 0, 640.0f, 320.0f)).xi0(this.Sv0(2, 1, 0.0f, 480.0f)).xi0(this.Sv0(2, 1, 800.0f, 640.0f)).y80(this.Qh0(179));
        s = 179;
        n = 0;
        n2 = 9;
        int n3 = 11;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 179;
        n = 0;
        n2 = 9;
        n3 = 11;
        f2 = 0.5f;
        pw_1 pw_16 = A2.Kj0(pw_15, this.fE0(-1, s, n, n2, n3, f2), 0.4f);
        s = 179;
        n = 2;
        n2 = 9;
        n3 = 11;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 179;
        n = 2;
        n2 = 9;
        n3 = 11;
        f2 = 0.5f;
        pw_1 pw_18 = N4.zr(pw_17, this.fE0(-1, s, n, n2, n3, f2), 0.6f);
        s = 179;
        n = 1;
        n2 = 9;
        n3 = 11;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 179;
        n = 1;
        n2 = 9;
        n3 = 11;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 179;
        n = 3;
        n2 = 9;
        n3 = 11;
        f2 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 179;
        n = 3;
        n2 = 9;
        n3 = 11;
        f2 = 0.5f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.Wt(1, 0.4f));
        s = 1440;
        n = 1;
        n2 = 16;
        float f3 = 833.3333f;
        f2 = 0.9765625f;
        pF = this.Vz0;
        this.E8 = N4.zr(N4.zr(N4.zr(pw_112, this.i6((byte)2, s, n, n2, f3, f2, pF), 1.1f).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.048f, 0.30004883f, -0.30004883f)), this.EN(16, 2, 6, 0.0f, 0.032f, 0.30004883f, 0.0f), 1.5f).y80(this.E2(16, true)), this.EN(16, 1, 1, 0.0f, 0.48f, -20.0f, 10.0f), 1.9f).xi0(this.df0(16, 3)).mz0().mz0().mz0().Xf0().xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.w3
 */
/**
 * 宝可梦对战技能招式动画 - 高速星星 (Swift)
 * 技能编号: 129
 * 原始类: f.w3_0
 */
public class SwiftAnimation
extends MU {
    public SwiftAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1483;
        int n = 2;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.075f)).xi0(this.Wt(0, 0.25f)).mz0().Xf0().y80(this.Qh0(294)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 294;
        n = 2;
        n2 = 9;
        int n3 = 11;
        f2 = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 294;
        n = 3;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 294;
        n = 1;
        n2 = 9;
        n3 = 11;
        f2 = 0.5f;
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, s, n, n2, n3, f2), 0.2f);
        s = 294;
        n = 1;
        n2 = 9;
        n3 = 11;
        f2 = 0.5f;
        pw_1 pw_16 = N4.zr(pw_15, this.fE0(-1, s, n, n2, n3, f2), 0.4f);
        s = 294;
        n = 1;
        n2 = 9;
        n3 = 11;
        f2 = 0.5f;
        pw_1 pw_17 = N4.zr(pw_16, this.fE0(-1, s, n, n2, n3, f2), 0.6f);
        s = 294;
        n = 1;
        n2 = 9;
        n3 = 11;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.Wt(1, 0.25f)).mz0().mz0().TD0().p1(0.8f).Xf0();
        s = 294;
        n = 1;
        n2 = 9;
        n3 = 11;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 294;
        n = 0;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.nM(16, 1)).mz0().mz0().TD0().p1(1.0f).Xf0();
        s = 1482;
        n = 1;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9765625f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1482;
        n = 2;
        n2 = 16;
        f3 = 333.33334f;
        f2 = 0.9765625f;
        pF = this.Vz0;
        this.E8 = pk_1.el(pw_111.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)), this.Xq0(16, 2, 6, 0.016f, 0.032f, 0.100097656f, -0.100097656f)).xi0(this.tP(0.25f)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.075f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


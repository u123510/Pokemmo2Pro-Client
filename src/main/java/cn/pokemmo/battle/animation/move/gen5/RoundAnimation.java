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
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 轮唱 (Round)
 * 技能编号: 496
 * 原始类: f.WP
 */
public class RoundAnimation
extends MU {
    public RoundAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1495;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.Ue0(2, Short.MAX_VALUE, 0.0f, 0.625f, 0.075f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1495;
        n = 1;
        n2 = 14;
        f = 916.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1523;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(10590);
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(2, 1, 2400.0f, 480.0f)).y80(this.Qh0(663)).xi0(this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 1));
        int n3 = 663;
        int n4 = 5;
        int n5 = 9;
        int n6 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 663;
        n4 = 6;
        n5 = 9;
        n6 = 8;
        f2 = 0.5f;
        float f6 = 0.75f;
        float f7 = 0.75f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(10590);
        this.E8 = A2.Kj0(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(A2.Kj0(pw_15.xi0(this.fE0(-1, n3, n4, n5, n6, f2)), this.dA0(663, 2, 9, 11, 0.5f, 1800.0f), 0.12f), this.dA0(663, 2, 9, 11, 0.5f, 1800.0f), 0.24f), this.dA0(663, 2, 9, 11, 0.5f, 1800.0f), 0.36f), this.dA0(663, 2, 9, 11, 0.5f, 1800.0f), 0.48f), this.dA0(663, 2, 9, 11, 0.5f, 1800.0f), 0.6f), this.dA0(663, 2, 9, 11, 0.5f, 1800.0f), 0.62f), this.dA0(663, 3, 9, 11, 0.5f, 1560.0f), 0.64f), this.dA0(663, 3, 9, 11, 0.5f, 1560.0f), 0.66f), this.dA0(663, 3, 9, 11, 0.5f, 1560.0f), 0.68f), this.dA0(663, 3, 9, 11, 0.5f, 1560.0f), 0.7f), this.dA0(663, 3, 9, 11, 0.5f, 1560.0f), 0.72f), this.dA0(663, 3, 9, 11, 0.5f, 1560.0f), 0.74f).xi0(this.dA0(663, 3, 9, 11, 0.5f, 1680.0f)).xi0(this.Wt(1, 0.8f)).mz0().mz0().mz0().Xf0(), this.WW(16, f6, f7, f8, color2), 0.1f).xi0(this.Ue0(2, Short.MAX_VALUE, 0.625f, 0.0f, 0.075f)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


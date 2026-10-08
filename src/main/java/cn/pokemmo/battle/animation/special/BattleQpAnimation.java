/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleQpAnimation
 * 原始类: f.QP
 */
public class BattleQpAnimation
extends MU {
    public BattleQpAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1463;
        int n = 3;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().y80(this.Qh0(435)).Xf0().xi0(this.Wt(0, 0.6f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 3;
        n2 = 14;
        f = 916.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(3, 0, 0.0f, 880.0f)).xi0(this.Sv0(3, 1, 640.0f, 160.0f));
        s = 1464;
        n = 1;
        n2 = 14;
        f = 0.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 916.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 880.0f)).xi0(this.Sv0(1, 1, 640.0f, 160.0f));
        s = 1712;
        n = 2;
        n2 = 14;
        f = 333.33334f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1712;
        n = 2;
        n2 = 14;
        f = 666.6667f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(31);
        pw_1 pw_17 = A2.Kj0(pw_16.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)), this.WW(14, f3, f4, f5, color), 0.4f);
        int n3 = 435;
        int n4 = 0;
        int n5 = 0;
        int n6 = 9;
        f2 = 0.5f;
        float f6 = 0.5f;
        float f7 = 0.75f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(31);
        this.E8 = pw_17.xi0(this.fE0(-1, n3, n4, n5, n6, f2)).xi0(this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f)).y80(this.wn0("crit_ratio_increase")).mz0().mz0().TD0().p1(0.8f).xi0(this.WW(16, f6, f7, f8, color2)).mz0().mz0().xi0(this.tP(0.6f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


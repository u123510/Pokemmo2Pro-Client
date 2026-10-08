/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 黑雾 (Haze)
 * 技能编号: 114
 * 原始类: f.f0
 */
public class HazeAnimation
extends MU {
    public HazeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1417;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.1875f, 0.05f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 800.0f, 480.0f));
        n = 1418;
        n2 = 3;
        n3 = 14;
        f = 0.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 3;
        n3 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(3, 1, 800.0f, 480.0f)).y80(this.Qh0(280));
        n = 280;
        n2 = 0;
        n3 = 0;
        int n4 = 8;
        f2 = 0.4f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 280;
        n2 = 1;
        n3 = 0;
        n4 = 8;
        f2 = 0.4f;
        this.E8 = A2.Kj0(pw_16, this.fE0(-1, n, n2, n3, n4, f2), 0.88f).xi0(this.tP(0.8f)).xi0(this.Ue0(4, 0, 0.1875f, 0.0f, 0.05f)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


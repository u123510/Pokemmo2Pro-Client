/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.Xk0
 */
/**
 * 宝可梦对战技能招式动画 - 沙暴 (Sandstorm)
 * 技能编号: 201
 * 原始类: f.xk0_0
 */
public class SandstormAnimation
extends MU {
    public SandstormAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1497;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).xi0(this.Ue0(4, 268, 0.0f, 0.875f, 0.05f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1600.0f));
        s = 1418;
        n = 3;
        n2 = 14;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 3;
        n2 = 14;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(268);
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(3, 1, 960.0f, 640.0f)).xi0(this.WW(14, f3, f4, f5, color));
        f3 = 0.5f;
        f4 = 0.0f;
        f5 = 0.625f;
        color = px_1.ep0(268);
        int n3 = 367;
        int n4 = 0;
        int n5 = 9;
        int n6 = 8;
        f2 = 0.25f;
        pw_1 pw_16 = pw_15.xi0(this.WW(16, f3, f4, f5, color)).y80(this.Qh0(367)).xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 367;
        n4 = 1;
        n5 = 9;
        n6 = 8;
        f2 = 0.0f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 367;
        n4 = 2;
        n5 = 9;
        n6 = 8;
        f2 = 0.0f;
        float f6 = 0.5f;
        float f7 = 0.625f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(268);
        pw_1 pw_18 = A2.Kj0(pw_17, this.fE0(-1, n3, n4, n5, n6, f2), 0.88f).xi0(this.Ue0(4, 268, 0.875f, 0.0f, 0.05f)).xi0(this.WW(14, f6, f7, f8, color2));
        f6 = 0.5f;
        f7 = 0.625f;
        f8 = 0.0f;
        color2 = px_1.ep0(268);
        this.E8 = pk_1.el(pw_18, this.WW(16, f6, f7, f8, color2)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


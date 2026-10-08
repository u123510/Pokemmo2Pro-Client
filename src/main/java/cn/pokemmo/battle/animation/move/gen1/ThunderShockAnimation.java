/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.COM4
 */
/**
 * 宝可梦对战技能招式动画 - 电击 (ThunderShock)
 * 技能编号: 84
 * 原始类: f.COM4_
 */
public class ThunderShockAnimation
extends MU {
    public ThunderShockAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1710;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = A2.Kj0(pw_1.xC().Xf0().xi0(this.Wt(1, 0.25f)).xi0(this.nM(14, 1)), this.Ue0(4, 0, 0.0f, 0.75f, 0.05f), 0.4f).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1458;
        n = 2;
        n2 = 16;
        f = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(0);
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 1)).y80(this.Qh0(248));
        int n3 = 248;
        int n4 = 0;
        int n5 = 11;
        int n6 = 8;
        f2 = 0.0f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 248;
        n4 = 1;
        n5 = 11;
        n6 = 8;
        f2 = 0.5f;
        float f6 = 0.5f;
        float f7 = 0.75f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(0);
        this.E8 = pk_1.el(N4.zr(pw_14, this.fE0(-1, n3, n4, n5, n6, f2), 0.6f).xi0(this.WW(16, f6, f7, f8, color2)), this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.nM(16, 0)).xi0(this.nM(14, 0)).xi0(this.tP(0.25f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


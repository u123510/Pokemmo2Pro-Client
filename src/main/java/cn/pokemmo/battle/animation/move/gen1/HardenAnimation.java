/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 变硬 (Harden)
 * 技能编号: 106
 * 原始类: f.Bf
 */
public class HardenAnimation
extends MU {
    public HardenAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1445;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 666.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 640.0f));
        s = 1449;
        n = 2;
        n2 = 14;
        f = 500.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_14 = HB.p30(pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(272)).xi0(this.nM(14, 1)).xi0(this.Xq0(14, 2, 4, 0.0f, 0.032f, 0.100097656f, 0.100097656f)), this.WW(14, f3, f4, f5, color));
        int n3 = 272;
        int n4 = 0;
        int n5 = 9;
        int n6 = 8;
        f2 = 0.5f;
        float f6 = 0.25f;
        float f7 = 0.625f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = HB.p30(pw_14, this.fE0(-1, n3, n4, n5, n6, f2)).xi0(this.tP(0.4f)).xi0(this.WW(14, f6, f7, f8, color2)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


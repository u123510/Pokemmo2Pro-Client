/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.mq0
 */
/**
 * 宝可梦对战技能招式动画 - 催眠粉 (SleepPowder)
 * 技能编号: 79
 * 原始类: f.mq0_0
 */
public class SleepPowderAnimation
extends MU {
    public SleepPowderAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 243;
        int n = 0;
        int n2 = 11;
        int n3 = 8;
        float f = 0.75f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(243)).xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 243;
        n = 1;
        n2 = 11;
        n3 = 8;
        f = 0.75f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f)).xi0(this.nM(16, 1));
        s = 1718;
        n = 2;
        n2 = 16;
        float f2 = 0.0f;
        f = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1463;
        n = 1;
        n2 = 16;
        f2 = 666.6667f;
        f = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1376;
        n = 1;
        n2 = 16;
        f2 = 2166.6667f;
        f = 0.0f;
        pF = this.Vz0;
        float f3 = 3.25f;
        float f4 = 0.0f;
        float f5 = 0.5f;
        Color color = px_1.ep0(21440);
        pw_1 pw_16 = A2.Kj0(pw_15.xi0(this.i6((byte)2, s, n, n2, f2, f, pF)).xi0(this.Sv0(1, 0, 640.0f, 1440.0f)).xi0(this.Sv0(1, 1, 560.0f, 320.0f)), this.Sv0(1, 1, 1440.0f, 640.0f), 0.6f).xi0(this.WW(16, f3, f4, f5, color));
        f3 = 3.25f;
        f4 = 0.5f;
        f5 = 0.0f;
        color = px_1.ep0(21440);
        this.E8 = pk_1.el(pw_16.xi0(this.WW(16, f3, f4, f5, color)), this.Xq0(16, 2, 6, 0.032f, 0.016f, 0.020019531f, -0.020019531f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


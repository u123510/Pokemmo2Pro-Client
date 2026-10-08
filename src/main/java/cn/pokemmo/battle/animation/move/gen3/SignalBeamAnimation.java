/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 信号光束 (SignalBeam)
 * 技能编号: 324
 * 原始类: f.m6
 */
public class SignalBeamAnimation
extends MU {
    public SignalBeamAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1455;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.546875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).y80(this.Qh0(494)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1450;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 2;
        n2 = 14;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(2, 1, 1120.0f, 480.0f));
        s = 1752;
        n = 1;
        n2 = 16;
        f = 666.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1752;
        n = 1;
        n2 = 16;
        f = 1000.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(30);
        pw_1 pw_16 = N4.zr(pw_15.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.dA0(494, 0, 9, 11, 0.5f, 0.0f)).xi0(this.Wt(1, 0.4f)).TD0().p1(0.4f).Xf0().xi0(this.nM(16, 1)).xi0(this.EN(16, 2, 16, 0.0f, 0.032f, 0.30004883f, 0.0f)), this.WW(16, f3, f4, f5, color), 0.6f);
        f3 = 0.25f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(30);
        pw_1 pw_17 = N4.zr(pw_16, this.WW(16, f3, f4, f5, color), 0.8f);
        f3 = 0.25f;
        f4 = 0.0f;
        f5 = 0.75f;
        color = px_1.ep0(960);
        pw_1 pw_18 = N4.zr(pw_17, this.WW(16, f3, f4, f5, color), 1.0f);
        f3 = 0.25f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(960);
        pw_1 pw_19 = N4.zr(pw_18, this.WW(16, f3, f4, f5, color), 1.2f);
        f3 = 0.25f;
        f4 = 0.0f;
        f5 = 0.75f;
        color = px_1.ep0(990);
        pw_1 pw_110 = N4.zr(pw_19, this.WW(16, f3, f4, f5, color), 1.4f);
        f3 = 0.25f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(990);
        this.E8 = pk_1.el(pw_110, this.WW(16, f3, f4, f5, color)).xi0(this.tP(0.25f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


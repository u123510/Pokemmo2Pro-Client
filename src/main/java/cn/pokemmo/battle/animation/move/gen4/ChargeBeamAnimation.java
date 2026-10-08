/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.Zw0;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 充电光束 (ChargeBeam)
 * 技能编号: 451
 * 原始类: f.Qf0
 */
public class ChargeBeamAnimation
extends MU {
    public ChargeBeamAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1445;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.05f)).y80(this.Qh0(626)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1440.0f));
        n = 1963;
        n2 = 2;
        n3 = 14;
        f = 1500.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 2833.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 2240.0f, 480.0f));
        n = 1407;
        n2 = 1;
        n3 = 14;
        f = 1500.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 2833.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1440.0f)).xi0(this.Sv0(1, 1, 2240.0f, 480.0f));
        n = 626;
        n2 = 1;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 626;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 626;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 626;
        n2 = 4;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 626;
        n2 = 0;
        n3 = 9;
        n4 = 11;
        f2 = 0.5f;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(13311);
        pw_1 pw_112 = N4.zr(N4.zr(A2.Kj0(pw_111, this.fE0(-1, n, n2, n3, n4, f2), 1.6f).xi0(this.Wt(1, 0.8f)), this.WW(16, f3, f4, f5, color), 2.0f).xi0(this.nM(16, 1)), this.EN(16, 2, 8, 0.032f, 0.016f, 0.30004883f, 0.0f), 2.6f);
        f3 = 0.5f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(13311);
        this.E8 = Zw0.H(pk_1.el(pw_112, this.WW(16, f3, f4, f5, color)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)), this.Ue0(4, 0, 0.75f, 0.0f, 0.05f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


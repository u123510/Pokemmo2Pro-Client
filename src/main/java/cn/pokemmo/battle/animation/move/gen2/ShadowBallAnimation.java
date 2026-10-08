/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

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
 * Renamed from f.Ch0
 */
/**
 * 宝可梦对战技能招式动画 - 暗影球 (ShadowBall)
 * 技能编号: 247
 * 原始类: f.ch0_0
 */
public class ShadowBallAnimation
extends MU {
    public ShadowBallAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1434;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.nM(14, 1)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1815;
        n2 = 1;
        n3 = 14;
        f = 1666.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 1600.0f, 320.0f)).xi0(this.Sv0(1, 1, 1600.0f, 320.0f));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f = 1833.3334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(414));
        n = 414;
        n2 = 0;
        n3 = 0;
        int n4 = 0;
        f2 = 1.0f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 414;
        n2 = 1;
        n3 = 0;
        n4 = 0;
        f2 = 1.0f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 414;
        n2 = 2;
        n3 = 0;
        n4 = 0;
        f2 = 1.0f;
        pw_1 pw_18 = A2.Kj0(pw_17, this.fE0(-1, n, n2, n3, n4, f2), 1.6f).xi0(this.Wt(1, 0.4f));
        n = 414;
        n2 = 3;
        n3 = 1;
        n4 = 0;
        f2 = 0.0f;
        pw_1 pw_19 = N4.zr(pw_18, this.fE0(-1, n, n2, n3, n4, f2), 1.8f);
        n = 414;
        n2 = 4;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 1.0f;
        Color color = px_1.ep0(12300);
        pw_1 pw_110 = N4.zr(pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)).xi0(this.WW(16, f3, f4, f5, color)), this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f), 2.2f);
        f3 = 0.5f;
        f4 = 1.0f;
        f5 = 0.0f;
        color = px_1.ep0(12300);
        this.E8 = pk_1.el(pw_110, this.WW(16, f3, f4, f5, color)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


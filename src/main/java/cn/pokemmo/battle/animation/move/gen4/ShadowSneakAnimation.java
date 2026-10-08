/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.PF;
import f.Zw0;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 影子偷袭 (ShadowSneak)
 * 技能编号: 425
 * 原始类: f.EM
 */
public class ShadowSneakAnimation
extends MU {
    public ShadowSneakAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1446;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.E2(18, true)).p1(0.6f).mz0().Xf0().xi0(this.Ue0(4, Short.MAX_VALUE, 0.0f, 0.3125f, 0.075f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1417;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 1833.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 800.0f)).xi0(this.Sv0(2, 1, 1280.0f, 320.0f));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 1166.6666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 1250.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 1333.3334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_17 = A2.Kj0(pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(600)), this.dA0(600, 0, 9, 11, 0.25f, 0.0f), 0.6f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(1.2f).Xf0();
        n = 600;
        n2 = 1;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(0);
        pw_1 pw_18 = pk_1.el(pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)).xi0(this.WW(16, f3, f4, f5, color)), this.EN(16, 2, 4, 0.016f, 0.032f, 0.19995117f, 0.0f));
        f3 = 0.25f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(0);
        this.E8 = Zw0.H(pw_18.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).y80(this.E2(18, false)), this.Ue0(4, Short.MAX_VALUE, 0.3125f, 0.0f, 0.075f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


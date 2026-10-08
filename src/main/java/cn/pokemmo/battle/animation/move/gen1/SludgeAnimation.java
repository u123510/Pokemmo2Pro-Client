/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.cg0
 */
/**
 * 宝可梦对战技能招式动画 - 污泥攻击 (Sludge)
 * 技能编号: 124
 * 原始类: f.cg0_2
 */
public class SludgeAnimation
extends MU {
    public SludgeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1510;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1480;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = A2.Kj0(pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(289)), this.dA0(289, 1, 9, 11, 0.5f, 360.0f), 0.4f).xi0(this.Wt(1, 0.4f)).mz0().mz0().mz0().Xf0().xi0(this.nM(16, 1));
        n = 289;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(30750);
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, n, n2, n3, n4, f2), 0.12f).xi0(this.WW(16, f3, f4, f5, color)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f));
        short s = 1478;
        int n5 = 2;
        int n6 = 16;
        float f6 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        float f7 = 0.75f;
        float f8 = 0.75f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(30750);
        this.E8 = pk_1.el(pw_15, this.i6((byte)2, s, n5, n6, f6, f2, pF)).xi0(this.tP(0.4f)).xi0(this.WW(16, f7, f8, f9, color2)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


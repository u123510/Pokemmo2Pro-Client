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
 * Renamed from f.hG0
 */
/**
 * 宝可梦对战技能招式动画 - 喷射火焰 (Flamethrower)
 * 技能编号: 53
 * 原始类: f.hg0_0
 */
public class FlamethrowerAnimation
extends MU {
    public FlamethrowerAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1425;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.Ue0(2, 30, 0.0f, 0.625f, 0.025f)).y80(this.Qh0(214)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1445;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = A2.Kj0(pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 960.0f)).xi0(this.dA0(214, 0, 9, 11, 0.5f, 0.0f)), this.dA0(214, 1, 9, 11, 0.5f, 0.0f), 0.4f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(0.92f).Xf0();
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1561;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1561;
        n2 = 2;
        n3 = 16;
        f = 500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1426;
        n2 = 0;
        n3 = 16;
        f = 166.66667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 214;
        n2 = 3;
        n3 = 11;
        int n4 = 8;
        f2 = 0.375f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 214;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.375f;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(31);
        pw_1 pw_19 = pk_1.el(pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.WW(16, f3, f4, f5, color)), this.EN(16, 2, 6, 0.016f, 0.032f, 0.5f, 0.0f));
        f3 = 0.5f;
        f4 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(31);
        this.E8 = pw_19.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.Ue0(2, 30, 0.625f, 0.0f, 0.025f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


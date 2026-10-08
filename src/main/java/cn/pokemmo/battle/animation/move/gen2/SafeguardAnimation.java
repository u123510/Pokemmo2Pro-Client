/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 神秘守护 (Safeguard)
 * 技能编号: 219
 * 原始类: f.n30
 */
public class SafeguardAnimation
extends MU {
    public SafeguardAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1483;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.4f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1480;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(386));
        n = 386;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 386;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        float f3 = 1.0f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_16 = pk_1.el(pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(14, 1)).TD0().p1(0.2f).Xf0().xi0(this.WW(14, f3, f4, f5, color)).xi0(this.EN(14, 2, 4, 0.016f, 0.016f, 0.19995117f, 0.0f)), this.Xq0(14, 2, 1, 0.016f, 0.16f, 0.100097656f, -0.100097656f));
        f3 = 1.0f;
        f4 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        this.E8 = pw_16.xi0(this.WW(14, f3, f4, f5, color)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


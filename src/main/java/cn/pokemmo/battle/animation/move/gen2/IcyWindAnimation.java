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

/*
 * Renamed from f.sx0
 */
/**
 * 宝可梦对战技能招式动画 - 冰冻之风 (IcyWind)
 * 技能编号: 196
 * 原始类: f.sx0_0
 */
public class IcyWindAnimation
extends MU {
    public IcyWindAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1439;
        int n2 = 1;
        int n3 = 16;
        float f = 166.66667f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.Ue0(4, 0, 0.0f, 1.0f, 0.075f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1717;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 320.0f)).xi0(this.Sv0(2, 0, 640.0f, 480.0f)).xi0(this.Sv0(2, 1, 0.0f, 480.0f)).xi0(this.Sv0(2, 1, 640.0f, 640.0f));
        n = 1488;
        n2 = 1;
        n3 = 16;
        f = 1333.3334f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1700;
        n2 = 2;
        n3 = 16;
        f = 1333.3334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1488;
        n2 = 1;
        n3 = 16;
        f = 1666.6666f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1700;
        n2 = 2;
        n3 = 16;
        f = 1666.6666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(362)).xi0(this.dA0(362, 1, 9, 11, 0.5f, 0.0f)).xi0(this.dA0(362, 2, 9, 11, 0.5f, 0.0f)).TD0().p1(0.6f).Xf0().xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(1.2f).Xf0().xi0(this.EN(16, 2, 4, 0.032f, 0.032f, 0.5f, 0.0f));
        n = 362;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        float f3 = 1.0f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_19 = pk_1.el(pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.WW(16, f3, f4, f5, color));
        f3 = 1.0f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        this.E8 = pw_19.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.tP(0.4f)).xi0(this.Ue0(4, 0, 1.0f, 0.0f, 0.075f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


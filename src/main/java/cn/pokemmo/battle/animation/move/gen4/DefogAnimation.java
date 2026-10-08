/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.bt0
 */
/**
 * 宝可梦对战技能招式动画 - 清除浓雾 (Defog)
 * 技能编号: 432
 * 原始类: f.bt0_0
 */
public class DefogAnimation
extends MU {
    public DefogAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1445;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.E2(18, true)).xi0(this.Ue0(4, Short.MAX_VALUE, 0.0f, 0.75f, 0.075f)).xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1280.0f)).xi0(this.Sv0(1, 1, 640.0f, 640.0f));
        s = 1509;
        n = 2;
        n2 = 14;
        f = 1000.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1509;
        n = 1;
        n2 = 14;
        f = 1166.6666f;
        f2 = 0.46875f;
        pF = this.Vz0;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.WW(18, f3, f4, f5, color)).y80(this.Qh0(608));
        int n3 = 608;
        int n4 = 0;
        int n5 = 11;
        int n6 = 8;
        f2 = 0.75f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 608;
        n4 = 0;
        n5 = 11;
        n6 = 8;
        f2 = 0.25f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 608;
        n4 = 0;
        n5 = 11;
        n6 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 608;
        n4 = 0;
        n5 = 11;
        n6 = 8;
        f2 = 1.0f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 608;
        n4 = 0;
        n5 = 11;
        n6 = 8;
        f2 = 1.25f;
        float f6 = 0.75f;
        float f7 = 0.75f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = HB.p30(pw_18, this.fE0(-1, n3, n4, n5, n6, f2)).xi0(this.Ue0(4, Short.MAX_VALUE, 0.75f, 0.0f, 0.075f)).xi0(this.WW(18, f6, f7, f8, color2)).y80(this.E2(18, false)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


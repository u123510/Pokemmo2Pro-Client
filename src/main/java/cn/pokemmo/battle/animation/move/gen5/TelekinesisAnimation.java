/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.jo
 */
/**
 * 宝可梦对战技能招式动画 - 意念移物 (Telekinesis)
 * 技能编号: 477
 * 原始类: f.jo_2
 */
public class TelekinesisAnimation
extends MU {
    public TelekinesisAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f = 1.0f;
        float f2 = 0.0f;
        float f3 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        short s = 1433;
        int n = 1;
        int n2 = 14;
        float f4 = 0.0f;
        float f5 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.625f, 0.075f)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.WW(14, f, f2, f3, color)).y80(this.Qh0(363)).xi0(this.i6((byte)2, s, n, n2, f4, f5, pF));
        s = 363;
        n = 0;
        n2 = 9;
        int n3 = 8;
        f5 = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f5));
        s = 363;
        n = 1;
        n2 = 9;
        n3 = 8;
        f5 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f5)).xi0(this.nM(16, 1)).TD0().p1(0.4f).Xf0().xi0(this.Ue0(4, 0, 0.625f, 0.0f, 0.075f)).xi0(this.Wt(1, 0.25f));
        s = 1777;
        n = 1;
        n2 = 16;
        float f6 = 0.0f;
        f5 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f6, f5, pF)).xi0(this.Sv0(1, 1, 1280.0f, 160.0f));
        s = 1376;
        n = 1;
        n2 = 16;
        f6 = 1500.0f;
        f5 = 0.0f;
        pF = this.Vz0;
        float f7 = 1.0f;
        float f8 = 0.75f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = pk_1.el(pw_15.xi0(this.i6((byte)2, s, n, n2, f6, f5, pF)).y80(this.E2(16, true)), this.EN(16, 2, 1, 0.016f, 0.32f, 1.0f, 2.0f)).xi0(this.tP(0.4f)).xi0(this.WW(14, f7, f8, f9, color2)).xi0(this.nM(16, 0)).y80(this.E2(16, false)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


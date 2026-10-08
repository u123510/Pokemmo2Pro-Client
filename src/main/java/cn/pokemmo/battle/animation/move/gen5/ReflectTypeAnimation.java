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
 * Renamed from f.cl0
 */
/**
 * 宝可梦对战技能招式动画 - 反射属性 (ReflectType)
 * 技能编号: 513
 * 原始类: f.cl0_2
 */
public class ReflectTypeAnimation
extends MU {
    public ReflectTypeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f = 0.25f;
        float f2 = 0.0f;
        float f3 = 0.5f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        int n = 1450;
        int n2 = 1;
        int n3 = 16;
        float f4 = 0.0f;
        float f5 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(678)).xi0(this.WW(16, f, f2, f3, color)).xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF)).xi0(this.Sv0(1, 0, 0.0f, 480.0f)).xi0(this.Sv0(1, 1, 400.0f, 160.0f));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f4 = 666.6667f;
        f5 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1450;
        n2 = 2;
        n3 = 16;
        f4 = 483.33334f;
        f5 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF)).xi0(this.Sv0(2, 0, 464.0f, 480.0f)).xi0(this.Sv0(2, 1, 896.0f, 320.0f));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f4 = 1166.6666f;
        f5 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 678;
        n2 = 1;
        n3 = 11;
        int n4 = 8;
        f5 = 0.25f;
        float f6 = 0.25f;
        float f7 = 0.5f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_16 = pk_1.el(pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f5)).xi0(this.nM(16, 1)).TD0().p1(0.6f).Xf0(), this.WW(16, f6, f7, f8, color2));
        int n5 = 1450;
        int n6 = 1;
        int n7 = 14;
        float f9 = 333.33334f;
        f5 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n5, n6, n7, f9, f5, pF)).xi0(this.Sv0(1, 0, 320.0f, 1920.0f)).xi0(this.Sv0(1, 1, 320.0f, 1920.0f));
        n5 = 1376;
        n6 = 1;
        n7 = 14;
        f9 = 2000.0f;
        f5 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n5, n6, n7, f9, f5, pF)).xi0(this.nM(16, 0));
        n5 = 678;
        n6 = 0;
        n7 = 9;
        int n8 = 8;
        f5 = 0.25f;
        float f10 = 0.25f;
        float f11 = 0.0f;
        float f12 = 0.5f;
        Color color3 = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_19 = pk_1.el(pw_18.xi0(this.fE0(-1, n5, n6, n7, n8, f5)).xi0(this.Wt(0, 0.4f)).TD0().p1(0.6f).Xf0(), this.WW(14, f10, f11, f12, color3));
        f10 = 0.25f;
        f11 = 0.5f;
        f12 = 0.0f;
        color3 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = pw_19.xi0(this.WW(14, f10, f11, f12, color3)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


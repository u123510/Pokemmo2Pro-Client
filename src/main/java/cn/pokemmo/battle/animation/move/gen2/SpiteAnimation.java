/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.fa
 */
/**
 * 宝可梦对战技能招式动画 - 怨恨 (Spite)
 * 技能编号: 180
 * 原始类: f.fa_2
 */
public class SpiteAnimation
extends MU {
    public SpiteAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1783;
        int n = 2;
        int n2 = 2;
        float f = 0.0f;
        float f2 = 0.3125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 2;
        n2 = 2;
        f = 2500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_13 = HB.p30(pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(2, 1, 2080.0f, 320.0f)).xi0(this.nM(14, 1)), this.Ue0(4, 0, 0.0f, 0.75f, 0.05f)).xi0(this.WW(14, f3, f4, f5, color));
        short s2 = 1448;
        int n3 = 1;
        int n4 = 14;
        float f6 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        float f7 = 0.5f;
        float f8 = 0.75f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_14 = HB.p30(pw_13, this.i6((byte)2, s2, n3, n4, f6, f2, pF)).xi0(this.WW(14, f7, f8, f9, color2)).xi0(this.EN(16, 2, 2, 0.032f, 0.016f, 0.0f, 0.30004883f)).xi0(this.nM(16, 1)).mz0().Xf0();
        short s3 = 1448;
        int n5 = 1;
        int n6 = 14;
        float f10 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        float f11 = 0.5f;
        float f12 = 0.0f;
        float f13 = 0.75f;
        Color color3 = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_15 = HB.p30(pw_14.xi0(this.i6((byte)2, s3, n5, n6, f10, f2, pF)).xi0(this.WW(14, f11, f12, f13, color3)), this.EN(16, 2, 2, 0.032f, 0.016f, 0.0f, 0.30004883f));
        f11 = 0.5f;
        f12 = 0.75f;
        f13 = 0.0f;
        color3 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = HB.p30(pw_15.xi0(this.WW(14, f11, f12, f13, color3)), this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.nM(16, 0)).xi0(this.nM(14, 0)).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


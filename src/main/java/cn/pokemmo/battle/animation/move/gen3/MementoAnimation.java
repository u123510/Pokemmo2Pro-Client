/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

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
 * Renamed from f.aP
 */
/**
 * 宝可梦对战技能招式动画 - 临别礼物 (Memento)
 * 技能编号: 262
 * 原始类: f.ap_1
 */
public class MementoAnimation
extends MU {
    public MementoAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1497;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 800.0f)).xi0(this.Sv0(1, 1, 640.0f, 320.0f)).y80(this.Qh0(428));
        n = 428;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.0f;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(6150);
        pw_1 pw_14 = A2.Kj0(pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.WW(14, f3, f4, f5, color)), this.Xq0(14, 2, 1, 0.016f, 0.192f, 0.0f, 0.8000488f), 0.4f);
        f3 = 0.5f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(6150);
        pw_1 pw_15 = pw_14.xi0(this.WW(14, f3, f4, f5, color)).xi0(this.Wt(1, 0.8f)).mz0().mz0().TD0().p1(1.0f).Xf0().xi0(this.nM(16, 1));
        f3 = 0.5f;
        f4 = 0.0f;
        f5 = 0.75f;
        color = px_1.ep0(6150);
        int n5 = 1497;
        int n6 = 2;
        int n7 = 16;
        float f6 = 0.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.i6((byte)2, (short)n5, n6, n7, f6, f2, pF));
        n5 = 1376;
        n6 = 2;
        n7 = 16;
        f6 = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n5, n6, n7, f6, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 800.0f)).xi0(this.Sv0(2, 1, 640.0f, 320.0f));
        n5 = 428;
        n6 = 1;
        n7 = 11;
        int n8 = 8;
        f2 = 0.0f;
        float f7 = 0.5f;
        float f8 = 0.75f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(6150);
        this.E8 = pk_1.el(N4.zr(pw_17, this.fE0(-1, n5, n6, n7, n8, f2), 1.4f), this.WW(16, f7, f8, f9, color2)).xi0(this.nM(16, 0)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


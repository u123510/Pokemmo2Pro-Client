/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.hT
 */
/**
 * 宝可梦对战技能招式动画 - 气旋攻击 (Aeroblast)
 * 技能编号: 177
 * 原始类: f.ht_1
 */
public class AeroblastAnimation
extends MU {
    public AeroblastAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1;
        int n = 0;
        lpt4__4 lpt4__42 = new lpt4__4(this, s, n != 0);
        s = 0;
        n = 0;
        lpt4__4 lpt4__43 = new lpt4__4(this, s, n != 0);
        s = 2;
        n = 1;
        lpt4__4 lpt4__44 = new lpt4__4(this, s, n != 0);
        s = 1445;
        n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)), this.Ue0(2, 0, 0.0f, 1.0f, 0.025f)).xi0(this.Ue0(3, 0, 1.0f, 0.0f, 0.025f)).y80(this.QO(18)).xi0(this.mf0(2, 8, 8, 0.016f)).y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 916.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 800.0f)).y80(this.Qh0(344));
        s = 344;
        n = 1;
        n2 = 9;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 344;
        n = 2;
        n2 = 9;
        n3 = 11;
        f2 = 0.5f;
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, s, n, n2, n3, f2), 1.0f).xi0(this.Wt(1, 0.8f));
        s = 1407;
        n = 2;
        n2 = 14;
        float f3 = 0.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1376;
        n = 2;
        n2 = 14;
        f3 = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1425;
        n = 1;
        n2 = 14;
        f3 = 0.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f3 = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        float f4 = 0.25f;
        float f5 = 0.0f;
        float f6 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_19 = N4.zr(pw_18.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1280.0f)).xi0(this.Sv0(1, 1, 960.0f, 320.0f)).xi0(this.Sv0(2, 1, 960.0f, 320.0f)), this.Sv0(2, 0, 0.0f, 1280.0f), 1.4f).xi0(this.WW(16, f4, f5, f6, color));
        short s2 = 344;
        int n4 = 0;
        int n5 = 11;
        int n6 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, s2, n4, n5, n6, f2));
        s2 = 1420;
        n4 = 0;
        n5 = 16;
        float f7 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, s2, n4, n5, f7, f2, pF));
        s2 = 1420;
        n4 = 0;
        n5 = 16;
        f7 = 166.66667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, s2, n4, n5, f7, f2, pF));
        s2 = 1420;
        n4 = 0;
        n5 = 16;
        f7 = 333.33334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_113 = pw_112.xi0(this.i6((byte)2, s2, n4, n5, f7, f2, pF));
        s2 = 1420;
        n4 = 0;
        n5 = 16;
        f7 = 500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        float f8 = 0.25f;
        float f9 = 0.75f;
        float f10 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        int n7 = 1;
        boolean bl = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n7, bl);
        n7 = 0;
        bl = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n7, bl);
        n7 = 2;
        bl = false;
        this.E8 = pk_1.el(N4.zr(N4.zr(pw_113.xi0(this.i6((byte)2, s2, n4, n5, f7, f2, pF)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 8, 0.016f, 0.032f, 0.30004883f, -0.19995117f)), this.EN(16, 2, 8, 0.032f, 0.016f, 0.30004883f, 0.0f), 2.0f), this.WW(16, f8, f9, f10, color2), 2.72f), this.Ue0(3, 0, 0.0f, 1.0f, 0.05f)).xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.025f)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n7, bl))).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


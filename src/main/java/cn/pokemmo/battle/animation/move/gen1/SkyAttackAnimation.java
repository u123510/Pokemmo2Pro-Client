/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.sD0
 */
/**
 * 宝可梦对战技能招式动画 - 神鸟猛击 (SkyAttack)
 * 技能编号: 143
 * 原始类: f.sd0_0
 */
public class SkyAttackAnimation
extends MU {
    public SkyAttackAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        float f = 0.25f;
        float f2 = 0.0f;
        float f3 = 0.8125f;
        Color color = px_1.ep0(0);
        int n = 1407;
        int n2 = 1;
        int n3 = 14;
        float f4 = 0.0f;
        float f5 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.025f)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.WW(14, f, f2, f3, color)).xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f4 = 1000.0f;
        f5 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF)).xi0(this.Sv0(1, 0, 0.0f, 960.0f)).xi0(this.Sv0(1, 1, 0.0f, 960.0f)).y80(this.Qh0(308));
        n = 308;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f5 = 0.5f;
        float f6 = 0.25f;
        float f7 = 0.8125f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(0);
        pw_1 pw_14 = HB.p30(HB.p30(pw_13, this.fE0(-1, n, n2, n3, n4, f5)), this.WW(14, f6, f7, f8, color2));
        f6 = 0.25f;
        f7 = 0.0f;
        f8 = 0.8125f;
        color2 = px_1.ep0(Short.MAX_VALUE);
        short s = 1358;
        int n5 = 1;
        int n6 = 14;
        float f9 = 0.0f;
        f5 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.WW(14, f6, f7, f8, color2)).xi0(this.i6((byte)2, s, n5, n6, f9, f5, pF));
        s = 1358;
        n5 = 2;
        n6 = 14;
        f9 = 500.0f;
        f5 = 0.46875f;
        pF = this.Vz0;
        float f10 = 0.25f;
        float f11 = 0.8125f;
        float f12 = 0.0f;
        Color color3 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = HB.p30(pw_15, this.i6((byte)2, s, n5, n6, f9, f5, pF)).xi0(this.WW(14, f10, f11, f12, color3)).xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.025f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        return this;
    }

    @Override
    public final MU us() {
        int n = 2;
        boolean bl = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl);
        n = 1505;
        int n2 = 1;
        int n3 = 14;
        float f = 166.66667f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).y80(this.QO(30)).y80(ao_1.pc(lpt4__42)).xi0(this.Ue0(4, 0, 0.0f, 1.0f, 0.025f)).xi0(this.df0(14, 3)).mz0().Xf0().xi0(this.Ue0(3, 0, 1.0f, 0.0f, 0.05f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1510;
        int n4 = 2;
        n3 = 2;
        f = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n4, n3, f, f2, pF));
        n = 1376;
        int n5 = 2;
        n3 = 2;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n5, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 800.0f, 480.0f));
        n = 1537;
        int n6 = 1;
        n3 = 16;
        f = 750.0f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n6, n3, f, f2, pF));
        n = 1424;
        int n7 = 2;
        n3 = 16;
        f = 750.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n7, n3, f, f2, pF)).y80(this.Qh0(309));
        n = 0;
        boolean bl2 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl2);
        n = 1;
        boolean bl3 = false;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl3);
        n = 309;
        int n8 = 2;
        n3 = 9;
        int n9 = 11;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.mf0(4, 30, 0, 1.44f)).xi0(this.fE0(-1, n, n8, n3, n9, f2));
        n = 309;
        int n10 = 4;
        n3 = 9;
        n9 = 11;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n10, n3, n9, f2));
        n = 309;
        int n11 = 5;
        n3 = 9;
        n9 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n11, n3, n9, f2));
        n = 309;
        int n12 = 1;
        n3 = 9;
        n9 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = A2.Kj0(pw_19, this.fE0(-1, n, n12, n3, n9, f2), 0.4f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(0.6f).Xf0();
        n = 309;
        int n13 = 0;
        n3 = 11;
        n9 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = pk_1.el(pw_110.xi0(this.fE0(-1, n, n13, n3, n9, f2)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.032f, 0.064f, 0.19995117f, -0.19995117f)), this.Ue0(3, 0, 0.0f, 1.0f, 0.025f));
        n = 0;
        boolean bl4 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl4);
        n = 1;
        boolean bl5 = true;
        this.E8 = pw_111.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n, bl5))).xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.025f)).xi0(this.df0(14, 4)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


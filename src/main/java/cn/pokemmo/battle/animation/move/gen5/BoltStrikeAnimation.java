/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

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
 * Renamed from f.sZ
 */
/**
 * 宝可梦对战技能招式动画 - 雷击 (BoltStrike)
 * 技能编号: 550
 * 原始类: f.sz_1
 */
public class BoltStrikeAnimation
extends MU {
    public BoltStrikeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 2;
        boolean bl = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, s, bl);
        s = 1522;
        int f4 = 1;
        int n = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().y80(this.QO(20)).y80(ao_1.pc(lpt4__42)).xi0(this.Wt(0, 0.3f)).mz0().Xf0(), this.Ue0(4, 0, 0.0f, 1.0f, 0.025f)).xi0(this.i6((byte)2, s, f4, n, f, f2, pF));
        s = 1522;
        int n2 = 2;
        n = 14;
        f = 750.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n2, n, f, f2, pF));
        s = 1522;
        int f8 = 1;
        n = 14;
        f = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, f8, n, f, f2, pF));
        s = 1908;
        int bl2 = 2;
        n = 14;
        f = 1333.3334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, bl2, n, f, f2, pF));
        s = 1438;
        int f11 = 1;
        n = 14;
        f = 2166.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, f11, n, f, f2, pF));
        s = 0;
        boolean bl3 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, s, bl3);
        s = 1;
        boolean bl4 = false;
        float f3 = 1.25f;
        float f5 = 0.0f;
        float f6 = 0.5f;
        Color color = px_1.ep0(1023);
        short s2 = 717;
        int n3 = 2;
        int n4 = 9;
        int n5 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(new lpt4__4(this, s, bl4))).xi0(this.WW(14, f3, f5, f6, color)).y80(this.Qh0(717)).xi0(this.fE0(-1, s2, n3, n4, n5, f2));
        s2 = 717;
        int n6 = 4;
        n4 = 9;
        n5 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, s2, n6, n4, n5, f2));
        s2 = 717;
        int n7 = 9;
        n4 = 9;
        n5 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, s2, n7, n4, n5, f2));
        s2 = 717;
        int n8 = 7;
        n4 = 9;
        n5 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = A2.Kj0(pw_19, this.fE0(-1, s2, n8, n4, n5, f2), 1.2f);
        s2 = 717;
        int n9 = 5;
        n4 = 9;
        n5 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = A2.Kj0(pk_1.el(pw_110, this.fE0(-1, s2, n9, n4, n5, f2)), this.Xq0(14, 2, 1, 0.0f, 0.096f, 0.39990234f, -0.39990234f), 0.2f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(0.6f).Xf0();
        s2 = 1593;
        int n10 = 2;
        n4 = 16;
        float f7 = 0.0f;
        f2 = 0.5859375f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, s2, n10, n4, f7, f2, pF));
        s2 = 1885;
        int n11 = 1;
        n4 = 16;
        f7 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_113 = pw_112.xi0(this.i6((byte)2, s2, n11, n4, f7, f2, pF));
        s2 = 1522;
        int n12 = 2;
        n4 = 16;
        f7 = 750.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_114 = pw_113.xi0(this.i6((byte)2, s2, n12, n4, f7, f2, pF));
        s2 = 1748;
        int n13 = 3;
        n4 = 16;
        f7 = 0.0f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_115 = pw_114.xi0(this.i6((byte)2, s2, n13, n4, f7, f2, pF)).xi0(this.Sv0(3, 0, 0.0f, 1600.0f)).xi0(this.Sv0(3, 1, 1280.0f, 160.0f));
        s2 = 1376;
        int n14 = 3;
        n4 = 16;
        f7 = 1833.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        float f72 = 1.25f;
        float f9 = 0.5f;
        float f10 = 0.0f;
        Color color2 = px_1.ep0(1023);
        pw_1 pw_116 = pw_115.xi0(this.i6((byte)2, s2, n14, n4, f7, f2, pF)).xi0(this.Ue0(4, 0, 1.0f, 0.0f, 0.075f)).xi0(this.nM(16, 1)).xi0(this.WW(14, f72, f9, f10, color2));
        f72 = 0.75f;
        f9 = 0.0f;
        f10 = 0.5f;
        color2 = px_1.ep0(1023);
        int n52 = 717;
        int n15 = 8;
        int n16 = 11;
        int n17 = 8;
        f2 = 0.5f;
        pw_1 pw_117 = pw_116.xi0(this.WW(16, f72, f9, f10, color2)).xi0(this.fE0(-1, n52, n15, n16, n17, f2));
        n52 = 717;
        int n18 = 0;
        n16 = 11;
        n17 = 8;
        f2 = 0.5f;
        pw_1 pw_118 = pw_117.xi0(this.fE0(-1, n52, n18, n16, n17, f2));
        n52 = 717;
        int n19 = 1;
        n16 = 11;
        n17 = 8;
        f2 = 0.5f;
        pw_1 pw_119 = pw_118.xi0(this.fE0(-1, n52, n19, n16, n17, f2));
        n52 = 717;
        int n20 = 6;
        n16 = 11;
        n17 = 8;
        f2 = 0.5f;
        pw_1 pw_120 = pw_119.xi0(this.fE0(-1, n52, n20, n16, n17, f2));
        n52 = 717;
        int n21 = 3;
        n16 = 11;
        n17 = 8;
        f2 = 0.5f;
        pw_1 pw_121 = N4.zr(pw_120.xi0(this.fE0(-1, n52, n21, n16, n17, f2)).xi0(this.Xq0(16, 2, 18, 0.0f, 0.032f, 0.19995117f, -0.19995117f)), this.Ue0(4, 0, 1.0f, 0.0f, 0.075f), 1.0f);
        n52 = 717;
        int n22 = 5;
        n16 = 11;
        n17 = 8;
        f2 = 0.25f;
        pw_1 pw_122 = pk_1.el(N4.zr(pw_121, this.fE0(-1, n52, n22, n16, n17, f2), 1.4f), this.Ue0(4, 0, 0.0f, 1.0f, 0.075f));
        n52 = 1;
        boolean bl5 = true;
        lpt4__4 lpt4__44 = new lpt4__4(this, n52, bl5);
        n52 = 0;
        boolean bl6 = true;
        float f102 = 1.25f;
        float f12 = 0.5f;
        float f13 = 0.0f;
        Color color3 = px_1.ep0(1023);
        this.E8 = pw_122.y80(ao_1.pc(lpt4__44)).y80(ao_1.pc(new lpt4__4(this, n52, bl6))).mz0().Xf0().xi0(this.Ue0(4, 0, 1.0f, 0.0f, 0.075f)).xi0(this.WW(16, f102, f12, f13, color3)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


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
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.c6
 */
/**
 * 宝可梦对战技能招式动画 - 精神突击 (PsychoBoost)
 * 技能编号: 354
 * 原始类: f.c6_0
 */
public class PsychoBoostAnimation
extends MU {
    public PsychoBoostAnimation(PF pF) {
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
        n = 1505;
        int f4 = 1;
        n3 = 14;
        f = 2166.6667f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, f4, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 2000.0f));
        n = 1509;
        int bl = 2;
        n3 = 14;
        f = 2166.6667f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, bl, n3, f, f2, pF));
        n = 1475;
        int f7 = 2;
        n3 = 16;
        f = 2333.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, f7, n3, f, f2, pF));
        n = 1475;
        int bl2 = 2;
        n3 = 16;
        f = 2583.3333f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, bl2, n3, f, f2, pF));
        n = 1475;
        int n4 = 2;
        n3 = 16;
        f = 2833.3333f;
        f2 = 0.234375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n4, n3, f, f2, pF)).y80(this.Qh0(527));
        n = 527;
        int n5 = 0;
        n3 = 9;
        int n6 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n5, n3, n6, f2));
        n = 527;
        int n7 = 3;
        n3 = 9;
        n6 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n7, n3, n6, f2));
        n = 527;
        int n8 = 4;
        n3 = 9;
        n6 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n8, n3, n6, f2));
        n = 527;
        int n9 = 5;
        n3 = 9;
        n6 = 8;
        f2 = 0.5f;
        float f3 = 1.25f;
        float f5 = 0.0f;
        float f6 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        int n52 = 2;
        boolean bl3 = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n52, bl3);
        n52 = 0;
        boolean bl4 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n52, bl4);
        n52 = 1;
        boolean bl5 = false;
        pw_1 pw_111 = N4.zr(A2.Kj0(pw_110, this.fE0(-1, n, n9, n3, n6, f2), 2.2f).xi0(this.Wt(1, 0.4f)).xi0(this.WW(14, f3, f5, f6, color)).y80(this.QO(1)).y80(ao_1.pc(lpt4__42)), this.Ue0(4, 0, 0.0f, 0.875f, 0.025f), 2.32f).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(new lpt4__4(this, n52, bl5))).mz0().mz0().TD0().p1(2.44f).Xf0().xi0(this.Ue0(3, 0, 0.875f, 0.0f, 0.025f));
        float f62 = 0.5f;
        float f8 = 0.75f;
        f6 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        int n62 = 527;
        int n10 = 1;
        int n11 = 11;
        int n12 = 8;
        f2 = 0.5f;
        pw_1 pw_112 = pw_111.xi0(this.WW(14, f62, f8, f6, color)).xi0(this.mf0(2, 0, 4, 0.016f)).xi0(this.fE0(-1, n62, n10, n11, n12, f2));
        n62 = 527;
        int n13 = 2;
        n11 = 11;
        n12 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = pk_1.el(pw_112.xi0(this.fE0(-1, n62, n13, n11, n12, f2)).xi0(this.nM(16, 1)), this.EN(16, 2, 6, 0.032f, 0.016f, 0.30004883f, 0.0f));
        n62 = 1;
        boolean bl6 = true;
        lpt4__4 lpt4__44 = new lpt4__4(this, n62, bl6);
        n62 = 0;
        boolean bl7 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n62, bl7);
        n62 = 2;
        boolean bl8 = false;
        this.E8 = pw_113.y80(ao_1.pc(lpt4__44)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n62, bl8))).mz0().Xf0().xi0(this.Ue0(2, 0, 0.8125f, 0.0f, 0.05f)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


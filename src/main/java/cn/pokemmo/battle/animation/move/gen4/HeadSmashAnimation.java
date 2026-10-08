/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 双刃头锤 (HeadSmash)
 * 技能编号: 457
 * 原始类: f.KD
 */
public class HeadSmashAnimation
extends MU {
    public HeadSmashAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1421;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.EN(14, 2, 1, 0.032f, 0.032f, 1.0f, 0.0f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.QO(35));
        n = 2;
        n2 = 1;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, n2 != 0);
        n = 0;
        n2 = 0;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, n2 != 0);
        n = 1;
        n2 = 0;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, n2 != 0);
        n = 1448;
        n2 = 1;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.y80(ao_1.pc(lpt4__42)).mz0().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.05f)).xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.Ue0(3, 0, 0.8125f, 0.0f, 0.05f)).xi0(this.mf0(2, 8, 0, 0.032f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(632));
        n = 632;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 632;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 632;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 632;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 632;
        n2 = 4;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(30);
        int n5 = 1;
        boolean bl = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n5, bl);
        n5 = 0;
        bl = true;
        pw_1 pw_19 = HB.p30(HB.p30(pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)).xi0(this.WW(16, f3, f4, f5, color)), this.Xq0(16, 2, 4, 0.016f, 0.032f, 0.19995117f, -0.19995117f)), this.Ue0(3, 0, 0.0f, 0.8125f, 0.05f)).xi0(this.Ue0(2, 0, 0.8125f, 0.0f, 0.05f)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n5, bl)));
        float f6 = 0.75f;
        float f7 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(30);
        this.E8 = pw_19.xi0(this.WW(16, f6, f7, f5, color)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.Jq
 */
/**
 * 宝可梦对战技能招式动画 - 过热 (Overheat)
 * 技能编号: 315
 * 原始类: f.jq_0
 */
public class OverheatAnimation
extends MU {
    public OverheatAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1418;
        int n = 3;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        int f4 = 3;
        n2 = 14;
        f = 1166.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        float f3 = 0.75f;
        float bl = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(31);
        int n3 = 2;
        boolean f8 = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n3, f8);
        n3 = 0;
        boolean n7 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n3, n7);
        n3 = 1;
        boolean bl2 = false;
        pw_1 pw_13 = HB.p30(pw_12.xi0(this.i6((byte)2, s, f4, n2, f, f2, pF)).xi0(this.Sv0(3, 0, 0.0f, 800.0f)).xi0(this.WW(14, f3, bl, f5, color)).y80(this.QO(24)).y80(ao_1.pc(lpt4__42)), this.Ue0(4, 0, 0.0f, 0.9375f, 0.05f)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(new lpt4__4(this, n3, bl2))).xi0(this.Ue0(3, 0, 0.9375f, 0.0f, 0.05f));
        n3 = 1475;
        int n4 = 1;
        int n5 = 14;
        float f6 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n3, n4, n5, f6, f2, pF));
        n3 = 1424;
        int n6 = 2;
        n5 = 14;
        f6 = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n3, n6, n5, f6, f2, pF)).xi0(this.nM(14, 1)).xi0(this.EN(14, 2, 6, 0.016f, 0.032f, 0.19995117f, 0.0f)).y80(this.Qh0(486));
        n3 = 486;
        int n8 = 0;
        n5 = 9;
        int n9 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n3, n8, n5, n9, f2)).xi0(this.Ue0(3, 0, 0.8125f, 0.0f, 0.05f));
        n3 = 486;
        int n10 = 1;
        n5 = 9;
        n9 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = HB.p30(HB.p30(pw_16, this.fE0(-1, n3, n10, n5, n9, f2)), this.Ue0(4, 0, 0.0f, 0.9375f, 0.05f));
        n3 = 0;
        boolean bl3 = true;
        lpt4__4 lpt4__44 = new lpt4__4(this, n3, bl3);
        n3 = 1;
        boolean bl4 = true;
        float f7 = 0.75f;
        float f9 = 0.75f;
        float f10 = 0.0f;
        Color color2 = px_1.ep0(31);
        int n62 = 1440;
        int n11 = 1;
        int n12 = 14;
        float f11 = 166.66667f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.y80(ao_1.pc(lpt4__44)).y80(ao_1.pc(new lpt4__4(this, n3, bl4))).xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.05f)).xi0(this.WW(14, f7, f9, f10, color2)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n62, n11, n12, f11, f2, pF));
        n62 = 1440;
        int n13 = 2;
        n12 = 16;
        f11 = 166.66667f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n62, n13, n12, f11, f2, pF));
        n62 = 486;
        int n14 = 2;
        n12 = 9;
        int n15 = 8;
        f2 = 0.4f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n62, n14, n12, n15, f2));
        n62 = 486;
        int n16 = 2;
        n12 = 11;
        n15 = 8;
        f2 = 0.4f;
        this.E8 = HB.p30(pw_110, this.fE0(-1, n62, n16, n12, n15, f2)).xi0(this.nM(16, 1)).mz0().Xf0().xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


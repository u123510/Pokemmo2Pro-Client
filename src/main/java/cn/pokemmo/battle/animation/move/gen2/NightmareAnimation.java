/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

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
 * Renamed from f.oz0
 */
/**
 * 宝可梦对战技能招式动画 - 恶梦 (Nightmare)
 * 技能编号: 171
 * 原始类: f.oz0_0
 */
public class NightmareAnimation
extends MU {
    public NightmareAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1783;
        int bl = 0;
        int n2 = 2;
        float f = 0.0f;
        float f2 = 0.46875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, bl, n2, f, f2, pF));
        n = 1376;
        int f4 = 0;
        n2 = 2;
        f = 3666.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = HB.p30(pw_12.xi0(this.i6((byte)2, (short)n, f4, n2, f, f2, pF)).xi0(this.Sv0(4, 1, 3200.0f, 320.0f)).xi0(this.nM(14, 1)).xi0(this.nM(16, 1)), this.Ue0(2, 0, 0.0f, 1.0f, 0.05f)).y80(this.QO(17)).xi0(this.mf0(4, 0, -1, 1.28f));
        n = 2;
        boolean n3 = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, n3);
        n = 1;
        boolean f8 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, f8);
        n = 0;
        boolean bl2 = false;
        float f3 = 0.5f;
        float f5 = 0.0f;
        float f6 = 0.5f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        short s = 1535;
        int n4 = 1;
        int n5 = 16;
        float f7 = 0.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        float f72 = 0.5f;
        float f9 = 0.5f;
        float f10 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_14 = pk_1.el(A2.Kj0(pw_13.y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(new lpt4__4(this, n, bl2))).y80(this.E2(16, true)).xi0(this.WW(16, f3, f5, f6, color)).xi0(this.i6((byte)2, s, n4, n5, f7, f2, pF)), this.Xq0(16, 2, 1, 0.016f, 0.128f, 0.0f, 0.30004883f), 0.6f), this.WW(16, f72, f9, f10, color2)).y80(this.E2(16, false)).xi0(this.mf0(4, 0, -1, 1.28f)).xi0(this.EN(16, 2, 4, 0.032f, 0.032f, 0.5f, 0.0f));
        int n52 = 1779;
        int n6 = 2;
        int n7 = 16;
        float f11 = 0.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n52, n6, n7, f11, f2, pF));
        n52 = 1779;
        int n8 = 2;
        n7 = 16;
        f11 = 333.33334f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_16 = HB.p30(pw_15, this.i6((byte)2, (short)n52, n8, n7, f11, f2, pF)).xi0(this.Ue0(2, 0, 0.8125f, 0.0f, 0.05f));
        n52 = 1;
        boolean bl3 = true;
        lpt4__4 lpt4__44 = new lpt4__4(this, n52, bl3);
        n52 = 0;
        boolean bl4 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n52, bl4);
        n52 = 2;
        boolean bl5 = false;
        this.E8 = pw_16.y80(ao_1.pc(lpt4__44)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n52, bl5))).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


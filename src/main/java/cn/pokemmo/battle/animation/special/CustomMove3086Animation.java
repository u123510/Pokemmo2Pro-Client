/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

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
 * Renamed from f.Wa0
 */
/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [3086]
 * 原始类: f.wa0_0
 */
public class CustomMove3086Animation
extends MU {
    public CustomMove3086Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 0;
        int n2 = 0;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, n2 != 0);
        n = 1;
        n2 = 1;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, n2 != 0);
        n = 1522;
        n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(3, 0.4f)), this.Ue0(4, 0, 0.0f, 0.875f, 0.1f)).y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1458;
        n2 = 2;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(3086));
        n = 3086;
        n2 = 0;
        n3 = 3;
        int n4 = 1;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 3086;
        n2 = 2;
        n3 = 3;
        n4 = 1;
        f2 = 0.5f;
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, n, n2, n3, n4, f2), 0.08f);
        n = 3086;
        n2 = 0;
        n3 = 3;
        n4 = 1;
        f2 = 0.5f;
        pw_1 pw_16 = N4.zr(pw_15, this.fE0(-1, n, n2, n3, n4, f2), 0.16f);
        n = 3086;
        n2 = 0;
        n3 = 3;
        n4 = 1;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 3086;
        n2 = 1;
        n3 = 3;
        n4 = 1;
        f2 = 0.5f;
        float f3 = 1.0f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(1023);
        int n5 = 0;
        boolean bl = true;
        lpt4__4 lpt4__44 = new lpt4__4(this, n5, bl);
        n5 = 1;
        bl = true;
        pw_1 pw_18 = pk_1.el(pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 1)).xi0(this.EN(16, 2, 6, 0.016f, 0.032f, 0.19995117f, 0.0f)), this.Xq0(16, 2, 6, 0.016f, 0.032f, 0.050048828f, -0.050048828f)).y80(ao_1.pc(lpt4__44)).y80(ao_1.pc(new lpt4__4(this, n5, bl))).xi0(this.tP(0.4f)).xi0(this.Ue0(4, 0, 0.875f, 0.0f, 0.1f));
        float f6 = 1.0f;
        float f7 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(1023);
        this.E8 = pw_18.xi0(this.WW(16, f6, f7, f5, color)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


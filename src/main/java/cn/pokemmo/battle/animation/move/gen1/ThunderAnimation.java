/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.MU;
import f.N4;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.e9
 */
/**
 * 宝可梦对战技能招式动画 - 打雷 (Thunder)
 * 技能编号: 87
 * 原始类: f.e9_0
 */
public class ThunderAnimation
extends MU {
    public ThunderAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1683;
        int n2 = 1;
        int n3 = 2;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.05f)).xi0(this.Wt(1, 0.65f)).TD0().p1(0.52f).Xf0().xi0(this.nM(14, 1)).xi0(this.nM(16, 1)).mz0().mz0().TD0().p1(0.92f).Xf0().xi0(this.Ue0(3, 0, 0.875f, 0.0f, 0.05f)).y80(this.QO(11));
        n = 2;
        n2 = 1;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, n2 != 0);
        n = 1;
        n2 = 0;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, n2 != 0);
        n = 0;
        n2 = 0;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, n2 != 0);
        n = 1710;
        n2 = 1;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = N4.zr(pw_12.y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)), this.mf0(4, 1, 0, 0.8f), 1.52f).xi0(this.Ue0(3, 0, 0.0f, 0.875f, 0.075f)).xi0(this.Wt(1, 0.2f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1710;
        n2 = 2;
        n3 = 16;
        f = 250.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 1;
        n3 = 16;
        f = 250.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1514;
        n2 = 2;
        n3 = 16;
        f = 416.66666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(252)).y80(this.Qh0(253)).y80(this.Qh0(254));
        n = 254;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.75f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 252;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.0f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 252;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.75f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 253;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.0f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 253;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.0f;
        float f3 = 0.75f;
        float f4 = 0.875f;
        float f5 = 0.0f;
        Color color = px_1.ep0(1023);
        int n5 = 1;
        boolean bl = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n5, bl);
        n5 = 0;
        bl = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n5, bl);
        n5 = 2;
        bl = false;
        this.E8 = pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.WW(16, f3, f4, f5, color)).xi0(this.Xq0(16, 2, 1, 0.0f, 0.096f, 0.30004883f, -0.30004883f)).xi0(this.EN(16, 2, 8, 0.032f, 0.016f, 0.5f, 0.0f)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n5, bl))).mz0().mz0().TD0().p1(2.52f).Xf0().xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.tP(0.8f)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


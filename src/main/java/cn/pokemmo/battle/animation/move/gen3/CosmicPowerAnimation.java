/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 宇宙力量 (CosmicPower)
 * 技能编号: 322
 * 原始类: f.F3
 */
public class CosmicPowerAnimation
extends MU {
    public CosmicPowerAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f = 0.75f;
        float f2 = 0.0f;
        float f3 = 0.8125f;
        Color color = px_1.ep0(0);
        int n = 2;
        int n2 = 1;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, n2 != 0);
        n = 0;
        n2 = 0;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, n2 != 0);
        n = 1;
        n2 = 0;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, n2 != 0);
        n = 1483;
        n2 = 1;
        int n3 = 14;
        float f4 = 0.0f;
        float f5 = 0.15625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.WW(16, f, f2, f3, color)).y80(this.QO(25)).y80(ao_1.pc(lpt4__42)).xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.075f)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.Ue0(3, 0, 0.8125f, 0.0f, 0.075f)).y80(this.E2(14, true)).y80(this.E2(16, true)).xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1872;
        n2 = 2;
        n3 = 14;
        f4 = 0.0f;
        f5 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF)).xi0(this.mf0(4, 0, 1, 1.6f)).y80(this.Qh0(492));
        n = 492;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f5 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f5));
        n = 492;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f5 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f5));
        n = 492;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f5 = 0.25f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f5));
        n = 492;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f5 = -0.049987793f;
        float f6 = 0.75f;
        float f7 = 0.8125f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(0);
        int n5 = 0;
        boolean bl = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n5, bl);
        n5 = 1;
        bl = true;
        this.E8 = A2.Kj0(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f5)).xi0(this.Ue0(3, 0, 0.0f, 0.8125f, 0.05f)), this.WW(16, f6, f7, f8, color2), 1.5f).y80(this.E2(14, false)).y80(this.E2(16, false)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n5, bl))).xi0(this.tP(0.4f)).xi0(this.Ue0(2, 0, 0.8125f, 0.0f, 0.05f)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


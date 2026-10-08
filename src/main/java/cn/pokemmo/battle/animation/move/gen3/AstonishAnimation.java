/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.jw0
 */
/**
 * 宝可梦对战技能招式动画 - 惊吓 (Astonish)
 * 技能编号: 310
 * 原始类: f.jw0_0
 */
public class AstonishAnimation
extends MU {
    public AstonishAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        AstonishAnimation jw0_02 = this;
        AstonishAnimation jw0_03 = this;
        short s = 1507;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = jw0_03.Vz0;
        pw_1 pw_13 = HB.p30(FB.zd0(0.6f).xi0(jw0_03.i6((byte)2, s, n, n2, f, f2, pF)), this.Xq0(14, 2, 1, 0.032f, 0.048f, 0.19995117f, -0.19995117f)).xi0(this.Wt(1, 0.3f)).mz0().Xf0();
        AstonishAnimation jw0_04 = this;
        s = 1508;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = jw0_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(jw0_04.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(477)).xi0(this.nM(16, 1));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 477, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_15.xi0(this.fE0(-1, 477, s, n, n2, f)), this.Xq0(16, 2, 1, 0.032f, 0.048f, 0.19995117f, -0.19995117f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        jw0_02.Vs.jH(this.E8);
        jw0_02.Vc();
        return jw0_02;
    }
}


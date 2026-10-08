/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.Ia
 */
/**
 * 宝可梦对战技能招式动画 - 力量宝石 (PowerGem)
 * 技能编号: 408
 * 原始类: f.ia_0
 */
public class PowerGemAnimation
extends MU {
    public PowerGemAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f = 1.75f;
        float f2 = 0.0f;
        float f3 = 0.5f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        int n = 1713;
        int n2 = 1;
        int n3 = 14;
        float f4 = 0.0f;
        float f5 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.05f)).xi0(this.WW(14, f, f2, f3, color)).xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f4 = 1333.3334f;
        f5 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF)).xi0(this.Sv0(1, 0, 0.0f, 1200.0f));
        n = 1510;
        n2 = 2;
        n3 = 14;
        f4 = 1333.3334f;
        f5 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF)).y80(this.Qh0(583));
        n = 583;
        n2 = 2;
        n3 = 9;
        int n4 = 8;
        f5 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f5));
        n = 583;
        n2 = 1;
        n3 = 9;
        n4 = 11;
        f5 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f5));
        n = 583;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f5 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f5));
        n = 583;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f5 = 0.5f;
        float f6 = 0.5f;
        float f7 = 0.5f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_18 = A2.Kj0(pw_17, this.fE0(-1, n, n2, n3, n4, f5), 1.6f).xi0(this.WW(14, f6, f7, f8, color2)).xi0(this.Wt(1, 0.4f));
        short s = 1421;
        int n5 = 1;
        int n6 = 16;
        float f9 = 500.0f;
        f5 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n5, n6, f9, f5, pF));
        s = 1421;
        n5 = 1;
        n6 = 16;
        f9 = 583.3333f;
        f5 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, s, n5, n6, f9, f5, pF));
        s = 1421;
        n5 = 1;
        n6 = 16;
        f9 = 666.6667f;
        f5 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, s, n5, n6, f9, f5, pF));
        s = 1421;
        n5 = 1;
        n6 = 16;
        f9 = 750.0f;
        f5 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, s, n5, n6, f9, f5, pF));
        s = 1421;
        n5 = 1;
        n6 = 16;
        f9 = 833.3333f;
        f5 = 0.8984375f;
        pF = this.Vz0;
        this.E8 = pk_1.el(N4.zr(pw_112, this.i6((byte)2, s, n5, n6, f9, f5, pF), 2.0f).xi0(this.nM(16, 1)), this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.nM(16, 0)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


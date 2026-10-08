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
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.iB
 */
/**
 * 宝可梦对战技能招式动画 - 扮演 (RolePlay)
 * 技能编号: 272
 * 原始类: f.ib_1
 */
public class RolePlayAnimation
extends MU {
    public RolePlayAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1421;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = A2.Kj0(pw_1.xC().Xf0().p1(0.6f).xi0(this.nM(14, 1)).xi0(this.nM(16, 1)), this.Ue0(4, 0, 0.0f, 0.75f, 0.05f), 0.6f).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1421;
        n = 2;
        n2 = 14;
        f = 83.333336f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1421;
        n = 1;
        n2 = 14;
        f = 166.66667f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1421;
        n = 2;
        n2 = 14;
        f = 250.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1421;
        n = 1;
        n2 = 14;
        f = 333.33334f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1421;
        n = 2;
        n2 = 14;
        f = 416.66666f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1421;
        n = 1;
        n2 = 14;
        f = 500.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1421;
        n = 2;
        n2 = 14;
        f = 583.3333f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1708;
        n = 1;
        n2 = 14;
        f = 716.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.EN(14, 2, 24, 0.0f, 0.016f, -2.5f, 0.0f)).xi0(this.WW(14, f3, f4, f5, color));
        f3 = 0.5f;
        f4 = 0.0f;
        f5 = 0.75f;
        color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_111 = N4.zr(pw_110, this.WW(16, f3, f4, f5, color), 1.2f).xi0(this.Xq0(14, 3, 1, 0.016f, 0.048f, 0.19995117f, -0.39990234f));
        f3 = 0.5f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_112 = pw_111.xi0(this.WW(14, f3, f4, f5, color)).p1(0.6f);
        f3 = 0.5f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        this.E8 = N4.zr(pw_112, this.WW(16, f3, f4, f5, color), 1.8f).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).mz0().mz0().mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


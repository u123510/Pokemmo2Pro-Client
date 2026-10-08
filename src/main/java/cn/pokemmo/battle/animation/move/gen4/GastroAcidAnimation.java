/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 胃液 (GastroAcid)
 * 技能编号: 380
 * 原始类: f.Cy
 */
public class GastroAcidAnimation
extends MU {
    public GastroAcidAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1480;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1452;
        n2 = 1;
        n3 = 16;
        f = 833.3333f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1724;
        n2 = 2;
        n3 = 16;
        f = 583.3333f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1724;
        n2 = 2;
        n3 = 16;
        f = 833.3333f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1724;
        n2 = 2;
        n3 = 16;
        f = 1083.3334f;
        f2 = 0.078125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1724;
        n2 = 2;
        n3 = 16;
        f = 1333.3334f;
        f2 = 0.0234375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(555));
        n = 555;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.25f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 555;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 555;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(970);
        pw_1 pw_110 = HB.p30(pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.Xq0(16, 2, 3, 0.016f, 0.032f, 0.100097656f, -0.100097656f)).xi0(this.nM(16, 1)), this.WW(16, f3, f4, f5, color));
        f3 = 0.25f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(970);
        pw_1 pw_111 = HB.p30(pw_110, this.WW(16, f3, f4, f5, color));
        f3 = 0.25f;
        f4 = 0.0f;
        f5 = 0.75f;
        color = px_1.ep0(970);
        pw_1 pw_112 = HB.p30(pw_111, this.WW(16, f3, f4, f5, color));
        f3 = 0.25f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(970);
        this.E8 = HB.p30(pw_112, this.WW(16, f3, f4, f5, color)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


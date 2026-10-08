/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.su0
 */
/**
 * 宝可梦对战技能招式动画 - 冷冻拳 (IcePunch)
 * 技能编号: 8
 * 原始类: f.su0_0
 */
public class IcePunchAnimation
extends MU {
    public IcePunchAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1421;
        int n2 = 2;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)), this.Ue0(4, 21140, 0.0f, 0.75f, 0.075f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1424;
        n2 = 1;
        n3 = 16;
        f = 166.66667f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1700;
        n2 = 2;
        n3 = 16;
        f = 333.33334f;
        f2 = 0.9765625f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1700;
        n2 = 2;
        n3 = 16;
        f = 500.0f;
        f2 = 0.9765625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1700;
        n2 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1719;
        n2 = 1;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.234375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1719;
        n2 = 1;
        n3 = 16;
        f = 750.0f;
        f2 = 0.234375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1719;
        n2 = 1;
        n3 = 16;
        f = 833.3333f;
        f2 = 0.234375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.nM(16, 1)).y80(this.Qh0(168));
        n = 168;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 168;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 168;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(25236);
        pw_1 pw_112 = HB.p30(pw_111.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.WW(16, f3, f4, f5, color)), this.EN(14, 2, 4, 0.0f, 0.032f, 0.5f, 0.0f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0();
        f3 = 0.25f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(25236);
        this.E8 = Zw0.H(pw_112.xi0(this.WW(16, f3, f4, f5, color)), this.Ue0(4, 21140, 0.75f, 0.0f, 0.075f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


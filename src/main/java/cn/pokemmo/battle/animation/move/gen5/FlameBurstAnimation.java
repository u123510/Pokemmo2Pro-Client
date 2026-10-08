/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.aJ
 */
/**
 * 宝可梦对战技能招式动画 - 烈焰溅落 (FlameBurst)
 * 技能编号: 481
 * 原始类: f.aj_0
 */
public class FlameBurstAnimation
extends MU {
    public FlameBurstAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1535;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).y80(this.Qh0(652)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 652;
        n = 3;
        n2 = 9;
        int n3 = 11;
        f2 = 0.5f;
        pw_1 pw_13 = A2.Kj0(pw_12, this.fE0(-1, s, n, n2, n3, f2), 0.24f).xi0(this.Wt(1, 0.4f));
        s = 652;
        n = 0;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 652;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 652;
        n = 2;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.nM(16, 1)).mz0().mz0().TD0().p1(0.32f).Xf0();
        s = 1507;
        n = 2;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1746;
        n = 1;
        n2 = 16;
        f3 = 0.0f;
        f2 = 0.546875f;
        pF = this.Vz0;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 0.5f;
        Color color = px_1.ep0(31);
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.Sv0(1, 1, 480.0f, 320.0f)).xi0(this.WW(16, f4, f5, f6, color)).xi0(this.Xq0(16, 2, 1, 0.0f, 0.096f, -0.100097656f, 0.30004883f)).mz0().mz0().TD0().p1(0.72f).Xf0();
        f4 = 0.5f;
        f5 = 0.5f;
        f6 = 0.0f;
        color = px_1.ep0(31);
        this.E8 = pw_18.xi0(this.WW(16, f4, f5, f6, color)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


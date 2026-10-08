/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.eC
 */
/**
 * 宝可梦对战技能招式动画 - 自我激励 (WorkUp)
 * 技能编号: 526
 * 原始类: f.ec_0
 */
public class WorkUpAnimation
extends MU {
    public WorkUpAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1450;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.nM(14, 1)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 640.0f, 160.0f));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 833.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1718;
        n = 2;
        n2 = 14;
        f = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        float f3 = 1.25f;
        float f4 = 0.0f;
        float f5 = 0.5f;
        Color color = px_1.ep0(511);
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.WW(14, f3, f4, f5, color)).y80(this.Qh0(691));
        int n3 = 691;
        int n4 = 0;
        int n5 = 9;
        int n6 = 8;
        f2 = 0.5f;
        float f6 = 1.25f;
        float f7 = 0.5f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(511);
        this.E8 = HB.p30(pw_14.xi0(this.fE0(-1, n3, n4, n5, n6, f2)), this.Xq0(14, 2, 6, 0.0f, 0.032f, 0.100097656f, -0.100097656f)).xi0(this.WW(14, f6, f7, f8, color2)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


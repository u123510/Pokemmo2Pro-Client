/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.sL0
 */
/**
 * 宝可梦对战技能招式动画 - 查封 (Embargo)
 * 技能编号: 373
 * 原始类: f.sl0_1
 */
public class EmbargoAnimation
extends MU {
    public EmbargoAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1480;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).y80(this.Qh0(548)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f = 1833.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 1280.0f, 480.0f));
        n = 1480;
        n2 = 2;
        n3 = 16;
        f = 500.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 1833.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 1280.0f, 480.0f));
        n = 548;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.25f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 548;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(0);
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 1)).TD0().p1(1.6f).Xf0();
        f3 = 0.5f;
        f4 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(0);
        this.E8 = pk_1.el(pw_17, this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


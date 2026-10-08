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

/**
 * 宝可梦对战技能招式动画 - 恶之波动 (DarkPulse)
 * 技能编号: 399
 * 原始类: f.U9
 */
public class DarkPulseAnimation
extends MU {
    public DarkPulseAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1519;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1418;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 1833.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 2048.0f)).xi0(this.Ue0(4, 10570, 0.0f, 0.8125f, 0.1f)).y80(this.Qh0(574));
        n = 574;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.25f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 574;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 574;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.25f;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.375f;
        Color color = px_1.ep0(5125);
        pw_1 pw_17 = pk_1.el(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.tP(0.75f)).TD0().p1(1.2f).Xf0().xi0(this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 1)), this.EN(16, 2, 12, 0.016f, 0.016f, 0.19995117f, 0.0f)).xi0(this.Ue0(4, 10570, 0.8125f, 0.0f, 0.1f));
        f3 = 0.75f;
        f4 = 0.375f;
        f5 = 0.0f;
        color = px_1.ep0(5125);
        this.E8 = pw_17.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


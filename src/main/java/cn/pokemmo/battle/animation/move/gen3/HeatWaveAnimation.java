/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.xI0
 */
/**
 * 宝可梦对战技能招式动画 - 热风 (HeatWave)
 * 技能编号: 257
 * 原始类: f.xi0_1
 */
public class HeatWaveAnimation
extends MU {
    public HeatWaveAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1497;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.546875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).mz0().Xf0().xi0(this.nM(14, 1)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 2000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 1120.0f, 800.0f));
        n = 1425;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 2000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1920.0f)).xi0(this.Sv0(2, 1, 1120.0f, 800.0f)).y80(this.Qh0(423));
        n = 423;
        n2 = 0;
        n3 = 0;
        int n4 = 8;
        f2 = 0.5f;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(8470);
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.Ue0(4, 8470, 0.0f, 0.75f, 0.05f)).xi0(this.WW(14, f3, f4, f5, color));
        f3 = 0.5f;
        f4 = 0.0f;
        f5 = 0.75f;
        color = px_1.ep0(8470);
        pw_1 pw_17 = pw_16.xi0(this.WW(16, f3, f4, f5, color)).TD0().p1(0.2f).Xf0().xi0(this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f)).mz0().mz0().TD0().p1(2.04f).Xf0().xi0(this.Ue0(4, 8470, 0.75f, 0.0f, 0.05f));
        f3 = 0.5f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(8470);
        pw_1 pw_18 = pw_17.xi0(this.WW(14, f3, f4, f5, color));
        f3 = 0.5f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(8470);
        this.E8 = pk_1.el(pw_18, this.WW(16, f3, f4, f5, color)).xi0(this.nM(14, 0)).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.MU;
import f.N4;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.uF0
 */
/**
 * 宝可梦对战技能招式动画 - 攀瀑 (Waterfall)
 * 技能编号: 127
 * 原始类: f.uf0_1
 */
public class WaterfallAnimation
extends MU {
    public WaterfallAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 0;
        int n = 0;
        lpt4__4 lpt4__42 = new lpt4__4(this, s, n != 0);
        s = 1;
        n = 0;
        lpt4__4 lpt4__43 = new lpt4__4(this, s, n != 0);
        s = 2;
        n = 1;
        lpt4__4 lpt4__44 = new lpt4__4(this, s, n != 0);
        s = 1407;
        n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.QO(16)).xi0(this.Ue0(2, 0, 0.0f, 1.0f, 0.05f)).xi0(this.Wt(0, 0.4f)).TD0().p1(0.48f).Xf0().xi0(this.Ue0(3, 0, 1.0f, 0.0f, 0.05f)).y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.mf0(4, 0, 20, 2.24f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 640.0f)).xi0(this.Sv0(1, 1, 0.0f, 640.0f));
        s = 1497;
        n = 0;
        n2 = 14;
        f = 0.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(14, 1)).y80(this.Qh0(292));
        s = 292;
        n = 1;
        n2 = 9;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 292;
        n = 0;
        n2 = 11;
        n3 = 8;
        f2 = 0.0f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 292;
        n = 2;
        n2 = 11;
        n3 = 8;
        f2 = 0.125f;
        pw_1 pw_17 = N4.zr(pw_16, this.fE0(-1, s, n, n2, n3, f2), 1.08f).xi0(this.nM(16, 1)).xi0(this.Wt(1, 0.4f));
        s = 1407;
        n = 2;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1376;
        n = 2;
        n2 = 16;
        f3 = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1475;
        n = 0;
        n2 = 16;
        f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1376;
        n = 0;
        n2 = 16;
        f3 = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_111 = N4.zr(pw_110.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.Sv0(2, 1, 960.0f, 320.0f)).xi0(this.Sv0(0, 1, 960.0f, 320.0f)).xi0(this.EN(16, 2, 6, 0.032f, 0.016f, 0.5f, 0.0f)), this.WW(16, f4, f5, f6, color), 1.68f);
        f4 = 0.5f;
        f5 = 0.75f;
        f6 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        int n4 = 0;
        boolean bl = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n4, bl);
        n4 = 1;
        bl = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n4, bl);
        n4 = 2;
        bl = false;
        this.E8 = N4.zr(N4.zr(pw_111, this.WW(16, f4, f5, f6, color), 2.28f), this.Ue0(3, 0, 0.0f, 1.0f, 0.05f), 2.6f).xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.025f)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n4, bl))).xi0(this.nM(16, 0)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.FB;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.t60
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleT600Animation
 * 原始类: f.t60_0
 */
public class BattleT600Animation
extends MU {
    public BattleT600Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 2;
        int n = 1;
        lpt4__4 lpt4__42 = new lpt4__4(this, s, n != 0);
        s = 0;
        n = 0;
        lpt4__4 lpt4__43 = new lpt4__4(this, s, n != 0);
        s = 1;
        n = 0;
        lpt4__4 lpt4__44 = new lpt4__4(this, s, n != 0);
        s = 1806;
        n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(31);
        pw_1 pw_12 = N4.zr(N4.zr(HB.p30(FB.zd0(0.6f).y80(this.QO(38)).y80(ao_1.pc(lpt4__42)), this.Ue0(4, 0, 0.0f, 1.0f, 0.05f)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.Ue0(3, 0, 0.8125f, 0.0f, 0.05f)).xi0(this.mf0(4, 0, 24, 2.88f)).y80(this.E2(18, true)).y80(this.Qh0(639)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(14, 0)).TD0().p1(0.32f).Xf0(), this.Xq0(14, 2, 6, 0.032f, 0.064f, -0.100097656f, 0.100097656f), 0.64f), this.WW(14, f3, f4, f5, color), 0.96f);
        f3 = 0.5f;
        f4 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(31);
        pw_1 pw_13 = N4.zr(pw_12, this.WW(14, f3, f4, f5, color), 1.28f);
        f3 = 0.5f;
        f4 = 0.0f;
        f5 = 0.625f;
        color = px_1.ep0(31);
        int n3 = 0;
        boolean bl = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n3, bl);
        n3 = 1;
        bl = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n3, bl);
        n3 = 2;
        bl = false;
        pw_1 pw_14 = HB.p30(pk_1.el(pw_13, this.WW(14, f3, f4, f5, color)), this.Ue0(3, 0, 0.0f, 1.0f, 0.05f)).xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.025f)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n3, bl)));
        float f6 = 0.5f;
        float f7 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(31);
        this.E8 = pw_14.xi0(this.WW(14, f6, f7, f5, color)).xi0(this.nM(14, 0)).y80(this.E2(18, false)).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


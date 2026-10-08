/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.bJ
 */
/**
 * 宝可梦对战技能招式动画 - 精神强念 (Psychic)
 * 技能编号: 94
 * 原始类: f.bj_1
 */
public class PsychicAnimation
extends MU {
    public PsychicAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 2;
        int n = 1;
        lpt4__4 lpt4__42 = new lpt4__4(this, s, n != 0);
        s = 1;
        n = 0;
        lpt4__4 lpt4__43 = new lpt4__4(this, s, n != 0);
        s = 0;
        n = 0;
        lpt4__4 lpt4__44 = new lpt4__4(this, s, n != 0);
        s = 1450;
        n = 2;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).xi0(this.nM(14, 1)), this.Ue0(2, 0, 0.0f, 1.0f, 0.025f)).xi0(this.Ue0(3, 0, 1.0f, 0.0f, 0.05f)).y80(this.QO(13)).xi0(this.mf0(4, 0, 22, 1.28f)).y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1461;
        n = 1;
        n2 = 16;
        f = 666.6667f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1524;
        n = 2;
        n2 = 16;
        f = 666.6667f;
        f2 = 0.78125f;
        pF = this.Vz0;
        float f3 = 0.5f;
        float f4 = 0.75f;
        float f5 = 0.0f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        int n3 = 1;
        boolean bl = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n3, bl);
        n3 = 0;
        bl = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n3, bl);
        n3 = 2;
        bl = false;
        this.E8 = N4.zr(A2.Kj0(pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)), this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f), 0.72f).xi0(this.Xq0(16, 2, 1, 0.016f, 0.064f, 0.19995117f, 0.19995117f)).xi0(this.WW(16, f3, f4, f5, color)), this.Ue0(3, 0, 0.0f, 1.0f, 0.025f), 1.2f).xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.025f)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n3, bl))).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


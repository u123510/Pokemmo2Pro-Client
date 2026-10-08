/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.Xh0
 */
/**
 * 宝可梦对战技能招式动画 - 燕返 (AerialAce)
 * 技能编号: 332
 * 原始类: f.xh0_0
 */
public class AerialAceAnimation
extends MU {
    public AerialAceAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1421;
        int bl = 2;
        int n = 16;
        float f = 166.66667f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.025f)).xi0(this.i6((byte)2, s, bl, n, f, f2, pF));
        s = 1423;
        int f4 = 2;
        n = 16;
        f = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, f4, n, f, f2, pF));
        s = 1423;
        int bl2 = 2;
        n = 16;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, bl2, n, f, f2, pF));
        s = 1420;
        int f7 = 1;
        n = 16;
        f = 666.6667f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, f7, n, f, f2, pF));
        s = 0;
        boolean bl3 = false;
        lpt4__4 lpt4__42 = new lpt4__4(this, s, bl3);
        s = 1;
        boolean bl4 = false;
        float f3 = 0.75f;
        float f5 = 0.0f;
        float f6 = 0.75f;
        Color color = px_1.ep0(0);
        int n2 = 502;
        int n3 = 0;
        int n4 = 11;
        int n5 = 8;
        f2 = 0.4f;
        pw_1 pw_16 = pw_15.y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(new lpt4__4(this, s, bl4))).xi0(this.WW(16, f3, f5, f6, color)).y80(this.Qh0(502)).xi0(this.fE0(-1, n2, n3, n4, n5, f2));
        n2 = 502;
        int n6 = 1;
        n4 = 11;
        n5 = 8;
        f2 = 0.4f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n2, n6, n4, n5, f2));
        n2 = 502;
        int n7 = 2;
        n4 = 11;
        n5 = 8;
        f2 = 0.4f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n2, n7, n4, n5, f2));
        n2 = 502;
        int n8 = 3;
        n4 = 11;
        n5 = 8;
        f2 = 0.4f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n2, n8, n4, n5, f2));
        n2 = 502;
        int n9 = 4;
        n4 = 11;
        n5 = 8;
        f2 = 0.4f;
        pw_1 pw_110 = pk_1.el(pw_19.xi0(this.fE0(-1, n2, n9, n4, n5, f2)).xi0(this.nM(16, 1)).TD0().p1(0.2f).Xf0(), this.EN(16, 2, 1, 0.016f, 0.032f, -1.0f, 0.0f));
        n2 = 0;
        boolean bl5 = true;
        lpt4__4 lpt4__43 = new lpt4__4(this, n2, bl5);
        n2 = 1;
        boolean bl6 = true;
        float f62 = 0.75f;
        float f8 = 0.75f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(0);
        this.E8 = pw_110.y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(new lpt4__4(this, n2, bl6))).xi0(this.WW(16, f62, f8, f9, color2)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.025f)).xi0(this.nM(16, 0)).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


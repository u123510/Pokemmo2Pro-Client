/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.Iz
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleIz0Animation
 * 原始类: f.iz_0
 */
public class BattleIz0Animation
extends MU {
    public BattleIz0Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 2;
        int n2 = 1;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, n2 != 0);
        n = 0;
        n2 = 0;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, n2 != 0);
        n = 1;
        n2 = 0;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, n2 != 0);
        n = 1810;
        n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.025f)).y80(this.QO(28)).mz0().Xf0().xi0(this.Ue0(3, 0, 0.75f, 0.0f, 0.1f)).y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).mz0().Xf0().xi0(this.mf0(1, 60, 0, 1.92f)).y80(this.Qh0(416)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 416;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.4f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 416;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.4f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 416;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.4f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 416;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.4f;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(20810);
        pw_1 pw_16 = A2.Kj0(pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.WW(14, f3, f4, f5, color), 0.4f);
        f3 = 0.75f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(20810);
        int n5 = 0;
        boolean bl = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n5, bl);
        n5 = 1;
        bl = true;
        this.E8 = pk_1.el(pw_16, this.WW(14, f3, f4, f5, color)).xi0(this.Ue0(3, 0, 0.0f, 0.75f, 0.075f)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n5, bl))).xi0(this.Ue0(2, 0, 0.75f, 0.0f, 0.075f)).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


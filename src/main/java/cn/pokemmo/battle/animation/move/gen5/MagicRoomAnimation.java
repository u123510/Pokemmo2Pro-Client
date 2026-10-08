/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 魔法空间 (MagicRoom)
 * 技能编号: 478
 * 原始类: f.No0
 */
public class MagicRoomAnimation
extends MU {
    public MagicRoomAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 2;
        boolean bl = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, s, bl);
        s = 0;
        boolean bl2 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, s, bl2);
        s = 1;
        boolean bl3 = false;
        lpt4__4 lpt4__44 = new lpt4__4(this, s, bl3);
        s = 1884;
        int n = 1;
        int n2 = 2;
        float f = 0.0f;
        float f2 = 0.546875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().y80(this.QO(41)).y80(ao_1.pc(lpt4__42)), this.Ue0(4, 0, 0.0f, 0.9375f, 0.05f)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 1280.0f, 480.0f));
        s = 1455;
        int n3 = 2;
        n2 = 2;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = HB.p30(pw_12.xi0(this.i6((byte)2, s, n3, n2, f, f2, pF)).xi0(this.Ue0(3, 0, 0.9375f, 0.0f, 0.05f)).y80(this.E2(18, true)).xi0(this.mf0(1, 0, -24, 1.28f)).xi0(this.nM(18, 1)).xi0(this.Xq0(18, 2, 40, 0.0f, 0.016f, -1.0f, -1.0f)), this.EN(18, 2, 1, 0.0f, 0.96f, 0.5f, 0.0f)).xi0(this.Ue0(3, 0, 0.0f, 0.9375f, 0.05f)).xi0(this.Ue0(2, 0, 0.9375f, 0.0f, 0.05f));
        s = 0;
        boolean bl4 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, s, bl4);
        s = 1;
        boolean bl5 = true;
        this.E8 = pw_13.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, s, bl5))).xi0(this.nM(18, 0)).y80(this.E2(18, false)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


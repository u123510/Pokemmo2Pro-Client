/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.po
 */
/**
 * 宝可梦对战技能招式动画 - 草笛 (GrassWhistle)
 * 技能编号: 320
 * 原始类: f.po_1
 */
public class GrassWhistleAnimation
extends MU {
    public GrassWhistleAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        GrassWhistleAnimation po_12 = this;
        GrassWhistleAnimation po_13 = this;
        short s = 1512;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = po_13.Vz0;
        this.E8 = pw_12 = HB.p30(FB.zd0(0.6f).xi0(po_13.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(490)).xi0(this.Ue0(4, 960, 0.0f, 0.375f, 0.075f)), this.dA0(490, 0, 9, 11, 0.25f, 0.0f)).xi0(this.Ue0(4, 960, 0.375f, 0.0f, 0.075f)).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        po_12.Vs.jH(this.E8);
        po_12.Vc();
        return po_12;
    }
}


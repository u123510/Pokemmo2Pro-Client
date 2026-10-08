/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Ww
 */
/**
 * 宝可梦对战技能招式动画 - 骨棒乱打 (BoneRush)
 * 技能编号: 198
 * 原始类: f.ww_0
 */
public class BoneRushAnimation
extends MU {
    public BoneRushAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BoneRushAnimation ww_02 = this;
        BoneRushAnimation ww_03 = this;
        short s = 1435;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = ww_03.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(ww_03.i6((byte)2, s, n, n2, f, f2, pF));
        BoneRushAnimation ww_04 = this;
        s = 1420;
        n = 1;
        n2 = 14;
        f = 333.33334f;
        f2 = 0.9375f;
        pF = ww_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(ww_04.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(364));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 364, s, n, n2, f));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(pw_15.xi0(this.fE0(-1, 364, s, n, n2, f)).xi0(this.nM(14, 1)).TD0().p1(0.2f).Xf0(), this.Xq0(16, 2, 1, 0.016f, 0.064f, 0.19995117f, -0.19995117f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        ww_02.Vs.jH(this.E8);
        ww_02.Vc();
        return ww_02;
    }
}


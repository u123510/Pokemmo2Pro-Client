/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.FB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.rc
 */
/**
 * 宝可梦对战技能招式动画 - 摇尾巴 (TailWhip)
 * 技能编号: 39
 * 原始类: f.rc_1
 */
public class TailWhipAnimation
extends MU {
    public TailWhipAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        TailWhipAnimation rc_12 = this;
        TailWhipAnimation rc_13 = this;
        short s = 1527;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.703125f;
        PF pF = rc_13.Vz0;
        pw_1 pw_13 = FB.zd0(0.6f).xi0(rc_13.i6((byte)2, s, n, n2, f, f2, pF));
        TailWhipAnimation rc_14 = this;
        s = 1527;
        n = 1;
        n2 = 14;
        f = 583.3333f;
        f2 = 0.703125f;
        pF = rc_14.Vz0;
        this.E8 = pw_12 = pw_13.xi0(rc_14.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(14, 1)).mz0().Xf0().xi0(this.nM(14, 0)).p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        rc_12.Vs.jH(this.E8);
        rc_12.Vc();
        return rc_12;
    }
}


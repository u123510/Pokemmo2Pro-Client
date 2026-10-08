/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 灭亡之歌 (PerishSong)
 * 技能编号: 195
 * 原始类: f.E0
 */
public class PerishSongAnimation
extends MU {
    public PerishSongAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        PerishSongAnimation e0 = this;
        PerishSongAnimation e02 = this;
        int n = 1533;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = e02.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.nM(14, 1)).xi0(e02.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        PerishSongAnimation e03 = this;
        n = 1505;
        n2 = 2;
        n3 = 14;
        f = 1083.3334f;
        f2 = 0.9375f;
        pF = e03.Vz0;
        pw_1 pw_14 = pw_13.xi0(e03.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(361));
        n = 1;
        n2 = 0;
        n3 = 0;
        f = 1.25f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 361, n, n2, n3, f));
        n = 0;
        n2 = 0;
        n3 = 0;
        f = 1.0f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 361, n, n2, n3, f));
        n = 2;
        n2 = 0;
        n3 = 0;
        f = 1.0f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 361, n, n2, n3, f));
        n = 3;
        n2 = 0;
        n3 = 0;
        f = 1.0f;
        this.E8 = pw_12 = A2.Kj0(pw_17.xi0(this.fE0(-1, 361, n, n2, n3, f)), this.Ue0(4, 0, 0.0f, 1.0f, 0.05f), 1.8f).xi0(this.Ue0(4, 0, 1.0f, 0.0f, 0.05f)).xi0(this.tP(0.4f)).mz0().mz0().mz0().Xf0().xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        e0.Vs.jH(this.E8);
        e0.Vc();
        return e0;
    }
}


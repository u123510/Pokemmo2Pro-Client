/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.yg
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleYg2Animation
 * 原始类: f.yg_2
 */
public class BattleYg2Animation
extends MU {
    public final PF[] kv0;
    public final PF[] qK;

    public BattleYg2Animation(PF pF, PF[] pFArray, PF[] pFArray2) {
        super(pF);
        this.kv0 = pFArray;
        this.qK = pFArray2;
    }

    @Override
    public final MU us() {
        float f;
        float f2;
        int n;
        int n2;
        short s = 1520;
        int n3 = 1;
        int n4 = 14;
        float f3 = 0.2f;
        float f4 = 0.3f;
        PF pF = this.Vz0;
        PF pF2 = this.Vz0;
        this.E8 = pw_1.xC().xi0(this.Wt(0, 0.4f)).xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.075f)).y80(this.wn0("grim_harvest_enemy_field")).xi0(this.i6((byte)2, s, n3, n4, f3, f4, pF)).xi0(this.i6((byte)10, (short)19, 3, 0, 100.0f, 0.9f, pF2)).p1(0.3f).Xf0();
        int n5 = 1;
        PF[] pFArray = this.kv0;
        n4 = this.kv0.length;
        for (n2 = 0; n2 < n4; ++n2) {
            PF pF3 = pFArray[n2];
            short s2 = 1651;
            n = 14;
            f2 = 0.2f;
            f = 0.8f;
            this.E8.xi0(this.kL0(pF3)).xi0(this.i6((byte)2, s2, n5, n, f2, f, pF3)).y80(this.wn0("grim_harvest_ally_attacked"));
            ++n5;
        }
        this.E8.mz0().p1(0.4f).xi0(this.kL0(null)).xi0(this.Wt(1, 1.2f)).y80(this.wn0("grim_harvest_allied_field")).p1(0.4f).Xf0();
        n5 = 1;
        pFArray = this.qK;
        n4 = this.qK.length;
        for (n2 = 0; n2 < n4; ++n2) {
            PF pF4 = pFArray[n2];
            short s3 = 1651;
            n = 14;
            f2 = 0.2f;
            f = 0.4f;
            this.E8.xi0(this.kL0(pF4)).xi0(this.i6((byte)2, s3, n5, n, f2, f, pF4)).y80(this.wn0("grim_harvest_foe_attacked"));
            ++n5;
        }
        this.E8.p1(1.0f).Xf0().xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.025f)).xi0(this.tP(0.4f)).mz0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}


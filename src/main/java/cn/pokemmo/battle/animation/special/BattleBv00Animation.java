/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.C8;
import f.D2;
import f.MU;
import f.PF;
import f.T3;
import f.ao_1;
import f.com3__3;
import f.lc_0;
import f.pw_1;
import f.tw0_0;
import f.vr_1;

/*
 * Renamed from f.bv0
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleBv00Animation
 * 原始类: f.bv0_0
 */
public class BattleBv00Animation
extends MU {
    public final PF oE0;
    public lc_0 EB;
    public boolean Si = true;

    public BattleBv00Animation(PF pF) {
        super(pF);
        this.oE0 = pF;
    }

    @Override
    public final boolean bL() {
        if (!this.Si) {
            return true;
        }
        return this.nJ0;
    }

    @Override
    public final MU us() {
        if (this.Si) {
            lc_0 object;
            this.EB = object = lc_0.fC0(this.Vs.hB0.Qn(this.oE0.rp0())[10]);
            this.Vs.A6.add(object);
        }
        com3__3[] com3__3Array = this.oE0.Br0;
        this.E8 = pw_1.xC();
        this.E8.p1(0.25f);
        C8 c8 = this.oE0.LpT9.j;
        C8 f = T3.hf(c8, c8);
        this.E8.y80(MU.kO((short)1383));
        lc_0 lc_02 = this.EB;
        if (lc_02 != null) {
            C8 c82 = f;
            float f2 = c82.y - 0.45f;
            this.E8.y80(ao_1.yp(4, lc_02).kt(f.x - 0.1f, f2, c82.z - 0.05f)).y80(ao_1.yp(7, this.EB).UD(0.5f, 0.5f));
        }
        this.E8.Xf0();
        for (com3__3 com3__32 : com3__3Array) {
            float com3__322;
            C8 c83 = com3__32.j;
            float f3 = c83.x;
            float f4 = c83.y - 0.5f;
            float f5 = c83.z;
            ao_1 ao_12 = ao_1.DX(com3__32, 11, 1.2f);
            ao_12.h5[0] = com3__322 = 1.0f;
            this.E8.y80(ao_1.yp(8, com3__32).Om0(1.0f, 1.0f, 1.0f, 1.0f)).y80(ao_1.yp(10, com3__32).Om0(1.0f, 1.0f, 1.0f, 0.0f)).TD0().Xf0().y80(ao_1.DX(com3__32, 4, 1.2f).kt(f3, f4, f5)).y80(ao_1.DX(com3__32, 7, 1.2f).UD(0.0f, 0.0f)).y80(ao_12).mz0().mz0();
        }
        this.E8.mz0();
        this.E8.y80(ao_1.pc(this::Hg));
        this.E8.Ms(this.Vs.wP);
        this.Vc();
        return this;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        if (tw0_0.PK0 == null) {
            return false;
        }
        if (this.nn0() && bl) {
            return true;
        }
        return !this.nn0() && !bl;
    }

    public final void Hg(int n, D2 d2) {
        vr_1 vr_12 = this.Vs;
        if (vr_12 != null && this.Si) {
            vr_12.A6.remove(this.EB);
        }
    }
}


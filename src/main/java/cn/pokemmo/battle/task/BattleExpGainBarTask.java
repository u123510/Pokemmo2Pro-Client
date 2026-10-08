/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.ML0;
import f.Mj;
import f.N60;
import f.NU;
import f.PF;
import f.VU;
import f._volatile;
import f.tw0_0;

/*
 * Renamed from f.fK
 */
public class BattleExpGainBarTask
extends N60 {
    public boolean K90 = false;
    public final ML0 ph;
    public final PF h50;
    public final byte vw0;

    public BattleExpGainBarTask(ML0 mL0, PF pF, byte by) {
        this.ph = mL0;
        this.h50 = pF;
        this.vw0 = by;
    }

    @Override
    public final boolean lPt1() {
        return this.K90;
    }

    @Override
    public final void ii() {
        if (this.K90) {
            return;
        }
        BattleExpGainBarTask fk_02 = this;
        fk_02.K90 = true;
        fk_02.h50.Ry0(this.vw0);
        if (fk_02.h50.cD0 == this.ph.yd0.Ez0()) {
            VU vU;
            if (!this.ph.yd0.kd0() && (vU = tw0_0.rl.PC0.sF(this.h50.Zo0())) != null) {
                vU.I8.H1 = this.h50.zi0.HP();
            }
            Mj mj = tw0_0.rl.r1(_volatile.BV);
            mj.rr0 = true;
            mj.jf = false;
        }
        this.ph.Hi(this.h50).z2(this.h50);
    }

    @Override
    public final NU gJ0() {
        return NU.qp;
    }
}


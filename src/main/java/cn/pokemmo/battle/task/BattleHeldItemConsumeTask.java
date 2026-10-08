/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.ML0;
import f.N60;
import f.NU;
import f.PF;
import f.fk0_0;

/*
 * Renamed from f.t30
 */
public class BattleHeldItemConsumeTask
extends N60 {
    public final /* synthetic */ ML0 Ba0;

    public BattleHeldItemConsumeTask(ML0 mL0, PF pF, PF pF2) {
        this.Ba0 = mL0;
    }

    @Override
    public final boolean lPt1() {
        return true;
    }

    @Override
    public final void ii() {
        ML0 mL0 = this.Ba0;
        fk0_0 fk0_02 = mL0.SB;
        if (fk0_02 != null) {
            mL0.u3(fk0_02);
            mL0.SB = null;
        }
    }

    @Override
    public final NU gJ0() {
        return NU.ST;
    }
}


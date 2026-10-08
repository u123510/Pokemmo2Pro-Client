/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.L5;
import f.ML0;
import f.N60;
import f.NU;
import f.hk0_1;

/*
 * Renamed from f.zi
 */
public class BattleChargeTurnTask
extends N60 {
    public long MH0 = -1L;
    public final /* synthetic */ ML0 fJ;

    public BattleChargeTurnTask(ML0 mL0) {
        this.fJ = mL0;
    }

    @Override
    public final void ii() {
        ((L5)this.fJ).X60(true);
    }

    @Override
    public final boolean lPt1() {
        if (!this.fJ.rp0()) {
            return false;
        }
        if (this.MH0 == -1L) {
            this.MH0 = hk0_1.KG;
        }
        return hk0_1.KG - this.MH0 > 500L;
    }

    @Override
    public final NU gJ0() {
        return NU.Yt;
    }
}


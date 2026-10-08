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

public class BattleDefeatDisplayTask
extends N60 {
    public long U3 = -1L;
    public final /* synthetic */ ML0 S6;

    public BattleDefeatDisplayTask(ML0 mL0) {
        this.S6 = mL0;
    }

    @Override
    public final void ii() {
        ((L5)this.S6).ZZ = false;
    }

    @Override
    public final boolean lPt1() {
        if (this.U3 == -1L) {
            this.U3 = hk0_1.KG;
        }
        this.S6.X60(true);
        return hk0_1.KG - this.U3 > 500L;
    }

    @Override
    public final NU gJ0() {
        return NU.Yt;
    }
}


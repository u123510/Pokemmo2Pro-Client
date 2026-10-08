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
 * Renamed from f.Rt
 */
public class BattleConfuseRayTask
extends N60 {
    public long Fq0 = -1L;
    public final /* synthetic */ ML0 Bw;

    public BattleConfuseRayTask(ML0 mL0) {
        this.Bw = mL0;
    }

    @Override
    public final void ii() {
        ((L5)this.Bw).ZZ = true;
    }

    @Override
    public final boolean lPt1() {
        if (this.Fq0 == -1L) {
            this.Fq0 = hk0_1.KG;
        }
        return hk0_1.KG - this.Fq0 > 500L;
    }

    @Override
    public final NU gJ0() {
        return NU.Yt;
    }
}


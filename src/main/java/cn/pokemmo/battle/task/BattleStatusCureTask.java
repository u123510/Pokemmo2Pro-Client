/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.N60;
import f.NU;
import f.hk0_1;
import f.pf0_2;

/*
 * Renamed from f.tq
 */
public class BattleStatusCureTask
extends N60 {
    public long z00 = -1L;
    public final /* synthetic */ pf0_2 ty;

    public BattleStatusCureTask(pf0_2 pf0_22) {
        this.ty = pf0_22;
    }

    @Override
    public final void ii() {
    }

    @Override
    public final boolean lPt1() {
        if (this.z00 == -1L) {
            this.z00 = hk0_1.KG;
        }
        return hk0_1.KG - this.z00 > (long)this.ty.Rd;
    }

    @Override
    public final NU gJ0() {
        return NU.Tl;
    }
}


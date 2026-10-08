/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.H8;
import f.N60;
import f.NU;
import f.ec0_2;
import f.ig_0;
import f.vk0_1;

/*
 * Renamed from f.nE
 */
public class BattleEntryHazardTask
extends N60 {
    public final /* synthetic */ long Rv;
    public final /* synthetic */ H8 sc0;

    public BattleEntryHazardTask(H8 h8, long l) {
        this.sc0 = h8;
        this.Rv = l;
    }

    @Override
    public final void ii() {
        if (this.sc0.Uj0 > 0) {
            StringBuilder stringBuilder2 = new StringBuilder();
            short s = this.sc0.Uj0;
            System.out.println(ig_0.u9(((vk0_1)ec0_2.Sx().f4.f5((short)s)).bt, stringBuilder2, " took ").append(System.currentTimeMillis() - this.Rv).toString());
        }
    }

    @Override
    public final boolean lPt1() {
        return true;
    }

    @Override
    public final NU gJ0() {
        return NU.Yt;
    }
}


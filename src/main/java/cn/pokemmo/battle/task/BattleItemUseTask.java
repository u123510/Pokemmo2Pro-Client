/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.N60;
import f.NU;
import f.NZ;
import f.ec0_2;
import f.ig_0;
import f.vk0_1;

public class BattleItemUseTask
extends N60 {
    public final /* synthetic */ long L80;
    public final /* synthetic */ NZ zE0;

    public BattleItemUseTask(NZ nZ, long l) {
        this.zE0 = nZ;
        this.L80 = l;
    }

    @Override
    public final void ii() {
        if (this.zE0.DA > 0) {
            StringBuilder stringBuilder2 = new StringBuilder();
            short s = this.zE0.DA;
            System.out.println(ig_0.u9(((vk0_1)ec0_2.Sx().f4.f5((short)s)).bt, stringBuilder2, " took ").append(System.currentTimeMillis() - this.L80).toString());
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


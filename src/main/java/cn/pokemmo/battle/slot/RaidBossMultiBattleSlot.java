/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.slot;

import f.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.battle.slot.BaseBattleParticipantSlot;

import f.Mj;
import f._volatile;
import f.tw0_0;

/*
 * Renamed from f.Ud0
 */
public class RaidBossMultiBattleSlot extends BaseBattleParticipantSlot {
    public RaidBossMultiBattleSlot() {
        super(_volatile.Bf0);
    }

    @Override
    public final int V2() {
        return tw0_0.rl.k0.Ta * 60 + this.Jn0.fq;
    }
}


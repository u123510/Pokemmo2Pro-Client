/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.N60;
import f.NU;
import f.jn_2;

/*
 * Renamed from f.pQ
 */
public class BattleLevelUpDisplayTask
extends N60 {
    public final jn_2 x4;
    public final boolean Pr0;

    public BattleLevelUpDisplayTask(jn_2 jn_22, boolean bl) {
        this.x4 = jn_22;
        this.Pr0 = bl;
    }

    @Override
    public final boolean lPt1() {
        return this.x4.Lpt1();
    }

    @Override
    public final void ii() {
    }

    @Override
    public final NU gJ0() {
        if (this.Pr0) {
            return NU.Uh0;
        }
        return NU.hO;
    }

    @Override
    public final boolean NJ() {
        return false;
    }
}


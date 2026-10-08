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

public class BattleRecoilDamageTask
extends N60 {
    public final ML0 ab0;
    public final PF Aq0;
    public final byte lp0;

    public BattleRecoilDamageTask(ML0 mL0, PF pF, byte by) {
        this.ab0 = mL0;
        this.Aq0 = pF;
        this.lp0 = by;
    }

    @Override
    public final void ii() {
        this.Aq0.q40.gS = this.lp0;
        this.ab0.X60(true);
    }

    @Override
    public final boolean lPt1() {
        return this.ab0.rp0();
    }

    @Override
    public final NU gJ0() {
        return NU.Yt;
    }
}


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

public class BattleTrapEffectTask
extends N60 {
    public final ML0 Nt0;
    public final PF C10;
    public final byte g6;

    public BattleTrapEffectTask(ML0 mL0, PF pF, byte by) {
        this.Nt0 = mL0;
        this.C10 = pF;
        this.g6 = by;
    }

    @Override
    public final void ii() {
        this.C10.q40.Tv0 = this.g6;
        this.Nt0.X60(true);
    }

    @Override
    public final boolean lPt1() {
        return this.Nt0.rp0();
    }

    @Override
    public final NU gJ0() {
        return NU.Yt;
    }
}


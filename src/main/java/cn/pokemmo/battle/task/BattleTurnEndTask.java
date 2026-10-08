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

/*
 * Renamed from f.kN
 */
public class BattleTurnEndTask
extends N60 {
    public final ML0 eB0;
    public final PF Pt;
    public short Tn;

    public BattleTurnEndTask(ML0 mL0, PF pF, short s) {
        this.eB0 = mL0;
        this.Pt = pF;
        this.Tn = s;
    }

    @Override
    public final void ii() {
        if (this.Tn > 160) {
            this.Tn = (short)160;
        }
        if (this.Tn < -160) {
            this.Tn = (short)-160;
        }
        this.Pt.q40.LX = this.Tn;
        this.eB0.X60(true);
    }

    @Override
    public final boolean lPt1() {
        return this.eB0.rp0();
    }

    @Override
    public final NU gJ0() {
        return NU.Yt;
    }
}


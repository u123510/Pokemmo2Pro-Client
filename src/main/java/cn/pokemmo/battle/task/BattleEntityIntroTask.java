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
 * Renamed from f.aF0
 */
public class BattleEntityIntroTask
extends N60 {
    public final ML0 om;
    public final PF sg0;
    public final byte S3;

    public BattleEntityIntroTask(ML0 mL0, PF pF, byte by) {
        this.om = mL0;
        this.sg0 = pF;
        this.S3 = by;
    }

    @Override
    public final boolean lPt1() {
        return true;
    }

    @Override
    public final void ii() {
        this.sg0.q40.jU = this.S3;
        this.om.X60(true);
    }

    @Override
    public final NU gJ0() {
        return NU.Yt;
    }
}


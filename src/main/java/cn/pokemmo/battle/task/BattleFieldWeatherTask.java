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

public class BattleFieldWeatherTask
extends N60 {
    public final ML0 Uw0;
    public final short Yr0;
    public boolean ly = false;
    public boolean fk0 = false;

    public BattleFieldWeatherTask(ML0 mL0, short s) {
        this.Uw0 = mL0;
        this.Yr0 = s;
    }

    @Override
    public final void ii() {
        ML0 mL0;
        if (System.currentTimeMillis() - this.qI > 1500L) {
            this.ly = true;
        }
        if (!((mL0 = this.Uw0) instanceof L5)) {
            return;
        }
        if (!this.fk0) {
            BattleFieldWeatherTask p2 = this;
            mL0.I1("", "", null);
            mL0 = (L5)p2.Uw0;
            int n = p2.ly ? -1 : (int)this.Yr0;
            ((L5)mL0).LC0 = (short)n;
            this.fk0 = true;
        }
    }

    @Override
    public final boolean lPt1() {
        BattleFieldWeatherTask p2 = this;
        p2.ii();
        return p2.ly;
    }

    @Override
    public final NU gJ0() {
        return NU.Yt;
    }
}


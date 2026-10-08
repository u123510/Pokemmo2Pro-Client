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
import f.cj_0;
import f.hk0_1;

/*
 * Renamed from f.kj0
 */
public class BattleTerrainEffectTask
extends N60 {
    public final ML0 zr;
    public final boolean Ax0;
    public final short pi;
    public final String lT;

    public BattleTerrainEffectTask(ML0 mL0, boolean bl, short s, String string) {
        this.zr = mL0;
        this.Ax0 = bl;
        this.pi = s;
        this.lT = string;
    }

    @Override
    public final void ii() {
        BattleTerrainEffectTask kj0_22 = this;
        boolean bl = this.Ax0;
        ((L5)kj0_22.zr).ea0 = hk0_1.KG;
        ((L5)kj0_22.zr).XK = bl;
        cj_0 cj_02 = ((L5)kj0_22.zr).MC;
        int n = kj0_22.pi;
        cj_02.getClass();
        if (n < 0) {
            n = 0;
        }
        if (n > 5) {
            n = 5;
        }
        BattleTerrainEffectTask kj0_23 = this;
        cj_02.A3 = (byte)n;
        kj0_23.zr.X60(true);
        kj0_23.zr.I1(this.lT, "", null);
    }

    @Override
    public final boolean lPt1() {
        return System.currentTimeMillis() - this.qI > 2000L;
    }

    @Override
    public final NU gJ0() {
        return NU.Yt;
    }
}


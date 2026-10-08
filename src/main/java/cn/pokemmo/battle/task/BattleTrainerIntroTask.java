/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.N60;
import f.NU;
import f.PF;

public class BattleTrainerIntroTask
extends N60 {
    public final PF ez0;
    public final boolean Yd0;
    public boolean Mb = false;

    public BattleTrainerIntroTask(PF pF, boolean bl) {
        this.ez0 = pF;
        this.Yd0 = bl;
    }

    @Override
    public final boolean lPt1() {
        return this.Mb;
    }

    @Override
    public final void ii() {
        boolean bl;
        if (this.Mb) {
            return;
        }
        this.Mb = true;
        PF pF = this.ez0;
        pF.kc = bl = this.Yd0;
        if (pF.Sc0 != null && !bl) {
            pF.Sc0 = null;
            pF.ll0();
        }
        if (this.Yd0) {
            this.ez0.RZ();
        }
    }

    @Override
    public final NU gJ0() {
        return NU.U0;
    }
}


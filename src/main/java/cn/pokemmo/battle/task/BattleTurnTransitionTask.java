/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.N60;
import f.NU;
import f.ZJ;

public class BattleTurnTransitionTask
extends N60 {
    public final String un0;
    public final ZJ kN;
    public boolean F20 = false;

    public BattleTurnTransitionTask(String string, ZJ zJ) {
        this.un0 = string;
        this.kN = zJ;
    }

    @Override
    public final boolean lPt1() {
        return this.F20;
    }

    @Override
    public final void ii() {
        if (this.F20) {
            return;
        }
        this.F20 = true;
        this.kN.Sk(this.un0);
    }

    @Override
    public final NU gJ0() {
        return NU.ST;
    }
}


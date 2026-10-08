/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.N60;
import f.NU;
import f.O8;

/*
 * Renamed from f.eu
 */
public class BattleFormeChangeTask
extends N60 {
    public boolean xq0 = false;
    public final O8 lY;
    public final byte Wl;

    public BattleFormeChangeTask(O8 o8, byte by) {
        this.lY = o8;
        this.Wl = by;
    }

    @Override
    public final boolean lPt1() {
        if (!this.xq0) {
            return false;
        }
        return this.lY.b90() == null || !this.lY.b90().nE0;
    }

    @Override
    public final void ii() {
        this.lY.aE0(0.0f, this.Wl);
        this.xq0 = true;
    }

    @Override
    public final NU gJ0() {
        return NU.d60;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.N60;
import f.NU;
import f.tw0_0;

/*
 * Renamed from f.gd
 */
public class BattleAbilityActivateTask
extends N60 {
    public final byte sd;
    public final short IJ0;
    public boolean Gf = false;

    public BattleAbilityActivateTask(byte by, short s) {
        this.sd = by;
        this.IJ0 = s;
    }

    @Override
    public final boolean lPt1() {
        return this.Gf;
    }

    @Override
    public final void ii() {
        if (this.Gf) {
            return;
        }
        this.Gf = true;
        BattleAbilityActivateTask gd_02 = this;
        byte by = gd_02.sd;
        tw0_0.RE0.Hq0(by, gd_02.IJ0);
    }

    @Override
    public final NU gJ0() {
        return NU.ST;
    }
}


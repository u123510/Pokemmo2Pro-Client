/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.N60;
import f.NU;
import f.hk0_1;

public class BattleBallThrowTask
extends N60 {
    public long Xi0 = -1L;

    @Override
    public final void ii() {
    }

    @Override
    public final boolean lPt1() {
        if (this.Xi0 == -1L) {
            this.Xi0 = hk0_1.KG;
        }
        return hk0_1.KG - this.Xi0 > 500L;
    }

    @Override
    public final NU gJ0() {
        return NU.Tl;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.ML0;
import f.NB0;
import f.TC0;
import f.a10_0;
import f.b30_0;

public class BattleTurnStateModifier
extends TC0 {
    public final b30_0 nv;

    public BattleTurnStateModifier(b30_0 b30_02, boolean bl) {
        this.nv = b30_02;
    }

    @Override
    public final void QC(ML0 mL0) {
        ML0 mL02 = mL0;
        b30_0 b30_02 = this.nv;
        mL02.lZ.add(new NB0(b30_02));
        a10_0 a10_02 = mL02.yd0;
        a10_02.rg0 = false;
        a10_02.p1 = 0;
    }
}


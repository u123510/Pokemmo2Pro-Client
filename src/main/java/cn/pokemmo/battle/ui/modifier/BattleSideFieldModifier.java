/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.ML0;
import f.TC0;
import f.a10_0;

public class BattleSideFieldModifier
extends TC0 {
    public final byte hz;
    public final boolean Mc0;

    public BattleSideFieldModifier(byte by, boolean bl) {
        this.hz = by;
        this.Mc0 = bl;
    }

    @Override
    public final void QC(ML0 mL0) {
        boolean bl;
        a10_0 a10_02 = mL0.yd0;
        BattleSideFieldModifier e12 = this;
        byte by = e12.hz;
        a10_02.Ql0[by] = bl = e12.Mc0;
        a10_02.zr[by] = null;
        a10_02.rg0 = false;
        a10_02.p1 = 0;
        a10_02.oC0 = false;
    }
}


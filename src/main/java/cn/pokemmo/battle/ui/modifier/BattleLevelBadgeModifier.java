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
import f.sm0_0;

/*
 * Renamed from f.uy
 */
public class BattleLevelBadgeModifier
extends TC0 {
    @Override
    public final void QC(ML0 mL0) {
        ML0 mL02 = mL0;
        mL02.ob(sm0_0.c0(5000));
        a10_0 a10_02 = mL02.yd0;
        a10_02.rg0 = true;
        a10_02.p1 = (int)(System.currentTimeMillis() / 1000L);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.ML0;
import f.Nt;
import f.PF;
import f.eb0_0;
import f.qn_1;
import f.sm0_0;

public class BattleAction102Packet
extends Nt
implements eb0_0 {
    @Override
    public final byte BL0() {
        return 102;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        String[] stringArray = new String[2];
        String[] stringArray2 = stringArray;
        stringArray[0] = pF2.A60();
        stringArray[1] = sm0_0.c0(210023);
        mL0.wJ(sm0_0.Bx(200531, stringArray2), "", null);
    }
}


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
import f.lpt6__2;
import f.qn_1;
import f.sm0_0;

/*
 * Renamed from f.Yf
 */
public class BattleAction072Packet
extends Nt
implements eb0_0 {
    @Override
    public final byte BL0() {
        return 72;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        int n = 15;
        int n2 = 102;
        String[] stringArray = new String[1];
        String[] stringArray2 = stringArray;
        stringArray[0] = pF2.A60();
        mL0.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, n, n2, stringArray2), "", null);
    }
}


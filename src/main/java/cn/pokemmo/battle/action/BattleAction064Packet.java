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

public class BattleAction064Packet
extends Nt
implements eb0_0 {
    public final short Se;

    public BattleAction064Packet(short s) {
        this.Se = s;
    }

    @Override
    public final byte BL0() {
        return 64;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        int n = 15;
        int n2 = 121;
        String[] stringArray = new String[1];
        String[] stringArray2 = stringArray;
        int n3 = 110000;
        stringArray[0] = sm0_0.c0(this.Se + n3);
        mL0.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, n, n2, stringArray2), "", null);
    }
}


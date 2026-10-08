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

/*
 * Renamed from f.pH0
 */
public class BattleActionNeg015Packet
extends Nt
implements eb0_0 {
    public final short Kv;

    public BattleActionNeg015Packet(short s) {
        this.Kv = s;
    }

    @Override
    public final byte BL0() {
        return -15;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        if (pF2 != null && pF2.LpT9 != null) {
            PF pF3 = pF2;
            pF3.VI0 = this.Kv;
            pF3.ZI(pF3.COm2(), true);
            return;
        }
    }
}


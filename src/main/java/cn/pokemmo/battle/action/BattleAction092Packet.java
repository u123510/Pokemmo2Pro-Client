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
 * Renamed from f.qx
 */
public class BattleAction092Packet
extends Nt
implements eb0_0 {
    public final boolean dk;

    public BattleAction092Packet(boolean bl) {
        this.dk = bl;
    }

    @Override
    public final byte BL0() {
        return 92;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        if (pF2 != null && pF2.LpT9 != null) {
            pF2.W1(this.dk);
            return;
        }
    }
}


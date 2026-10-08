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
import f.tw0_0;

/*
 * Renamed from f.od
 */
public class BattleActionNeg001Packet
extends Nt
implements eb0_0 {
    public final short Nn0;

    public BattleActionNeg001Packet(short s) {
        this.Nn0 = s;
    }

    @Override
    public final byte BL0() {
        return -1;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        if (tw0_0.PK0 != null && tw0_0.LD0.he0 != null && (pF = tw0_0.PK0.nd0(pF2.Zo0())) != null) {
            pF.bv0(this.Nn0);
            tw0_0.LD0.he0.N10.Hi(pF).Ny();
        }
    }
}


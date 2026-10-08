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

/*
 * Renamed from f.y9
 */
public class BattleActionNeg010Packet
extends Nt
implements eb0_0 {
    public final byte ZJ0;

    public BattleActionNeg010Packet(byte by) {
        this.ZJ0 = by;
    }

    @Override
    public final byte BL0() {
        return -10;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        if (this.ZJ0 == 0) {
            mL0.wJ(sm0_0.c0(200431), "", null);
        }
    }
}


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

public class BattleAction108Packet
extends Nt
implements eb0_0 {
    public final short HX;

    public BattleAction108Packet(short s) {
        this.HX = s;
    }

    @Override
    public final byte BL0() {
        return 108;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        if (pF2 != null && !pF2.zi0.hf0() && pF != null && !pF.zi0.hf0()) {
            mL0.wJ(sm0_0.wa0(200359, sm0_0.c0(this.HX + 110000)), "", null);
            return;
        }
    }
}


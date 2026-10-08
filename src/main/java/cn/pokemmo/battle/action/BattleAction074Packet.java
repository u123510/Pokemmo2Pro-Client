/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.GV;
import f.ML0;
import f.Nt;
import f.PF;
import f.eb0_0;
import f.qn_1;
import f.sm0_0;

public class BattleAction074Packet
extends Nt
implements eb0_0 {
    public final GV JH0;

    public BattleAction074Packet(GV gV) {
        this.JH0 = gV;
    }

    @Override
    public final byte BL0() {
        return 74;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        mL0.wJ(sm0_0.wa0(5010, sm0_0.c0(this.JH0.pN)), "", null);
    }
}


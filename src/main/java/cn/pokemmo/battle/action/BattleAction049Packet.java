/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  f.ML0
 *  f.Nt
 *  f.PF
 *  f.eb0_0
 *  f.lpt6__2
 *  f.qn_1
 *  f.sm0_0
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

public class BattleAction049Packet
extends Nt
implements eb0_0 {
    public final short Dx0;

    public BattleAction049Packet(short s) {
        this.Dx0 = s;
    }

    public final byte BL0() {
        return 49;
    }

    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        mL0.wJ(
            sm0_0.fg0(
                (byte)2,
                lpt6__2.Q80,
                14,
                mL0.yd0.QX(635, pF2),
                new String[]{pF2.A60(), sm0_0.c0(this.Dx0 + 110000)}
            ),
            "",
            null
        );
    }
}

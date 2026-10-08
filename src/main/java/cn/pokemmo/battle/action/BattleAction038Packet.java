/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  f.ML0
 *  f.Nt
 *  f.PF
 *  f.eb0_0
 *  f.kw_0
 *  f.lpt6__2
 *  f.oh0_0
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
import f.kw_0;
import f.lpt6__2;
import f.oh0_0;
import f.qn_1;
import f.sm0_0;

public class BattleAction038Packet
extends Nt
implements eb0_0 {
    public final byte BL0() {
        return 38;
    }

    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        mL0.lZ.add(new kw_0((byte)0, new oh0_0(pF).vv(pF2)));
        mL0.wJ(
            sm0_0.fg0(
                (byte)2,
                lpt6__2.Q80,
                14,
                mL0.yd0.QX(736, pF),
                new String[]{pF.A60()}
            ),
            "",
            null
        );
        pF2.AF0 = true;
    }
}

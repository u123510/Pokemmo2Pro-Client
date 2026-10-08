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
import f.gu0;
import f.mc0_1;
import f.qn_1;
import f.sm0_0;

public class BattleAction087Packet
extends Nt
implements eb0_0 {
    @Override
    public final byte BL0() {
        return 87;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        mc0_1 mc0_12 = gu0.l2.lPT6((short)5295);
        mL0.wJ(sm0_0.Bx(6068, pF.A60(), sm0_0.c0(mc0_12.Nl)), "", null);
    }
}


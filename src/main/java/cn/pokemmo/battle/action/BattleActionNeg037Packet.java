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
import f.i40_0;
import f.qn_1;
import f.sm0_0;
import f.tu0_0;

public class BattleActionNeg037Packet
extends Nt
implements eb0_0 {
    public final byte RT;
    public final i40_0 M3;

    public BattleActionNeg037Packet(byte by, i40_0 i40_02) {
        this.RT = by;
        this.M3 = i40_02;
    }

    @Override
    public final byte BL0() {
        return -37;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        byte by = this.RT;
        if (by == 1) {
            String[] stringArray = new String[2];
            String[] stringArray2 = stringArray;
            stringArray2[0] = pF2.Yp();
            stringArray[1] = this.M3.BT();
            mL0.wJ(sm0_0.Bx(200598, stringArray2), "", null);
        } else if (by == 0) {
            tu0_0.mk(pF2, 200597, mL0, "", null);
        }
    }
}


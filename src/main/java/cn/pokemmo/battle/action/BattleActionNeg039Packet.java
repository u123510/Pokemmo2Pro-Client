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

/*
 * Renamed from f.pk
 */
public class BattleActionNeg039Packet
extends Nt
implements eb0_0 {
    public final byte As;
    public final i40_0 Iu;

    public BattleActionNeg039Packet(byte by, i40_0 i40_02) {
        this.As = by;
        this.Iu = i40_02 == null ? i40_0.Gc : i40_02;
    }

    @Override
    public final byte BL0() {
        return -39;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        byte by = this.As;
        if (by != 2) {
            if (by == 3) {
                String[] stringArray = new String[2];
                String[] stringArray2 = stringArray;
                stringArray2[0] = pF2.Yp();
                stringArray[1] = this.Iu.BT();
                mL0.wJ(sm0_0.Bx(200605, stringArray2), "", null);
            }
        } else {
            tu0_0.mk(pF2, 200606, mL0, "", null);
        }
    }
}


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
import f.km_0;
import f.kw_0;
import f.qn_1;
import f.sm0_0;
import f.tw0_0;

public class BattleActionNeg020Packet
extends Nt
implements eb0_0 {
    @Override
    public final byte BL0() {
        return -20;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        km_0 km_02;
        if (tw0_0.LD0.he0 == null) {
            return;
        }
        if (pF2 == null) {
            return;
        }
        mL0.I1(sm0_0.wa0(16807026, pF2.Yp()), "", null);
        km_0 km_03 = new km_0(pF2, false);
        tw0_0.LD0.he0.N10.lZ.add(new kw_0(km_03));
    }
}


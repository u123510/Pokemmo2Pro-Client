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
import f.lpt6__2;
import f.mc0_1;
import f.qn_1;
import f.sm0_0;

/*
 * Renamed from f.cC0
 */
public class BattleAction088Packet
extends Nt
implements eb0_0 {
    @Override
    public final byte BL0() {
        return 88;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void IE0(PF pF, PF object, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        mc0_1 mc0_12 = gu0.l2.lPT6((short)5270);
        if (pF == null) {
            return;
        }
        lpt6__2 object2 = lpt6__2.Q80;
        int n = 14;
        int n2 = mL0.yd0.QX(1038, pF);
        String[] stringArray = new String[2];
        String[] stringArray2 = stringArray;
        stringArray[0] = pF.A60();
        stringArray[1] = sm0_0.c0(mc0_12.Nl);
        mL0.wJ(sm0_0.fg0((byte)2, object2, n, n2, stringArray2), "", null);
    }
}

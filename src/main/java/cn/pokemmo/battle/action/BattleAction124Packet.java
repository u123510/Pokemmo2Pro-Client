/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  f.ML0
 *  f.Nt
 *  f.Oz0
 *  f.PF
 *  f.eb0_0
 *  f.gc_2
 *  f.lpt6__2
 *  f.qn_1
 *  f.sm0_0
 *  f.tw0_0
 */
package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.ML0;
import f.Nt;
import f.PF;
import f.eb0_0;
import f.gc_2;
import f.lpt6__2;
import f.qn_1;
import f.sm0_0;
import f.tw0_0;

public class BattleAction124Packet
extends Nt
implements eb0_0 {
    public final gc_2[] UY;

    public BattleAction124Packet(gc_2[] gc_2Array) {
        this.UY = gc_2Array;
    }

    public final byte BL0() {
        return 124;
    }

    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        String string;
        int n;
        if (this.UY[0] == gc_2.r4) {
            lpt6__2 lpt6__22 = lpt6__2.Q80;
            int n2 = 14;
            n = mL0.yd0.QX(676, pF);
            String[] stringArray = new String[1];
            int n3 = 0;
            string = pF == null ? "" : pF.A60();
            stringArray[n3] = string;
            mL0.wJ(sm0_0.fg0((byte)2, (lpt6__2)lpt6__22, (int)n2, (int)n, (String[])stringArray), "", null);
        }
        if (this.UY[0] == gc_2.ly) {
            lpt6__2 lpt6__23 = lpt6__2.Q80;
            int n4 = 14;
            n = mL0.yd0.QX(679, pF);
            String[] stringArray = new String[1];
            int n5 = 0;
            string = pF == null ? "" : pF.A60();
            stringArray[n5] = string;
            mL0.wJ(sm0_0.fg0((byte)2, (lpt6__2)lpt6__23, (int)n4, (int)n, (String[])stringArray), "", null);
        }
        gc_2[] gc_2Array = this.UY;
        int n6 = gc_2Array.length;
        for (int i = 0; i < n6; ++i) {
            gc_2 gc_22 = gc_2Array[i];
            byte by = gc_22.v10;
            byte by2 = pF.sL0[by];
            pF.Mt(gc_22, pF2.sL0[by]);
            pF2.Mt(gc_22, by2);
        }
        if (tw0_0.LD0.he0 != null) {
            tw0_0.LD0.he0.N10.Hi(pF).XO();
            tw0_0.LD0.he0.N10.Hi(pF2).XO();
        }
    }
}

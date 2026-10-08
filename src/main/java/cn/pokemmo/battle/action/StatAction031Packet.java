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
import f.b30_0;
import f.eb0_0;
import f.gc_2;
import f.i40_0;
import f.lg_0;
import f.lpt6__2;
import f.nd_1;
import f.qn_1;
import f.sm0_0;

public class StatAction031Packet
extends Nt
implements eb0_0 {
    public final short ff0;
    public final short o60;
    public final short o80;
    public final byte jg0;
    public final byte LpT3;
    public final short[] Ga;
    public final byte[] wX;
    public final i40_0 xy0;
    public final i40_0 dp;

    public StatAction031Packet(short s, byte by, short[] sArray, short s2, short s3, byte by2, byte[] byArray, i40_0 i40_02, i40_0 i40_03) {
        this.ff0 = s;
        this.jg0 = by;
        this.Ga = sArray;
        this.o60 = s2;
        this.o80 = s3;
        this.LpT3 = by2;
        this.wX = byArray;
        if (i40_02 == null) {
            i40_02 = i40_0.Gc;
        }
        this.xy0 = i40_02;
        if (i40_03 == null) {
            i40_03 = i40_0.Gc;
        }
        this.dp = i40_03;
    }

    public static void tL0(ML0 mL0, PF pF) {
        PF pF2 = pF;
        PF pF3 = pF;
        mL0.Hi(pF).le0(pF3, false, pF3.uk());
        pF2.ZI(pF2.COm2(), true);
    }

    @Override
    public final byte BL0() {
        return 31;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        pF.ND0(this.ff0, this.jg0, this.Ga, null, this.o80, this.LpT3);
        pF.Sk0 = this.o60;
        mL0.lZ.add(new nd_1(pF, b30_0.U5(pF.cD0, pF.Kj0)));
        lpt6__2 lpt6__22 = lpt6__2.Q80;
        int n = 14;
        int n2 = mL0.yd0.eH0(644, pF, pF2);
        String[] stringArray = new String[2];
        stringArray[0] = pF.A60();
        stringArray[1] = sm0_0.c0(this.ff0 + 150000);
        mL0.wJ(sm0_0.fg0((byte)2, lpt6__22, n, n2, stringArray), "", null);
        pF.gp = this.xy0;
        pF.Qj = this.dp;
        for (int i = 0; i < this.wX.length; ++i) {
            pF.Mt(gc_2.ME[i], this.wX[i]);
        }
        lg_0.k.lPT5(() -> StatAction031Packet.tL0(mL0, pF));
    }
}

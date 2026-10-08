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
import f.lpt6__2;
import f.qn_1;
import f.sm0_0;

/*
 * Renamed from f.u10
 */
public class BattleAction050Packet
extends Nt
implements eb0_0 {
    public final short Qg;
    public final byte KY;

    public BattleAction050Packet(byte by, short s) {
        this.KY = by;
        this.Qg = s;
    }

    @Override
    public final byte BL0() {
        return 50;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        String string;
        ML0 mL02;
        int n = this.KY;
        if (n != 0) {
            if (n != 1) {
                return;
            }
            mL02 = mL0;
            n = 14;
            int n2 = 764;
            String[] stringArray = new String[2];
            String[] stringArray2 = stringArray;
            stringArray[0] = sm0_0.c0(210156);
            int n3 = 110000;
            stringArray[1] = sm0_0.c0(this.Qg + n3);
            string = sm0_0.fg0((byte)2, lpt6__2.Q80, n, n2, stringArray2);
        } else {
            mL02 = mL0;
            n = 14;
            int n4 = 764;
            String[] stringArray = new String[2];
            String[] stringArray3 = stringArray;
            stringArray[0] = sm0_0.c0(110277);
            int n5 = 110000;
            stringArray[1] = sm0_0.c0(this.Qg + n5);
            string = sm0_0.fg0((byte)2, lpt6__2.Q80, n, n4, stringArray3);
        }
        mL02.wJ(string, "", null);
    }
}


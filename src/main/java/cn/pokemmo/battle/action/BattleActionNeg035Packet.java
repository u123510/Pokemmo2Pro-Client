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
import f.qn_1;

/*
 * Renamed from f.hE
 */
public class BattleActionNeg035Packet
extends Nt
implements eb0_0 {
    public final short[] ol;
    public final byte[] x00;

    public BattleActionNeg035Packet(short[] sArray, byte[] byArray) {
        this.ol = sArray;
        this.x00 = byArray;
    }

    @Override
    public final byte BL0() {
        return -35;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        byte by = 0;
        while (true) {
            short[] sArray = this.ol;
            if (by >= this.ol.length) break;
            short s2 = sArray[by];
            pF2.X70(by, this.x00[by], s2);
            by = (byte)(by + 1);
        }
    }
}


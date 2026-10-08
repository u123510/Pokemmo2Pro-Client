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

public class BattleAction075Packet
extends Nt
implements eb0_0 {
    public short oI0;
    public short M8;

    public BattleAction075Packet(short s, short s2) {
        this.oI0 = s;
        this.M8 = s2;
    }

    @Override
    public final byte BL0() {
        return 75;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        if (this.oI0 < 0 || this.oI0 == 165) {
            this.oI0 = -1;
            this.M8 = -1;
        }
        if (pF2 != null) {
            pF2.EH0 = this.oI0;
            pF2.FF = this.M8;
        }
    }
}


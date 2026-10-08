package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction027Packet extends Nt implements eb0_0 {
    public final byte fp0;


    public BattleAction027Packet(byte i1) {
        this.fp0 = i1;
    }

    public final byte BL0() {
        return 27;
    }


    public final void IE0(PF v1, PF v2, boolean i3, boolean i4, short i5, boolean i6, ML0 v7, qn_1 v8) {
        byte i0 = this.fp0;
        if (i0 == 0) {
            lpt6__2 this_1 = lpt6__2.Q80;
            int i1 = 14;
            int i3_1 = v7.yd0.QX(607, v2);
            String[] v4 = new String[]{ v2.A60() };
            String msg = sm0_0.fg0((byte) 2, this_1, i1, i3_1, v4);
            v7.wJ("", msg, (java.lang.Runnable) null);
        } else if (i0 == 1) {
            String msg = sm0_0.wa0(16807051, v2.A60());
            v7.wJ("", msg, (java.lang.Runnable) null);
        }
    }
}

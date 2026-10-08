package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction015Packet extends Nt implements eb0_0 {
    public final boolean XC0;

    public BattleAction015Packet(boolean i1) {
        super();
        this.XC0 = i1;
    }

    public final byte BL0() {
        return 15;
    }

    public final void IE0(PF v1, PF v2, boolean i3, boolean i4, short i5, boolean i6, ML0 v7, qn_1 v8) {
        String msg;
        if (this.XC0) {
            msg = sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 122, sm0_0.zb0);
        } else {
            msg = sm0_0.c0(5012);
        }
        v7.wJ(msg, "", null);
    }
}

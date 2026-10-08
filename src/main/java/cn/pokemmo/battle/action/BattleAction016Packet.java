package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction016Packet extends Nt implements eb0_0 {
    public final byte com6;

    public BattleAction016Packet(byte i1) {
        super();
        this.com6 = i1;
    }

    public final byte BL0() {
        return 16;
    }

    public final void IE0(PF v1, PF v2, boolean i3, boolean i4, short i5, boolean i6, ML0 v7, qn_1 v8) {
        String msg = sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 100 + this.com6, sm0_0.zb0);
        v7.wJ(msg, "", null);
    }
}

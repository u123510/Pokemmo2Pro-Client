package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction033Packet extends Nt implements eb0_0 {
    public final short Sg0;

    public BattleAction033Packet(short i1) {
        super();
        this.Sg0 = i1;
    }

    public final byte BL0() {
        return 33;
    }

    public final void IE0(PF v1, PF v2, boolean i3, boolean i4, short i5, boolean i6, ML0 v7, qn_1 v8) {
        int qx = v7.yd0.QX(691, v1);
        String[] arr = new String[]{v1.A60(), sm0_0.c0(110000 + this.Sg0)};
        String msg = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, qx, arr);
        v7.wJ(msg, "", null);
    }
}

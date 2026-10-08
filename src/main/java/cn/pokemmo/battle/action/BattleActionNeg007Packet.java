package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleActionNeg007Packet extends Nt implements eb0_0 {
    public BattleActionNeg007Packet() {
        super();
    }

    public final byte BL0() {
        return -7;
    }

    public final void IE0(PF v1, PF v2, boolean i3, boolean i4, short i5, boolean i6, ML0 v7, qn_1 v8) {
        int qx = v7.yd0.QX(1128, v2);
        String[] arr = new String[]{v2.A60()};
        String msg = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, qx, arr);
        v7.wJ(msg, "", null);
        v2.uV = true;
    }
}

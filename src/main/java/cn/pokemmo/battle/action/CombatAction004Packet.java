package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class CombatAction004Packet extends Nt implements eb0_0 {
    public static final CombatAction004Packet class$;

    public CombatAction004Packet() {
        super();
    }

    static {
        class$ = new CombatAction004Packet();
    }

    public final byte BL0() {
        return 4;
    }

    public final void IE0(PF v1, PF v2, boolean i3, boolean i4, short i5, boolean i6, ML0 v7, qn_1 v8) {
        int qx = v7.yd0.QX(363, v2);
        String[] arr = new String[]{v2.A60()};
        String msg = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, qx, arr);
        v7.wJ(msg, "", null);
    }
}

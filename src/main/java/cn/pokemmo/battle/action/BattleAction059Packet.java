package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction059Packet extends Nt implements eb0_0 {
    public final byte ZV;

    public BattleAction059Packet(byte ZV) {
        this.ZV = ZV;
    }

    @Override
    public final byte BL0() {
        return 59;
    }

    @Override
    public final void IE0(PF first, PF second, boolean unused1, boolean unused2,
                          short unused3, boolean unused4, ML0 context, qn_1 unused5) {
        int resource;
        if (this.ZV == 0) {
            resource = 745;
        } else if (this.ZV == 1) {
            resource = 748;
        } else {
            return;
        }

        String message = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                context.yd0.QX(resource, first), new String[]{first.A60()});
        context.wJ(message, "", null);
    }
}

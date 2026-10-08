package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction123Packet extends Nt implements eb0_0 {
    public BattleAction123Packet() {
        super();
    }

    @Override
    public final byte BL0() {
        return (byte) 123;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        lpt6__2 messageType = lpt6__2.Q80;
        byte mode = 14;
        int messageId = battle.yd0.QX(673, first);
        String[] args = new String[1];
        args[0] = first == null ? "" : first.A60();
        battle.wJ(sm0_0.fg0((byte) 2, messageType, mode, messageId, args), "", null);
        if (tw0_0.PK0 != null) {
            second.h30(first.sL0);
            first.h30(second.sL0);
        }
        Oz0 overlay = tw0_0.LD0.he0;
        if (overlay != null) {
            overlay.N10.Hi(first).XO();
            overlay.N10.Hi(second).XO();
        }
    }
}

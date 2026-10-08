package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class CombatAction057Packet extends Nt implements eb0_0 {
    public final short c1;

    public CombatAction057Packet(short itemId) {
        super();
        this.c1 = itemId;
    }

    @Override
    public final byte BL0() {
        return 57;
    }

    @Override
    public final void IE0(PF attacker, PF target, boolean critical, boolean missed, short damage,
                          boolean special, ML0 messageLog, qn_1 context) {
        mc0_1 item = gu0.l2.lPT6(this.c1);
        int messageId = messageLog.yd0.QX(1001, target);
        String[] arguments = new String[]{target.A60(), sm0_0.c0(item.Nl)};
        String message = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, messageId, arguments);
        messageLog.wJ(message, "", null);
    }
}

package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class CombatAction094Packet extends Nt implements eb0_0 {
    public final byte Bu;

    public CombatAction094Packet(byte mode) {
        super();
        this.Bu = mode;
    }

    @Override
    public final byte BL0() {
        return 94;
    }

    @Override
    public final void IE0(PF attacker, PF target, boolean critical, boolean missed, short damage,
                          boolean special, ML0 messageLog, qn_1 context) {
        byte mode = this.Bu;
        if (mode != 1 && mode != 0) {
            return;
        }

        int messageKey = mode == 1 ? 661 : 658;
        int targetValue = messageLog.yd0.QX(messageKey, target);
        String[] arguments = new String[]{target.A60()};
        String message = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, targetValue, arguments);
        messageLog.wJ(message, "", null);
    }
}

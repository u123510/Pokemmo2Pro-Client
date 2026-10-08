package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class CombatAction079Packet extends Nt implements eb0_0 {
    public final byte uK0;

    public CombatAction079Packet(byte mode) {
        super();
        this.uK0 = mode;
    }

    @Override
    public final byte BL0() {
        return 79;
    }

    @Override
    public final void IE0(PF attacker, PF target, boolean critical, boolean missed, short damage,
                          boolean special, ML0 messageLog, qn_1 context) {
        byte mode = this.uK0;
        target.c10 = (byte) -1;
        target.zi0.nF0 = mode;
        messageLog.lZ.add(new nd_1(target, b30_0.U5(target.cD0, target.Kj0)));

        int messageId = messageLog.yd0.QX(222, target);
        String[] arguments = new String[]{target.A60()};
        String message = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, messageId, arguments);
        messageLog.wJ(message, "", null);

        target.gp = i40_0.Gc;
        target.Qj = i40_0.Gc;
        messageLog.Hi(target).XO();
    }
}

package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction006Packet extends ka_0 {
    public BattleAction006Packet(short value) {
        super(value);
    }

    public final byte BL0() {
        return 6;
    }

    public final void IE0(
            PF first,
            PF second,
            boolean flag1,
            boolean flag2,
            short value,
            boolean flag3,
            ML0 window,
            qn_1 context
    ) {
        second.F(this.rA);
        lpt6__2 messageType = lpt6__2.Q80;
        byte category = 14;
        int messageId = window.yd0.QX(243, second);
        String[] names = new String[]{second.A60()};
        String message = sm0_0.fg0((byte)2, messageType, category, messageId, names);
        window.I1(message, "", null);

        kw_0 action = new kw_0((byte)0, new LI0(first).vv(second));
        window.lZ.add(action);

        ii_1 followUp = new ii_1(second, window.Hi(second), null, false, false);
        window.lZ.add(followUp);
    }
}

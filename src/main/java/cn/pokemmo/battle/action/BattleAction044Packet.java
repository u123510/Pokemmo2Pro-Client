package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction044Packet extends ka_0 {
    public final byte zG0;

    public BattleAction044Packet(byte type) {
        super((short)0);
        this.zG0 = type;
    }

    @Override
    public final byte BL0() {
        return 44;
    }

    @Override
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
        if (this.zG0 == 0) {
            int messageId = window.yd0.QX(626, first);
            String message = sm0_0.fg0(
                    (byte)2,
                    lpt6__2.Q80,
                    14,
                    messageId,
                    new String[]{first.A60()}
            );
            window.wJ(message, "", null);
            return;
        }

        if (this.zG0 == 1) {
            int messageId = window.yd0.QX(629, second);
            String message = sm0_0.fg0(
                    (byte)2,
                    lpt6__2.Q80,
                    14,
                    messageId,
                    new String[]{second.A60()}
            );
            window.wJ(message, "", null);
            first.F((short)0);
            window.lZ.add(new ii_1(first, window.Hi(first), null, false, false));
        }
    }
}

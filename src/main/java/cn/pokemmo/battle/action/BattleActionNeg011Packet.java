package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleActionNeg011Packet extends Nt implements eb0_0 {
    public final short a60;

    public BattleActionNeg011Packet(short value) {
        super();
        this.a60 = value;
    }

    @Override
    public final byte BL0() {
        return (byte) -11;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        String secondName = second == null ? "" : second.A60();
        String firstName = first == null ? "" : first.A60();
        String message;
        if (this.a60 == 46) {
            message = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                    battle.yd0.QX(767, second), new String[]{secondName});
        } else {
            message = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                    battle.yd0.QX(782, first), new String[]{firstName, secondName});
        }
        battle.wJ(message, "", null);
    }
}

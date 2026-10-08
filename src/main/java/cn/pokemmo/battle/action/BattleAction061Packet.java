package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction061Packet extends Nt implements eb0_0 {
    public final byte Q4;
    public final short FH0;

    public BattleAction061Packet(byte type, short value) {
        super();
        this.Q4 = type;
        this.FH0 = value;
    }

    @Override
    public final byte BL0() {
        return 61;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        if (this.Q4 == 1) {
            int messageId = battle.yd0.QX(589, first);
            String[] arguments = {
                    first.A60(),
                    sm0_0.c0(this.FH0 + 110000)
            };
            battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, messageId, arguments), "", null);
            return;
        }
        if (this.Q4 == 0) {
            int messageId = battle.yd0.QX(586, first);
            String[] arguments = {first.A60()};
            battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, messageId, arguments), "", null);
        }
    }
}

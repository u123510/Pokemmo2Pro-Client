package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction030Packet extends Nt implements eb0_0 {
    public final short t70;
    public final byte mp;

    public BattleAction030Packet(byte value, short amount) {
        super();
        this.t70 = amount;
        this.mp = value;
    }

    @Override
    public final byte BL0() {
        return (byte) 30;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        lpt6__2 mode = lpt6__2.Q80;
        int category = 14;
        int localized = battle.yd0.QX(641, second);
        String[] arguments = new String[3];
        arguments[0] = second.A60();
        arguments[1] = sm0_0.c0(this.t70 + 110000);
        arguments[2] = fp0_0.uD(new StringBuilder(), this.mp, "");
        battle.wJ(sm0_0.fg0((byte) 2, mode, category, localized, arguments), "", null);
    }
}

package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction116Packet extends Nt implements eb0_0 {
    public final short P10;

    public BattleAction116Packet(short value) {
        super();
        this.P10 = value;
    }

    @Override
    public final byte BL0() {
        return 116;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        mc0_1 move = gu0.l2.lPT6(this.P10);
        if (move == null) {
            return;
        }
        String message = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                battle.yd0.QX(1025, first),
                new String[]{first.A60(), sm0_0.c0(move.Nl)});
        battle.wJ(message, "", null);
    }
}

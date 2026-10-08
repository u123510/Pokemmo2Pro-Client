package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction054Packet extends Nt implements eb0_0 {
    public final short MP;
    public final short cOm6;

    public BattleAction054Packet(short move, short value) {
        super();
        this.MP = move;
        this.cOm6 = value;
    }

    @Override
    public final byte BL0() {
        return 54;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        mc0_1 move = gu0.l2.lPT6(this.MP);
        String valueName = sm0_0.c0(this.cOm6 + 110000);
        String message = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                battle.yd0.QX(911, second),
                new String[]{second.A60(), sm0_0.c0(move.Nl), valueName});
        battle.wJ(message, "", null);
    }
}

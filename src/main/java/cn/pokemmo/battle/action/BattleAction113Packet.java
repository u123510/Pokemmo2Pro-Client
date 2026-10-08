package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction113Packet extends Nt implements eb0_0 {
    public final short jb;

    public BattleAction113Packet(short value) {
        this.jb = value;
    }

    @Override
    public final byte BL0() {
        return 113;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 context, qn_1 extra) {
        mc0_1 translated = gu0.l2.lPT6(this.jb);
        lpt6__2 formatter = lpt6__2.Q80;
        int code = context.yd0.QX(219, second);
        String[] args = {second.A60(), sm0_0.c0(translated.Nl)};
        context.wJ(sm0_0.fg0((byte) 14, formatter, 14, code, args), null, null);
    }
}

package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction067Packet extends Nt implements eb0_0 {
    @Override
    public final byte BL0() {
        return 67;
    }

    @Override
    public final void IE0(PF sender, PF target, boolean flag1, boolean flag2, short value, boolean flag3, ML0 context, qn_1 callback) {
        lpt6__2 channel = lpt6__2.Q80;
        int priority = 14;
        int textId = context.yd0.QX(670, target);
        String[] arguments = new String[]{target.A60()};
        context.wJ(sm0_0.fg0((byte)2, channel, priority, textId, arguments), "", null);
    }
}

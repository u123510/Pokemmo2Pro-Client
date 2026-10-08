package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction019Packet extends ka_0 {
    public BattleAction019Packet(short value) {
        super(value);
    }

    @Override
    public final byte BL0() {
        return 19;
    }

    @Override
    public final void IE0(PF first, PF target, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        target.F(this.rA);
        battle.lZ.add(new ii_1(target, battle.Hi(target), null, false, false));
        String message = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                battle.yd0.QX(324, target), new String[]{target.A60()});
        battle.wJ(message, "", null);
    }
}

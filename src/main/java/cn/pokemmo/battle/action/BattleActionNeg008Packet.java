package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleActionNeg008Packet extends Nt implements eb0_0 {
    public final byte ag0;

    public BattleActionNeg008Packet(byte value) {
        super();
        this.ag0 = value;
    }

    @Override
    public final byte BL0() {
        return (byte) -8;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        int mode = this.ag0;
        if (mode == 1) {
            battle.wJ(sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 116, sm0_0.zb0), "", null);
            battle.yd0.l2.remove(gw0_0.U4);
            return;
        }
        if (mode != 0) {
            return;
        }
        battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                battle.yd0.QX(857, first), new String[]{first.A60()}), "", null);
        battle.yd0.l2.put(gw0_0.U4, new bj0_2(gw0_0.U4, (byte) 5));
    }

    @Override
    public final boolean Hm() {
        return false;
    }
}

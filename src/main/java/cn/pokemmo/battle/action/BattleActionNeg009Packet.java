package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleActionNeg009Packet extends Nt implements eb0_0 {
    public final byte QT;

    public BattleActionNeg009Packet(byte value) {
        super();
        this.QT = value;
    }

    @Override
    public final byte BL0() {
        return (byte) -9;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 model, qn_1 callback) {
        if (this.QT == 1) {
            model.wJ(sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 179, sm0_0.zb0), "", null);
            model.yd0.l2.remove(gw0_0.cZ);
        } else if (this.QT == 0) {
            model.wJ(sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 178, sm0_0.zb0), "", null);
            model.yd0.l2.put(gw0_0.cZ, new bj0_2(gw0_0.cZ, (byte) 5));
        }
    }
}

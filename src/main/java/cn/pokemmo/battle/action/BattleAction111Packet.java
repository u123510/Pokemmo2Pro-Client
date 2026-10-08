package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction111Packet extends Nt implements eb0_0 {
    public final byte BF;

    public BattleAction111Packet(byte value) {
        super();
        this.BF = value;
    }

    @Override
    public final byte BL0() {
        return 111;
    }

    @Override
    public final void IE0(PF p1, PF p2, boolean b1, boolean b2, short s,
                          boolean b3, ML0 model, qn_1 qn) {
        if (this.BF == 2) {
            int count = model.yd0.QX(727, p2);
            model.wJ("", sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, count,
                    new String[] {p2.A60()}), null);
        } else if (this.BF == 1) {
            model.wJ("", sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 181,
                    sm0_0.zb0), null);
            model.yd0.l2.remove(gw0_0.sm0);
        } else {
            model.wJ("", sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 180,
                    sm0_0.zb0), null);
            model.yd0.l2.put(gw0_0.sm0, new bj0_2(gw0_0.sm0, (byte) 5));
        }
    }

    @Override
    public final boolean Hm() {
        return this.BF == 2;
    }
}

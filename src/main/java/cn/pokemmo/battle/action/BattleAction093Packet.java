package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction093Packet extends Nt implements eb0_0 {
    public final byte v50;
    public final short fS;

    public BattleAction093Packet(byte type, short value) {
        super();
        this.v50 = type;
        this.fS = value;
    }

    @Override
    public final byte BL0() {
        return 93;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2, short value,
                          boolean flag3, ML0 battle, qn_1 context) {
        int type = this.v50;
        if (type == 2) {
            ec0_2 registry = ec0_2.Sx();
            vk0_1 entry = (vk0_1)registry.f4.f5(this.fS);
            if (entry == null) {
                return;
            }
            lpt6__2 category = lpt6__2.Q80;
            int effect = battle.yd0.QX(1086, first);
            battle.wJ(sm0_0.fg0((byte)2, category, 14, effect,
                    new String[]{first.nz0(false), sm0_0.c0(entry.bt)}), "", null);
        } else if (type == 1) {
            battle.wJ(sm0_0.Bw((byte)2, lpt6__2.Q80, 15, 118, sm0_0.zb0), "", null);
            battle.yd0.l2.remove(gw0_0.cOm9);
        } else if (type == 0) {
            battle.wJ(sm0_0.Bw((byte)2, lpt6__2.Q80, 15, 117, sm0_0.zb0), "", null);
            battle.yd0.l2.put(gw0_0.cOm9, new bj0_2(gw0_0.cOm9, (byte)5));
        }
    }

    @Override
    public final boolean Hm() {
        return this.v50 == 2;
    }
}

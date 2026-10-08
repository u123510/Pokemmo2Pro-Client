package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatActionNeg034Packet extends Nt implements eb0_0 {
    public final byte h2;

    public StatActionNeg034Packet(byte value) {
        super();
        this.h2 = value;
    }

    @Override
    public final byte BL0() {
        return (byte) -34;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        switch (this.h2) {
            case 0: {
                a10_0 state = battle.yd0;
                bj0_2 entry = new bj0_2(gw0_0.lV, (byte) 5);
                state.l2.put(gw0_0.lV, entry);
                return;
            }
            case 1: {
                battle.wJ(sm0_0.c0(200558), "", null);
                battle.yd0.l2.remove(gw0_0.lV);
                return;
            }
            case 2: {
                a10_0 state = battle.yd0;
                bj0_2 entry = new bj0_2(gw0_0.vz, (byte) 5);
                state.l2.put(gw0_0.vz, entry);
                return;
            }
            case 3: {
                battle.wJ(sm0_0.c0(200560), "", null);
                battle.yd0.l2.remove(gw0_0.vz);
                return;
            }
            default:
                return;
        }
    }
}

package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatAction029Packet extends Nt implements eb0_0 {
    public final byte S90;
    public final i40_0 F60;

    public StatAction029Packet(byte value, i40_0 state) {
        this.S90 = value;
        this.F60 = state;
    }

    @Override
    public final byte BL0() {
        return 29;
    }

    @Override
    public final void IE0(PF first, PF second, boolean firstFlag, boolean secondFlag,
                          short ignored, boolean thirdFlag, ML0 battle, qn_1 context) {
        if (this.S90 == 0) {
            int ordinal = this.F60.ordinal();
            if (ordinal == 13) {
                battle.wJ(sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 115, sm0_0.zb0), "", null);
            } else if (ordinal == 10) {
                battle.wJ(sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 114, sm0_0.zb0), "", null);
            }
            return;
        }
        if (this.S90 == 1) {
            int ordinal = this.F60.ordinal();
            if (ordinal == 13) {
                vk0_1 value = (vk0_1) ec0_2.Sx().f4.f5((short) 300);
                battle.wJ(sm0_0.wa0(200608, sm0_0.c0(value.bt)), "", null);
            } else if (ordinal == 10) {
                vk0_1 value = (vk0_1) ec0_2.Sx().f4.f5((short) 346);
                battle.wJ(sm0_0.wa0(200608, sm0_0.c0(value.bt)), "", null);
            }
        }
    }
}

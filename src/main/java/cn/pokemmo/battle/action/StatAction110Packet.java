package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatAction110Packet extends Nt implements eb0_0 {
    public final byte Q10;

    public StatAction110Packet(byte value) {
        this.Q10 = value;
    }

    @Override
    public final byte BL0() {
        return 110;
    }

    @Override
    public final void IE0(PF unused1, PF target, boolean unused2, boolean unused3,
                          short unused4, boolean unused5, ML0 state, qn_1 unused6) {
        switch (this.Q10) {
            case 0:
                state.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, (byte) 14,
                        state.yd0.QX(727, target), new String[]{target.A60()}), "", null);
                target.z40 = true;
                return;
            case 1:
                state.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, (byte) 14,
                        state.yd0.QX(727, target), new String[]{target.A60()}), "", null);
                return;
            case 2:
                state.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, (byte) 14,
                        state.yd0.QX(730, target), new String[]{target.A60()}), "", null);
                target.z40 = false;
                return;
            default:
                return;
        }
    }
}

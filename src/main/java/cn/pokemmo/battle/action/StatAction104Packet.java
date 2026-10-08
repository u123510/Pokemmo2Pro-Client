package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatAction104Packet extends Nt implements eb0_0 {
    public final byte eM;

    public StatAction104Packet(byte value) {
        super();
        this.eM = value;
    }

    @Override
    public final byte BL0() {
        return 104;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2, short value,
                          boolean flag3, ML0 battle, qn_1 context) {
        a10_0 state = battle.yd0;
        String message = sm0_0.c0(state.Ez0() == this.eM ? 200504 : 200505);
        battle.wJ("", message, () -> this.Ep0(state));
    }

    public final void Ep0(a10_0 state) {
        tb0_1[] values = state.mn(this.eM).zz();
        for (tb0_1 value : values) {
            se_0 entry = value.B3;
            entry.Bn.hB(entry.Sj);
            entry.Bn.H1 = (byte) entry.Bn.H1;
            value.Wb();
        }
    }
}

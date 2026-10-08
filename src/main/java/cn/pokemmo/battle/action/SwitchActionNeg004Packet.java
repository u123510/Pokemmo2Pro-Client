package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class SwitchActionNeg004Packet extends Nt implements eb0_0 {
    public final byte VF0;

    public SwitchActionNeg004Packet(byte kind) {
        super();
        this.VF0 = kind;
    }

    @Override
    public final byte BL0() {
        return -4;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        if (second == null) {
            return;
        }

        switch (this.VF0) {
            case 2:
                battle.wJ(sm0_0.wa0(200420, second.nz0(true)), "", null);
                return;
            case 1:
                battle.wJ(sm0_0.wa0(200419, second.nz0(true)), "", null);
                MU move = qk_2.cR.import$(first, (short) 1014);
                move.kA0(new PF[]{second});
                battle.lZ.add(new kw_0((byte) 2, move));
                return;
            case 0:
                battle.wJ(sm0_0.wa0(200418, second.nz0(true)), "", null);
                return;
            default:
                return;
        }
    }
}

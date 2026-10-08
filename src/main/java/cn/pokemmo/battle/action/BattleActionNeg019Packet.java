package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleActionNeg019Packet extends Nt implements eb0_0 {
    public final byte Nk;

    public BattleActionNeg019Packet(byte value) {
        super();
        this.Nk = value;
    }

    @Override
    public final byte BL0() {
        return (byte) -19;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2, short value,
                          boolean flag3, ML0 battle, qn_1 context) {
        if (this.Nk != 0) {
            return;
        }
        int slot = first.cD0;
        String text = sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 103,
                new String[]{second.A60(), new StringBuilder("       ")
                        .append(sm0_0.c0(210548)).toString()});
        battle.z70[slot].fl0(text);
        battle.I1(sm0_0.wa0(200498, second.Yp()), "", null);
        for (PF[] row : battle.yd0.wI0) {
            for (PF candidate : row) {
                if (candidate != null && !candidate.zi0.hf0() && candidate != second) {
                    candidate.Sk0 = 0;
                }
            }
        }
    }
}

package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatAction068Packet extends Nt implements eb0_0 {
    public final short YF;
    public final short Lpt9;

    public StatAction068Packet(short first, short second) {
        this.YF = first;
        this.Lpt9 = second;
    }

    @Override
    public final byte BL0() {
        return 68;
    }

    @Override
    public final void IE0(PF first, PF second, boolean unused1, boolean unused2,
                          short unused3, boolean unused4, ML0 state, qn_1 unused5) {
        state.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, (byte) 14,
                state.yd0.QX(682, first), new String[]{first.A60()}), "", null);

        PF[] targets = {first, second};
        short[] amounts = {this.YF, this.Lpt9};
        for (int i = 0; i < 2; i++) {
            if (amounts[i] < 1) {
                continue;
            }
            mc0_1 item = gu0.l2.lPT6(amounts[i]);
            state.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, (byte) 14,
                    state.yd0.QX(685, targets[i]),
                    new String[]{targets[i].A60(), sm0_0.c0(item.Nl)}), "", null);
        }

        if (tw0_0.PK0 != null && tw0_0.LD0.he0 != null) {
            PF resolvedSecond = tw0_0.PK0.nd0(second.Zo0());
            if (resolvedSecond != null) {
                resolvedSecond.bv0(this.Lpt9);
                tw0_0.LD0.he0.N10.Hi(resolvedSecond).Ny();
            }
            PF resolvedFirst = tw0_0.PK0.nd0(first.Zo0());
            if (resolvedFirst != null) {
                resolvedFirst.bv0(this.YF);
                tw0_0.LD0.he0.N10.Hi(resolvedFirst).Ny();
            }
        }
    }
}

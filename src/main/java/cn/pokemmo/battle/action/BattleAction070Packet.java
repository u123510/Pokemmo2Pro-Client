package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction070Packet extends Nt implements eb0_0 {
    public final short w8;

    public BattleAction070Packet(short value) {
        this.w8 = value;
    }

    public final byte BL0() {
        return 70;
    }

    public final void IE0(PF source, PF target, boolean first, boolean second, short value, boolean third, ML0 context, qn_1 callback) {
        mc0_1 move = gu0.l2.lPT6(this.w8);
        if (tw0_0.PK0 != null && tw0_0.LD0.he0 != null) {
            PF current = tw0_0.PK0.nd0(target.Zo0());
            if (current != null) {
                current.bv0(this.w8);
                tw0_0.LD0.he0.N10.Hi(current).Ny();
            }
        }
        String[] arguments = {source.A60(), sm0_0.c0(move.Nl)};
        context.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, 14, context.yd0.QX(490, source), arguments), "", null);
    }
}

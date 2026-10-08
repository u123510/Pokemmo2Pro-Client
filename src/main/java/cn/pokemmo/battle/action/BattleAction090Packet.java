package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction090Packet extends Nt implements eb0_0 {
    public final short RW;

    public BattleAction090Packet(short value) {
        super();
        this.RW = value;
    }

    @Override
    public final byte BL0() {
        return (byte) 90;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        mc0_1 type = gu0.l2.lPT6(this.RW);
        if (tw0_0.PK0 != null && tw0_0.LD0.he0 != null) {
            PF target = tw0_0.PK0.nd0(second.Zo0());
            if (target != null) {
                target.bv0((short) 0);
                tw0_0.LD0.he0.N10.Hi(target).Ny();
            }
        }
        int messageId = battle.yd0.QX(776, first);
        String[] args = {first.A60(), sm0_0.c0(type.Nl)};
        battle.wJ(sm0_0.Bw((byte) 2, lpt6__2.Q80, 14, messageId, args), "", null);
    }
}
